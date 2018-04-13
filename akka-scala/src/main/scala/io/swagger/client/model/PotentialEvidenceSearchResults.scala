/**
 * NOTE: This class is auto generated by the akka-scala (beta) swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen
 * For any issue or feedback, please open a ticket via https://github.com/swagger-api/swagger-codegen/issues/new
 */

package io.swagger.client.model

import io.swagger.client.core.ApiModel
import org.joda.time.DateTime
import java.util.UUID

case class PotentialEvidenceSearchResults (
  /* The property the collection is sorted on. This is optional and may not be supported by all collections  */
  sortBy: Option[String],
  /* The page in the collection */
  page: Int,
  /* The order the collection is sorted in. This is optional and may not be supported by all collections. Valid values are 'asc', 'desc'  */
  sortOrder: Option[PotentialEvidenceSearchResultsEnums.SortOrder],
  /* The total number of results/items in this collection */
  totalItems: Int,
  /* The number of results/items returned per page of results */
  pageSize: Int,
  /* The list of links to navigate this collection */
  links: Seq[Link],
  /* The number of pages in the collection given the current pageSize.  Note this will have the value ceiling(totalItems / pageSize).  */
  totalPages: Int,
  /* The search criteria */
  searchCriteria: Option[String],
  /* The array of results */
  items: Option[Seq[PotentialEvidenceSearchResult]]
) extends ApiModel

object PotentialEvidenceSearchResultsEnums {

  type SortOrder = SortOrder.Value
  object SortOrder extends Enumeration {
    val Asc = Value("asc")
    val Desc = Value("desc")
  }

}

