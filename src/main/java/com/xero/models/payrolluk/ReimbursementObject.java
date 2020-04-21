/*
 * Xero Payroll UK
 * This is the Xero Payroll API for orgs in the UK region.
 *
 * The version of the OpenAPI document: 2.1.0
 * Contact: api@xero.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.xero.models.payrolluk;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.xero.models.payrolluk.Pagination;
import com.xero.models.payrolluk.Problem;
import com.xero.models.payrolluk.Reimbursement;
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
 * ReimbursementObject
 */

public class ReimbursementObject {
  StringUtil util = new StringUtil();

  
  @JsonProperty("pagination")
  private Pagination pagination = null;

  
  @JsonProperty("problem")
  private Problem problem = null;

  
  @JsonProperty("reimbursement")
  private Reimbursement reimbursement = null;
  public ReimbursementObject pagination(Pagination pagination) {
    this.pagination = pagination;
    return this;
  }

   /**
   * Get pagination
   * @return pagination
  **/
  @ApiModelProperty(value = "")
  public Pagination getPagination() {
    return pagination;
  }

  public void setPagination(Pagination pagination) {
    this.pagination = pagination;
  }

  public ReimbursementObject problem(Problem problem) {
    this.problem = problem;
    return this;
  }

   /**
   * Get problem
   * @return problem
  **/
  @ApiModelProperty(value = "")
  public Problem getProblem() {
    return problem;
  }

  public void setProblem(Problem problem) {
    this.problem = problem;
  }

  public ReimbursementObject reimbursement(Reimbursement reimbursement) {
    this.reimbursement = reimbursement;
    return this;
  }

   /**
   * Get reimbursement
   * @return reimbursement
  **/
  @ApiModelProperty(value = "")
  public Reimbursement getReimbursement() {
    return reimbursement;
  }

  public void setReimbursement(Reimbursement reimbursement) {
    this.reimbursement = reimbursement;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReimbursementObject reimbursementObject = (ReimbursementObject) o;
    return Objects.equals(this.pagination, reimbursementObject.pagination) &&
        Objects.equals(this.problem, reimbursementObject.problem) &&
        Objects.equals(this.reimbursement, reimbursementObject.reimbursement);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pagination, problem, reimbursement);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReimbursementObject {\n");
    sb.append("    pagination: ").append(toIndentedString(pagination)).append("\n");
    sb.append("    problem: ").append(toIndentedString(problem)).append("\n");
    sb.append("    reimbursement: ").append(toIndentedString(reimbursement)).append("\n");
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
