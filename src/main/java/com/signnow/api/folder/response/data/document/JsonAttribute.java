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

public final class JsonAttribute extends ApiData {

  @JsonProperty("page_number")
  private final int pageNumber;

  @JsonProperty("x")
  private final int x;

  @JsonProperty("y")
  private final int y;

  @JsonProperty("width")
  private final int width;

  @JsonProperty("height")
  private final int height;

  @JsonProperty("required")
  private final boolean required;

  @JsonProperty("label")
  private final String label;

  @JsonProperty("name")
  private final String name;

  @JsonProperty("color")
  private final String color;

  @JsonProperty("bold")
  private final Boolean bold;

  @JsonProperty("italic")
  private final Boolean italic;

  @JsonProperty("underline")
  private final Boolean underline;

  @JsonProperty("align")
  private final String align;

  @JsonProperty("valign")
  private final String valign;

  @JsonProperty("font")
  private final String font;

  @JsonProperty("size")
  private final Integer size;

  @JsonProperty("font_size")
  private final Integer fontSize;

  @JsonProperty("arrangement")
  private final String arrangement;

  @JsonProperty("max_lines")
  private final Integer maxLines;

  @JsonProperty("max_chars")
  private final Integer maxChars;

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

  public int getPageNumber() {
    return this.pageNumber;
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

  public boolean isRequired() {
    return this.required;
  }

  public String getLabel() {
    return this.label;
  }

  public String getName() {
    return this.name;
  }

  public String getColor() {
    return this.color;
  }

  public Boolean isBold() {
    return this.bold;
  }

  public Boolean isItalic() {
    return this.italic;
  }

  public Boolean isUnderline() {
    return this.underline;
  }

  public String getAlign() {
    return this.align;
  }

  public String getValign() {
    return this.valign;
  }

  public String getFont() {
    return this.font;
  }

  public Integer getSize() {
    return this.size;
  }

  public Integer getFontSize() {
    return this.fontSize;
  }

  public String getArrangement() {
    return this.arrangement;
  }

  public Integer getMaxLines() {
    return this.maxLines;
  }

  public Integer getMaxChars() {
    return this.maxChars;
  }

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
