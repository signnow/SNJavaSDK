/*
 * This file is a part of signNow SDK API client.
 *
 * (с) Copyright © 2011-present airSlate Inc. (https://www.signnow.com)
 *
 * For more details on copyright, see LICENSE.md file
 * that was distributed with this source code.
 */

package com.signnow.api.document.response.data.routingdetail;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.signnow.core.data.ApiData;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

/**
 * Data class extends ApiData.
 */
public final class Data extends ApiData {

  /**
   * Default email of the user.
   */
  @JsonProperty("default_email")
  private final String defaultEmail;

  /**
   * Role of the inviter.
   */
  @JsonProperty("inviter_role")
  private final boolean inviterRole;

  /**
   * Name of the user.
   */
  @JsonProperty("name")
  private final String name;

  /**
   * Role ID of the user.
   */
  @JsonProperty("role_id")
  private final String roleId;

  /**
   * Signing order of the user.
   */
  @JsonProperty("signing_order")
  private final int signingOrder;

  /**
   * Constructor for Data class.
   *
   * @param defaultEmail Default email of the user.
   * @param inviterRole Role of the inviter.
   * @param name Name of the user.
   * @param roleId Role ID of the user.
   * @param signingOrder Signing order of the user.
   */
  @JsonCreator
  public Data(
      @JsonProperty("default_email") String defaultEmail,
      @JsonProperty("inviter_role") boolean inviterRole,
      @JsonProperty("name") String name,
      @JsonProperty("role_id") String roleId,
      @JsonProperty("signing_order") int signingOrder) {
    this.defaultEmail = defaultEmail;
    this.inviterRole = inviterRole;
    this.name = name;
    this.roleId = roleId;
    this.signingOrder = signingOrder;
  }

  /**
   * Get default email of the user.
   *
   * @return Default email of the user.
   */
  public String getDefaultEmail() {
    return this.defaultEmail;
  }

  /**
   * Check if the user is an inviter.
   *
   * @return True if the user is an inviter, false otherwise.
   */
  public boolean isInviterRole() {
    return this.inviterRole;
  }

  /**
   * Get name of the user.
   *
   * @return Name of the user.
   */
  public String getName() {
    return this.name;
  }

  /**
   * Get role ID of the user.
   *
   * @return Role ID of the user.
   */
  public String getRoleId() {
    return this.roleId;
  }

  /**
   * Get signing order of the user.
   *
   * @return Signing order of the user.
   */
  public int getSigningOrder() {
    return this.signingOrder;
  }

  /**
   * Convert the Data object to a Map.
   *
   * @return Map representation of the Data object.
   */
  @NotNull
  @Override
  public Map<String, Object> toMap() {
    Map<String, Object> map = new LinkedHashMap<>();
    map.put("default_email", this.getDefaultEmail());
    map.put("inviter_role", this.isInviterRole());
    map.put("name", this.getName());
    map.put("role_id", this.getRoleId());
    map.put("signing_order", this.getSigningOrder());
    return map;
  }

  /**
   * Create a Data object from a Map.
   *
   * @param data Map representation of a Data object.
   * @return Data object created from the Map.
   */
  @NotNull
  @Contract("_ -> new")
  public static Data fromMap(@NotNull Map<String, Object> data) {
    return new Data(
        (String) data.get("default_email"),
        (Boolean) data.get("inviter_role"),
        (String) data.get("name"),
        (String) data.get("role_id"),
        (Integer) data.get("signing_order"));
  }
}