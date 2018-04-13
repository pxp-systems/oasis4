/**
 * NOTE: This class is auto generated by the akka-scala (beta) swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen
 * For any issue or feedback, please open a ticket via https://github.com/swagger-api/swagger-codegen/issues/new
 */

package io.swagger.client.model

import io.swagger.client.core.ApiModel
import org.joda.time.DateTime
import java.util.UUID

case class MaintainContactRecord (
  /* Boolean indicating unknown?  */
  mainContactYn: Option[Boolean],
  /* Flag to indicate whether the contact wished to recieve a creditor report (if applicable) **Candidate for refactor into preferences**   */
  emailCreditorReprt: Option[Boolean],
  /* The type of contact   */
  contactType: Option[MaintainContactRecordEnums.ContactType],
  /* Link to the key creditors resource: essentially simply used as a  **Candidate for refactoring** - key creditors table is just a bunch of booleans for bank, credit card, trusted, locked in and secured.  */
  keyCreditorId: Option[Double],
  /* Is an address known for this contact?  */
  addressKnown: Option[Boolean],
  /* Flag indicating whether address may appear on public registers and search results.  */
  withholdAddress: Option[Boolean],
  /* Flag indicating whether higher priviledge level is needed to modify this record.  */
  protectFromEdit: Option[Boolean],
  /* Flag indicating whether the contact is knwn to be deceased.  */
  isDeceased: Option[Boolean],
  /* Date of birth if known.      */
  dateOfBirth: Option[String],
  /* New Zealand driver's licence number if known.  */
  nzDriversLicence: Option[String],
  /* **To be dreprecated**  */
  enableBranchCreation: Option[Boolean],
  /* **To be deprecated**  */
  companyNumber: Option[String],
  /* New Zealand Business Number. If the contact is a company end if the NZBN is known.  */
  nzbn: Option[Long],
  /* **Refactor: Could import this from NZBN or alternatively link directly to the resource on the NZBN web service**  */
  incorporationdate: Option[Date],
  /* The full name of the contact. **Refactor**  */
  contactName: Option[String],
  /* Notes about the contact.  */
  notes: Option[String],
  alternateNames: Option[Seq[ContactName]],
  links: Option[Seq[Link]]
) extends ApiModel

object MaintainContactRecordEnums {

  type ContactType = ContactType.Value
  object ContactType extends Enumeration {
    val Person = Value("Person")
    val Organisation = Value("Organisation")
  }

}

