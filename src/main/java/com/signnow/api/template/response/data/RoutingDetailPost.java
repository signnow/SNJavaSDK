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
 * This class represents the details of a routing post.
 */
public final class RoutingDetailPost extends ApiData {

  /**
   * The default email of the routing post.
   */
  @JsonProperty("default_email")
  private final String defaultEmail;

  /**
   * The inviter role of the routing post.
   */
  @JsonProperty("inviter_role")
  private final boolean inviterRole;

  /**
   * The name of the routing post.
   */
  @JsonProperty("name")
  private final String name;

  /**
   * The role id of the routing post.
   */
  @JsonProperty("role_id")
  private final String roleId;

  /**
   * The signing order of the routing post.
   */
  @JsonProperty("signing_order")
  private final int signingOrder;

  /**
   * Constructs a new RoutingDetailPost with the specified details.
   *
   * @param defaultEmail the default email of the routing post
   * @param inviterRole the inviter role of the routing post
   * @param name the name of the routing post
   * @param roleId the role id of the routing post
   * @param signingOrder the signing order of the routing post
   */
  @JsonCreator
  public RoutingDetailPost(
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
   * Returns the default email of the routing post.
   *
   * @return the default email of the routing post
   */
  public String getDefaultEmail() {
    return this.defaultEmail;
  }

  /**
   * Returns the inviter role of the routing post.
   *
   * @return the inviter role of the routing post
   */
  public boolean isInviterRole() {
    return this.inviterRole;
  }

  /**
   * Returns the name of the routing post.
   *
   * @return the name of the routing post
   */
  public String getName() {
    return this.name;
  }

  /**
   * Returns the role id of the routing post.
   *
   * @return the role id of the routing post
   */
  public String getRoleId() {
    return this.roleId;
  }

  /**
   * Returns the signing order of the routing post.
   *
   * @return the signing order of the routing post
   */
  public int getSigningOrder() {
    return this.signingOrder;
  }

  /**
   * Converts the routing post details to a map.
   *
   * @return a map containing the routing post details
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
   * Creates a new RoutingDetailPost from the specified map.
   *
   * @param data a map containing the routing post details
   * @return a new RoutingDetailPost created from the specified map
   */
  @NotNull
  @Contract("_ -> new")
  public static RoutingDetailPost fromMap(@NotNull Map<String, Object> data) {
    return new RoutingDetailPost(
        (String) data.get("default_email"),
        (Boolean) data.get("inviter_role"),
        (String) data.get("name"),
        (String) data.get("role_id"),
        (Integer) data.get("signing_order"));
  }
}