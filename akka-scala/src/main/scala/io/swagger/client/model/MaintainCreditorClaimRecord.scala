/**
 * NOTE: This class is auto generated by the akka-scala (beta) swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen
 * For any issue or feedback, please open a ticket via https://github.com/swagger-api/swagger-codegen/issues/new
 */

package io.swagger.client.model

import io.swagger.client.core.ApiModel
import org.joda.time.DateTime
import java.util.UUID

case class MaintainCreditorClaimRecord (
  /* The reference supplied by the creditor for the claim. Not necessarily unique (many claims may well have the same reference).   */
  claimCreditorReference: Option[String],
  /* Populated if the actual claimant where the claim is not beng made by the actual claimant. This should be used concatenated with createdBy when displaying the claim  */
  claimOnBehalfOf: Option[String],
  personCompletingApplication: Option[String],
  /* The value of the claim as notified by the debtor.   */
  claimNotifiedValue: Option[Double],
  /* The value to be paid on the claim by the estate.   */
  claimValue: Option[Double],
  /* Boolean indicating whether the claim is subject to court action, used to determine the claim type and priority.   */
  subjectToCourtActionYn: Option[Boolean],
  /* The IRD number of the claimant   */
  claimIrdNumber: Option[String],
  /* If a claim was withdrawn (can only be done as the creditor) the reason for this action.   */
  claimWithdrawnReason: Option[String],
  /* Treat this as an enumerator.  The currency (code) of the claim. Loosely mapped to the ISO4217 country codes. Currently updated infrequently.   **Suggested UI implementation:** Implement as typeahead search. Big lists of enums are not good.  */
  amountClaimedCurCode: Option[String],
  /* The amount claimed, in words.   */
  amountInWords: Option[String],
  /* The amount claimed  */
  amountClaimed: Option[Double],
  /* Unknown. Appears to be roles, But also free text. Hard to say where this comes from.   */
  designation: Option[String],
  /* Acocunt number   */
  refAccountNumber: Option[String],
  /* GST portion  */
  gstPortionOfClaim: Option[Double],
  /* Treat this as an enumerator.  The currency (code) of the claim. Loosely mapped to the ISO4217 country codes. Currently updated infrequently.   **Suggested UI implementation:** Implement as typeahead search. Big lists of enums are not good.  */
  gstPortionOfClaimCurCode: Option[String],
  /* When the debt was incurred  */
  debtIncurredFrom: Option[Date],
  /* When the debt was incurred  */
  debtIncurredTo: Option[Date],
  /* Description of the debt  */
  description: Option[String],
  /* A financing statement contains information about a security interest. The actual security agreement is not registered on PPSR. In its place, a notice of this agreement is posted on PPSR by registering a financing statement. Registering a financing statement is one way of protecting a security interest and determining priority.  */
  ppsrFinancingStatementRegistrationNumber: Option[String],
  /* the value of the security  */
  secValue: Option[Double],
  /* Treat this as an enumerator.  The currency (code) of the claim. Loosely mapped to the ISO4217 country codes. Currently updated infrequently.   **Suggested UI implementation:** Implement as typeahead search. Big lists of enums are not good.  */
  secValueCurrencyCode: Option[String],
  /* description of the security  */
  secDescription: Option[String],
  /* description of the court action  */
  descriptionOfCourtAction: Option[String],
  /* is this claim subject to court action?  */
  subjectToCourtAction: Option[Boolean],
  /* the contract interest component of the claim  */
  claimContractInterest: Option[Boolean],
  /* The type of claim made  */
  transactionCode: Option[String],
  links: Option[Seq[Link]]
) extends ApiModel


