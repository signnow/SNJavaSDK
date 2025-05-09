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
 * This class represents a JSON attribute associated with a document field.
 * It should be treated as a metadata attribute of the field itself.
 */
public final class JsonAttribute extends ApiData {

  /**
   * The field’s page number.
   */
  @JsonProperty("page_number")
  private final int pageNumber;

  /**
   * The field’s x-coordinate on the page.
   */
  @JsonProperty("x")
  private final int x;

  /**
   * The field’s y-coordinate on the page.
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
   * Whether the field is required or not.
   */
  @JsonProperty("required")
  private final boolean required;

  /**
   * The name of the field.
   */
  @JsonProperty("name")
  private final String name;

  /**
   * The label of the field.
   */
  @JsonProperty("label")
  private final String label;

  /**
   * The color of the field.
   */
  @JsonProperty("color")
  private final String color;

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
   * Horizontal alignment of the field.
   */
  @JsonProperty("align")
  private final String align;

  /**
   * Vertical alignment of the field.
   */
  @JsonProperty("valign")
  private final String valign;

  /**
   * The font name of the field.
   */
  @JsonProperty("font")
  private final String font;

  /**
   * The font size of the field.
   */
  @JsonProperty("font_size")
  private final int fontSize;

  /**
   * The size of the field.
   */
  @JsonProperty("size")
  private final int size;

  /**
   * The arrangement of the field relative to other elements.
   */
  @JsonProperty("arrangement")
  private final String arrangement;

  /**
   * The maximum number of lines for the field.
   */
  @JsonProperty("max_lines")
  private final int maxLines;

  /**
   * The maximum number of chars for the field.
   */
  @JsonProperty("max_chars")
  private final int maxChars;

  /**
   * The validator ID of the field.
   */
  @JsonProperty("validator_id")
  private final String validatorId;

  /**
   * The text value used to prefill the field, if specified.
   */
  @JsonProperty("prefilled_text")
  private final String prefilledText;

  /**
   * Constructor for JsonAttribute.
   *
   * @param pageNumber the page number of the field
   * @param x the x-coordinate of the field
   * @param y the y-coordinate of the field
   * @param width the width of the field
   * @param height the height of the field
   * @param required whether the field is required or not
   * @param name the name of the field
   * @param label the label of the field
   * @param color the color of the field
   * @param bold whether the field is bold or not
   * @param italic whether the field is italic or not
   * @param underline whether the field is underlined or not
   * @param align the horizontal alignment
   * @param valign the vertical alignment
   * @param font font name
   * @param fontSize font size
   * @param size size
   * @param arrangement arrangement of the field relative to other elements
   * @param maxLines the maximum number of lines for the field
   * @param maxChars the maximum number of chars for the field
   * @param validatorId the validator ID of the field
   * @param prefilledText text value used to prefill the field
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
      @JsonProperty("color") String color,
      @JsonProperty("bold") boolean bold,
      @JsonProperty("italic") boolean italic,
      @JsonProperty("underline") boolean underline,
      @JsonProperty("align") String align,
      @JsonProperty("valign") String valign,
      @JsonProperty("font") String font,
      @JsonProperty("font_size") int fontSize,
      @JsonProperty("size") int size,
      @JsonProperty("arrangement") String arrangement,
      @JsonProperty("max_lines") int maxLines,
      @JsonProperty("max_chars") int maxChars,
      @JsonProperty("validator_id") String validatorId,
      @JsonProperty("prefilled_text") String prefilledText) {
    this.pageNumber = pageNumber;
    this.x = x;
    this.y = y;
    this.width = width;
    this.height = height;
    this.required = required;
    this.name = name;
    this.label = label;
    this.color = color;
    this.bold = bold;
    this.italic = italic;
    this.underline = underline;
    this.align = align;
    this.valign = valign;
    this.font = font;
    this.fontSize = fontSize;
    this.size = size;
    this.arrangement = arrangement;
    this.maxLines = maxLines;
    this.maxChars = maxChars;
    this.validatorId = validatorId;
    this.prefilledText = prefilledText;
  }

  /**
   * Returns the page number of the field.
   *
   * @return the page number
   */
  public int getPageNumber() {
    return this.pageNumber;
  }

  /**
   * Returns the x-coordinate of the field.
   *
   * @return the x-coordinate
   */
  public int getX() {
    return this.x;
  }

  /**
   * Returns the y-coordinate of the field.
   *
   * @return the y-coordinate
   */
  public int getY() {
    return this.y;
  }

  /**
   * Returns the width of the field.
   *
   * @return the width
   */
  public int getWidth() {
    return this.width;
  }

  /**
   * Returns the height of the field.
   *
   * @return the height
   */
  public int getHeight() {
    return this.height;
  }

  /**
   * Returns whether the field is required or not.
   *
   * @return true if the field is required, false otherwise
   */
  public boolean isRequired() {
    return this.required;
  }

  /**
   * Returns the name of the field.
   *
   * @return the name
   */
  public String getName() {
    return this.name;
  }

  /**
   * Returns the label of the field.
   *
   * @return the label
   */
  public String getLabel() {
    return this.label;
  }

  /**
   * Returns the color of the field.
   *
   * @return the color
   */
  public String getColor() {
    return this.color;
  }

  /**
   * Returns whether the field is bold or not.
   *
   * @return true if the field is bold, false otherwise
   */
  public boolean isBold() {
    return this.bold;
  }

  /**
   * Returns whether the field is italic or not.
   *
   * @return true if the field is italic, false otherwise
   */
  public boolean isItalic() {
    return this.italic;
  }

  /**
   * Returns whether the field is underlined or not.
   *
   * @return true if the field is underlined, false otherwise
   */
  public boolean isUnderline() {
    return this.underline;
  }

  /**
   * Returns horizontal align of the field.
   *
   * @return align
   */
  public String getAlign() {
    return this.align;
  }

  /**
   * Returns vertical align of the field.
   *
   * @return vertical align
   */
  public String getValign() {
    return this.valign;
  }

  /**
   * Returns font name.
   *
   * @return font
   */
  public String getFont() {
    return this.font;
  }

  /**
   * Returns font size.
   *
   * @return font size
   */
  public int getFontSize() {
    return this.fontSize;
  }

  /**
   * Returns size.
   *
   * @return size
   */
  public int getSize() {
    return this.size;
  }

  /**
   * Returns arrangement of the field relative to other elements.
   *
   * @return arrangement
   */
  public String getArrangement() {
    return arrangement;
  }

  /**
   * Returns the maximum number of chars for the field.
   *
   * @return the maximum number of chars
   */
  public int getMaxChars() {
    return maxChars;
  }

  /**
   * Returns the maximum number of lines for the field.
   *
   * @return the maximum number of lines
   */
  public int getMaxLines() {
    return this.maxLines;
  }

  /**
   * Returns the validator ID of the field.
   *
   * @return the validator ID
   */
  public String getValidatorId() {
    return this.validatorId;
  }

  /**
   * Returns text value used to prefill the field.
   *
   * @return the value to prefill the field
   */
  public String getPrefilledText() {
    return prefilledText;
  }

  /**
   * Converts the field to a map.
   *
   * @return a map representation of the field
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
    map.put("color", this.getColor());
    map.put("bold", this.isBold());
    map.put("italic", this.isItalic());
    map.put("underline", this.isUnderline());
    map.put("align", this.getAlign());
    map.put("valign", this.getValign());
    map.put("font", this.getFont());
    map.put("font_size", this.getFontSize());
    map.put("size", this.getSize());
    map.put("arrangement", this.getArrangement());
    map.put("max_lines", this.getMaxLines());
    map.put("max_chars", this.getMaxChars());
    map.put("validator_id", this.getValidatorId());
    map.put("prefilled_text", this.getPrefilledText());
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
        (String) data.getOrDefault("color", null),
        (boolean) data.getOrDefault("bold", false),
        (boolean) data.getOrDefault("italic", false),
        (boolean) data.getOrDefault("underline", false),
        (String) data.getOrDefault("align", ""),
        (String) data.getOrDefault("valign", ""),
        (String) data.getOrDefault("font", ""),
        (int) data.getOrDefault("font_size", 0),
        (int) data.getOrDefault("size", 0),
        (String) data.getOrDefault("arrangement", ""),
        (int) data.getOrDefault("max_lines", 0),
        (int) data.getOrDefault("max_chars", 0),
        (String) data.getOrDefault("validator_id", ""),
        (String) data.getOrDefault("prefilled_text", ""));
  }
}