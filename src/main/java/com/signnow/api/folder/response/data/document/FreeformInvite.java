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
 * This class represents a FreeformInvite which extends ApiData.
 */
public final class FreeformInvite extends ApiData {

  /**
   * The id of the FreeformInvite.
   */
  @JsonProperty("id")
  private final String id;

  /**
   * Constructs a new FreeformInvite with the specified id.
   *
   * @param id the id of the FreeformInvite.
   */
  @JsonCreator
  public FreeformInvite(@JsonProperty("id") String id) {
    this.id = id;
  }

  /**
   * Returns the id of this FreeformInvite.
   *
   * @return the id of this FreeformInvite.
   */
  public String getId() {
    return this.id;
  }

  /**
   * Returns a Map representation of this FreeformInvite.
   *
   * @return a Map representation of this FreeformInvite.
   */
  @NotNull
  @Override
  public Map<String, Object> toMap() {
    Map<String, Object> map = new LinkedHashMap<>();
    map.put("id", this.getId());
    return map;
  }

  /**
   * Returns a new FreeformInvite created from the specified Map.
   *
   * @param data the Map from which to create the FreeformInvite.
   * @return a new FreeformInvite created from the specified Map.
   */
  @NotNull
  @Contract("_ -> new")
  public static FreeformInvite fromMap(@NotNull Map<String, Object> data) {
    return new FreeformInvite((String) data.getOrDefault("id", null));
  }
}