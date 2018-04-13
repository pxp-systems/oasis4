/**
 * NOTE: This class is auto generated by the akka-scala (beta) swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen
 * For any issue or feedback, please open a ticket via https://github.com/swagger-api/swagger-codegen/issues/new
 */
package io.swagger.client.api

import io.swagger.client.model._
import org.json4s._
import scala.reflect.ClassTag

object EnumsSerializers {

  def all = Seq[Serializer[_]]() :+
    new EnumNameSerializer(AddressEnums.AddressType) :+
    new EnumNameSerializer(AddressEnums.PhysicalAddressTypeCode) :+
    new EnumNameSerializer(AddressSearchResultEnums.AddressType) :+
    new EnumNameSerializer(AddressSearchResultsEnums.SortOrder) :+
    new EnumNameSerializer(ClaimRegistrationRecordEnums.AppEvidenceCode) :+
    new EnumNameSerializer(ClaimRegistrationRecordEnums.WagesEvidenceCode) :+
    new EnumNameSerializer(ClaimRegistrationSearchResultsEnums.SortOrder) :+
    new EnumNameSerializer(ClaimSearchResultEnums.ClaimRegistrationType) :+
    new EnumNameSerializer(ClaimSearchResultEnums.ClaimType) :+
    new EnumNameSerializer(ClaimSearchResultEnums.Status) :+
    new EnumNameSerializer(ClaimSearchResultBaseEnums.ClaimRegistrationType) :+
    new EnumNameSerializer(ClaimSearchResultBaseEnums.ClaimType) :+
    new EnumNameSerializer(ClaimSearchResultBaseEnums.Status) :+
    new EnumNameSerializer(ClaimSearchResultsEnums.SortOrder) :+
    new EnumNameSerializer(CollectionMetadataEnums.SortOrder) :+
    new EnumNameSerializer(ContactSearchResultEnums.&#x60;Type&#x60;) :+
    new EnumNameSerializer(ContactSearchResultsEnums.SortOrder) :+
    new EnumNameSerializer(CreditorClaimRecordEnums.ClaimRegistrationType) :+
    new EnumNameSerializer(CreditorClaimRecordEnums.ClaimStatus) :+
    new EnumNameSerializer(CreditorClaimSearchResultEnums.ClaimRegistrationType) :+
    new EnumNameSerializer(CreditorClaimSearchResultEnums.ClaimType) :+
    new EnumNameSerializer(CreditorClaimSearchResultEnums.ClaimStatus) :+
    new EnumNameSerializer(CreditorClaimSearchResultBaseEnums.ClaimRegistrationType) :+
    new EnumNameSerializer(CreditorClaimSearchResultBaseEnums.ClaimType) :+
    new EnumNameSerializer(CreditorClaimSearchResultBaseEnums.ClaimStatus) :+
    new EnumNameSerializer(CreditorClaimSearchResultsEnums.SortOrder) :+
    new EnumNameSerializer(DataProtectionRuleRecordEnums.RuleType) :+
    new EnumNameSerializer(DataProtectionRuleSearchResultEnums.RuleType) :+
    new EnumNameSerializer(DataProtectionRuleSearchResultsEnums.SortOrder) :+
    new EnumNameSerializer(EvidenceSearchResultEnums.&#x60;Type&#x60;) :+
    new EnumNameSerializer(EvidenceSearchResultsEnums.SortOrder) :+
    new EnumNameSerializer(FolioRecordEnums.FolioType) :+
    new EnumNameSerializer(FolioRecordEnums.FolioStatus) :+
    new EnumNameSerializer(FolioRecordEnums.FolioProtectionStatus) :+
    new EnumNameSerializer(FolioRecordEnums.FolioConfidentialityStatus) :+
    new EnumNameSerializer(FolioSearchResultEnums.&#x60;Type&#x60;) :+
    new EnumNameSerializer(FolioSearchResultsEnums.SortOrder) :+
    new EnumNameSerializer(FullContactRecordEnums.ContactType) :+
    new EnumNameSerializer(IdentitySearchResultEnums.IdentityProviderName) :+
    new EnumNameSerializer(IdentitySearchResultsEnums.SortOrder) :+
    new EnumNameSerializer(LinkEnums.Method) :+
    new EnumNameSerializer(MaintainClaimRecordEnums.ClaimTcId) :+
    new EnumNameSerializer(MaintainContactRecordEnums.ContactType) :+
    new EnumNameSerializer(MaintianClaimRecordEnums.ClaimStatus) :+
    new EnumNameSerializer(NameSearchResultEnums.IdentityProviderName) :+
    new EnumNameSerializer(NameSearchResultsEnums.SortOrder) :+
    new EnumNameSerializer(NewClaimRecordEnums.ClaimChannelType) :+
    new EnumNameSerializer(NewClaimRecordEnums.ClaimStatus) :+
    new EnumNameSerializer(OrganisationSearchResultsEnums.SortOrder) :+
    new EnumNameSerializer(PotentialClaimEvidenceRecordEnums.TypeCode) :+
    new EnumNameSerializer(PotentialEvidenceSearchResultEnums.&#x60;Type&#x60;) :+
    new EnumNameSerializer(PotentialEvidenceSearchResultsEnums.SortOrder) :+
    new EnumNameSerializer(RoleSearchResultsEnums.SortOrder) :+
    new EnumNameSerializer(SubmitClaimRegistrationRecordEnums.AppEvidenceCode) :+
    new EnumNameSerializer(SubmitClaimRegistrationRecordEnums.WagesEvidenceCode) :+
    new EnumNameSerializer(TaxNumberSearchResultsEnums.SortOrder) :+
    new EnumNameSerializer(UserGroupSearchResultsEnums.SortOrder) :+
    new EnumNameSerializer(ViewClaimRecordEnums.ClaimRegistrationType) :+
    new EnumNameSerializer(ViewClaimRecordEnums.ClaimChannelType) :+
    new EnumNameSerializer(ViewClaimRecordEnums.ClaimStatus) :+
    new EnumNameSerializer(ViewClaimRecordEnums.ClaimRingfenceTypeCode)



  private class EnumNameSerializer[E <: Enumeration: ClassTag](enum: E)
    extends Serializer[E#Value] {
    import JsonDSL._

    val EnumerationClass = classOf[E#Value]

    def deserialize(implicit format: Formats):
    PartialFunction[(TypeInfo, JValue), E#Value] = {
      case (t @ TypeInfo(EnumerationClass, _), json) if isValid(json) => {
        json match {
          case JString(value) =>
            enum.withName(value)
          case value =>
            throw new MappingException(s"Can't convert $value to $EnumerationClass")
        }
      }
    }

    private[this] def isValid(json: JValue) = json match {
      case JString(value) if enum.values.exists(_.toString == value) => true
      case _ => false
    }

    def serialize(implicit format: Formats): PartialFunction[Any, JValue] = {
      case i: E#Value => i.toString
    }
  }

}