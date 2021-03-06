/*
 * Bank Feeds API
 * This specifing endpoints Xero Bank feeds API
 *
 * The version of the OpenAPI document: 2.1.5
 * Contact: api@xero.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.xero.models.bankfeeds;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

import org.threeten.bp.OffsetDateTime;
import org.threeten.bp.LocalDateTime;
import org.threeten.bp.ZoneId;
import org.threeten.bp.Instant;
import org.threeten.bp.LocalDate;
import com.xero.api.StringUtil;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

/**
 * Pagination
 */

public class Pagination {
  StringUtil util = new StringUtil();

  @JsonProperty("page")
  private Integer page;

  @JsonProperty("pageSize")
  private Integer pageSize;

  @JsonProperty("pageCount")
  private Integer pageCount;

  @JsonProperty("itemCount")
  private Integer itemCount;
  public Pagination page(Integer page) {
    this.page = page;
    return this;
  }

   /**
   * Page number which specifies the set of records to retrieve. Example - https://api.xero.com/bankfeeds.xro/1.0/Statements?page&#x3D;2 to get the second set of the records. When page value is not a number or a negative number, by default, the first set of records is returned.
   * @return page
  **/
  @ApiModelProperty(example = "1", value = "Page number which specifies the set of records to retrieve. Example - https://api.xero.com/bankfeeds.xro/1.0/Statements?page=2 to get the second set of the records. When page value is not a number or a negative number, by default, the first set of records is returned.")
  public Integer getPage() {
    return page;
  }

  public void setPage(Integer page) {
    this.page = page;
  }

  public Pagination pageSize(Integer pageSize) {
    this.pageSize = pageSize;
    return this;
  }

   /**
   * Page size which specifies how many records per page will be returned (default 50). Example - https://api.xero.com/bankfeeds.xro/1.0/Statements?pageSize&#x3D;100 to specify page size of 100.
   * @return pageSize
  **/
  @ApiModelProperty(example = "10", value = "Page size which specifies how many records per page will be returned (default 50). Example - https://api.xero.com/bankfeeds.xro/1.0/Statements?pageSize=100 to specify page size of 100.")
  public Integer getPageSize() {
    return pageSize;
  }

  public void setPageSize(Integer pageSize) {
    this.pageSize = pageSize;
  }

  public Pagination pageCount(Integer pageCount) {
    this.pageCount = pageCount;
    return this;
  }

   /**
   * Number of pages available
   * @return pageCount
  **/
  @ApiModelProperty(example = "1", value = "Number of pages available")
  public Integer getPageCount() {
    return pageCount;
  }

  public void setPageCount(Integer pageCount) {
    this.pageCount = pageCount;
  }

  public Pagination itemCount(Integer itemCount) {
    this.itemCount = itemCount;
    return this;
  }

   /**
   * Number of items returned
   * @return itemCount
  **/
  @ApiModelProperty(example = "2", value = "Number of items returned")
  public Integer getItemCount() {
    return itemCount;
  }

  public void setItemCount(Integer itemCount) {
    this.itemCount = itemCount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Pagination pagination = (Pagination) o;
    return Objects.equals(this.page, pagination.page) &&
        Objects.equals(this.pageSize, pagination.pageSize) &&
        Objects.equals(this.pageCount, pagination.pageCount) &&
        Objects.equals(this.itemCount, pagination.itemCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(page, pageSize, pageCount, itemCount);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Pagination {\n");
    sb.append("    page: ").append(toIndentedString(page)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
    sb.append("    pageCount: ").append(toIndentedString(pageCount)).append("\n");
    sb.append("    itemCount: ").append(toIndentedString(itemCount)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

