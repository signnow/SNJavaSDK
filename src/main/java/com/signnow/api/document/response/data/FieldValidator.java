/*
 * This file is a part of signNow SDK API client.
 *
 * (с) Copyright © 2011-present airSlate Inc. (https://www.signnow.com)
 *
 * For more details on copyright, see LICENSE.md file
 * that was distributed with this source code.
 */

package com.signnow.api.document.response.data;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.signnow.core.data.ApiData;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

/**
 * This class represents a field validator in the signNow API.
 */
public final class FieldValidator extends ApiData {

  /**
   * The unique identifier of the field validator.
   */
  @JsonProperty("id")
  private final String id;

  /**
   * The name of the field validator.
   */
  @JsonProperty("name")
  private final String name;

  /**
   * The regular expression used by the field validator.
   */
  @JsonProperty("regex_expression")
  private final String regexExpression;

  /**
   * The description of the field validator.
   */
  @JsonProperty("description")
  private final String description;

  /**
   * The scope of the field validator.
   */
  @JsonProperty("scope")
  private final String scope;

  /**
   * The error message displayed when the field validation fails.
   */
  @JsonProperty("error_message")
  private final String errorMessage;

  /**
   * The display attributes of the field validator in JSON format.
   */
  @JsonProperty("display_json_attributes")
  private final DisplayJsonAttribute displayJsonAttributes;

  /**
   * The formula used for calculation in the field validator.
   */
  @JsonProperty("formula_calculation")
  private final String formulaCalculation;

  /**
   * Constructs a new FieldValidator with the specified details.
   *
   * @param id the unique identifier of the field validator
   * @param name the name of the field validator
   * @param regexExpression the regular expression used by the field validator
   * @param description the description of the field validator
   * @param scope the scope of the field validator
   * @param errorMessage the error message displayed when the field validation fails
   * @param displayJsonAttributes the display attributes of the field validator in JSON format
   * @param formulaCalculation the formula used for calculation in the field validator
   */
  @JsonCreator
  public FieldValidator(
      @JsonProperty("id") String id,
      @JsonProperty("name") String name,
      @JsonProperty("regex_expression") String regexExpression,
      @JsonProperty("description") String description,
      @JsonProperty("scope") String scope,
      @JsonProperty("error_message") String errorMessage,
      @JsonProperty("display_json_attributes") DisplayJsonAttribute displayJsonAttributes,
      @JsonProperty("formula_calculation") String formulaCalculation) {
    this.id = id;
    this.name = name;
    this.regexExpression = regexExpression;
    this.description = description;
    this.scope = scope;
    this.errorMessage = errorMessage;
    this.displayJsonAttributes = displayJsonAttributes;
    this.formulaCalculation = formulaCalculation;
  }

  /**
   * Returns the unique identifier of the field validator.
   *
   * @return the unique identifier of the field validator
   */
  public String getId() {
    return this.id;
  }

  /**
   * Returns the name of the field validator.
   *
   * @return the name of the field validator
   */
  public String getName() {
    return this.name;
  }

  /**
   * Returns the regular expression used by the field validator.
   *
   * @return the regular expression used by the field validator
   */
  public String getRegexExpression() {
    return this.regexExpression;
  }

  /**
   * Returns the description of the field validator.
   *
   * @return the description of the field validator
   */
  public String getDescription() {
    return this.description;
  }

  /**
   * Returns the scope of the field validator.
   *
   * @return the scope of the field validator
   */
  public String getScope() {
    return this.scope;
  }

  /**
   * Returns the error message displayed when the field validation fails.
   *
   * @return the error message displayed when the field validation fails
   */
  public String getErrorMessage() {
    return this.errorMessage;
  }

  /**
   * Returns the display attributes of the field validator in JSON format.
   *
   * @return the display attributes of the field validator in JSON format
   */
  public DisplayJsonAttribute getDisplayJsonAttributes() {
    return this.displayJsonAttributes;
  }

  /**
   * Returns the formula used for calculation in the field validator.
   *
   * @return the formula used for calculation in the field validator
   */
  public String getFormulaCalculation() {
    return this.formulaCalculation;
  }

  /**
   * Converts the field validator to a map.
   *
   * @return a map representing the field validator
   */
  @NotNull
  @Override
  public Map<String, Object> toMap() {
    Map<String, Object> map = new LinkedHashMap<>();
    map.put("id", this.getId());
    map.put("name", this.getName());
    map.put("regex_expression", this.getRegexExpression());
    map.put("description", this.getDescription());
    map.put("scope", this.getScope());
    map.put("error_message", this.getErrorMessage());
    map.put("display_json_attributes", this.getDisplayJsonAttributes());
    map.put("formula_calculation", this.getFormulaCalculation());
    return map;
  }

  /**
   * Creates a new FieldValidator from the specified map.
   *
   * @param data a map containing the details of the field validator
   * @return a new FieldValidator created from the specified map
   */
  @NotNull
  @Contract("_ -> new")
  public static FieldValidator fromMap(@NotNull Map<String, Object> data) {
    return new FieldValidator(
        (String) data.get("id"),
        (String) data.get("name"),
        (String) data.get("regex_expression"),
        (String) data.get("description"),
        (String) data.get("scope"),
        (String) data.getOrDefault("error_message", ""),
        (DisplayJsonAttribute) data.get("display_json_attributes"),
        (String) data.getOrDefault("formula_calculation", ""));
  }
}