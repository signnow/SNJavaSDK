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

/**
 * This class represents the Authentication data for the signNow API.
 */
public final class Authentication extends ApiData {

  /**
   * The type of authentication.
   */
  @JsonProperty("type")
  private final String type;

  /**
   * The password for authentication.
   */
  @JsonProperty("password")
  private final String password;

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
   * The SMS message for authentication.
   */
  @JsonProperty("sms_message")
  private final String smsMessage;

  /**
   * Constructs an Authentication object with the specified parameters.
   *
   * @param type the type of authentication
   * @param password the password for authentication
   * @param method the method of authentication
   * @param phone the phone number for authentication
   * @param smsMessage the SMS message for authentication
   */
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

  /**
   * Returns the type of authentication.
   *
   * @return the type of authentication
   */
  public String getType() {
    return this.type;
  }

  /**
   * Returns the password for authentication.
   *
   * @return the password for authentication
   */
  public String getPassword() {
    return this.password;
  }

  /**
   * Returns the method of authentication.
   *
   * @return the method of authentication
   */
  public String getMethod() {
    return this.method;
  }

  /**
   * Returns the phone number for authentication.
   *
   * @return the phone number for authentication
   */
  public String getPhone() {
    return this.phone;
  }

  /**
   * Returns the SMS message for authentication.
   *
   * @return the SMS message for authentication
   */
  public String getSmsMessage() {
    return this.smsMessage;
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
    map.put("password", this.getPassword());
    map.put("method", this.getMethod());
    map.put("phone", this.getPhone());
    map.put("sms_message", this.getSmsMessage());
    return map;
  }

  /**
   * Creates an Authentication object from the specified Map.
   *
   * @param data a Map containing the data for the Authentication object
   * @return a new Authentication object
   */
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