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
import com.xero.models.payrolluk.SalaryAndWage;
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
 * SalaryAndWages
 */

public class SalaryAndWages {
  StringUtil util = new StringUtil();

  
  @JsonProperty("pagination")
  private Pagination pagination = null;

  
  @JsonProperty("problem")
  private Problem problem = null;

  
  @JsonProperty("salaryAndWages")
  private List<SalaryAndWage> salaryAndWages = new ArrayList<SalaryAndWage>();
  public SalaryAndWages pagination(Pagination pagination) {
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

  public SalaryAndWages problem(Problem problem) {
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

  public SalaryAndWages salaryAndWages(List<SalaryAndWage> salaryAndWages) {
    this.salaryAndWages = salaryAndWages;
    return this;
  }

  public SalaryAndWages addSalaryAndWagesItem(SalaryAndWage salaryAndWagesItem) {
    if (this.salaryAndWages == null) {
      this.salaryAndWages = new ArrayList<SalaryAndWage>();
    }
    this.salaryAndWages.add(salaryAndWagesItem);
    return this;
  }

   /**
   * Get salaryAndWages
   * @return salaryAndWages
  **/
  @ApiModelProperty(value = "")
  public List<SalaryAndWage> getSalaryAndWages() {
    return salaryAndWages;
  }

  public void setSalaryAndWages(List<SalaryAndWage> salaryAndWages) {
    this.salaryAndWages = salaryAndWages;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SalaryAndWages salaryAndWages = (SalaryAndWages) o;
    return Objects.equals(this.pagination, salaryAndWages.pagination) &&
        Objects.equals(this.problem, salaryAndWages.problem) &&
        Objects.equals(this.salaryAndWages, salaryAndWages.salaryAndWages);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pagination, problem, salaryAndWages);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SalaryAndWages {\n");
    sb.append("    pagination: ").append(toIndentedString(pagination)).append("\n");
    sb.append("    problem: ").append(toIndentedString(problem)).append("\n");
    sb.append("    salaryAndWages: ").append(toIndentedString(salaryAndWages)).append("\n");
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

