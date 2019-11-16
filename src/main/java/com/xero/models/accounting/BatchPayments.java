/*
 * Accounting API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 2.0.0
 * Contact: api@xero.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.xero.models.accounting;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.xero.models.accounting.BatchPayment;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

/**
 * BatchPayments
 */

public class BatchPayments {
  
  @JsonProperty("BatchPayments")
  private List<BatchPayment> batchPayments = new ArrayList<BatchPayment>();

  public BatchPayments batchPayments(List<BatchPayment> batchPayments) {
    this.batchPayments = batchPayments;
    return this;
  }

  public BatchPayments addBatchPaymentsItem(BatchPayment batchPaymentsItem) {
    if (this.batchPayments == null) {
      this.batchPayments = new ArrayList<BatchPayment>();
    }
    this.batchPayments.add(batchPaymentsItem);
    return this;
  }

   /**
   * Get batchPayments
   * @return batchPayments
  **/
  @ApiModelProperty(value = "")
  public List<BatchPayment> getBatchPayments() {
    return batchPayments;
  }

  public void setBatchPayments(List<BatchPayment> batchPayments) {
    this.batchPayments = batchPayments;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BatchPayments batchPayments = (BatchPayments) o;
    return Objects.equals(this.batchPayments, batchPayments.batchPayments);
  }

  @Override
  public int hashCode() {
    return Objects.hash(batchPayments);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BatchPayments {\n");
    sb.append("    batchPayments: ").append(toIndentedString(batchPayments)).append("\n");
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

