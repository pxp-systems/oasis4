/**
 * NOTE: This class is auto generated by the akka-scala (beta) swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen
 * For any issue or feedback, please open a ticket via https://github.com/swagger-api/swagger-codegen/issues/new
 */

package io.swagger.client.model

import io.swagger.client.core.ApiModel
import org.joda.time.DateTime
import java.util.UUID

case class ClaimSearchResult (
  /* The unique claim number. */
  claimNumber: Option[String],
  /* The claim registration that generated the claim.  */
  claimRegistrationId: Option[String],
  /* Needs to be captured in a new field coming from ONC_POTENTIAL_ONLINE_CLAIMS  */
  claimRegistrationType: Option[ClaimSearchResultEnums.ClaimRegistrationType],
  /* The type of claim  */
  claimType: Option[ClaimSearchResultEnums.ClaimType],
  /* The name of the creditor. Where the onBehalfOf field is populated, this feild is to be contactenated  */
  creditorName: Option[String],
  /* Other names applicable to Individual. */
  created: Option[Seq[String]],
  status: Option[ClaimSearchResultEnums.Status],
  links: Option[Link],
  /* The array of realted claims */
  relatedClaims: Option[Seq[ClaimSearchResultBase]]
) extends ApiModel

object ClaimSearchResultEnums {

  type ClaimRegistrationType = ClaimRegistrationType.Value
  type ClaimType = ClaimType.Value
  type Status = Status.Value
  object ClaimRegistrationType extends Enumeration {
    val CourtAwardedYouAdjudicationapplicationCosts = Value("Court awarded you adjudication/application costs")
    val ClaimForWagesHolidayPayOrRedundancy = Value("Claim for wages, holiday pay or redundancy")
    val Other = Value("Other")
    val SecuredDebt = Value("Secured debt")
    val CourtAction = Value("Court action")
    val InterestAwardedByACourtOrAgreedToInAContract = Value("Interest awarded by a Court or agreed to in a contract")
  }

  object ClaimType extends Enumeration {
    val OCL = Value("OCL")
    val MCL = Value("MCL")
  }

  object Status extends Enumeration {
    val Errored = Value("Errored")
    val Admitted = Value("Admitted")
    val Potential = Value("Potential")
    val Received = Value("Received")
    val Withdrawn = Value("Withdrawn")
    val Rejected = Value("Rejected")
    val Suspended = Value("Suspended")
    val Duplicate = Value("Duplicate")
  }

}

