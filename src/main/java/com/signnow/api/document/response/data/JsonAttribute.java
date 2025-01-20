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
 * This class represents a JSON attribute.
 */
public final class JsonAttribute extends ApiData {

  /**
   * The page number of the attribute.
   */
  @JsonProperty("page_number")
  private final int pageNumber;

  /**
   * The x-coordinate of the attribute.
   */
  @JsonProperty("x")
  private final int x;

  /**
   * The y-coordinate of the attribute.
   */
  @JsonProperty("y")
  private final int y;

  /**
   * The width of the attribute.
   */
  @JsonProperty("width")
  private final int width;

  /**
   * The height of the attribute.
   */
  @JsonProperty("height")
  private final int height;

  /**
   * Whether the attribute is required or not.
   */
  @JsonProperty("required")
  private final boolean required;

  /**
   * The name of the attribute.
   */
  @JsonProperty("name")
  private final String name;

  /**
   * The label of the attribute.
   */
  @JsonProperty("label")
  private final String label;

  /**
   * Whether the attribute is bold or not.
   */
  @JsonProperty("bold")
  private final boolean bold;

  /**
   * Whether the attribute is underlined or not.
   */
  @JsonProperty("underline")
  private final boolean underline;

  /**
   * The maximum number of lines for the attribute.
   */
  @JsonProperty("max_lines")
  private final int maxLines;

  /**
   * The validator ID of the attribute.
   */
  @JsonProperty("validator_id")
  private final String validatorId;

  /**
   * Constructor for JsonAttribute.
   *
   * @param pageNumber the page number of the attribute
   * @param x the x-coordinate of the attribute
   * @param y the y-coordinate of the attribute
   * @param width the width of the attribute
   * @param height the height of the attribute
   * @param required whether the attribute is required or not
   * @param name the name of the attribute
   * @param label the label of the attribute
   * @param bold whether the attribute is bold or not
   * @param underline whether the attribute is underlined or not
   * @param maxLines the maximum number of lines for the attribute
   * @param validatorId the validator ID of the attribute
   */
  @JsonCreator
  public JsonAttribute(
      @JsonProperty("page_number") int pageNumber,
      @JsonProperty("x") int x,
      @JsonProperty("y") int y,
      @JsonProperty("width") int width,
      @JsonProperty("height") int height,
      @JsonProperty("required") boolean required,
      @JsonProperty("name") String name,
      @JsonProperty("label") String label,
      @JsonProperty("bold") boolean bold,
      @JsonProperty("underline") boolean underline,
      @JsonProperty("max_lines") int maxLines,
      @JsonProperty("validator_id") String validatorId) {
    this.pageNumber = pageNumber;
    this.x = x;
    this.y = y;
    this.width = width;
    this.height = height;
    this.required = required;
    this.name = name;
    this.label = label;
    this.bold = bold;
    this.underline = underline;
    this.maxLines = maxLines;
    this.validatorId = validatorId;
  }

  /**
   * Returns the page number of the attribute.
   *
   * @return the page number
   */
  public int getPageNumber() {
    return this.pageNumber;
  }

  /**
   * Returns the x-coordinate of the attribute.
   *
   * @return the x-coordinate
   */
  public int getX() {
    return this.x;
  }

  /**
   * Returns the y-coordinate of the attribute.
   *
   * @return the y-coordinate
   */
  public int getY() {
    return this.y;
  }

  /**
   * Returns the width of the attribute.
   *
   * @return the width
   */
  public int getWidth() {
    return this.width;
  }

  /**
   * Returns the height of the attribute.
   *
   * @return the height
   */
  public int getHeight() {
    return this.height;
  }

  /**
   * Returns whether the attribute is required or not.
   *
   * @return true if the attribute is required, false otherwise
   */
  public boolean isRequired() {
    return this.required;
  }

  /**
   * Returns the name of the attribute.
   *
   * @return the name
   */
  public String getName() {
    return this.name;
  }

  /**
   * Returns the label of the attribute.
   *
   * @return the label
   */
  public String getLabel() {
    return this.label;
  }

  /**
   * Returns whether the attribute is bold or not.
   *
   * @return true if the attribute is bold, false otherwise
   */
  public boolean isBold() {
    return this.bold;
  }

  /**
   * Returns whether the attribute is underlined or not.
   *
   * @return true if the attribute is underlined, false otherwise
   */
  public boolean isUnderline() {
    return this.underline;
  }

  /**
   * Returns the maximum number of lines for the attribute.
   *
   * @return the maximum number of lines
   */
  public int getMaxLines() {
    return this.maxLines;
  }

  /**
   * Returns the validator ID of the attribute.
   *
   * @return the validator ID
   */
  public String getValidatorId() {
    return this.validatorId;
  }

  /**
   * Converts the attribute to a map.
   *
   * @return a map representation of the attribute
   */
  @NotNull
  @Override
  public Map<String, Object> toMap() {
    Map<String, Object> map = new LinkedHashMap<>();
    map.put("page_number", this.getPageNumber());
    map.put("x", this.getX());
    map.put("y", this.getY());
    map.put("width", this.getWidth());
    map.put("height", this.getHeight());
    map.put("required", this.isRequired());
    map.put("name", this.getName());
    map.put("label", this.getLabel());
    map.put("bold", this.isBold());
    map.put("underline", this.isUnderline());
    map.put("max_lines", this.getMaxLines());
    map.put("validator_id", this.getValidatorId());
    return map;
  }

  /**
   * Creates a JsonAttribute from a map.
   *
   * @param data the map to create the JsonAttribute from
   * @return a new JsonAttribute
   */
  @NotNull
  @Contract("_ -> new")
  public static JsonAttribute fromMap(@NotNull Map<String, Object> data) {
    return new JsonAttribute(
        (int) data.getOrDefault("page_number", 0),
        (int) data.getOrDefault("x", 0),
        (int) data.getOrDefault("y", 0),
        (int) data.getOrDefault("width", 0),
        (int) data.getOrDefault("height", 0),
        (boolean) data.getOrDefault("required", false),
        (String) data.getOrDefault("name", ""),
        (String) data.getOrDefault("label", ""),
        (boolean) data.getOrDefault("bold", false),
        (boolean) data.getOrDefault("underline", false),
        (int) data.getOrDefault("max_lines", 0),
        (String) data.getOrDefault("validator_id", ""));
  }
}