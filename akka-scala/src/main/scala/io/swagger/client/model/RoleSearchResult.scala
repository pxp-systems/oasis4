/**
 * NOTE: This class is auto generated by the akka-scala (beta) swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen
 * For any issue or feedback, please open a ticket via https://github.com/swagger-api/swagger-codegen/issues/new
 */

package io.swagger.client.model

import io.swagger.client.core.ApiModel
import org.joda.time.DateTime
import java.util.UUID

case class RoleSearchResult (
  /* The primary identifier for the role */
  roleId: Option[Double],
  /* Short role code */
  roleCode: Option[String],
  /* The human friendly description of the role */
  roleDescription: Option[String]
) extends ApiModel


