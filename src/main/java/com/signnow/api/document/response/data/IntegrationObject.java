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
import com.signnow.core.util.Cast;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

public final class IntegrationObject extends ApiData {

  @JsonProperty("id")
  private final String id;

  @JsonProperty("page_number")
  private final String pageNumber;

  @JsonProperty("font")
  private final String font;

  @JsonProperty("size")
  private final String size;

  @JsonProperty("data")
  private final String data;

  @JsonProperty("x")
  private final String x;

  @JsonProperty("y")
  private final String y;

  @JsonProperty("json_attributes")
  private final JsonAttribute jsonAttributes;

  @JsonProperty("line_height")
  private final float lineHeight;

  @JsonProperty("user_id")
  private final String userId;

  @JsonProperty("email")
  private final String email;

  @JsonProperty("api_integration_id")
  private final String apiIntegrationId;

  @JsonProperty("created")
  private final String created;

  @JsonProperty("allow_editing")
  private final boolean allowEditing;

  @JsonProperty("width")
  private final String width;

  @JsonProperty("height")
  private final String height;

  @JsonCreator
  public IntegrationObject(
      @JsonProperty("id") String id,
      @JsonProperty("page_number") String pageNumber,
      @JsonProperty("font") String font,
      @JsonProperty("size") String size,
      @JsonProperty("data") String data,
      @JsonProperty("x") String x,
      @JsonProperty("y") String y,
      @JsonProperty("json_attributes") JsonAttribute jsonAttributes,
      @JsonProperty("line_height") float lineHeight,
      @JsonProperty("user_id") String userId,
      @JsonProperty("email") String email,
      @JsonProperty("api_integration_id") String apiIntegrationId,
      @JsonProperty("created") String created,
      @JsonProperty("allow_editing") boolean allowEditing,
      @JsonProperty("width") String width,
      @JsonProperty("height") String height) {
    this.id = id;
    this.pageNumber = pageNumber;
    this.font = font;
    this.size = size;
    this.data = data;
    this.x = x;
    this.y = y;
    this.jsonAttributes = jsonAttributes;
    this.lineHeight = lineHeight;
    this.userId = userId;
    this.email = email;
    this.apiIntegrationId = apiIntegrationId;
    this.created = created;
    this.allowEditing = allowEditing;
    this.width = width;
    this.height = height;
  }

  public String getId() {
    return this.id;
  }

  public String getUserId() {
    return this.userId;
  }

  public String getPageNumber() {
    return this.pageNumber;
  }

  public String getEmail() {
    return this.email;
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

  public String getApiIntegrationId() {
    return this.apiIntegrationId;
  }

  public String getX() {
    return this.x;
  }

  public String getY() {
    return this.y;
  }

  public JsonAttribute getJsonAttributes() {
    return this.jsonAttributes;
  }

  public String getCreated() {
    return this.created;
  }

  public float getLineHeight() {
    return this.lineHeight;
  }

  public boolean isAllowEditing() {
    return this.allowEditing;
  }

  public String getWidth() {
    return this.width;
  }

  public String getHeight() {
    return this.height;
  }

  @NotNull
  @Override
  public Map<String, Object> toMap() {
    Map<String, Object> map = new LinkedHashMap<>();
    map.put("id", this.getId());
    map.put("user_id", this.getUserId());
    map.put("page_number", this.getPageNumber());
    map.put("email", this.getEmail());
    map.put("font", this.getFont());
    map.put("size", this.getSize());
    map.put("data", this.getData());
    map.put("api_integration_id", this.getApiIntegrationId());
    map.put("x", this.getX());
    map.put("y", this.getY());
    map.put("json_attributes", this.getJsonAttributes());
    map.put("created", this.getCreated());
    map.put("line_height", this.getLineHeight());
    map.put("allow_editing", this.isAllowEditing());
    map.put("width", this.getWidth());
    map.put("height", this.getHeight());
    return map;
  }

  @NotNull
  @Contract("_ -> new")
  public static IntegrationObject fromMap(@NotNull Map<String, Object> data) {
    return new IntegrationObject(
        (String) data.get("id"),
        (String) data.get("page_number"),
        (String) data.get("font"),
        (String) data.get("size"),
        (String) data.get("data"),
        (String) data.get("x"),
        (String) data.get("y"),
        JsonAttribute.fromMap(
            Cast.safeToMap(data.get("json_attributes"), String.class, Object.class)),
        (Float) data.get("line_height"),
        (String) data.getOrDefault("user_id", null),
        (String) data.getOrDefault("email", null),
        (String) data.getOrDefault("api_integration_id", null),
        (String) data.getOrDefault("created", ""),
        (Boolean) data.getOrDefault("allow_editing", false),
        (String) data.getOrDefault("width", ""),
        (String) data.getOrDefault("height", ""));
  }
}
