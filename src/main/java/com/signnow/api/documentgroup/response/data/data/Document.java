/*
 * This file is a part of signNow SDK API client.
 *
 * (с) Copyright © 2011-present airSlate Inc. (https://www.signnow.com)
 *
 * For more details on copyright, see LICENSE.md file
 * that was distributed with this source code.
 */

package com.signnow.api.documentgroup.response.data.data;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.signnow.core.data.ApiData;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

public final class Document extends ApiData {

  @JsonProperty("id")
  private final String id;

  @JsonProperty("role")
  private final String role;

  @JsonProperty("action")
  private final String action;

  @JsonCreator
  public Document(
      @JsonProperty("id") String id,
      @JsonProperty("role") String role,
      @JsonProperty("action") String action) {
    this.id = id;
    this.role = role;
    this.action = action;
  }

  public String getId() {
    return this.id;
  }

  public String getRole() {
    return this.role;
  }

  public String getAction() {
    return this.action;
  }

  @NotNull
  @Override
  public Map<String, Object> toMap() {
    Map<String, Object> map = new LinkedHashMap<>();
    map.put("id", this.getId());
    map.put("role", this.getRole());
    map.put("action", this.getAction());
    return map;
  }

  @NotNull
  @Contract("_ -> new")
  public static Document fromMap(@NotNull Map<String, Object> data) {
    return new Document(
        (String) data.get("id"), (String) data.get("role"), (String) data.get("action"));
  }
}
