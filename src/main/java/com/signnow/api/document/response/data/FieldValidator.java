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

public final class FieldValidator extends ApiData {

  @JsonProperty("id")
  private final String id;

  @JsonProperty("name")
  private final String name;

  @JsonProperty("regex_expression")
  private final String regexExpression;

  @JsonProperty("description")
  private final String description;

  @JsonProperty("scope")
  private final String scope;

  @JsonProperty("error_message")
  private final String errorMessage;

  @JsonProperty("display_json_attributes")
  private final DisplayJsonAttribute displayJsonAttributes;

  @JsonProperty("formula_calculation")
  private final String formulaCalculation;

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

  public String getId() {
    return this.id;
  }

  public String getName() {
    return this.name;
  }

  public String getRegexExpression() {
    return this.regexExpression;
  }

  public String getDescription() {
    return this.description;
  }

  public String getScope() {
    return this.scope;
  }

  public String getErrorMessage() {
    return this.errorMessage;
  }

  public DisplayJsonAttribute getDisplayJsonAttributes() {
    return this.displayJsonAttributes;
  }

  public String getFormulaCalculation() {
    return this.formulaCalculation;
  }

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
