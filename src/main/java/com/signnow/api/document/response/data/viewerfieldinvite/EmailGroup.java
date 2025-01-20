/*
 * This file is a part of signNow SDK API client.
 *
 * (с) Copyright © 2011-present airSlate Inc. (https://www.signnow.com)
 *
 * For more details on copyright, see LICENSE.md file
 * that was distributed with this source code.
 */

package com.signnow.api.document.response.data.viewerfieldinvite;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.signnow.core.data.ApiData;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

/**
 * This class represents an Email Group in the signNow API.
 */
public final class EmailGroup extends ApiData {

  /**
   * The unique identifier of the Email Group.
   */
  @JsonProperty("id")
  private final String id;

  /**
   * The name of the Email Group.
   */
  @JsonProperty("name")
  private final String name;

  /**
   * Constructs an EmailGroup with the specified id and name.
   *
   * @param id   the unique identifier of the Email Group
   * @param name the name of the Email Group
   */
  @JsonCreator
  public EmailGroup(@JsonProperty("id") String id, @JsonProperty("name") String name) {
    this.id = id;
    this.name = name;
  }

  /**
   * Returns the unique identifier of this Email Group.
   *
   * @return the id of this Email Group
   */
  public String getId() {
    return this.id;
  }

  /**
   * Returns the name of this Email Group.
   *
   * @return the name of this Email Group
   */
  public String getName() {
    return this.name;
  }

  /**
   * Returns a Map representation of this Email Group.
   *
   * @return a Map with the id and name of this Email Group
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
   * Creates an EmailGroup from the specified Map.
   *
   * @param data a Map containing the id and name of the Email Group
   * @return a new EmailGroup with the id and name from the Map
   */
  @NotNull
  @Contract("_ -> new")
  public static EmailGroup fromMap(@NotNull Map<String, Object> data) {
    return new EmailGroup(
        (String) data.getOrDefault("id", null), (String) data.getOrDefault("name", null));
  }
}