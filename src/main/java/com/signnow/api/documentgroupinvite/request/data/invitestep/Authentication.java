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

/**
 * This class represents the Authentication data for the API.
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
   * The method of authentication.
   */
  @JsonProperty("method")
  private final String method;

  /**
   * The phone number for authentication.
   */
  @JsonProperty("phone")
  private final String phone;

  /**
   * The message for authentication.
   */
  @JsonProperty("message")
  private final String message;

  /**
   * Constructs an Authentication object with the specified values.
   *
   * @param type the type of authentication
   * @param value the value of authentication
   * @param method the method of authentication
   * @param phone the phone number for authentication
   * @param message the message for authentication
   */
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

  /**
   * Returns the type of authentication.
   *
   * @return the type
   */
  public String getType() {
    return this.type;
  }

  /**
   * Returns the value of authentication.
   *
   * @return the value
   */
  public String getValue() {
    return this.value;
  }

  /**
   * Returns the method of authentication.
   *
   * @return the method
   */
  public String getMethod() {
    return this.method;
  }

  /**
   * Returns the phone number for authentication.
   *
   * @return the phone number
   */
  public String getPhone() {
    return this.phone;
  }

  /**
   * Returns the message for authentication.
   *
   * @return the message
   */
  public String getMessage() {
    return this.message;
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
    map.put("method", this.getMethod());
    map.put("phone", this.getPhone());
    map.put("message", this.getMessage());
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
        (String) data.getOrDefault("method", ""),
        (String) data.getOrDefault("phone", ""),
        (String) data.getOrDefault("message", ""));
  }
}