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

public final class Hyperlink extends ApiData {

  @JsonProperty("id")
  private final String id;

  @JsonProperty("page_number")
  private final String pageNumber;

  @JsonProperty("x")
  private final String x;

  @JsonProperty("y")
  private final String y;

  @JsonProperty("font")
  private final String font;

  @JsonProperty("size")
  private final String size;

  @JsonProperty("data")
  private final String data;

  @JsonProperty("label")
  private final String label;

  @JsonProperty("line_height")
  private final String lineHeight;

  @JsonProperty("original_font_size")
  private final String originalFontSize;

  @JsonProperty("created")
  private final String created;

  @JsonProperty("allow_editing")
  private final boolean allowEditing;

  @JsonProperty("user_id")
  private final String userId;

  @JsonProperty("email")
  private final String email;

  @JsonCreator
  public Hyperlink(
      @JsonProperty("id") String id,
      @JsonProperty("page_number") String pageNumber,
      @JsonProperty("x") String x,
      @JsonProperty("y") String y,
      @JsonProperty("font") String font,
      @JsonProperty("size") String size,
      @JsonProperty("data") String data,
      @JsonProperty("label") String label,
      @JsonProperty("line_height") String lineHeight,
      @JsonProperty("original_font_size") String originalFontSize,
      @JsonProperty("created") String created,
      @JsonProperty("allow_editing") boolean allowEditing,
      @JsonProperty("user_id") String userId,
      @JsonProperty("email") String email) {
    this.id = id;
    this.pageNumber = pageNumber;
    this.x = x;
    this.y = y;
    this.font = font;
    this.size = size;
    this.data = data;
    this.label = label;
    this.lineHeight = lineHeight;
    this.originalFontSize = originalFontSize;
    this.created = created;
    this.allowEditing = allowEditing;
    this.userId = userId;
    this.email = email;
  }

  public String getId() {
    return this.id;
  }

  public String getUserId() {
    return this.userId;
  }

  public String getEmail() {
    return this.email;
  }

  public String getPageNumber() {
    return this.pageNumber;
  }

  public String getX() {
    return this.x;
  }

  public String getY() {
    return this.y;
  }

  public String getFont() {
    return this.font;
  }

  public String getSize() {
    return this.size;
  }

  public String getData() {
    return this.data;
  }

  public String getLabel() {
    return this.label;
  }

  public String getLineHeight() {
    return this.lineHeight;
  }

  public String getOriginalFontSize() {
    return this.originalFontSize;
  }

  public String getCreated() {
    return this.created;
  }

  public boolean isAllowEditing() {
    return this.allowEditing;
  }

  @NotNull
  @Override
  public Map<String, Object> toMap() {
    Map<String, Object> map = new LinkedHashMap<>();
    map.put("id", this.getId());
    map.put("user_id", this.getUserId());
    map.put("email", this.getEmail());
    map.put("page_number", this.getPageNumber());
    map.put("x", this.getX());
    map.put("y", this.getY());
    map.put("font", this.getFont());
    map.put("size", this.getSize());
    map.put("data", this.getData());
    map.put("label", this.getLabel());
    map.put("line_height", this.getLineHeight());
    map.put("original_font_size", this.getOriginalFontSize());
    map.put("created", this.getCreated());
    map.put("allow_editing", this.isAllowEditing());
    return map;
  }

  @NotNull
  @Contract("_ -> new")
  public static Hyperlink fromMap(@NotNull Map<String, Object> data) {
    return new Hyperlink(
        (String) data.get("id"),
        (String) data.get("page_number"),
        (String) data.get("x"),
        (String) data.get("y"),
        (String) data.get("font"),
        (String) data.get("size"),
        (String) data.get("data"),
        (String) data.get("label"),
        (String) data.get("line_height"),
        (String) data.get("original_font_size"),
        (String) data.get("created"),
        (Boolean) data.get("allow_editing"),
        (String) data.getOrDefault("user_id", null),
        (String) data.getOrDefault("email", ""));
  }
}
