/*
 * Xero Payroll AU
 * This is the Xero Payroll API for orgs in Australia region.
 *
 * The version of the OpenAPI document: 2.1.0
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
import com.xero.models.payrollau.State;
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
 * HomeAddress
 */

public class HomeAddress {
  StringUtil util = new StringUtil();

  
  @JsonProperty("AddressLine1")
  private String addressLine1;

  
  @JsonProperty("AddressLine2")
  private String addressLine2;

  
  @JsonProperty("City")
  private String city;

  
  @JsonProperty("Region")
  private State region;

  
  @JsonProperty("PostalCode")
  private String postalCode;

  
  @JsonProperty("Country")
  private String country;
  public HomeAddress addressLine1(String addressLine1) {
    this.addressLine1 = addressLine1;
    return this;
  }

   /**
   * Address line 1 for employee home address
   * @return addressLine1
  **/
  @ApiModelProperty(example = "123 Main St", required = true, value = "Address line 1 for employee home address")
  public String getAddressLine1() {
    return addressLine1;
  }

  public void setAddressLine1(String addressLine1) {
    this.addressLine1 = addressLine1;
  }

  public HomeAddress addressLine2(String addressLine2) {
    this.addressLine2 = addressLine2;
    return this;
  }

   /**
   * Address line 2 for employee home address
   * @return addressLine2
  **/
  @ApiModelProperty(example = "Apt 4", value = "Address line 2 for employee home address")
  public String getAddressLine2() {
    return addressLine2;
  }

  public void setAddressLine2(String addressLine2) {
    this.addressLine2 = addressLine2;
  }

  public HomeAddress city(String city) {
    this.city = city;
    return this;
  }

   /**
   * Suburb for employee home address
   * @return city
  **/
  @ApiModelProperty(example = "St. Kilda", value = "Suburb for employee home address")
  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public HomeAddress region(State region) {
    this.region = region;
    return this;
  }

   /**
   * Get region
   * @return region
  **/
  @ApiModelProperty(value = "")
  public State getRegion() {
    return region;
  }

  public void setRegion(State region) {
    this.region = region;
  }

  public HomeAddress postalCode(String postalCode) {
    this.postalCode = postalCode;
    return this;
  }

   /**
   * PostCode for employee home address
   * @return postalCode
  **/
  @ApiModelProperty(example = "3182", value = "PostCode for employee home address")
  public String getPostalCode() {
    return postalCode;
  }

  public void setPostalCode(String postalCode) {
    this.postalCode = postalCode;
  }

  public HomeAddress country(String country) {
    this.country = country;
    return this;
  }

   /**
   * Country of HomeAddress
   * @return country
  **/
  @ApiModelProperty(example = "AUSTRALIA", value = "Country of HomeAddress")
  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HomeAddress homeAddress = (HomeAddress) o;
    return Objects.equals(this.addressLine1, homeAddress.addressLine1) &&
        Objects.equals(this.addressLine2, homeAddress.addressLine2) &&
        Objects.equals(this.city, homeAddress.city) &&
        Objects.equals(this.region, homeAddress.region) &&
        Objects.equals(this.postalCode, homeAddress.postalCode) &&
        Objects.equals(this.country, homeAddress.country);
  }

  @Override
  public int hashCode() {
    return Objects.hash(addressLine1, addressLine2, city, region, postalCode, country);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HomeAddress {\n");
    sb.append("    addressLine1: ").append(toIndentedString(addressLine1)).append("\n");
    sb.append("    addressLine2: ").append(toIndentedString(addressLine2)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    region: ").append(toIndentedString(region)).append("\n");
    sb.append("    postalCode: ").append(toIndentedString(postalCode)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
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

