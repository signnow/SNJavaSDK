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
 * This class represents a FreeformInvite which extends ApiData.
 */
public final class FreeformInvite extends ApiData {

  /**
   * The id of the FreeformInvite.
   */
  @JsonProperty("id")
  private final String id;

  /**
   * Constructor for FreeformInvite.
   *
   * @param id The id of the FreeformInvite.
   */
  @JsonCreator
  public FreeformInvite(@JsonProperty("id") String id) {
    this.id = id;
  }

  /**
   * Getter for the id of the FreeformInvite.
   *
   * @return The id of the FreeformInvite.
   */
  public String getId() {
    return this.id;
  }

  /**
   * Converts the FreeformInvite to a Map.
   *
   * @return A Map representation of the FreeformInvite.
   */
  @NotNull
  @Override
  public Map<String, Object> toMap() {
    Map<String, Object> map = new LinkedHashMap<>();
    map.put("id", this.getId());
    return map;
  }

  /**
   * Creates a FreeformInvite from a Map.
   *
   * @param data The Map to create the FreeformInvite from.
   * @return A new FreeformInvite created from the provided Map.
   */
  @NotNull
  @Contract("_ -> new")
  public static FreeformInvite fromMap(@NotNull Map<String, Object> data) {
    return new FreeformInvite((String) data.getOrDefault("id", null));
  }
}