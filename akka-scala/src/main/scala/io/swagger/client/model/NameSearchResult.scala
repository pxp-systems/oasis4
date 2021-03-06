/**
 * NOTE: This class is auto generated by the akka-scala (beta) swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen
 * For any issue or feedback, please open a ticket via https://github.com/swagger-api/swagger-codegen/issues/new
 */

package io.swagger.client.model

import io.swagger.client.core.ApiModel
import org.joda.time.DateTime
import java.util.UUID

case class NameSearchResult (
  /* The human redable name of the (ultimate) IdP - all federated via WSO2 Identity Server. */
  identityProviderName: Option[NameSearchResultEnums.IdentityProviderName],
  /* The name of the person (provided by the IdP) */
  accountName: Option[String],
  /* The email address associted with the identity */
  emailAddress: Option[String],
  /* The \"Medsec User Id\" that this identity is known by in WSO2 identity server and the OASIS security schema (along with its associated tokens). */
  muid: Option[String]
) extends ApiModel

object NameSearchResultEnums {

  type IdentityProviderName = IdentityProviderName.Value
  object IdentityProviderName extends Enumeration {
    val RealMe = Value("RealMe")
    val ActiveDirectory = Value("Active Directory")
    val Facebook = Value("Facebook")
    val Microsoft = Value("Microsoft")
    val Google = Value("Google")
  }

}

