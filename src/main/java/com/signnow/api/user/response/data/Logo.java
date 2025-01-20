/*
 * This file is a part of signNow SDK API client.
 *
 * (с) Copyright © 2011-present airSlate Inc. (https://www.signnow.com)
 *
 * For more details on copyright, see LICENSE.md file
 * that was distributed with this source code.
 */

package com.signnow.api.user.response.data;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.signnow.core.data.ApiData;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

/**
 * This class represents a Logo with its properties and methods.
 */
public final class Logo extends ApiData {

  /**
   * The id of the logo.
   */
  @JsonProperty("id")
  private final String id;

  /**
   * The name of the logo.
   */
  @JsonProperty("name")
  private final String name;

  /**
   * The active status of the logo.
   */
  @JsonProperty("active")
  private final boolean active;

  /**
   * Constructs a new Logo with the specified id, name, and active status.
   *
   * @param id the id of the logo
   * @param name the name of the logo
   * @param active the active status of the logo
   */
  @JsonCreator
  public Logo(
      @JsonProperty("id") String id,
      @JsonProperty("name") String name,
      @JsonProperty("active") boolean active) {
    this.id = id;
    this.name = name;
    this.active = active;
  }

  /**
   * Returns the id of the logo.
   *
   * @return the id of the logo
   */
  public String getId() {
    return this.id;
  }

  /**
   * Returns the name of the logo.
   *
   * @return the name of the logo
   */
  public String getName() {
    return this.name;
  }

  /**
   * Returns the active status of the logo.
   *
   * @return the active status of the logo
   */
  public boolean isActive() {
    return this.active;
  }

  /**
   * Returns a map representation of the logo.
   *
   * @return a map representation of the logo
   */
  @NotNull
  @Override
  public Map<String, Object> toMap() {
    Map<String, Object> map = new LinkedHashMap<>();
    map.put("id", this.getId());
    map.put("name", this.getName());
    map.put("active", this.isActive());
    return map;
  }

  /**
   * Returns a new Logo object created from the specified map.
   *
   * @param data the map containing the logo data
   * @return a new Logo object created from the specified map
   */
  @NotNull
  @Contract("_ -> new")
  public static Logo fromMap(@NotNull Map<String, Object> data) {
    return new Logo(
        (String) data.get("id"), (String) data.get("name"), (Boolean) data.get("active"));
  }
}