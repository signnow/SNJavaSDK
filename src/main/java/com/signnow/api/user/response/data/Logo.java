/*
 * This file is a part of signNow SDK API client.
 *
 * (с) Copyright © 2011-present airSlate Inc. (https://www.signnow.com)
 *
 * For more details on copyright, see LICENSE.md file
 * that was distributed with this source code.
 */

package com.signnow.api.user.response.data;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.signnow.core.data.ApiData;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

public final class Logo extends ApiData {

  @JsonProperty("id")
  private final String id;

  @JsonProperty("name")
  private final String name;

  @JsonProperty("active")
  private final boolean active;

  @JsonCreator
  public Logo(
      @JsonProperty("id") String id,
      @JsonProperty("name") String name,
      @JsonProperty("active") boolean active) {
    this.id = id;
    this.name = name;
    this.active = active;
  }

  public String getId() {
    return this.id;
  }

  public String getName() {
    return this.name;
  }

  public boolean isActive() {
    return this.active;
  }

  @NotNull
  @Override
  public Map<String, Object> toMap() {
    Map<String, Object> map = new LinkedHashMap<>();
    map.put("id", this.getId());
    map.put("name", this.getName());
    map.put("active", this.isActive());
    return map;
  }

  @NotNull
  @Contract("_ -> new")
  public static Logo fromMap(@NotNull Map<String, Object> data) {
    return new Logo(
        (String) data.get("id"), (String) data.get("name"), (Boolean) data.get("active"));
  }
}
