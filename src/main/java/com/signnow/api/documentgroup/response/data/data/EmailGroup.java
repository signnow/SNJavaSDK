/*
 * This file is a part of signNow SDK API client.
 *
 * (с) Copyright © 2011-present airSlate Inc. (https://www.signnow.com)
 *
 * For more details on copyright, see LICENSE.md file
 * that was distributed with this source code.
 */

package com.signnow.api.documentgroup.response.data.data;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.signnow.core.data.ApiData;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

/**
 * This class represents an EmailGroup which extends ApiData.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public final class EmailGroup extends ApiData {

  /**
   * The id of the EmailGroup.
   */
  @JsonProperty("id")
  private final String id;

  /**
   * Constructor for EmailGroup.
   *
   * @param id The id of the EmailGroup.
   */
  @JsonCreator
  public EmailGroup(@JsonProperty("id") String id) {
    this.id = id;
  }

  /**
   * Getter for the id of the EmailGroup.
   *
   * @return The id of the EmailGroup.
   */
  public String getId() {
    return this.id;
  }

  /**
   * Converts the EmailGroup to a Map.
   *
   * @return A Map representation of the EmailGroup.
   */
  @NotNull
  @Override
  public Map<String, Object> toMap() {
    Map<String, Object> map = new LinkedHashMap<>();
    map.put("id", this.getId());
    return map;
  }

  /**
   * Creates an EmailGroup from a Map.
   *
   * @param data The Map to create the EmailGroup from.
   * @return The created EmailGroup.
   */
  @NotNull
  @Contract("_ -> new")
  public static EmailGroup fromMap(@NotNull Map<String, Object> data) {
    return new EmailGroup((String) data.getOrDefault("id", ""));
  }
}