/*
 * This file is a part of signNow SDK API client.
 *
 * (с) Copyright © 2011-present airSlate Inc. (https://www.signnow.com)
 *
 * For more details on copyright, see LICENSE.md file
 * that was distributed with this source code.
 */

package com.signnow.api.folder.response.data.document;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.signnow.core.data.ApiData;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

/**
 * Tag class extends ApiData.
 * Represents a Tag object with type and name properties.
 */
public final class Tag extends ApiData {

  /**
   * Type of the Tag.
   */
  @JsonProperty("type")
  private final String type;

  /**
   * Name of the Tag.
   */
  @JsonProperty("name")
  private final String name;

  /**
   * Constructor for Tag class.
   *
   * @param type Type of the Tag.
   * @param name Name of the Tag.
   */
  @JsonCreator
  public Tag(@JsonProperty("type") String type, @JsonProperty("name") String name) {
    this.type = type;
    this.name = name;
  }

  /**
   * Getter for type property.
   *
   * @return String representing the type of the Tag.
   */
  public String getType() {
    return this.type;
  }

  /**
   * Getter for name property.
   *
   * @return String representing the name of the Tag.
   */
  public String getName() {
    return this.name;
  }

  /**
   * Converts the Tag object to a Map.
   *
   * @return Map with keys "type" and "name" and their corresponding values.
   */
  @NotNull
  @Override
  public Map<String, Object> toMap() {
    Map<String, Object> map = new LinkedHashMap<>();
    map.put("type", this.getType());
    map.put("name", this.getName());
    return map;
  }

  /**
   * Static factory method to create a Tag object from a Map.
   *
   * @param data Map with keys "type" and "name" and their corresponding values.
   * @return New Tag object with properties set from the Map.
   */
  @NotNull
  @Contract("_ -> new")
  public static Tag fromMap(@NotNull Map<String, Object> data) {
    return new Tag((String) data.get("type"), (String) data.get("name"));
  }
}