/*
 * This file is a part of signNow SDK API client.
 *
 * (с) Copyright © 2011-present airSlate Inc. (https://www.signnow.com)
 *
 * For more details on copyright, see LICENSE.md file
 * that was distributed with this source code.
 */

package com.signnow.api.embeddedgroupinvite.response.data;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.signnow.core.data.ApiData;
import java.util.HashMap;
import java.util.Map;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

/**
 * This class represents the data of an invite.
 * It extends the ApiData class.
 */
public final class DataInvite extends ApiData {

  /**
   * The id of the invite.
   */
  @JsonProperty("id")
  private final String id;

  /**
   * Constructor for the DataInvite class.
   *
   * @param id The id of the invite.
   */
  @JsonCreator
  DataInvite(@JsonProperty("id") String id) {
    this.id = id;
  }

  /**
   * This method returns the id of the invite.
   *
   * @return The id of the invite.
   */
  public String getId() {
    return this.id;
  }

  /**
   * This method converts the invite data to a map.
   *
   * @return A map containing the invite data.
   */
  @NotNull
  @Override
  public Map<String, Object> toMap() {
    Map<String, Object> map = new HashMap<>();
    map.put("id", this.getId());
    return map;
  }

  /**
   * This method creates a new DataInvite object from a map.
   *
   * @param data A map containing the invite data.
   * @return A new DataInvite object.
   */
  @NotNull
  @Contract("_ -> new")
  public static DataInvite fromMap(@NotNull Map<String, Object> data) {
    return new DataInvite((String) data.get("id"));
  }
}