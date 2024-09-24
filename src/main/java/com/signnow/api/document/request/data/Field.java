/*
 * This file is a part of signNow SDK API client.
 *
 * (с) Copyright © 2011-present airSlate Inc. (https://www.signnow.com)
 *
 * For more details on copyright, see LICENSE.md file
 * that was distributed with this source code.
 */

package com.signnow.api.document.request.data;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.signnow.core.data.ApiData;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

public final class Field extends ApiData {

  @JsonProperty("x")
  private final int x;

  @JsonProperty("y")
  private final int y;

  @JsonProperty("width")
  private final int width;

  @JsonProperty("height")
  private final int height;

  @JsonProperty("type")
  private final String type;

  @JsonProperty("page_number")
  private final int pageNumber;

  @JsonProperty("required")
  private final boolean required;

  @JsonProperty("role")
  private final String role;

  @JsonProperty("custom_defined_option")
  private final boolean customDefinedOption;

  @JsonProperty("name")
  private final String name;

  @JsonProperty("tooltip")
  private final String tooltip;

  @JsonProperty("formula")
  private final String formula;

  @JsonProperty("conditional")
  private final boolean conditional;

  @JsonProperty("stretch_to_grid")
  private final boolean stretchToGrid;

  @JsonProperty("active")
  private final boolean active;

  @JsonProperty("bold")
  private final boolean bold;

  @JsonProperty("italic")
  private final boolean italic;

  @JsonProperty("underline")
  private final boolean underline;

  @JsonProperty("subtype")
  private final String subtype;

  @JsonProperty("align")
  private final String align;

  @JsonProperty("calculation_precision")
  private final String calculationPrecision;

  @JsonProperty("color")
  private final String color;

  @JsonProperty("label")
  private final String label;

  @JsonProperty("validator_id")
  private final String validatorId;

  @JsonCreator
  public Field(
      @JsonProperty("x") int x,
      @JsonProperty("y") int y,
      @JsonProperty("width") int width,
      @JsonProperty("height") int height,
      @JsonProperty("type") String type,
      @JsonProperty("page_number") int pageNumber,
      @JsonProperty("required") boolean required,
      @JsonProperty("role") String role,
      @JsonProperty("custom_defined_option") boolean customDefinedOption,
      @JsonProperty("name") String name,
      @JsonProperty("tooltip") String tooltip,
      @JsonProperty("formula") String formula,
      @JsonProperty("conditional") boolean conditional,
      @JsonProperty("stretch_to_grid") boolean stretchToGrid,
      @JsonProperty("active") boolean active,
      @JsonProperty("bold") boolean bold,
      @JsonProperty("italic") boolean italic,
      @JsonProperty("underline") boolean underline,
      @JsonProperty("subtype") String subtype,
      @JsonProperty("align") String align,
      @JsonProperty("calculation_precision") String calculationPrecision,
      @JsonProperty("color") String color,
      @JsonProperty("label") String label,
      @JsonProperty("validator_id") String validatorId) {
    this.x = x;
    this.y = y;
    this.width = width;
    this.height = height;
    this.type = type;
    this.pageNumber = pageNumber;
    this.required = required;
    this.role = role;
    this.customDefinedOption = customDefinedOption;
    this.name = name;
    this.tooltip = tooltip;
    this.formula = formula;
    this.conditional = conditional;
    this.stretchToGrid = stretchToGrid;
    this.active = active;
    this.bold = bold;
    this.italic = italic;
    this.underline = underline;
    this.subtype = subtype;
    this.align = align;
    this.calculationPrecision = calculationPrecision;
    this.color = color;
    this.label = label;
    this.validatorId = validatorId;
  }

  public Field(
      @JsonProperty("x") int x,
      @JsonProperty("y") int y,
      @JsonProperty("width") int width,
      @JsonProperty("height") int height,
      @JsonProperty("type") String type,
      @JsonProperty("page_number") int pageNumber,
      @JsonProperty("required") boolean required,
      @JsonProperty("role") String role,
      @JsonProperty("name") String name,
      @JsonProperty("label") String label) {
    this.x = x;
    this.y = y;
    this.width = width;
    this.height = height;
    this.type = type;
    this.pageNumber = pageNumber;
    this.required = required;
    this.role = role;
    this.customDefinedOption = false;
    this.name = name;
    this.tooltip = null;
    this.formula = null;
    this.conditional = false;
    this.stretchToGrid = false;
    this.active = true;
    this.bold = false;
    this.italic = false;
    this.underline = false;
    this.subtype = null;
    this.align = null;
    this.calculationPrecision = null;
    this.color = null;
    this.label = label;
    this.validatorId = null;
  }

  public int getX() {
    return this.x;
  }

  public int getY() {
    return this.y;
  }

  public int getWidth() {
    return this.width;
  }

  public int getHeight() {
    return this.height;
  }

  public String getType() {
    return this.type;
  }

  public int getPageNumber() {
    return this.pageNumber;
  }

  public boolean isRequired() {
    return this.required;
  }

  public String getRole() {
    return this.role;
  }

  public boolean isCustomDefinedOption() {
    return this.customDefinedOption;
  }

  public String getName() {
    return this.name;
  }

  public String getTooltip() {
    return this.tooltip;
  }

  public String getFormula() {
    return this.formula;
  }

  public boolean isConditional() {
    return this.conditional;
  }

  public boolean isStretchToGrid() {
    return this.stretchToGrid;
  }

  public boolean isActive() {
    return this.active;
  }

  public boolean isBold() {
    return this.bold;
  }

  public boolean isItalic() {
    return this.italic;
  }

  public boolean isUnderline() {
    return this.underline;
  }

  public String getSubtype() {
    return this.subtype;
  }

  public String getAlign() {
    return this.align;
  }

  public String getCalculationPrecision() {
    return this.calculationPrecision;
  }

  public String getColor() {
    return this.color;
  }

  public String getLabel() {
    return this.label;
  }

  public String getValidatorId() {
    return this.validatorId;
  }

  @NotNull
  @Override
  public Map<String, Object> toMap() {
    Map<String, Object> map = new LinkedHashMap<>();
    map.put("x", this.getX());
    map.put("y", this.getY());
    map.put("width", this.getWidth());
    map.put("height", this.getHeight());
    map.put("type", this.getType());
    map.put("page_number", this.getPageNumber());
    map.put("required", this.isRequired());
    map.put("role", this.getRole());
    map.put("custom_defined_option", this.isCustomDefinedOption());
    map.put("name", this.getName());
    map.put("tooltip", this.getTooltip());
    map.put("formula", this.getFormula());
    map.put("conditional", this.isConditional());
    map.put("stretch_to_grid", this.isStretchToGrid());
    map.put("active", this.isActive());
    map.put("bold", this.isBold());
    map.put("italic", this.isItalic());
    map.put("underline", this.isUnderline());
    map.put("subtype", this.getSubtype());
    map.put("align", this.getAlign());
    map.put("calculation_precision", this.getCalculationPrecision());
    map.put("color", this.getColor());
    map.put("label", this.getLabel());
    map.put("validator_id", this.getValidatorId());
    return map;
  }

  @NotNull
  @Contract("_ -> new")
  public static Field fromMap(@NotNull Map<String, Object> data) {
    return new Field(
        (int) data.get("x"),
        (int) data.get("y"),
        (int) data.get("width"),
        (int) data.get("height"),
        (String) data.get("type"),
        (int) data.get("page_number"),
        (boolean) data.get("required"),
        (String) data.get("role"),
        (boolean) data.getOrDefault("custom_defined_option", false),
        (String) data.getOrDefault("name", ""),
        (String) data.getOrDefault("tooltip", ""),
        (String) data.getOrDefault("formula", ""),
        (boolean) data.getOrDefault("conditional", false),
        (boolean) data.getOrDefault("stretch_to_grid", false),
        (boolean) data.getOrDefault("active", true),
        (boolean) data.getOrDefault("bold", false),
        (boolean) data.getOrDefault("italic", false),
        (boolean) data.getOrDefault("underline", false),
        (String) data.getOrDefault("subtype", ""),
        (String) data.getOrDefault("align", ""),
        (String) data.getOrDefault("calculation_precision", ""),
        (String) data.getOrDefault("color", ""),
        (String) data.getOrDefault("label", ""),
        (String) data.getOrDefault("validator_id", ""));
  }
}
