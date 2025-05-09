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
 * This class represents the details of routing in the signNow API.
 */
public final class RoutingDetailGet extends ApiData {

  /**
   * Represents the name of the user.
   */
  @JsonProperty("name")
  private final String name;

  /**
   * Represents the ID of the role.
   */
  @JsonProperty("role_id")
  private final String roleId;

  /**
   * Represents the default email of the user.
   */
  @JsonProperty("default_email")
  private final String defaultEmail;

  /**
   * Represents the role of the inviter.
   */
  @JsonProperty("inviter_role")
  private final boolean inviterRole;

  /**
   * Represents the order of signing.
   */
  @JsonProperty("signing_order")
  private final int signingOrder;

  /**
   * Represents if the signature can be declined.
   */
  @JsonProperty("decline_by_signature")
  private final boolean declineBySignature;

  /**
   * Represents the type of delivery.
   */
  @JsonProperty("delivery_type")
  private final String deliveryType;

  /**
   * Constructor for the RoutingDetailGet class.
   *
   * @param name               The name of the user.
   * @param roleId             The ID of the role.
   * @param defaultEmail       The default email of the user.
   * @param inviterRole        The role of the inviter.
   * @param signingOrder       The order of signing.
   * @param declineBySignature If the signature can be declined.
   * @param deliveryType       The type of delivery.
   */
  @JsonCreator
  public RoutingDetailGet(
      @JsonProperty("name") String name,
      @JsonProperty("role_id") String roleId,
      @JsonProperty("default_email") String defaultEmail,
      @JsonProperty("inviter_role") boolean inviterRole,
      @JsonProperty("signing_order") int signingOrder,
      @JsonProperty("decline_by_signature") boolean declineBySignature,
      @JsonProperty("delivery_type") String deliveryType) {
    this.name = name;
    this.roleId = roleId;
    this.defaultEmail = defaultEmail;
    this.inviterRole = inviterRole;
    this.signingOrder = signingOrder;
    this.declineBySignature = declineBySignature;
    this.deliveryType = deliveryType;
  }

  /**
   * @return The role of the inviter.
   */
  public boolean isInviterRole() {
    return this.inviterRole;
  }

  /**
   * @return The name of the user.
   */
  public String getName() {
    return this.name;
  }

  /**
   * @return The ID of the role.
   */
  public String getRoleId() {
    return this.roleId;
  }

  /**
   * @return The order of signing.
   */
  public int getSigningOrder() {
    return this.signingOrder;
  }

  /**
   * @return The default email of the user.
   */
  public String getDefaultEmail() {
    return this.defaultEmail;
  }

  /**
   * @return If the signature can be declined.
   */
  public boolean isDeclineBySignature() {
    return this.declineBySignature;
  }

  /**
   * @return The type of delivery.
   */
  public String getDeliveryType() {
    return this.deliveryType;
  }

  /**
   * Converts the RoutingDetailGet object to a Map.
   *
   * @return A Map representing the RoutingDetailGet object.
   */
  @NotNull
  @Override
  public Map<String, Object> toMap() {
    Map<String, Object> map = new LinkedHashMap<>();
    map.put("name", this.getName());
    map.put("role_id", this.getRoleId());
    map.put("default_email", this.getDefaultEmail());
    map.put("inviter_role", this.isInviterRole());
    map.put("signing_order", this.getSigningOrder());
    map.put("decline_by_signature", this.isDeclineBySignature());
    map.put("delivery_type", this.getDeliveryType());
    return map;
  }

  /**
   * Creates a RoutingDetailGet object from a Map.
   *
   * @param data The Map to convert.
   * @return A new RoutingDetailGet object.
   */
  @NotNull
  @Contract("_ -> new")
  public static RoutingDetailGet fromMap(@NotNull Map<String, Object> data) {
    return new RoutingDetailGet(
        (String) data.get("name"),
        (String) data.get("role_id"),
        (String) data.getOrDefault("default_email", ""),
        (boolean) data.getOrDefault("inviter_role", false),
        (int) data.get("signing_order"),
        (boolean) data.getOrDefault("decline_by_signature", false),
        (String) data.get("delivery_type"));
  }
}