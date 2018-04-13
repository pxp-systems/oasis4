/**
 * NOTE: This class is auto generated by the akka-scala (beta) swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen
 * For any issue or feedback, please open a ticket via https://github.com/swagger-api/swagger-codegen/issues/new
 */

package io.swagger.client.model

import io.swagger.client.core.ApiModel
import org.joda.time.DateTime
import java.util.UUID

case class OrganisationRecord (
  /* Boolean indicating whether the key creditor is a bank.  */
  bankYn: Option[Boolean],
  /*  */
  creditCardYn: Option[Boolean],
  /* Mandatory */
  inUseYn: Option[Boolean],
  /*  */
  securedYn: Option[Boolean],
  /*  */
  organisaionId: Option[Double],
  /*  */
  version: Option[Double],
  /*  */
  created: Option[Date],
  /*  */
  createdBy: Option[String],
  /*  */
  createdName: Option[String],
  /*  */
  lastUpdated: Option[Date],
  /*  */
  lastUpdatedBy: Option[String],
  /*  */
  lastUpdatedName: Option[String],
  /*  */
  cttId: Option[Double],
  /*  */
  trustedYn: Option[Boolean],
  /*  */
  lockedYn: Option[String],
  /*  */
  comment: Option[String]
) extends ApiModel

