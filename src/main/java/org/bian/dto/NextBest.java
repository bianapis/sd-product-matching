package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * NextBest
 */
public class NextBest   {
  private String customerReference = null;

  private String customerProductserviceProfile = null;

  private Object customerReferenceDataRecord = null;

  private String productserviceType = null;

  private String productserviceProperties = null;

  private String matchingContextIndicator = null;

  private String customerInsightType = null;

  private String customerInsightValue = null;

  private String customerProductserviceUtilization = null;

  private String bankProductWeightingspriorities = null;

  private String productMatchingAssessmentResult = null;

  private String productMatchingAuthorizationCode = null;


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier 
   * @return customerReference
  **/

  public String getCustomerReference() {
    return customerReference;
  }

  public void setCustomerReference(String customerReference) {
    this.customerReference = customerReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text general-info: \"Customer's current use and eligibility for products/services - retrieved from SD-Customer Product/Service Eligibility using Customer Reference\" 
   * @return customerProductserviceProfile
  **/

  public String getCustomerProductserviceProfile() {
    return customerProductserviceProfile;
  }

  public void setCustomerProductserviceProfile(String customerProductserviceProfile) {
    this.customerProductserviceProfile = customerProductserviceProfile;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary general-info: \"Consolidated record of reference details\" 
   * @return customerReferenceDataRecord
  **/

  public Object getCustomerReferenceDataRecord() {
    return customerReferenceDataRecord;
  }

  public void setCustomerReferenceDataRecord(Object customerReferenceDataRecord) {
    this.customerReferenceDataRecord = customerReferenceDataRecord;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text general-info: \"Sought product category/indication of type\" 
   * @return productserviceType
  **/

  public String getProductserviceType() {
    return productserviceType;
  }

  public void setProductserviceType(String productserviceType) {
    this.productserviceType = productserviceType;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text general-info: \"Indicated desired product features\" 
   * @return productserviceProperties
  **/

  public String getProductserviceProperties() {
    return productserviceProperties;
  }

  public void setProductserviceProperties(String productserviceProperties) {
    this.productserviceProperties = productserviceProperties;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text general-info: \"e.g. solicitation, cross/up-sell, retention, relationship review\" 
   * @return matchingContextIndicator
  **/

  public String getMatchingContextIndicator() {
    return matchingContextIndicator;
  }

  public void setMatchingContextIndicator(String matchingContextIndicator) {
    this.matchingContextIndicator = matchingContextIndicator;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text general-info: \"Bank maintained indicators e.g. propensity to buy, priority...\" 
   * @return customerInsightType
  **/

  public String getCustomerInsightType() {
    return customerInsightType;
  }

  public void setCustomerInsightType(String customerInsightType) {
    this.customerInsightType = customerInsightType;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text general-info: \"Indicator value/grade\" 
   * @return customerInsightValue
  **/

  public String getCustomerInsightValue() {
    return customerInsightValue;
  }

  public void setCustomerInsightValue(String customerInsightValue) {
    this.customerInsightValue = customerInsightValue;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text general-info: \"Usage volume/frequency for in-force products\" 
   * @return customerProductserviceUtilization
  **/

  public String getCustomerProductserviceUtilization() {
    return customerProductserviceUtilization;
  }

  public void setCustomerProductserviceUtilization(String customerProductserviceUtilization) {
    this.customerProductserviceUtilization = customerProductserviceUtilization;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text general-info: \"Can influence selection to favor bank preferences\" 
   * @return bankProductWeightingspriorities
  **/

  public String getBankProductWeightingspriorities() {
    return bankProductWeightingspriorities;
  }

  public void setBankProductWeightingspriorities(String bankProductWeightingspriorities) {
    this.bankProductWeightingspriorities = bankProductWeightingspriorities;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text general-info: \"Next best product, product prioritized list\" 
   * @return productMatchingAssessmentResult
  **/

  public String getProductMatchingAssessmentResult() {
    return productMatchingAssessmentResult;
  }

  public void setProductMatchingAssessmentResult(String productMatchingAssessmentResult) {
    this.productMatchingAssessmentResult = productMatchingAssessmentResult;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code general-info: \"Used when the match requires authorization\" 
   * @return productMatchingAuthorizationCode
  **/

  public String getProductMatchingAuthorizationCode() {
    return productMatchingAuthorizationCode;
  }

  public void setProductMatchingAuthorizationCode(String productMatchingAuthorizationCode) {
    this.productMatchingAuthorizationCode = productMatchingAuthorizationCode;
  }


}

