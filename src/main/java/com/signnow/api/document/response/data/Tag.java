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
 * This class represents a Tag in the signNow API.
 */
public final class Tag extends ApiData {

  /**
   * The type of the tag.
   */
  @JsonProperty("type")
  private final String type;

  /**
   * The name of the tag.
   */
  @JsonProperty("name")
  private final String name;

  /**
   * Constructs a new Tag with the specified type and name.
   *
   * @param type the type of the tag
   * @param name the name of the tag
   */
  @JsonCreator
  public Tag(@JsonProperty("type") String type, @JsonProperty("name") String name) {
    this.type = type;
    this.name = name;
  }

  /**
   * Returns the type of this tag.
   *
   * @return the type of this tag
   */
  public String getType() {
    return this.type;
  }

  /**
   * Returns the name of this tag.
   *
   * @return the name of this tag
   */
  public String getName() {
    return this.name;
  }

  /**
   * Converts this tag to a Map.
   *
   * @return a Map representing this tag
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
   * Creates a new Tag from the specified Map.
   *
   * @param data a Map containing the data to create the Tag from
   * @return a new Tag created from the specified Map
   */
  @NotNull
  @Contract("_ -> new")
  public static Tag fromMap(@NotNull Map<String, Object> data) {
    return new Tag((String) data.get("type"), (String) data.get("name"));
  }
}