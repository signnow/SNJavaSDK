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

public final class EnumerationOption extends ApiData {

  @JsonProperty("id")
  private final String id;

  @JsonProperty("page_number")
  private final String pageNumber;

  @JsonProperty("width")
  private final String width;

  @JsonProperty("height")
  private final String height;

  @JsonProperty("created")
  private final int created;

  @JsonProperty("enumeration_id")
  private final String enumerationId;

  @JsonProperty("user_id")
  private final String userId;

  @JsonProperty("data")
  private final String data;

  @JsonProperty("email")
  private final String email;

  @JsonProperty("x")
  private final String x;

  @JsonProperty("y")
  private final String y;

  @JsonCreator
  public EnumerationOption(
      @JsonProperty("id") String id,
      @JsonProperty("page_number") String pageNumber,
      @JsonProperty("width") String width,
      @JsonProperty("height") String height,
      @JsonProperty("created") int created,
      @JsonProperty("enumeration_id") String enumerationId,
      @JsonProperty("user_id") String userId,
      @JsonProperty("data") String data,
      @JsonProperty("email") String email,
      @JsonProperty("x") String x,
      @JsonProperty("y") String y) {
    this.id = id;
    this.pageNumber = pageNumber;
    this.width = width;
    this.height = height;
    this.created = created;
    this.enumerationId = enumerationId;
    this.userId = userId;
    this.data = data;
    this.email = email;
    this.x = x;
    this.y = y;
  }

  public String getId() {
    return this.id;
  }

  public String getEnumerationId() {
    return this.enumerationId;
  }

  public String getUserId() {
    return this.userId;
  }

  public String getData() {
    return this.data;
  }

  public String getEmail() {
    return this.email;
  }

  public String getPageNumber() {
    return this.pageNumber;
  }

  public String getWidth() {
    return this.width;
  }

  public String getHeight() {
    return this.height;
  }

  public String getX() {
    return this.x;
  }

  public String getY() {
    return this.y;
  }

  public int getCreated() {
    return this.created;
  }

  @NotNull
  @Override
  public Map<String, Object> toMap() {
    Map<String, Object> map = new LinkedHashMap<>();
    map.put("id", this.getId());
    map.put("enumeration_id", this.getEnumerationId());
    map.put("user_id", this.getUserId());
    map.put("data", this.getData());
    map.put("email", this.getEmail());
    map.put("page_number", this.getPageNumber());
    map.put("width", this.getWidth());
    map.put("height", this.getHeight());
    map.put("x", this.getX());
    map.put("y", this.getY());
    map.put("created", this.getCreated());
    return map;
  }

  @NotNull
  @Contract("_ -> new")
  public static EnumerationOption fromMap(@NotNull Map<String, Object> data) {
    return new EnumerationOption(
        (String) data.get("id"),
        (String) data.get("page_number"),
        (String) data.get("width"),
        (String) data.get("height"),
        (int) data.get("created"),
        (String) data.getOrDefault("enumeration_id", null),
        (String) data.getOrDefault("user_id", null),
        (String) data.getOrDefault("data", null),
        (String) data.getOrDefault("email", null),
        (String) data.getOrDefault("x", null),
        (String) data.getOrDefault("y", null));
  }
}
