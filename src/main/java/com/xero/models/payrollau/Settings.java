/*
 * Xero Payroll AU
 * This is the Xero Payroll API for orgs in Australia region.
 *
 * The version of the OpenAPI document: 2.1.5
 * Contact: api@xero.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.xero.models.payrollau;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.xero.models.payrollau.Account;
import com.xero.models.payrollau.SettingsTrackingCategories;
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
 * Settings
 */

public class Settings {
  StringUtil util = new StringUtil();

  @JsonProperty("Accounts")
  private List<Account> accounts = new ArrayList<Account>();

  @JsonProperty("TrackingCategories")
  private SettingsTrackingCategories trackingCategories = null;

  @JsonProperty("DaysInPayrollYear")
  private Integer daysInPayrollYear;
  public Settings accounts(List<Account> accounts) {
    this.accounts = accounts;
    return this;
  }

  public Settings addAccountsItem(Account accountsItem) {
    if (this.accounts == null) {
      this.accounts = new ArrayList<Account>();
    }
    this.accounts.add(accountsItem);
    return this;
  }

   /**
   * Payroll Account details for SuperExpense, SuperLiabilty, WagesExpense, PAYGLiability &amp; WagesPayable.
   * @return accounts
  **/
  @ApiModelProperty(value = "Payroll Account details for SuperExpense, SuperLiabilty, WagesExpense, PAYGLiability & WagesPayable.")
  public List<Account> getAccounts() {
    return accounts;
  }

  public void setAccounts(List<Account> accounts) {
    this.accounts = accounts;
  }

  public Settings trackingCategories(SettingsTrackingCategories trackingCategories) {
    this.trackingCategories = trackingCategories;
    return this;
  }

   /**
   * Get trackingCategories
   * @return trackingCategories
  **/
  @ApiModelProperty(value = "")
  public SettingsTrackingCategories getTrackingCategories() {
    return trackingCategories;
  }

  public void setTrackingCategories(SettingsTrackingCategories trackingCategories) {
    this.trackingCategories = trackingCategories;
  }

  public Settings daysInPayrollYear(Integer daysInPayrollYear) {
    this.daysInPayrollYear = daysInPayrollYear;
    return this;
  }

   /**
   * Number of days in the Payroll year
   * @return daysInPayrollYear
  **/
  @ApiModelProperty(example = "365", value = "Number of days in the Payroll year")
  public Integer getDaysInPayrollYear() {
    return daysInPayrollYear;
  }

  public void setDaysInPayrollYear(Integer daysInPayrollYear) {
    this.daysInPayrollYear = daysInPayrollYear;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Settings settings = (Settings) o;
    return Objects.equals(this.accounts, settings.accounts) &&
        Objects.equals(this.trackingCategories, settings.trackingCategories) &&
        Objects.equals(this.daysInPayrollYear, settings.daysInPayrollYear);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accounts, trackingCategories, daysInPayrollYear);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Settings {\n");
    sb.append("    accounts: ").append(toIndentedString(accounts)).append("\n");
    sb.append("    trackingCategories: ").append(toIndentedString(trackingCategories)).append("\n");
    sb.append("    daysInPayrollYear: ").append(toIndentedString(daysInPayrollYear)).append("\n");
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

