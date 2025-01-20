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
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.signnow.core.data.ApiData;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

/**
 * This class represents a Team in the signNow API.
 * It extends the ApiData class and includes properties for the team's id and name.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public final class Team extends ApiData {

  /**
   * The unique identifier for the team.
   */
  @JsonProperty("id")
  private final String id;

  /**
   * The name of the team.
   */
  @JsonProperty("name")
  private final String name;

  /**
   * Constructor for the Team class.
   *
   * @param id   The unique identifier for the team.
   * @param name The name of the team.
   */
  @JsonCreator
  public Team(@JsonProperty("id") String id, @JsonProperty("name") String name) {
    this.id = id;
    this.name = name;
  }

  /**
   * Returns the unique identifier for the team.
   *
   * @return The unique identifier for the team.
   */
  public String getId() {
    return this.id;
  }

  /**
   * Returns the name of the team.
   *
   * @return The name of the team.
   */
  public String getName() {
    return this.name;
  }

  /**
   * Converts the Team object to a Map.
   *
   * @return A Map representation of the Team object.
   */
  @NotNull
  @Override
  public Map<String, Object> toMap() {
    Map<String, Object> map = new LinkedHashMap<>();
    map.put("id", this.getId());
    map.put("name", this.getName());
    return map;
  }

  /**
   * Creates a new Team object from a Map.
   *
   * @param data A Map containing the data for the new Team object.
   * @return A new Team object.
   */
  @NotNull
  @Contract("_ -> new")
  public static Team fromMap(@NotNull Map<String, Object> data) {
    return new Team((String) data.get("id"), (String) data.get("name"));
  }
}