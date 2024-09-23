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

public final class Authentication extends ApiData {

  @JsonProperty("type")
  private final String type;

  @JsonProperty("value")
  private final String value;

  @JsonProperty("phone")
  private final String phone;

  @JsonProperty("method")
  private final String method;

  @JsonCreator
  public Authentication(
      @JsonProperty("type") String type,
      @JsonProperty("value") String value,
      @JsonProperty("phone") String phone,
      @JsonProperty("method") String method) {
    this.type = type;
    this.value = value;
    this.phone = phone;
    this.method = method;
  }

  public String getType() {
    return this.type;
  }

  public String getValue() {
    return this.value;
  }

  public String getPhone() {
    return this.phone;
  }

  public String getMethod() {
    return this.method;
  }

  @NotNull
  @Override
  public Map<String, Object> toMap() {
    Map<String, Object> map = new LinkedHashMap<>();
    map.put("type", this.getType());
    map.put("value", this.getValue());
    map.put("phone", this.getPhone());
    map.put("method", this.getMethod());
    return map;
  }

  @NotNull
  @Contract("_ -> new")
  public static Authentication fromMap(@NotNull Map<String, Object> data) {
    return new Authentication(
        (String) data.get("type"),
        (String) data.get("value"),
        (String) data.getOrDefault("phone", ""),
        (String) data.getOrDefault("method", ""));
  }
}
