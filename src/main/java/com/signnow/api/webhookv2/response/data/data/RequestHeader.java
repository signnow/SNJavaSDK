/*
 * This file is a part of signNow SDK API client.
 *
 * (с) Copyright © 2011-present airSlate Inc. (https://www.signnow.com)
 *
 * For more details on copyright, see LICENSE.md file
 * that was distributed with this source code.
 */

package com.signnow.api.webhookv2.response.data.data;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.signnow.core.data.ApiData;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

public final class RequestHeader extends ApiData {

  @JsonProperty("string_head")
  private final String stringHead;

  @JsonProperty("int_head")
  private final Integer intHead;

  @JsonProperty("bool_head")
  private final Boolean boolHead;

  @JsonProperty("float_head")
  private final Float floatHead;

  @JsonCreator
  public RequestHeader(
      @JsonProperty("string_head") String stringHead,
      @JsonProperty("int_head") Integer intHead,
      @JsonProperty("bool_head") Boolean boolHead,
      @JsonProperty("float_head") Float floatHead) {
    this.stringHead = stringHead;
    this.intHead = intHead;
    this.boolHead = boolHead;
    this.floatHead = floatHead;
  }

  public String getStringHead() {
    return this.stringHead;
  }

  public Integer getIntHead() {
    return this.intHead;
  }

  public Boolean isBoolHead() {
    return this.boolHead;
  }

  public Float getFloatHead() {
    return this.floatHead;
  }

  @NotNull
  @Override
  public Map<String, Object> toMap() {
    Map<String, Object> map = new LinkedHashMap<>();
    map.put("string_head", this.getStringHead());
    map.put("int_head", this.getIntHead());
    map.put("bool_head", this.isBoolHead());
    map.put("float_head", this.getFloatHead());
    return map;
  }

  @NotNull
  @Contract("_ -> new")
  public static RequestHeader fromMap(@NotNull Map<String, Object> data) {
    return new RequestHeader(
        (String) data.getOrDefault("string_head", null),
        (Integer) data.getOrDefault("int_head", null),
        (Boolean) data.getOrDefault("bool_head", null),
        (Float) data.getOrDefault("float_head", null));
  }
}
