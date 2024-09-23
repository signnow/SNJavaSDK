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

public final class Company extends ApiData {

  @JsonProperty("name")
  private final String name;

  @JsonProperty("full_access")
  private final boolean fullAccess;

  @JsonCreator
  public Company(
      @JsonProperty("name") String name, @JsonProperty("full_access") boolean fullAccess) {
    this.name = name;
    this.fullAccess = fullAccess;
  }

  public String getName() {
    return this.name;
  }

  public boolean isFullAccess() {
    return this.fullAccess;
  }

  @NotNull
  @Override
  public Map<String, Object> toMap() {
    Map<String, Object> map = new LinkedHashMap<>();
    map.put("name", this.getName());
    map.put("full_access", this.isFullAccess());
    return map;
  }

  @NotNull
  @Contract("_ -> new")
  public static Company fromMap(@NotNull Map<String, Object> data) {
    return new Company(
        (String) data.getOrDefault("name", ""), (Boolean) data.getOrDefault("full_access", false));
  }
}
