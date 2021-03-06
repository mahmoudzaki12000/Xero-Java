/*
 * Xero Payroll UK
 * This is the Xero Payroll API for orgs in the UK region.
 *
 * The version of the OpenAPI document: 2.1.5
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
import com.xero.models.payrolluk.EmployeeLeaveBalance;
import com.xero.models.payrolluk.Pagination;
import com.xero.models.payrolluk.Problem;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.io.IOException;

import org.threeten.bp.OffsetDateTime;
import org.threeten.bp.LocalDateTime;
import org.threeten.bp.ZoneId;
import org.threeten.bp.Instant;
import org.threeten.bp.LocalDate;
import com.xero.api.StringUtil;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

/**
 * EmployeeLeaveBalances
 */

public class EmployeeLeaveBalances {
  StringUtil util = new StringUtil();

  @JsonProperty("pagination")
  private Pagination pagination = null;

  @JsonProperty("problem")
  private Problem problem = null;

  @JsonProperty("leaveBalances")
  private List<EmployeeLeaveBalance> leaveBalances = new ArrayList<EmployeeLeaveBalance>();
  public EmployeeLeaveBalances pagination(Pagination pagination) {
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

  public EmployeeLeaveBalances problem(Problem problem) {
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

  public EmployeeLeaveBalances leaveBalances(List<EmployeeLeaveBalance> leaveBalances) {
    this.leaveBalances = leaveBalances;
    return this;
  }

  public EmployeeLeaveBalances addLeaveBalancesItem(EmployeeLeaveBalance leaveBalancesItem) {
    if (this.leaveBalances == null) {
      this.leaveBalances = new ArrayList<EmployeeLeaveBalance>();
    }
    this.leaveBalances.add(leaveBalancesItem);
    return this;
  }

   /**
   * Get leaveBalances
   * @return leaveBalances
  **/
  @ApiModelProperty(value = "")
  public List<EmployeeLeaveBalance> getLeaveBalances() {
    return leaveBalances;
  }

  public void setLeaveBalances(List<EmployeeLeaveBalance> leaveBalances) {
    this.leaveBalances = leaveBalances;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EmployeeLeaveBalances employeeLeaveBalances = (EmployeeLeaveBalances) o;
    return Objects.equals(this.pagination, employeeLeaveBalances.pagination) &&
        Objects.equals(this.problem, employeeLeaveBalances.problem) &&
        Objects.equals(this.leaveBalances, employeeLeaveBalances.leaveBalances);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pagination, problem, leaveBalances);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmployeeLeaveBalances {\n");
    sb.append("    pagination: ").append(toIndentedString(pagination)).append("\n");
    sb.append("    problem: ").append(toIndentedString(problem)).append("\n");
    sb.append("    leaveBalances: ").append(toIndentedString(leaveBalances)).append("\n");
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

