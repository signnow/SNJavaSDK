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

/**
 * This class represents a Field in the signNow API.
 */
public final class Field extends ApiData {

  /**
   * The x-coordinate of the field.
   */
  @JsonProperty("x")
  private final int x;

  /**
   * The y-coordinate of the field.
   */
  @JsonProperty("y")
  private final int y;

  /**
   * The width of the field.
   */
  @JsonProperty("width")
  private final int width;

  /**
   * The height of the field.
   */
  @JsonProperty("height")
  private final int height;

  /**
   * The type of the field.
   */
  @JsonProperty("type")
  private final String type;

  /**
   * The page number where the field is located.
   */
  @JsonProperty("page_number")
  private final int pageNumber;

  /**
   * Whether the field is required or not.
   */
  @JsonProperty("required")
  private final boolean required;

  /**
   * The role of the field.
   */
  @JsonProperty("role")
  private final String role;

  /**
   * Whether the field has a custom defined option or not.
   */
  @JsonProperty("custom_defined_option")
  private final boolean customDefinedOption;

  /**
   * The name of the field.
   */
  @JsonProperty("name")
  private final String name;

  /**
   * The tooltip of the field.
   */
  @JsonProperty("tooltip")
  private final String tooltip;

  /**
   * The formula of the field.
   */
  @JsonProperty("formula")
  private final String formula;

  /**
   * Whether the field is conditional or not.
   */
  @JsonProperty("conditional")
  private final boolean conditional;

  /**
   * Whether the field is stretched to grid or not.
   */
  @JsonProperty("stretch_to_grid")
  private final boolean stretchToGrid;

  /**
   * Whether the field is active or not.
   */
  @JsonProperty("active")
  private final boolean active;

  /**
   * Whether the field is bold or not.
   */
  @JsonProperty("bold")
  private final boolean bold;

  /**
   * Whether the field is italic or not.
   */
  @JsonProperty("italic")
  private final boolean italic;

  /**
   * Whether the field is underlined or not.
   */
  @JsonProperty("underline")
  private final boolean underline;

  /**
   * The subtype of the field.
   */
  @JsonProperty("subtype")
  private final String subtype;

  /**
   * The alignment of the field.
   */
  @JsonProperty("align")
  private final String align;

  /**
   * The calculation precision of the field.
   */
  @JsonProperty("calculation_precision")
  private final String calculationPrecision;

  /**
   * The color of the field.
   */
  @JsonProperty("color")
  private final String color;

  /**
   * The label of the field.
   */
  @JsonProperty("label")
  private final String label;

  /**
   * The validator id of the field.
   */
  @JsonProperty("validator_id")
  private final String validatorId;

  /**
   * Constructor for Field class.
   *
   * @param x The x-coordinate of the field.
   * @param y The y-coordinate of the field.
   * @param width The width of the field.
   * @param height The height of the field.
   * @param type The type of the field.
   * @param pageNumber The page number where the field is located.
   * @param required Whether the field is required or not.
   * @param role The role of the field.
   * @param customDefinedOption Whether the field has a custom defined option or not.
   * @param name The name of the field.
   * @param tooltip The tooltip of the field.
   * @param formula The formula of the field.
   * @param conditional Whether the field is conditional or not.
   * @param stretchToGrid Whether the field is stretched to grid or not.
   * @param active Whether the field is active or not.
   * @param bold Whether the field is bold or not.
   * @param italic Whether the field is italic or not.
   * @param underline Whether the field is underlined or not.
   * @param subtype The subtype of the field.
   * @param align The alignment of the field.
   * @param calculationPrecision The calculation precision of the field.
   * @param color The color of the field.
   * @param label The label of the field.
   * @param validatorId The validator id of the field.
   */
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

  /**
   * Constructor for Field class with fewer parameters.
   *
   * @param x The x-coordinate of the field.
   * @param y The y-coordinate of the field.
   * @param width The width of the field.
   * @param height The height of the field.
   * @param type The type of the field.
   * @param pageNumber The page number where the field is located.
   * @param required Whether the field is required or not.
   * @param role The role of the field.
   * @param name The name of the field.
   * @param label The label of the field.
   */
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

  /**
   * Returns the x-coordinate of the field.
   *
   * @return The x-coordinate of the field.
   */
  public int getX() {
    return this.x;
  }

  /**
   * Returns the y-coordinate of the field.
   *
   * @return The y-coordinate of the field.
   */
  public int getY() {
    return this.y;
  }

  /**
   * Returns the width of the field.
   *
   * @return The width of the field.
   */
  public int getWidth() {
    return this.width;
  }

  /**
   * Returns the height of the field.
   *
   * @return The height of the field.
   */
  public int getHeight() {
    return this.height;
  }

  /**
   * Returns the type of the field.
   *
   * @return The type of the field.
   */
  public String getType() {
    return this.type;
  }

  /**
   * Returns the page number where the field is located.
   *
   * @return The page number where the field is located.
   */
  public int getPageNumber() {
    return this.pageNumber;
  }

  /**
   * Returns whether the field is required or not.
   *
   * @return Whether the field is required or not.
   */
  public boolean isRequired() {
    return this.required;
  }

  /**
   * Returns the role of the field.
   *
   * @return The role of the field.
   */
  public String getRole() {
    return this.role;
  }

  /**
   * Returns whether the field has a custom defined option or not.
   *
   * @return Whether the field has a custom defined option or not.
   */
  public boolean isCustomDefinedOption() {
    return this.customDefinedOption;
  }

  /**
   * Returns the name of the field.
   *
   * @return The name of the field.
   */
  public String getName() {
    return this.name;
  }

  /**
   * Returns the tooltip of the field.
   *
   * @return The tooltip of the field.
   */
  public String getTooltip() {
    return this.tooltip;
  }

  /**
   * Returns the formula of the field.
   *
   * @return The formula of the field.
   */
  public String getFormula() {
    return this.formula;
  }

  /**
   * Returns whether the field is conditional or not.
   *
   * @return Whether the field is conditional or not.
   */
  public boolean isConditional() {
    return this.conditional;
  }

  /**
   * Returns whether the field is stretched to grid or not.
   *
   * @return Whether the field is stretched to grid or not.
   */
  public boolean isStretchToGrid() {
    return this.stretchToGrid;
  }

  /**
   * Returns whether the field is active or not.
   *
   * @return Whether the field is active or not.
   */
  public boolean isActive() {
    return this.active;
  }

  /**
   * Returns whether the field is bold or not.
   *
   * @return Whether the field is bold or not.
   */
  public boolean isBold() {
    return this.bold;
  }

  /**
   * Returns whether the field is italic or not.
   *
   * @return Whether the field is italic or not.
   */
  public boolean isItalic() {
    return this.italic;
  }

  /**
   * Returns whether the field is underlined or not.
   *
   * @return Whether the field is underlined or not.
   */
  public boolean isUnderline() {
    return this.underline;
  }

  /**
   * Returns the subtype of the field.
   *
   * @return The subtype of the field.
   */
  public String getSubtype() {
    return this.subtype;
  }

  /**
   * Returns the alignment of the field.
   *
   * @return The alignment of the field.
   */
  public String getAlign() {
    return this.align;
  }

  /**
   * Returns the calculation precision of the field.
   *
   * @return The calculation precision of the field.
   */
  public String getCalculationPrecision() {
    return this.calculationPrecision;
  }

  /**
   * Returns the color of the field.
   *
   * @return The color of the field.
   */
  public String getColor() {
    return this.color;
  }

  /**
   * Returns the label of the field.
   *
   * @return The label of the field.
   */
  public String getLabel() {
    return this.label;
  }

  /**
   * Returns the validator id of the field.
   *
   * @return The validator id of the field.
   */
  public String getValidatorId() {
    return this.validatorId;
  }

  /**
   * Converts the field to a map.
   *
   * @return A map representing the field.
   */
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

  /**
   * Creates a Field object from a map.
   *
   * @param data The map representing the field.
   * @return A Field object.
   */
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