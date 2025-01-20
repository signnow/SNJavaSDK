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
 * This class represents the role of a viewer in the signNow API.
 */
public final class ViewerRole extends ApiData {

  /**
   * The unique identifier for the viewer role.
   */
  @JsonProperty("unique_id")
  private final String uniqueId;

  /**
   * The signing order for the viewer role.
   */
  @JsonProperty("signing_order")
  private final String signingOrder;

  /**
   * The name of the viewer role.
   */
  @JsonProperty("name")
  private final String name;

  /**
   * Constructs a new ViewerRole with the specified uniqueId, signingOrder, and name.
   *
   * @param uniqueId the unique identifier for the viewer role
   * @param signingOrder the signing order for the viewer role
   * @param name the name of the viewer role
   */
  @JsonCreator
  public ViewerRole(
      @JsonProperty("unique_id") String uniqueId,
      @JsonProperty("signing_order") String signingOrder,
      @JsonProperty("name") String name) {
    this.uniqueId = uniqueId;
    this.signingOrder = signingOrder;
    this.name = name;
  }

  /**
   * Returns the unique identifier for this viewer role.
   *
   * @return the unique identifier for this viewer role
   */
  public String getUniqueId() {
    return this.uniqueId;
  }

  /**
   * Returns the signing order for this viewer role.
   *
   * @return the signing order for this viewer role
   */
  public String getSigningOrder() {
    return this.signingOrder;
  }

  /**
   * Returns the name of this viewer role.
   *
   * @return the name of this viewer role
   */
  public String getName() {
    return this.name;
  }

  /**
   * Converts this viewer role to a Map.
   *
   * @return a Map representing this viewer role
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
   * Creates a new ViewerRole from the specified Map.
   *
   * @param data a Map containing the data to create the ViewerRole from
   * @return a new ViewerRole created from the specified Map
   */
  @NotNull
  @Contract("_ -> new")
  public static ViewerRole fromMap(@NotNull Map<String, Object> data) {
    return new ViewerRole(
        (String) data.get("unique_id"),
        (String) data.get("signing_order"),
        (String) data.get("name"));
  }
}