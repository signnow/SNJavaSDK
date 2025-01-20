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
 * This class represents an active logo with its ID and URI.
 */
public final class ActiveLogo extends ApiData {

  /**
   * The ID of the active logo.
   */
  @JsonProperty("id")
  private final String id;

  /**
   * The URI of the active logo.
   */
  @JsonProperty("uri")
  private final String uri;

  /**
   * Constructs an ActiveLogo object with the specified ID and URI.
   *
   * @param id the ID of the active logo
   * @param uri the URI of the active logo
   */
  @JsonCreator
  public ActiveLogo(@JsonProperty("id") String id, @JsonProperty("uri") String uri) {
    this.id = id;
    this.uri = uri;
  }

  /**
   * Returns the ID of this active logo.
   *
   * @return the ID of this active logo
   */
  public String getId() {
    return this.id;
  }

  /**
   * Returns the URI of this active logo.
   *
   * @return the URI of this active logo
   */
  public String getUri() {
    return this.uri;
  }

  /**
   * Converts this active logo to a map with keys "id" and "uri".
   *
   * @return a map representing this active logo
   */
  @NotNull
  @Override
  public Map<String, Object> toMap() {
    Map<String, Object> map = new LinkedHashMap<>();
    map.put("id", this.getId());
    map.put("uri", this.getUri());
    return map;
  }

  /**
   * Creates an ActiveLogo object from the specified map.
   *
   * @param data a map containing the data to create an ActiveLogo object
   * @return a new ActiveLogo object created from the specified map
   */
  @NotNull
  @Contract("_ -> new")
  public static ActiveLogo fromMap(@NotNull Map<String, Object> data) {
    return new ActiveLogo(
        (String) data.getOrDefault("id", null), (String) data.getOrDefault("uri", null));
  }
}