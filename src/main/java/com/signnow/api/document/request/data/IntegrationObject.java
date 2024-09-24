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

public final class IntegrationObject extends ApiData {

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

  @JsonProperty("page_number")
  private final int pageNumber;

  @JsonProperty("font")
  private final String font;

  @JsonProperty("data")
  private final String data;

  @JsonProperty("status")
  private final int status;

  @JsonProperty("color")
  private final String color;

  @JsonProperty("created")
  private final int created;

  @JsonProperty("active")
  private final boolean active;

  @JsonProperty("line_height")
  private final int lineHeight;

  @JsonProperty("bold")
  private final boolean bold;

  @JsonProperty("italic")
  private final boolean italic;

  @JsonProperty("underline")
  private final boolean underline;

  @JsonProperty("field_id")
  private final String fieldId;

  @JsonProperty("api_integration_id")
  private final String apiIntegrationId;

  @JsonCreator
  public IntegrationObject(
      @JsonProperty("x") int x,
      @JsonProperty("y") int y,
      @JsonProperty("size") int size,
      @JsonProperty("width") int width,
      @JsonProperty("height") int height,
      @JsonProperty("page_number") int pageNumber,
      @JsonProperty("font") String font,
      @JsonProperty("data") String data,
      @JsonProperty("status") int status,
      @JsonProperty("color") String color,
      @JsonProperty("created") int created,
      @JsonProperty("active") boolean active,
      @JsonProperty("line_height") int lineHeight,
      @JsonProperty("bold") boolean bold,
      @JsonProperty("italic") boolean italic,
      @JsonProperty("underline") boolean underline,
      @JsonProperty("field_id") String fieldId,
      @JsonProperty("api_integration_id") String apiIntegrationId) {
    this.x = x;
    this.y = y;
    this.size = size;
    this.width = width;
    this.height = height;
    this.pageNumber = pageNumber;
    this.font = font;
    this.data = data;
    this.status = status;
    this.color = color;
    this.created = created;
    this.active = active;
    this.lineHeight = lineHeight;
    this.bold = bold;
    this.italic = italic;
    this.underline = underline;
    this.fieldId = fieldId;
    this.apiIntegrationId = apiIntegrationId;
  }

  public IntegrationObject(
      @JsonProperty("x") int x,
      @JsonProperty("y") int y,
      @JsonProperty("size") int size,
      @JsonProperty("width") int width,
      @JsonProperty("height") int height,
      @JsonProperty("page_number") int pageNumber,
      @JsonProperty("font") String font,
      @JsonProperty("data") String data,
      @JsonProperty("status") int status,
      @JsonProperty("color") String color,
      @JsonProperty("created") int created,
      @JsonProperty("active") boolean active,
      @JsonProperty("line_height") int lineHeight) {
    this.x = x;
    this.y = y;
    this.size = size;
    this.width = width;
    this.height = height;
    this.pageNumber = pageNumber;
    this.font = font;
    this.data = data;
    this.status = status;
    this.color = color;
    this.created = created;
    this.active = active;
    this.lineHeight = lineHeight;
    this.bold = false;
    this.italic = false;
    this.underline = false;
    this.fieldId = null;
    this.apiIntegrationId = null;
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

  public int getPageNumber() {
    return this.pageNumber;
  }

  public String getFont() {
    return this.font;
  }

  public String getData() {
    return this.data;
  }

  public int getStatus() {
    return this.status;
  }

  public String getColor() {
    return this.color;
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

  public int getCreated() {
    return this.created;
  }

  public boolean isActive() {
    return this.active;
  }

  public int getLineHeight() {
    return this.lineHeight;
  }

  public String getFieldId() {
    return this.fieldId;
  }

  public String getApiIntegrationId() {
    return this.apiIntegrationId;
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
    map.put("page_number", this.getPageNumber());
    map.put("font", this.getFont());
    map.put("data", this.getData());
    map.put("status", this.getStatus());
    map.put("color", this.getColor());
    map.put("bold", this.isBold());
    map.put("italic", this.isItalic());
    map.put("underline", this.isUnderline());
    map.put("created", this.getCreated());
    map.put("active", this.isActive());
    map.put("line_height", this.getLineHeight());
    map.put("field_id", this.getFieldId());
    map.put("api_integration_id", this.getApiIntegrationId());
    return map;
  }

  @NotNull
  @Contract("_ -> new")
  public static IntegrationObject fromMap(@NotNull Map<String, Object> data) {
    return new IntegrationObject(
        (int) data.get("x"),
        (int) data.get("y"),
        (int) data.get("size"),
        (int) data.get("width"),
        (int) data.get("height"),
        (int) data.get("page_number"),
        (String) data.get("font"),
        (String) data.get("data"),
        (int) data.get("status"),
        (String) data.get("color"),
        (int) data.get("created"),
        (boolean) data.get("active"),
        (int) data.get("line_height"),
        (boolean) data.getOrDefault("bold", false),
        (boolean) data.getOrDefault("italic", false),
        (boolean) data.getOrDefault("underline", false),
        (String) data.getOrDefault("field_id", ""),
        (String) data.getOrDefault("api_integration_id", null));
  }
}
