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
 * This class represents a Role in the signNow API.
 */
public final class Role extends ApiData {

  /**
   * The unique identifier for the Role.
   */
  @JsonProperty("unique_id")
  private final String uniqueId;

  /**
   * The signing order for the Role.
   */
  @JsonProperty("signing_order")
  private final String signingOrder;

  /**
   * The name of the Role.
   */
  @JsonProperty("name")
  private final String name;

  /**
   * Constructor for the Role class.
   *
   * @param uniqueId The unique identifier for the Role.
   * @param signingOrder The signing order for the Role.
   * @param name The name of the Role.
   */
  @JsonCreator
  public Role(
      @JsonProperty("unique_id") String uniqueId,
      @JsonProperty("signing_order") String signingOrder,
      @JsonProperty("name") String name) {
    this.uniqueId = uniqueId;
    this.signingOrder = signingOrder;
    this.name = name;
  }

  /**
   * Returns the unique identifier for the Role.
   *
   * @return The unique identifier for the Role.
   */
  public String getUniqueId() {
    return this.uniqueId;
  }

  /**
   * Returns the signing order for the Role.
   *
   * @return The signing order for the Role.
   */
  public String getSigningOrder() {
    return this.signingOrder;
  }

  /**
   * Returns the name of the Role.
   *
   * @return The name of the Role.
   */
  public String getName() {
    return this.name;
  }

  /**
   * Converts the Role to a Map.
   *
   * @return A Map representation of the Role.
   */
  @NotNull
  @Override
  public Map<String, Object> toMap() {
    Map<String, Object> map = new LinkedHashMap<>();
    map.put("unique_id", this.getUniqueId());
    map.put("signing_order", this.getSigningOrder());
    map.put("name", this.getName());
    return map;
  }

  /**
   * Creates a Role from a Map.
   *
   * @param data The Map to create the Role from.
   * @return A new Role created from the provided Map.
   */
  @NotNull
  @Contract("_ -> new")
  public static Role fromMap(@NotNull Map<String, Object> data) {
    return new Role(
        (String) data.get("unique_id"),
        (String) data.get("signing_order"),
        (String) data.get("name"));
  }
}