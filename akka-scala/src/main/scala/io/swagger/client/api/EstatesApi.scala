/**
 * NOTE: This class is auto generated by the akka-scala (beta) swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen
 * For any issue or feedback, please open a ticket via https://github.com/swagger-api/swagger-codegen/issues/new
 */
package io.swagger.client.api

import io.swagger.client.model.ClaimSearchResults
import io.swagger.client.model.ErrorDescription
import io.swagger.client.model.EstateDetail
import io.swagger.client.model.ViewClaimRecord
import io.swagger.client.core._
import io.swagger.client.core.CollectionFormats._
import io.swagger.client.core.ApiKeyLocations._

object EstatesApi {

  /**
   * **UC Map:** Create Claim  Creates a new claim against an estate - can only be done by an insolvency officer - claims from other participants need to be vetted and accepted - going through the embryonic stage of being a Claim Registration or a potential claim first. 
   * 
   * Expected answers:
   *   code 200 : ViewClaimRecord (---- Overview ---- Get result matching estate-number  ---- Pre-conditions ---- * Claim does not exist in the system * Estate exists  ---- Post-conditions ---- * The claim exists * New claim is linked to the estate   ---- Error messages ---- | 400 | Not authenticated | Agent not authenticated | | 401 | Not authorised | Agent has requested resource that the authenticated user is not authorisedto view - e.g. A debtor trying to access an estate that is not their own | | 403 | The requester is not authorised for this operation. | Agent is not authorised to retrieve this resource type | | 404 | The specified estate (number) does not exist. | Agent has requested resource that does not exist | )
   *              Headers :
   *                api-business-govt-nz-Request-Id - MBIE Request id header
   *                api-business-govt-nz-Correlation-Id - MBIE Correlation id header
   *                date - Response parameter. Date/time the response was generated (in Greenwich mean time).
   *                service-version - The minor version of the API.
   *   code 400 :  (bad input parameter)
   *   code 401 :  (The requester is not authenticated.)
   *   code 403 :  (The requester is not authorised for this operation.)
   *   code 404 :  (The specified estate (number) does not exist.)
   *   code 500 : ErrorDescription (An unexpected internal server error occurred.)
   * 
   * Available security schemes:
   *   jwt (apiKey)
   * 
   * @param estateNumber The unique estate number of the insolvency 
   * @param claimDetail The detail of the new claim record.
   */
  def createClaim(estateNumber: Int, claimDetail: ViewClaimRecord)(implicit apiKey: ApiKeyValue): ApiRequest[ViewClaimRecord] =
    ApiRequest[ViewClaimRecord](ApiMethods.POST, "https://virtserver.swaggerhub.com/apis/OASIS4-development/oasis4/1.4.13", "/estates/{estate-number}/claims/", "application/json")
      .withApiKey(apiKey, "Authorization", HEADER)
      .withBody(claimDetail)
      .withPathParam("estate-number", estateNumber)
      .withSuccessResponse[ViewClaimRecord](200)
      .withErrorResponse[Unit](400)
      .withErrorResponse[Unit](401)
      .withErrorResponse[Unit](403)
      .withErrorResponse[Unit](404)
      .withErrorResponse[ErrorDescription](500)
      
  object CreateClaimHeaders { 
    def apiBusinessGovtNzRequestId(r: ApiReturnWithHeaders) = r.getStringHeader("api-business-govt-nz-Request-Id")
    def apiBusinessGovtNzCorrelationId(r: ApiReturnWithHeaders) = r.getStringHeader("api-business-govt-nz-Correlation-Id")
    def date(r: ApiReturnWithHeaders) = r.getDateTimeHeader("date")
    def serviceVersion(r: ApiReturnWithHeaders) = r.getStringHeader("service-version")
  }
  /**
   * By passing in the estate-number, the details of the estate are returned 
   * 
   * Expected answers:
   *   code 200 : EstateDetail (---- Overview ---- Get a resource matching estate-number  ---- Pre-conditions ---- * *  ---- Post-conditions ---- * *  ---- Error messages ----  | Code| Message | Description| |----|-----|------| | 400 | Not authenticated | Agent not authenticated | | 401 | Not authorised | Agent has requested resource that the authenticated user is not authorisedto view - e.g. A debtor trying to access an estate that is not their own | | 403 | The requester is not authorised for this operation. | Agent is not authorised to retrieve this resource type | | 404 | The specified estate (number) does not exist. | Agent has requested resource that does not exist | )
   *              Headers :
   *                api-business-govt-nz-Request-Id - MBIE Request id header
   *                api-business-govt-nz-Correlation-Id - MBIE Correlation id header
   *                date - Response parameter. Date/time the response was generated (in Greenwich mean time).
   *                service-version - The minor version of the API.
   *   code 400 :  (bad input parameter)
   *   code 401 :  (The requester is not authenticated.)
   *   code 403 :  (The requester is not authorised for this operation.)
   *   code 404 :  (The specified estate (number) does not exist.)
   *   code 500 : ErrorDescription (An unexpected internal server error occurred.)
   * 
   * Available security schemes:
   *   jwt (apiKey)
   * 
   * @param estateNumber The unique estate number of the insolvency 
   */
  def getEstateDetails1(estateNumber: Int)(implicit apiKey: ApiKeyValue): ApiRequest[EstateDetail] =
    ApiRequest[EstateDetail](ApiMethods.GET, "https://virtserver.swaggerhub.com/apis/OASIS4-development/oasis4/1.4.13", "/estates/{estate-number}", "application/json")
      .withApiKey(apiKey, "Authorization", HEADER)
      .withPathParam("estate-number", estateNumber)
      .withSuccessResponse[EstateDetail](200)
      .withErrorResponse[Unit](400)
      .withErrorResponse[Unit](401)
      .withErrorResponse[Unit](403)
      .withErrorResponse[Unit](404)
      .withErrorResponse[ErrorDescription](500)
      
  object GetEstateDetails1Headers { 
    def apiBusinessGovtNzRequestId(r: ApiReturnWithHeaders) = r.getStringHeader("api-business-govt-nz-Request-Id")
    def apiBusinessGovtNzCorrelationId(r: ApiReturnWithHeaders) = r.getStringHeader("api-business-govt-nz-Correlation-Id")
    def date(r: ApiReturnWithHeaders) = r.getDateTimeHeader("date")
    def serviceVersion(r: ApiReturnWithHeaders) = r.getStringHeader("service-version")
  }
  /**
   * ### Overview  **UC Mapping:** View Claim  Get result matching estate-number ____ ### Pre-conditions * User is authenticated ____ ### Post-conditions * The ringfence area has been checked * Individual permissions have been checked * The claim record is returned if it exists    * An audit record for the read has been created (asynchronously) in mongoDB  ____ ### --- Error messages --- | Code| Message | Description| |----|-----|------| | **400** | Not authenticated | Agent not authenticated |  ### HATEOAS \&quot;links\&quot; element examples | Case | Case | Description / Rules | |----|-----|------| | **1** | New claim | Where claim has not yet been vetted, admitted or withdrawn |   **1. New Claim**       \&quot;links\&quot;: [      {        \&quot;href\&quot;: \&quot;https://app.insolvency.govt.nz/v1/oasis4/estates/883785/claims/4855682,\&quot;,        \&quot;rel\&quot;: \&quot;self,\&quot;,        \&quot;method\&quot;: \&quot;GET\&quot;      },      {        \&quot;href\&quot;: \&quot;https://app.insolvency.govt.nz/v1/oasis4/estates/883785/claims,\&quot;,        \&quot;rel\&quot;: \&quot;claim.search,\&quot;,        \&quot;method\&quot;: \&quot;GET\&quot;      },      {        \&quot;href\&quot;: \&quot;https://app.insolvency.govt.nz/v1/oasis4/estates/883785/claims/4855682,\&quot;,        \&quot;rel\&quot;: \&quot;claim.maintain,\&quot;,        \&quot;method\&quot;: \&quot;PUT\&quot;      },      {        \&quot;href\&quot;: \&quot;https://app.insolvency.govt.nz/v1/oasis4/estates/883785/claims/4855682/suspend,\&quot;,        \&quot;rel\&quot;: \&quot;claim.suspend,\&quot;,        \&quot;method\&quot;: \&quot;POST\&quot;      },      {        \&quot;href\&quot;: \&quot;https://app.insolvency.govt.nz/v1/oasis4/estates/883785/claims/4855682/vet,\&quot;,        \&quot;rel\&quot;: \&quot;claim.vet,\&quot;,        \&quot;method\&quot;: \&quot;POST\&quot;      },      {        \&quot;href\&quot;: \&quot;https://app.insolvency.govt.nz/v1/oasis4/estates/883785/claims/4855682/admit,\&quot;,        \&quot;rel\&quot;: \&quot;claim.admit,\&quot;,        \&quot;method\&quot;: \&quot;POST\&quot;      },      {        \&quot;href\&quot;: \&quot;https://app.insolvency.govt.nz/v1/oasis4/estates/883785/claims/4855682/reject,\&quot;,        \&quot;rel\&quot;: \&quot;claim.reject,\&quot;,        \&quot;method\&quot;: \&quot;POST\&quot;      },      {        \&quot;href\&quot;: \&quot;https://app.insolvency.govt.nz/v1/oasis4/estates/883785/claims/4855682/assets,\&quot;,        \&quot;rel\&quot;: \&quot;claim.assets,\&quot;,        \&quot;method\&quot;: \&quot;GET\&quot;      },      {        \&quot;href\&quot;: \&quot;https://app.insolvency.govt.nz/v1/oasis4/estates/883785/claims/4855682/assets/523623/link,\&quot;,        \&quot;rel\&quot;: \&quot;claim.assets.link,\&quot;,        \&quot;method\&quot;: \&quot;POST\&quot;      },      {        \&quot;href\&quot;: \&quot;https://app.insolvency.govt.nz/v1/oasis4/estates/883785/claims/4855682/folios,\&quot;,        \&quot;rel\&quot;: \&quot;claim.folios,\&quot;,        \&quot;method\&quot;: \&quot;GET\&quot;      },      {        \&quot;href\&quot;: \&quot;https://app.insolvency.govt.nz/v1/oasis4/estates/883785/claims/4855682/link-folio,\&quot;,        \&quot;rel\&quot;: \&quot;claim.link.folio,\&quot;,        \&quot;method\&quot;: \&quot;POST\&quot;      },      {        \&quot;href\&quot;: \&quot;https://app.insolvency.govt.nz/v1/oasis4/estates/883785/claims/4855682/link_claim,\&quot;,        \&quot;rel\&quot;: \&quot;claim.link.claim,\&quot;,        \&quot;method\&quot;: \&quot;POST\&quot;      },      {        \&quot;href\&quot;: \&quot;https://app.insolvency.govt.nz/v1/oasis4/estates/883785/claims/4855682/history,\&quot;,        \&quot;rel\&quot;: \&quot;claim.history,\&quot;,        \&quot;method\&quot;: \&quot;GET\&quot;      },      {        \&quot;href\&quot;: \&quot;https://app.insolvency.govt.nz/v1/oasis4/estates/883785/claims/4855682/history/64,\&quot;,        \&quot;rel\&quot;: \&quot;claim.view_history_record,\&quot;,        \&quot;method\&quot;: \&quot;GET\&quot;      },      {        \&quot;href\&quot;: \&quot;https://app.insolvency.govt.nz/v1/oasis4/estates/883785/claims/4855682/audit_log,\&quot;,        \&quot;rel\&quot;: \&quot;claim.search_audit,\&quot;,        \&quot;method\&quot;: \&quot;GET\&quot;      }      ] 
   * 
   * Expected answers:
   *   code 200 : ClaimSearchResults ( ---- Overview ---- Get result matching estate-number  ---- Pre-conditions ---- * The claim exists  ---- Post-conditions ---- * The ringfence area has been checked * Individual permissions have been checked * The claim record is returned if it exists    * An audit record for the read has been created (asynchornously) in mongoDB   ---- Error messages ---- | 400 | Not authenticated | Agent not authenticated | )
   *              Headers :
   *                api-business-govt-nz-Request-Id - MBIE Request id header
   *                api-business-govt-nz-correlation-id - MBIE Correlation id header
   *                date - Response parameter. Date/time the response was generated (in Greenwich mean time).
   *                service-version - The minor version of the API.
   *   code 400 :  (bad input parameter)
   * 
   * Available security schemes:
   *   jwt (apiKey)
   * 
   * @param estateNumber the unique number of the estate resource
   * @param page The page in the collection to return. Default is page 1.
   * @param pageSize The requested number of items to include in each page returned. Default is 20. 
   * @param sortOrder The order to sort the collection in. Can be &#39;asc&#39; or &#39;desc&#39;.
   * @param sortBy The property to sort the collection by.
   */
  def searchEstateClaims(estateNumber: Int, page: Option[Int], pageSize: Option[Int], sortOrder: Option[String], sortBy: Option[String])(implicit apiKey: ApiKeyValue): ApiRequest[ClaimSearchResults] =
    ApiRequest[ClaimSearchResults](ApiMethods.GET, "https://virtserver.swaggerhub.com/apis/OASIS4-development/oasis4/1.4.13", "/estates/{estate-number}/claims/", "application/json")
      .withApiKey(apiKey, "Authorization", HEADER)
      .withQueryParam("page", page)
      .withQueryParam("page-size", pageSize)
      .withQueryParam("sort-order", sortOrder)
      .withQueryParam("sort-by", sortBy)
      .withPathParam("estate-number", estateNumber)
      .withSuccessResponse[ClaimSearchResults](200)
      .withErrorResponse[Unit](400)
      
  object SearchEstateClaimsHeaders { 
    def apiBusinessGovtNzRequestId(r: ApiReturnWithHeaders) = r.getStringHeader("api-business-govt-nz-Request-Id")
    def apiBusinessGovtNzCorrelationId(r: ApiReturnWithHeaders) = r.getStringHeader("api-business-govt-nz-correlation-id")
    def date(r: ApiReturnWithHeaders) = r.getDateTimeHeader("date")
    def serviceVersion(r: ApiReturnWithHeaders) = r.getStringHeader("service-version")
  }
  /**
   * Search the insolvency register for a bankrupt (current or discharged) person Question: do I need to split into SIO and Insolvency search 
   * 
   * Expected answers:
   *   code 200 :  (---- Overview ---- Get result matching estate-number  ---- Pre-conditions ---- * *  ---- Post-conditions ---- * *  ---- Error messages ---- | 400 | Not authenticated | Agent not authenticated | )
   *   code 400 :  (bad input parameter)
   * 
   * Available security schemes:
   *   jwt (apiKey)
   * 
   * @param surname Surname of the Bankrupt Person (requires one name to be searched) 
   * @param middleName Middle name of the Bankrupt Person (requires one name to be searched) 
   * @param firstName First Name of the Bankrupt Person (requires one name to be searched) 
   * @param status The status of the Insolvency, leave blank for all
   * @param page The page in the collection to return. Default is page 1.
   * @param pageSize The requested number of items to include in each page returned. Default is 20. 
   * @param sortOrder The order to sort the collection in. Can be &#39;asc&#39; or &#39;desc&#39;.
   * @param sortBy The property to sort the collection by.
   */
  def searchEstates(surname: Option[String] = None, middleName: Option[String] = None, firstName: Option[String] = None, status: Option[String] = None, page: Option[Int], pageSize: Option[Int], sortOrder: Option[String], sortBy: Option[String])(implicit apiKey: ApiKeyValue): ApiRequest[Unit] =
    ApiRequest[Unit](ApiMethods.GET, "https://virtserver.swaggerhub.com/apis/OASIS4-development/oasis4/1.4.13", "/estates", "application/json")
      .withApiKey(apiKey, "Authorization", HEADER)
      .withQueryParam("surname", surname)
      .withQueryParam("middle-name", middleName)
      .withQueryParam("first-name", firstName)
      .withQueryParam("status", status)
      .withQueryParam("page", page)
      .withQueryParam("page-size", pageSize)
      .withQueryParam("sort-order", sortOrder)
      .withQueryParam("sort-by", sortBy)
      .withSuccessResponse[Unit](200)
      .withErrorResponse[Unit](400)
      

}

