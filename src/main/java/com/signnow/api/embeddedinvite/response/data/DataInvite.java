/*
 * This file is a part of signNow SDK API client.
 *
 * (с) Copyright © 2011-present airSlate Inc. (https://www.signnow.com)
 *
 * For more details on copyright, see LICENSE.md file
 * that was distributed with this source code.
 */

package com.signnow.api.embeddedinvite.response.data;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.signnow.core.data.ApiData;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

/**
 * This class represents the data of an invite in the signNow API.
 */
public final class DataInvite extends ApiData {

  /**
   * The id of the invite.
   */
  @JsonProperty("id")
  private final String id;

  /**
   * The email associated with the invite.
   */
  @JsonProperty("email")
  private final String email;

  /**
   * The role id associated with the invite.
   */
  @JsonProperty("role_id")
  private final String roleId;

  /**
   * The order of the invite.
   */
  @JsonProperty("order")
  private final int order;

  /**
   * The status of the invite.
   */
  @JsonProperty("status")
  private final String status;

  /**
   * Constructs a new DataInvite with the given parameters.
   *
   * @param id the id of the invite
   * @param email the email associated with the invite
   * @param roleId the role id associated with the invite
   * @param order the order of the invite
   * @param status the status of the invite
   */
  @JsonCreator
  public DataInvite(
      @JsonProperty("id") String id,
      @JsonProperty("email") String email,
      @JsonProperty("role_id") String roleId,
      @JsonProperty("order") int order,
      @JsonProperty("status") String status) {
    this.id = id;
    this.email = email;
    this.roleId = roleId;
    this.order = order;
    this.status = status;
  }

  /**
   * Returns the id of the invite.
   *
   * @return the id of the invite
   */
  public String getId() {
    return this.id;
  }

  /**
   * Returns the email associated with the invite.
   *
   * @return the email associated with the invite
   */
  public String getEmail() {
    return this.email;
  }

  /**
   * Returns the role id associated with the invite.
   *
   * @return the role id associated with the invite
   */
  public String getRoleId() {
    return this.roleId;
  }

  /**
   * Returns the order of the invite.
   *
   * @return the order of the invite
   */
  public int getOrder() {
    return this.order;
  }

  /**
   * Returns the status of the invite.
   *
   * @return the status of the invite
   */
  public String getStatus() {
    return this.status;
  }

  /**
   * Converts this DataInvite to a Map.
   *
   * @return a Map representation of this DataInvite
   */
  @NotNull
  @Override
  public Map<String, Object> toMap() {
    Map<String, Object> map = new LinkedHashMap<>();
    map.put("id", this.getId());
    map.put("email", this.getEmail());
    map.put("role_id", this.getRoleId());
    map.put("order", this.getOrder());
    map.put("status", this.getStatus());
    return map;
  }

  /**
   * Creates a new DataInvite from the given Map.
   *
   * @param data a Map containing the data for the new DataInvite
   * @return a new DataInvite created from the given Map
   */
  @NotNull
  @Contract("_ -> new")
  public static DataInvite fromMap(@NotNull Map<String, Object> data) {
    return new DataInvite(
        (String) data.get("id"),
        (String) data.get("email"),
        (String) data.get("role_id"),
        (Integer) data.get("order"),
        (String) data.get("status"));
  }
}