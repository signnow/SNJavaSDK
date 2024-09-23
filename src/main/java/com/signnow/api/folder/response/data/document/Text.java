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

public final class Text extends ApiData {

  @JsonProperty("id")
  private final String id;

  @JsonProperty("user_id")
  private final String userId;

  @JsonProperty("page_number")
  private final String pageNumber;

  @JsonProperty("email")
  private final String email;

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

  @JsonProperty("line_height")
  private final String lineHeight;

  @JsonProperty("created")
  private final int created;

  @JsonCreator
  public Text(
      @JsonProperty("id") String id,
      @JsonProperty("user_id") String userId,
      @JsonProperty("page_number") String pageNumber,
      @JsonProperty("email") String email,
      @JsonProperty("font") String font,
      @JsonProperty("size") String size,
      @JsonProperty("data") String data,
      @JsonProperty("x") String x,
      @JsonProperty("y") String y,
      @JsonProperty("line_height") String lineHeight,
      @JsonProperty("created") int created) {
    this.id = id;
    this.userId = userId;
    this.pageNumber = pageNumber;
    this.email = email;
    this.font = font;
    this.size = size;
    this.data = data;
    this.x = x;
    this.y = y;
    this.lineHeight = lineHeight;
    this.created = created;
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

  public String getX() {
    return this.x;
  }

  public String getY() {
    return this.y;
  }

  public String getLineHeight() {
    return this.lineHeight;
  }

  public int getCreated() {
    return this.created;
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
    map.put("x", this.getX());
    map.put("y", this.getY());
    map.put("line_height", this.getLineHeight());
    map.put("created", this.getCreated());
    return map;
  }

  @NotNull
  @Contract("_ -> new")
  public static Text fromMap(@NotNull Map<String, Object> data) {
    return new Text(
        (String) data.get("id"),
        (String) data.get("user_id"),
        (String) data.get("page_number"),
        (String) data.get("email"),
        (String) data.get("font"),
        (String) data.get("size"),
        (String) data.get("data"),
        (String) data.get("x"),
        (String) data.get("y"),
        (String) data.get("line_height"),
        (Integer) data.get("created"));
  }
}
