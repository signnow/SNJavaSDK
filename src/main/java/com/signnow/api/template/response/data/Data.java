/*
 * This file is a part of signNow SDK API client.
 *
 * (с) Copyright © 2011-present airSlate Inc. (https://www.signnow.com)
 *
 * For more details on copyright, see LICENSE.md file
 * that was distributed with this source code.
 */

package com.signnow.api.template.response.data;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.signnow.core.data.ApiData;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

/**
 * Data class extends ApiData.
 * It represents the data response from the signNow API.
 */
public final class Data extends ApiData {

  /**
   * The name of the data.
   */
  @JsonProperty("name")
  private final String name;

  /**
   * The role id of the data.
   */
  @JsonProperty("role_id")
  private final String roleId;

  /**
   * The signing order of the data.
   */
  @JsonProperty("signing_order")
  private final int signingOrder;

  /**
   * Constructor for Data class.
   *
   * @param name The name of the data.
   * @param roleId The role id of the data.
   * @param signingOrder The signing order of the data.
   */
  @JsonCreator
  public Data(
      @JsonProperty("name") String name,
      @JsonProperty("role_id") String roleId,
      @JsonProperty("signing_order") int signingOrder) {
    this.name = name;
    this.roleId = roleId;
    this.signingOrder = signingOrder;
  }

  /**
   * Returns the name of the data.
   *
   * @return The name of the data.
   */
  public String getName() {
    return this.name;
  }

  /**
   * Returns the role id of the data.
   *
   * @return The role id of the data.
   */
  public String getRoleId() {
    return this.roleId;
  }

  /**
   * Returns the signing order of the data.
   *
   * @return The signing order of the data.
   */
  public int getSigningOrder() {
    return this.signingOrder;
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
    map.put("name", this.getName());
    map.put("role_id", this.getRoleId());
    map.put("signing_order", this.getSigningOrder());
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
        (String) data.get("name"),
        (String) data.get("role_id"),
        (Integer) data.get("signing_order"));
  }
}