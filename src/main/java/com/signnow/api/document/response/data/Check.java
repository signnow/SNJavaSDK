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

public final class Check extends ApiData {

  @JsonProperty("id")
  private final String id;

  @JsonProperty("page_number")
  private final String pageNumber;

  @JsonProperty("x")
  private final String x;

  @JsonProperty("y")
  private final String y;

  @JsonProperty("width")
  private final String width;

  @JsonProperty("height")
  private final String height;

  @JsonProperty("created")
  private final String created;

  @JsonProperty("allow_editing")
  private final boolean allowEditing;

  @JsonProperty("owner_as_recipient")
  private final boolean ownerAsRecipient;

  @JsonProperty("user_id")
  private final String userId;

  @JsonProperty("email")
  private final String email;

  @JsonCreator
  public Check(
      @JsonProperty("id") String id,
      @JsonProperty("page_number") String pageNumber,
      @JsonProperty("x") String x,
      @JsonProperty("y") String y,
      @JsonProperty("width") String width,
      @JsonProperty("height") String height,
      @JsonProperty("created") String created,
      @JsonProperty("allow_editing") boolean allowEditing,
      @JsonProperty("owner_as_recipient") boolean ownerAsRecipient,
      @JsonProperty("user_id") String userId,
      @JsonProperty("email") String email) {
    this.id = id;
    this.pageNumber = pageNumber;
    this.x = x;
    this.y = y;
    this.width = width;
    this.height = height;
    this.created = created;
    this.allowEditing = allowEditing;
    this.ownerAsRecipient = ownerAsRecipient;
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

  public String getWidth() {
    return this.width;
  }

  public String getHeight() {
    return this.height;
  }

  public String getCreated() {
    return this.created;
  }

  public boolean isAllowEditing() {
    return this.allowEditing;
  }

  public boolean isOwnerAsRecipient() {
    return this.ownerAsRecipient;
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
    map.put("width", this.getWidth());
    map.put("height", this.getHeight());
    map.put("created", this.getCreated());
    map.put("allow_editing", this.isAllowEditing());
    map.put("owner_as_recipient", this.isOwnerAsRecipient());
    return map;
  }

  @NotNull
  @Contract("_ -> new")
  public static Check fromMap(@NotNull Map<String, Object> data) {
    return new Check(
        (String) data.get("id"),
        (String) data.get("page_number"),
        (String) data.get("x"),
        (String) data.get("y"),
        (String) data.get("width"),
        (String) data.get("height"),
        (String) data.get("created"),
        (Boolean) data.get("allow_editing"),
        (Boolean) data.get("owner_as_recipient"),
        (String) data.getOrDefault("user_id", null),
        (String) data.getOrDefault("email", ""));
  }
}
