/*
 * This file is a part of signNow SDK API client.
 *
 * (с) Copyright © 2011-present airSlate Inc. (https://www.signnow.com)
 *
 * For more details on copyright, see LICENSE.md file
 * that was distributed with this source code.
 */

package com.signnow.api.documentgroupinvite.request.data.invitestep;

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

  @JsonProperty("method")
  private final String method;

  @JsonProperty("phone")
  private final String phone;

  @JsonProperty("message")
  private final String message;

  @JsonCreator
  public Authentication(
      @JsonProperty("type") String type,
      @JsonProperty("value") String value,
      @JsonProperty("method") String method,
      @JsonProperty("phone") String phone,
      @JsonProperty("message") String message) {
    this.type = type;
    this.value = value;
    this.method = method;
    this.phone = phone;
    this.message = message;
  }

  public String getType() {
    return this.type;
  }

  public String getValue() {
    return this.value;
  }

  public String getMethod() {
    return this.method;
  }

  public String getPhone() {
    return this.phone;
  }

  public String getMessage() {
    return this.message;
  }

  @NotNull
  @Override
  public Map<String, Object> toMap() {
    Map<String, Object> map = new LinkedHashMap<>();
    map.put("type", this.getType());
    map.put("value", this.getValue());
    map.put("method", this.getMethod());
    map.put("phone", this.getPhone());
    map.put("message", this.getMessage());
    return map;
  }

  @NotNull
  @Contract("_ -> new")
  public static Authentication fromMap(@NotNull Map<String, Object> data) {
    return new Authentication(
        (String) data.get("type"),
        (String) data.get("value"),
        (String) data.getOrDefault("method", ""),
        (String) data.getOrDefault("phone", ""),
        (String) data.getOrDefault("message", ""));
  }
}
