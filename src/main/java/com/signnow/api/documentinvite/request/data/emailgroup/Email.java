/*
 * This file is a part of signNow SDK API client.
 *
 * (с) Copyright © 2011-present airSlate Inc. (https://www.signnow.com)
 *
 * For more details on copyright, see LICENSE.md file
 * that was distributed with this source code.
 */

package com.signnow.api.documentinvite.request.data.emailgroup;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.signnow.core.data.ApiData;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

/**
 * Email class extends ApiData.
 * Represents an email object with a single property - email.
 */
public class Email extends ApiData {

  /**
   * The email property of the Email object.
   */
  @JsonProperty("email")
  private final String email;

  /**
   * Constructor for the Email class.
   *
   * @param email The email string to be set as the email property of the Email object.
   */
  @JsonCreator
  public Email(@JsonProperty("email") String email) {
    this.email = email;
  }

  /**
   * Getter for the email property of the Email object.
   *
   * @return The email string of the Email object.
   */
  public String getEmail() {
    return this.email;
  }

  /**
   * Converts the Email object to a Map.
   *
   * @return A Map with a single entry. The key is "email" and the value is the email property of the Email object.
   */
  @NotNull
  @Override
  public Map<String, Object> toMap() {
    Map<String, Object> map = new LinkedHashMap<>();
    map.put("email", this.getEmail());
    return map;
  }

  /**
   * Static factory method to create an Email object from a Map.
   *
   * @param data A Map with a single entry. The key should be "email" and the value should be a string.
   * @return A new Email object with the email property set to the value from the Map.
   */
  @NotNull
  @Contract("_ -> new")
  public static Email fromMap(@NotNull Map<String, Object> data) {
    return new Email((String) data.get("email"));
  }
}