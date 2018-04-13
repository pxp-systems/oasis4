/**
 * NOTE: This class is auto generated by the akka-scala (beta) swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen
 * For any issue or feedback, please open a ticket via https://github.com/swagger-api/swagger-codegen/issues/new
 */

package io.swagger.client.model

import io.swagger.client.core.ApiModel
import org.joda.time.DateTime
import java.util.UUID

case class NameRecord (
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
  validFrom: Option[String],
  /*  */
  typeCode: Option[String],
  /*  */
  validTo: Option[String],
  /*  */
  notes: Option[String],
  /*  */
  firstName: Option[String],
  /*  */
  lastName: Option[String],
  /*  */
  middleNames: Option[String],
  /*  */
  titleCode: Option[String],
  /*  */
  organisationName: Option[String],
  /*  */
  nameId: Option[Double],
  /*  */
  contactId: Option[Double],
  /*  */
  `type`: Option[String],
  /*  */
  version: Option[Double],
  /*  */
  created: Option[Date]
) extends ApiModel

