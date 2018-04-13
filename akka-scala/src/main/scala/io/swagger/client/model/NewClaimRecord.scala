/**
 * NOTE: This class is auto generated by the akka-scala (beta) swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen
 * For any issue or feedback, please open a ticket via https://github.com/swagger-api/swagger-codegen/issues/new
 */

package io.swagger.client.model

import io.swagger.client.core.ApiModel
import org.joda.time.DateTime
import java.util.UUID

case class NewClaimRecord (
  /* The the estate that the claim registration is to be associated to.  */
  estateId: Double,
  /* The name of the actual claimant where the claim is not beng made by the actual claimant. This should be used concatenated with createdBy when displaying the claim (NEW FIELD)  */
  claimOnBehalfOf: Option[String],
  /* The claim type  */
  claimType: String,
  /* The type of claim  */
  claimChannelType: NewClaimRecordEnums.ClaimChannelType,
  /* The type of claim made  */
  transactionCode: Option[String],
  /* The status of the claim  */
  claimStatus: NewClaimRecordEnums.ClaimStatus,
  /*  */
  claimManualSourceCode: String,
  /* Boolean indicating whether claim is being appealed in the courts.  */
  claimUnderAppeal: Option[Boolean],
  /* The (payment) priority of the claim (once claim becomes part of the estate).  */
  claimPriority: Option[Double],
  /* The reference supplied by the creditor for the claim. Not necessarily unique (many claims may well have the same reference).  ### NOTE If longer than 12 digits it can't appear on the statement  */
  claimCreditorReference: Option[String],
  /* The value of the claim as notified by the debtor.  */
  claimNotifiedValue: Option[Double],
  /* The value to be paid on the claim by the estate.  */
  claimValue: Option[Double],
  /* Unknown, mandatory  */
  claimContractInterestYn: Option[Boolean],
  /* Unknown, mandatory  */
  claimValueTbaYn: Option[Boolean],
  /* The IRD number of the claimant  */
  claimIrdNumber: Option[String],
  /* Does the claim include GST for the Official Assignee?  */
  claimIncludeOaGstYn: Option[Boolean],
  /* The calculated amount of GST that needs to be paid on the claim for the OA.  */
  claimOaGstAmount: Option[Double],
  /* The tax rate payable on a claim for wages.  */
  claimWagesTaxRate: Option[Double],
  /* Comments from the case officer(s) about the claim  */
  claimComments: Option[String],
  /* The date that the case officer was made aware of the claim??  */
  claimItsAwaredate: Option[Date],
  /* The date the claim was lodged with ITS.  */
  claimLodgedWithItsdate: Option[Date],
  /* The currency (code) if the claim. Loosely mapped to the ISO4217 country codes. Currently updated infrequently  */
  claimCurCode: Option[String],
  /* The (contact) identifier for the creditor.  */
  creditorId: Double,
  /* The organisation the owns the claim  */
  organisationId: Option[Double],
  /* Comment from insolvency officer when changing claim meta-data  */
  claimReasonForChange: Option[String],
  links: Option[Seq[Link]]
) extends ApiModel

object NewClaimRecordEnums {

  type ClaimChannelType = ClaimChannelType.Value
  type ClaimStatus = ClaimStatus.Value
  object ClaimChannelType extends Enumeration {
    val OCL = Value("OCL")
    val MCL = Value("MCL")
  }

  object ClaimStatus extends Enumeration {
    val Potential = Value("Potential")
    val Received = Value("Received")
  }

}

