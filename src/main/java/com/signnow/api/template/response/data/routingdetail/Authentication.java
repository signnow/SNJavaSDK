/*
 * This file is a part of signNow SDK API client.
 *
 * (с) Copyright © 2011-present airSlate Inc. (https://www.signnow.com)
 *
 * For more details on copyright, see LICENSE.md file
 * that was distributed with this source code.
 */

package com.signnow.api.template.response.data.routingdetail;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.signnow.core.data.ApiData;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

/**
 * Represents the authentication details in the routing process.
 */
public final class Authentication extends ApiData {

  /**
   * Authentication type.
   */
  @JsonProperty("type")
  private final String type;

  /**
   * Constructs an Authentication instance.
   *
   * @param type the type of authentication, can be null.
   */
  @JsonCreator
  public Authentication(@JsonProperty("type") String type) {
    this.type = type;
  }

  /**
   * Gets the type of authentication.
   *
   * @return the type of authentication, can be null.
   */
  public String getType() {
    return this.type;
  }

  /**
   * Converts the authentication details to a map.
   *
   * @return a map representation of the authentication details.
   */
  @NotNull
  public Map<String, Object> toMap() {
    Map<String, Object> map = new LinkedHashMap<>();
    map.put("type", this.getType());
    return map;
  }

  /**
   * Creates an Authentication instance from a map.
   *
   * @param data the map containing authentication details.
   * @return a new Authentication instance.
   */
  @NotNull
  @Contract("_ -> new")
  public static Authentication fromMap(@NotNull Map<String, Object> data) {
    return new Authentication((String) data.getOrDefault("type", null));
  }
}
