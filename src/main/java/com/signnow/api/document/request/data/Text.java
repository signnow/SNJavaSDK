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

public final class Text extends ApiData {

  @JsonProperty("x")
  private final int x;

  @JsonProperty("y")
  private final int y;

  @JsonProperty("size")
  private final int size;

  @JsonProperty("width")
  private final int width;

  @JsonProperty("height")
  private final int height;

  @JsonProperty("subtype")
  private final String subtype;

  @JsonProperty("page_number")
  private final int pageNumber;

  @JsonProperty("data")
  private final String data;

  @JsonProperty("font")
  private final String font;

  @JsonProperty("line_height")
  private final int lineHeight;

  @JsonProperty("field_id")
  private final String fieldId;

  @JsonCreator
  public Text(
      @JsonProperty("x") int x,
      @JsonProperty("y") int y,
      @JsonProperty("size") int size,
      @JsonProperty("width") int width,
      @JsonProperty("height") int height,
      @JsonProperty("subtype") String subtype,
      @JsonProperty("page_number") int pageNumber,
      @JsonProperty("data") String data,
      @JsonProperty("font") String font,
      @JsonProperty("line_height") int lineHeight,
      @JsonProperty("field_id") String fieldId) {
    this.x = x;
    this.y = y;
    this.size = size;
    this.width = width;
    this.height = height;
    this.subtype = subtype;
    this.pageNumber = pageNumber;
    this.data = data;
    this.font = font;
    this.lineHeight = lineHeight;
    this.fieldId = fieldId;
  }

  public Text(
      @JsonProperty("x") int x,
      @JsonProperty("y") int y,
      @JsonProperty("size") int size,
      @JsonProperty("width") int width,
      @JsonProperty("height") int height,
      @JsonProperty("page_number") int pageNumber,
      @JsonProperty("data") String data) {
    this.x = x;
    this.y = y;
    this.size = size;
    this.width = width;
    this.height = height;
    this.subtype = "text";
    this.pageNumber = pageNumber;
    this.data = data;
    this.font = null;
    this.lineHeight = 0;
    this.fieldId = null;
  }

  public int getX() {
    return this.x;
  }

  public int getY() {
    return this.y;
  }

  public int getSize() {
    return this.size;
  }

  public int getWidth() {
    return this.width;
  }

  public int getHeight() {
    return this.height;
  }

  public String getSubtype() {
    return this.subtype;
  }

  public int getPageNumber() {
    return this.pageNumber;
  }

  public String getData() {
    return this.data;
  }

  public String getFont() {
    return this.font;
  }

  public int getLineHeight() {
    return this.lineHeight;
  }

  public String getFieldId() {
    return this.fieldId;
  }

  @NotNull
  @Override
  public Map<String, Object> toMap() {
    Map<String, Object> map = new LinkedHashMap<>();
    map.put("x", this.getX());
    map.put("y", this.getY());
    map.put("size", this.getSize());
    map.put("width", this.getWidth());
    map.put("height", this.getHeight());
    map.put("subtype", this.getSubtype());
    map.put("page_number", this.getPageNumber());
    map.put("data", this.getData());
    map.put("font", this.getFont());
    map.put("line_height", this.getLineHeight());
    map.put("field_id", this.getFieldId());
    return map;
  }

  @NotNull
  @Contract("_ -> new")
  public static Text fromMap(@NotNull Map<String, Object> data) {
    return new Text(
        (int) data.get("x"),
        (int) data.get("y"),
        (int) data.get("size"),
        (int) data.get("width"),
        (int) data.get("height"),
        (String) data.get("subtype"),
        (int) data.get("page_number"),
        (String) data.get("data"),
        (String) data.get("font"),
        (int) data.get("line_height"),
        (String) data.getOrDefault("field_id", ""));
  }
}
