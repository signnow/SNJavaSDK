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

/**
 * This class represents the request header data.
 */
public final class RequestHeader extends ApiData {

  /**
   * The string header property.
   */
  @JsonProperty("string_head")
  private final String stringHead;

  /**
   * The integer header property.
   */
  @JsonProperty("int_head")
  private final Integer intHead;

  /**
   * The boolean header property.
   */
  @JsonProperty("bool_head")
  private final Boolean boolHead;

  /**
   * The float header property.
   */
  @JsonProperty("float_head")
  private final Float floatHead;

  /**
   * Constructs a new RequestHeader with the specified values.
   *
   * @param stringHead the string header value
   * @param intHead the integer header value
   * @param boolHead the boolean header value
   * @param floatHead the float header value
   */
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

  /**
   * Returns the string header value.
   *
   * @return the string header value
   */
  public String getStringHead() {
    return this.stringHead;
  }

  /**
   * Returns the integer header value.
   *
   * @return the integer header value
   */
  public Integer getIntHead() {
    return this.intHead;
  }

  /**
   * Returns the boolean header value.
   *
   * @return the boolean header value
   */
  public Boolean isBoolHead() {
    return this.boolHead;
  }

  /**
   * Returns the float header value.
   *
   * @return the float header value
   */
  public Float getFloatHead() {
    return this.floatHead;
  }

  /**
   * Converts this RequestHeader to a Map.
   *
   * @return a Map representation of this RequestHeader
   */
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

  /**
   * Creates a new RequestHeader from the specified Map.
   *
   * @param data the Map to convert
   * @return a new RequestHeader with the values from the specified Map
   */
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