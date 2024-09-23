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

  @JsonProperty("name")
  private final String name;

  @JsonProperty("label")
  private final String label;

  @JsonProperty("bold")
  private final boolean bold;

  @JsonProperty("underline")
  private final boolean underline;

  @JsonProperty("max_lines")
  private final int maxLines;

  @JsonProperty("validator_id")
  private final String validatorId;

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

  public String getName() {
    return this.name;
  }

  public String getLabel() {
    return this.label;
  }

  public boolean isBold() {
    return this.bold;
  }

  public boolean isUnderline() {
    return this.underline;
  }

  public int getMaxLines() {
    return this.maxLines;
  }

  public String getValidatorId() {
    return this.validatorId;
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
    map.put("name", this.getName());
    map.put("label", this.getLabel());
    map.put("bold", this.isBold());
    map.put("underline", this.isUnderline());
    map.put("max_lines", this.getMaxLines());
    map.put("validator_id", this.getValidatorId());
    return map;
  }

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
