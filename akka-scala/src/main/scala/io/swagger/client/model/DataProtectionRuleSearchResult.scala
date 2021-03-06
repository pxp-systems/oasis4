/**
 * NOTE: This class is auto generated by the akka-scala (beta) swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen
 * For any issue or feedback, please open a ticket via https://github.com/swagger-api/swagger-codegen/issues/new
 */

package io.swagger.client.model

import io.swagger.client.core.ApiModel
import org.joda.time.DateTime
import java.util.UUID

case class DataProtectionRuleSearchResult (
  /* The primary identifier for the rule */
  ruleId: Option[Double],
  /* The primary identifier for the rule */
  ruleCode: Option[Double],
  /* The type of restriction being enforced */
  ruleType: Option[DataProtectionRuleSearchResultEnums.RuleType],
  /* Human readable note on the business motivation for the rule. */
  rulePurpose: Option[Double],
  /* The primary identifier for the rule. */
  targetResource: Option[String],
  /* Human readable note on the operation of the rule. */
  ruleDescription: Option[String]
) extends ApiModel

object DataProtectionRuleSearchResultEnums {

  type RuleType = RuleType.Value
  object RuleType extends Enumeration {
    val StateChangeRestriction = Value("State change restriction")
    val FieldEditRestriction = Value("Field edit restriction")
    val Other = Value("Other")
  }

}

