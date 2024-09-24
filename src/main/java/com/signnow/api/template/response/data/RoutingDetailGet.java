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

public final class RoutingDetailGet extends ApiData {

  @JsonProperty("inviter_role")
  private final boolean inviterRole;

  @JsonProperty("name")
  private final String name;

  @JsonProperty("role_id")
  private final String roleId;

  @JsonProperty("signing_order")
  private final int signingOrder;

  @JsonProperty("default_email")
  private final String defaultEmail;

  @JsonProperty("decline_by_signature")
  private final boolean declineBySignature;

  @JsonProperty("delivery_type")
  private final String deliveryType;

  @JsonCreator
  public RoutingDetailGet(
      @JsonProperty("inviter_role") boolean inviterRole,
      @JsonProperty("name") String name,
      @JsonProperty("role_id") String roleId,
      @JsonProperty("signing_order") int signingOrder,
      @JsonProperty("default_email") String defaultEmail,
      @JsonProperty("decline_by_signature") boolean declineBySignature,
      @JsonProperty("delivery_type") String deliveryType) {
    this.inviterRole = inviterRole;
    this.name = name;
    this.roleId = roleId;
    this.signingOrder = signingOrder;
    this.defaultEmail = defaultEmail;
    this.declineBySignature = declineBySignature;
    this.deliveryType = deliveryType;
  }

  public boolean isInviterRole() {
    return this.inviterRole;
  }

  public String getName() {
    return this.name;
  }

  public String getRoleId() {
    return this.roleId;
  }

  public int getSigningOrder() {
    return this.signingOrder;
  }

  public String getDefaultEmail() {
    return this.defaultEmail;
  }

  public boolean isDeclineBySignature() {
    return this.declineBySignature;
  }

  public String getDeliveryType() {
    return this.deliveryType;
  }

  @NotNull
  @Override
  public Map<String, Object> toMap() {
    Map<String, Object> map = new LinkedHashMap<>();
    map.put("inviter_role", this.isInviterRole());
    map.put("name", this.getName());
    map.put("role_id", this.getRoleId());
    map.put("signing_order", this.getSigningOrder());
    map.put("default_email", this.getDefaultEmail());
    map.put("decline_by_signature", this.isDeclineBySignature());
    map.put("delivery_type", this.getDeliveryType());
    return map;
  }

  @NotNull
  @Contract("_ -> new")
  public static RoutingDetailGet fromMap(@NotNull Map<String, Object> data) {
    return new RoutingDetailGet(
        (boolean) data.getOrDefault("inviter_role", false),
        (String) data.get("name"),
        (String) data.get("role_id"),
        (int) data.get("signing_order"),
        (String) data.getOrDefault("default_email", ""),
        (boolean) data.getOrDefault("decline_by_signature", false),
        (String) data.get("delivery_type"));
  }
}
