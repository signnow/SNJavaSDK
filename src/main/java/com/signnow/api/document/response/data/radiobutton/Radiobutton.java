/*
 * This file is a part of signNow SDK API client.
 *
 * (с) Copyright © 2011-present airSlate Inc. (https://www.signnow.com)
 *
 * For more details on copyright, see LICENSE.md file
 * that was distributed with this source code.
 */

package com.signnow.api.document.response.data.radiobutton;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.signnow.core.data.ApiData;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

public final class Radiobutton extends ApiData {

  @JsonProperty("id")
  private final String id;

  @JsonProperty("user_id")
  private final String userId;

  @JsonProperty("name")
  private final String name;

  @JsonProperty("server_created_timestamp")
  private final String serverCreatedTimestamp;

  @JsonProperty("x")
  private final String x;

  @JsonProperty("y")
  private final String y;

  @JsonProperty("size")
  private final String size;

  @JsonProperty("line_height")
  private final String lineHeight;

  @JsonProperty("page_number")
  private final String pageNumber;

  @JsonProperty("is_printed")
  private final boolean isPrinted;

  @JsonProperty("font")
  private final String font;

  @JsonProperty("original_font_size")
  private final String originalFontSize;

  @JsonProperty("radio")
  private final RadioCollection radio;

  @JsonCreator
  public Radiobutton(
      @JsonProperty("id") String id,
      @JsonProperty("user_id") String userId,
      @JsonProperty("name") String name,
      @JsonProperty("server_created_timestamp") String serverCreatedTimestamp,
      @JsonProperty("x") String x,
      @JsonProperty("y") String y,
      @JsonProperty("size") String size,
      @JsonProperty("line_height") String lineHeight,
      @JsonProperty("page_number") String pageNumber,
      @JsonProperty("is_printed") boolean isPrinted,
      @JsonProperty("font") String font,
      @JsonProperty("original_font_size") String originalFontSize,
      @JsonProperty("radio") RadioCollection radio) {
    this.id = id;
    this.userId = userId;
    this.name = name;
    this.serverCreatedTimestamp = serverCreatedTimestamp;
    this.x = x;
    this.y = y;
    this.size = size;
    this.lineHeight = lineHeight;
    this.pageNumber = pageNumber;
    this.isPrinted = isPrinted;
    this.font = font;
    this.originalFontSize = originalFontSize;
    this.radio = radio;
  }

  public String getId() {
    return this.id;
  }

  public String getUserId() {
    return this.userId;
  }

  public String getName() {
    return this.name;
  }

  public String getServerCreatedTimestamp() {
    return this.serverCreatedTimestamp;
  }

  public String getX() {
    return this.x;
  }

  public String getY() {
    return this.y;
  }

  public String getSize() {
    return this.size;
  }

  public String getLineHeight() {
    return this.lineHeight;
  }

  public String getPageNumber() {
    return this.pageNumber;
  }

  public boolean isPrinted() {
    return this.isPrinted;
  }

  public String getFont() {
    return this.font;
  }

  public String getOriginalFontSize() {
    return this.originalFontSize;
  }

  public RadioCollection getRadio() {
    return this.radio;
  }

  @NotNull
  @Override
  public Map<String, Object> toMap() {
    Map<String, Object> map = new LinkedHashMap<>();
    map.put("id", this.getId());
    map.put("user_id", this.getUserId());
    map.put("name", this.getName());
    map.put("server_created_timestamp", this.getServerCreatedTimestamp());
    map.put("x", this.getX());
    map.put("y", this.getY());
    map.put("size", this.getSize());
    map.put("line_height", this.getLineHeight());
    map.put("page_number", this.getPageNumber());
    map.put("is_printed", this.isPrinted());
    map.put("font", this.getFont());
    map.put("original_font_size", this.getOriginalFontSize());
    map.put("radio", this.getRadio());
    return map;
  }

  @NotNull
  @Contract("_ -> new")
  public static Radiobutton fromMap(@NotNull Map<String, Object> data) {
    return new Radiobutton(
        (String) data.get("id"),
        (String) data.get("user_id"),
        (String) data.get("name"),
        (String) data.get("server_created_timestamp"),
        (String) data.get("x"),
        (String) data.get("y"),
        (String) data.get("size"),
        (String) data.get("line_height"),
        (String) data.get("page_number"),
        (Boolean) data.get("is_printed"),
        (String) data.get("font"),
        (String) data.get("original_font_size"),
        (RadioCollection) data.get("radio"));
  }
}
