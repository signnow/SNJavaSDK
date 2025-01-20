/*
 * This file is a part of signNow SDK API client.
 *
 * (с) Copyright © 2011-present airSlate Inc. (https://www.signnow.com)
 *
 * For more details on copyright, see LICENSE.md file
 * that was distributed with this source code.
 */

package com.signnow.api.documentgroupinvite.request.data.emailgroup;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.signnow.core.data.ApiData;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

/**
 * This class represents an Email object with its properties and methods.
 */
public final class Email extends ApiData {

  /**
   * The email property of the Email object.
   */
  @JsonProperty("email")
  private final String email;

  /**
   * This is a constructor for the Email class.
   *
   * @param email The email to be set for the Email object.
   */
  @JsonCreator
  public Email(@JsonProperty("email") String email) {
    this.email = email;
  }

  /**
   * This method is used to get the email of the Email object.
   *
   * @return String This returns the email of the Email object.
   */
  public String getEmail() {
    return this.email;
  }

  /**
   * This method is used to convert the Email object to a Map.
   *
   * @return Map This returns a map with the email of the Email object.
   */
  @NotNull
  @Override
  public Map<String, Object> toMap() {
    Map<String, Object> map = new LinkedHashMap<>();
    map.put("email", this.getEmail());
    return map;
  }

  /**
   * This method is used to create an Email object from a Map.
   *
   * @param data The map containing the email to be set for the Email object.
   * @return Email This returns a new Email object with the email set from the map.
   */
  @NotNull
  @Contract("_ -> new")
  public static Email fromMap(@NotNull Map<String, Object> data) {
    return new Email((String) data.get("email"));
  }
}