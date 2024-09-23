/*
 * This file is a part of signNow SDK API client.
 *
 * (с) Copyright © 2011-present airSlate Inc. (https://www.signnow.com)
 *
 * For more details on copyright, see LICENSE.md file
 * that was distributed with this source code.
 */

package com.signnow.api.embeddedinvite.request.data;

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

  @JsonProperty("password")
  private final String password;

  @JsonProperty("method")
  private final String method;

  @JsonProperty("phone")
  private final String phone;

  @JsonProperty("sms_message")
  private final String smsMessage;

  @JsonCreator
  public Authentication(
      @JsonProperty("type") String type,
      @JsonProperty("password") String password,
      @JsonProperty("method") String method,
      @JsonProperty("phone") String phone,
      @JsonProperty("sms_message") String smsMessage) {
    this.type = type;
    this.password = password;
    this.method = method;
    this.phone = phone;
    this.smsMessage = smsMessage;
  }

  public String getType() {
    return this.type;
  }

  public String getPassword() {
    return this.password;
  }

  public String getMethod() {
    return this.method;
  }

  public String getPhone() {
    return this.phone;
  }

  public String getSmsMessage() {
    return this.smsMessage;
  }

  @NotNull
  @Override
  public Map<String, Object> toMap() {
    Map<String, Object> map = new LinkedHashMap<>();
    map.put("type", this.getType());
    map.put("password", this.getPassword());
    map.put("method", this.getMethod());
    map.put("phone", this.getPhone());
    map.put("sms_message", this.getSmsMessage());
    return map;
  }

  @NotNull
  @Contract("_ -> new")
  public static Authentication fromMap(@NotNull Map<String, Object> data) {
    return new Authentication(
        (String) data.get("type"),
        (String) data.getOrDefault("password", ""),
        (String) data.getOrDefault("method", ""),
        (String) data.getOrDefault("phone", ""),
        (String) data.getOrDefault("sms_message", ""));
  }
}
