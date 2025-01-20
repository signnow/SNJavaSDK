/*
 * This file is a part of signNow SDK API client.
 *
 * (с) Copyright © 2011-present airSlate Inc. (https://www.signnow.com)
 *
 * For more details on copyright, see LICENSE.md file
 * that was distributed with this source code.
 */

package com.signnow.api.user.response.data.premiumaccess;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.signnow.core.data.ApiData;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

/**
 * This class represents a Marketplace object.
 */
public final class Marketplace extends ApiData {

  /**
   * The name of the marketplace.
   */
  @JsonProperty("name")
  private final String name;

  /**
   * Constructor for the Marketplace class.
   *
   * @param name The name of the marketplace.
   */
  @JsonCreator
  public Marketplace(@JsonProperty("name") String name) {
    this.name = name;
  }

  /**
   * Returns the name of the marketplace.
   *
   * @return The name of the marketplace.
   */
  public String getName() {
    return this.name;
  }

  /**
   * Converts the Marketplace object to a Map.
   *
   * @return A Map representation of the Marketplace object.
   */
  @NotNull
  @Override
  public Map<String, Object> toMap() {
    Map<String, Object> map = new LinkedHashMap<>();
    map.put("name", this.getName());
    return map;
  }

  /**
   * Creates a new Marketplace object from a Map.
   *
   * @param data The Map to convert to a Marketplace object.
   * @return A new Marketplace object.
   */
  @NotNull
  @Contract("_ -> new")
  public static Marketplace fromMap(@NotNull Map<String, Object> data) {
    return new Marketplace((String) data.getOrDefault("name", null));
  }
}