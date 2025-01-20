/*
 * This file is a part of signNow SDK API client.
 *
 * (с) Copyright © 2011-present airSlate Inc. (https://www.signnow.com)
 *
 * For more details on copyright, see LICENSE.md file
 * that was distributed with this source code.
 */

package com.signnow.api.folder.response.data.document;

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
   * The label of the attribute.
   */
  @JsonProperty("label")
  private final String label;

  /**
   * The name of the attribute.
   */
  @JsonProperty("name")
  private final String name;

  /**
   * The color of the attribute.
   */
  @JsonProperty("color")
  private final String color;

  /**
   * Whether the attribute is bold or not.
   */
  @JsonProperty("bold")
  private final Boolean bold;

  /**
   * Whether the attribute is italic or not.
   */
  @JsonProperty("italic")
  private final Boolean italic;

  /**
   * Whether the attribute is underlined or not.
   */
  @JsonProperty("underline")
  private final Boolean underline;

  /**
   * The alignment of the attribute.
   */
  @JsonProperty("align")
  private final String align;

  /**
   * The vertical alignment of the attribute.
   */
  @JsonProperty("valign")
  private final String valign;

  /**
   * The font of the attribute.
   */
  @JsonProperty("font")
  private final String font;

  /**
   * The size of the attribute.
   */
  @JsonProperty("size")
  private final Integer size;

  /**
   * The font size of the attribute.
   */
  @JsonProperty("font_size")
  private final Integer fontSize;

  /**
   * The arrangement of the attribute.
   */
  @JsonProperty("arrangement")
  private final String arrangement;

  /**
   * The maximum number of lines for the attribute.
   */
  @JsonProperty("max_lines")
  private final Integer maxLines;

  /**
   * The maximum number of characters for the attribute.
   */
  @JsonProperty("max_chars")
  private final Integer maxChars;

  /**
   * Constructor for JsonAttribute.
   *
   * @param pageNumber the page number
   * @param x the x-coordinate
   * @param y the y-coordinate
   * @param width the width
   * @param height the height
   * @param required whether the attribute is required or not
   * @param label the label
   * @param name the name
   * @param color the color
   * @param bold whether the attribute is bold or not
   * @param italic whether the attribute is italic or not
   * @param underline whether the attribute is underlined or not
   * @param align the alignment
   * @param valign the vertical alignment
   * @param font the font
   * @param size the size
   * @param fontSize the font size
   * @param arrangement the arrangement
   * @param maxLines the maximum number of lines
   * @param maxChars the maximum number of characters
   */
  @JsonCreator
  public JsonAttribute(
      @JsonProperty("page_number") int pageNumber,
      @JsonProperty("x") int x,
      @JsonProperty("y") int y,
      @JsonProperty("width") int width,
      @JsonProperty("height") int height,
      @JsonProperty("required") boolean required,
      @JsonProperty("label") String label,
      @JsonProperty("name") String name,
      @JsonProperty("color") String color,
      @JsonProperty("bold") Boolean bold,
      @JsonProperty("italic") Boolean italic,
      @JsonProperty("underline") Boolean underline,
      @JsonProperty("align") String align,
      @JsonProperty("valign") String valign,
      @JsonProperty("font") String font,
      @JsonProperty("size") Integer size,
      @JsonProperty("font_size") Integer fontSize,
      @JsonProperty("arrangement") String arrangement,
      @JsonProperty("max_lines") Integer maxLines,
      @JsonProperty("max_chars") Integer maxChars) {
    this.pageNumber = pageNumber;
    this.x = x;
    this.y = y;
    this.width = width;
    this.height = height;
    this.required = required;
    this.label = label;
    this.name = name;
    this.color = color;
    this.bold = bold;
    this.italic = italic;
    this.underline = underline;
    this.align = align;
    this.valign = valign;
    this.font = font;
    this.size = size;
    this.fontSize = fontSize;
    this.arrangement = arrangement;
    this.maxLines = maxLines;
    this.maxChars = maxChars;
  }

  /**
   * Returns the page number.
   *
   * @return the page number
   */
  public int getPageNumber() {
    return this.pageNumber;
  }

  /**
   * Returns the x-coordinate.
   *
   * @return the x-coordinate
   */
  public int getX() {
    return this.x;
  }

  /**
   * Returns the y-coordinate.
   *
   * @return the y-coordinate
   */
  public int getY() {
    return this.y;
  }

  /**
   * Returns the width.
   *
   * @return the width
   */
  public int getWidth() {
    return this.width;
  }

  /**
   * Returns the height.
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
   * Returns the label.
   *
   * @return the label
   */
  public String getLabel() {
    return this.label;
  }

  /**
   * Returns the name.
   *
   * @return the name
   */
  public String getName() {
    return this.name;
  }

  /**
   * Returns the color.
   *
   * @return the color
   */
  public String getColor() {
    return this.color;
  }

  /**
   * Returns whether the attribute is bold or not.
   *
   * @return true if the attribute is bold, false otherwise
   */
  public Boolean isBold() {
    return this.bold;
  }

  /**
   * Returns whether the attribute is italic or not.
   *
   * @return true if the attribute is italic, false otherwise
   */
  public Boolean isItalic() {
    return this.italic;
  }

  /**
   * Returns whether the attribute is underlined or not.
   *
   * @return true if the attribute is underlined, false otherwise
   */
  public Boolean isUnderline() {
    return this.underline;
  }

  /**
   * Returns the alignment.
   *
   * @return the alignment
   */
  public String getAlign() {
    return this.align;
  }

  /**
   * Returns the vertical alignment.
   *
   * @return the vertical alignment
   */
  public String getValign() {
    return this.valign;
  }

  /**
   * Returns the font.
   *
   * @return the font
   */
  public String getFont() {
    return this.font;
  }

  /**
   * Returns the size.
   *
   * @return the size
   */
  public Integer getSize() {
    return this.size;
  }

  /**
   * Returns the font size.
   *
   * @return the font size
   */
  public Integer getFontSize() {
    return this.fontSize;
  }

  /**
   * Returns the arrangement.
   *
   * @return the arrangement
   */
  public String getArrangement() {
    return this.arrangement;
  }

  /**
   * Returns the maximum number of lines.
   *
   * @return the maximum number of lines
   */
  public Integer getMaxLines() {
    return this.maxLines;
  }

  /**
   * Returns the maximum number of characters.
   *
   * @return the maximum number of characters
   */
  public Integer getMaxChars() {
    return this.maxChars;
  }

  /**
   * Converts this object to a map.
   *
   * @return a map representation of this object
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
    map.put("label", this.getLabel());
    map.put("name", this.getName());
    map.put("color", this.getColor());
    map.put("bold", this.isBold());
    map.put("italic", this.isItalic());
    map.put("underline", this.isUnderline());
    map.put("align", this.getAlign());
    map.put("valign", this.getValign());
    map.put("font", this.getFont());
    map.put("size", this.getSize());
    map.put("font_size", this.getFontSize());
    map.put("arrangement", this.getArrangement());
    map.put("max_lines", this.getMaxLines());
    map.put("max_chars", this.getMaxChars());
    return map;
  }

  /**
   * Creates a new JsonAttribute object from a map.
   *
   * @param data the map
   * @return a new JsonAttribute object
   */
  @NotNull
  @Contract("_ -> new")
  public static JsonAttribute fromMap(@NotNull Map<String, Object> data) {
    return new JsonAttribute(
        (int) data.get("page_number"),
        (int) data.get("x"),
        (int) data.get("y"),
        (int) data.get("width"),
        (int) data.get("height"),
        (boolean) data.get("required"),
        (String) data.getOrDefault("label", null),
        (String) data.getOrDefault("name", null),
        (String) data.getOrDefault("color", null),
        (Boolean) data.getOrDefault("bold", null),
        (Boolean) data.getOrDefault("italic", null),
        (Boolean) data.getOrDefault("underline", null),
        (String) data.getOrDefault("align", null),
        (String) data.getOrDefault("valign", null),
        (String) data.getOrDefault("font", null),
        (Integer) data.getOrDefault("size", null),
        (Integer) data.getOrDefault("font_size", null),
        (String) data.getOrDefault("arrangement", null),
        (Integer) data.getOrDefault("max_lines", null),
        (Integer) data.getOrDefault("max_chars", null));
  }
}