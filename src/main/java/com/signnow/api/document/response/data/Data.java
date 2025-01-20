/*
 * This file is a part of signNow SDK API client.
 *
 * (с) Copyright © 2011-present airSlate Inc. (https://www.signnow.com)
 *
 * For more details on copyright, see LICENSE.md file
 * that was distributed with this source code.
 */

package com.signnow.api.document.response.data;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.signnow.core.data.ApiData;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

/**
 * Data class extends ApiData.
 * Represents the data response from the API.
 */
public final class Data extends ApiData {

  /**
   * The id of the data.
   */
  @JsonProperty("id")
  private final String id;

  /**
   * The name of the data.
   */
  @JsonProperty("name")
  private final String name;

  /**
   * The type of the data.
   */
  @JsonProperty("type")
  private final String type;

  /**
   * The value of the data.
   */
  @JsonProperty("value")
  private final String value;

  /**
   * Constructor for Data class.
   *
   * @param id    The id of the data.
   * @param name  The name of the data.
   * @param type  The type of the data.
   * @param value The value of the data.
   */
  @JsonCreator
  public Data(
      @JsonProperty("id") String id,
      @JsonProperty("name") String name,
      @JsonProperty("type") String type,
      @JsonProperty("value") String value) {
    this.id = id;
    this.name = name;
    this.type = type;
    this.value = value;
  }

  /**
   * Gets the id of the data.
   *
   * @return The id of the data.
   */
  public String getId() {
    return this.id;
  }

  /**
   * Gets the name of the data.
   *
   * @return The name of the data.
   */
  public String getName() {
    return this.name;
  }

  /**
   * Gets the type of the data.
   *
   * @return The type of the data.
   */
  public String getType() {
    return this.type;
  }

  /**
   * Gets the value of the data.
   *
   * @return The value of the data.
   */
  public String getValue() {
    return this.value;
  }

  /**
   * Converts the data to a map.
   *
   * @return A map representation of the data.
   */
  @NotNull
  @Override
  public Map<String, Object> toMap() {
    Map<String, Object> map = new LinkedHashMap<>();
    map.put("id", this.getId());
    map.put("name", this.getName());
    map.put("type", this.getType());
    map.put("value", this.getValue());
    return map;
  }

  /**
   * Creates a new Data object from a map.
   *
   * @param data The map to create the Data object from.
   * @return A new Data object.
   */
  @NotNull
  @Contract("_ -> new")
  public static Data fromMap(@NotNull Map<String, Object> data) {
    return new Data(
        (String) data.get("id"),
        (String) data.get("name"),
        (String) data.get("type"),
        (String) data.getOrDefault("value", ""));
  }
}