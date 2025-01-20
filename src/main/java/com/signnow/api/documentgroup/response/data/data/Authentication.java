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

/**
 * This class represents the Authentication data model.
 */
public final class Authentication extends ApiData {

  /**
   * The type of authentication.
   */
  @JsonProperty("type")
  private final String type;

  /**
   * The value of the authentication.
   */
  @JsonProperty("value")
  private final String value;

  /**
   * The phone number associated with the authentication.
   */
  @JsonProperty("phone")
  private final String phone;

  /**
   * The method used for authentication.
   */
  @JsonProperty("method")
  private final String method;

  /**
   * Constructs an Authentication object with the specified parameters.
   *
   * @param type   the type of authentication
   * @param value  the value of the authentication
   * @param phone  the phone number associated with the authentication
   * @param method the method used for authentication
   */
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

  /**
   * Returns the type of authentication.
   *
   * @return the type of authentication
   */
  public String getType() {
    return this.type;
  }

  /**
   * Returns the value of the authentication.
   *
   * @return the value of the authentication
   */
  public String getValue() {
    return this.value;
  }

  /**
   * Returns the phone number associated with the authentication.
   *
   * @return the phone number associated with the authentication
   */
  public String getPhone() {
    return this.phone;
  }

  /**
   * Returns the method used for authentication.
   *
   * @return the method used for authentication
   */
  public String getMethod() {
    return this.method;
  }

  /**
   * Converts this Authentication object to a Map.
   *
   * @return a Map representing this Authentication object
   */
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

  /**
   * Creates an Authentication object from a Map.
   *
   * @param data a Map containing the data for the Authentication object
   * @return a new Authentication object
   */
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