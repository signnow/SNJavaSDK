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

public final class Data extends ApiData {

  @JsonProperty("name")
  private final String name;

  @JsonProperty("inviter_role")
  private final Boolean inviterRole;

  @JsonProperty("signing_order")
  private final Integer signingOrder;

  @JsonProperty("delivery_type")
  private final String deliveryType;

  @JsonProperty("default_email")
  private final String defaultEmail;

  @JsonProperty("role_id")
  private final String roleId;

  @JsonProperty("decline_by_signature")
  private final Boolean declineBySignature;

  @JsonProperty("reassign")
  private final Boolean reassign;

  @JsonProperty("expiration_days")
  private final Integer expirationDays;

  @JsonProperty("reminder")
  private final Reminder reminder;

  @JsonCreator
  public Data(
      @JsonProperty("name") String name,
      @JsonProperty("inviter_role") Boolean inviterRole,
      @JsonProperty("signing_order") Integer signingOrder,
      @JsonProperty("delivery_type") String deliveryType,
      @JsonProperty("default_email") String defaultEmail,
      @JsonProperty("role_id") String roleId,
      @JsonProperty("decline_by_signature") Boolean declineBySignature,
      @JsonProperty("reassign") Boolean reassign,
      @JsonProperty("expiration_days") Integer expirationDays,
      @JsonProperty("reminder") Reminder reminder) {
    this.name = name;
    this.inviterRole = inviterRole;
    this.signingOrder = signingOrder;
    this.deliveryType = deliveryType;
    this.defaultEmail = defaultEmail;
    this.roleId = roleId;
    this.declineBySignature = declineBySignature;
    this.reassign = reassign;
    this.expirationDays = expirationDays;
    this.reminder = reminder;
  }

  public String getName() {
    return this.name;
  }

  public Boolean isInviterRole() {
    return this.inviterRole;
  }

  public Integer getSigningOrder() {
    return this.signingOrder;
  }

  public String getDeliveryType() {
    return this.deliveryType;
  }

  public String getDefaultEmail() {
    return this.defaultEmail;
  }

  public String getRoleId() {
    return this.roleId;
  }

  public Boolean isDeclineBySignature() {
    return this.declineBySignature;
  }

  public Boolean isReassign() {
    return this.reassign;
  }

  public Integer getExpirationDays() {
    return this.expirationDays;
  }

  public Reminder getReminder() {
    return this.reminder;
  }

  @NotNull
  @Override
  public Map<String, Object> toMap() {
    Map<String, Object> map = new LinkedHashMap<>();
    map.put("name", this.getName());
    map.put("inviter_role", this.isInviterRole());
    map.put("signing_order", this.getSigningOrder());
    map.put("delivery_type", this.getDeliveryType());
    map.put("default_email", this.getDefaultEmail());
    map.put("role_id", this.getRoleId());
    map.put("decline_by_signature", this.isDeclineBySignature());
    map.put("reassign", this.isReassign());
    map.put("expiration_days", this.getExpirationDays());
    map.put("reminder", this.getReminder());
    return map;
  }

  @NotNull
  @Contract("_ -> new")
  public static Data fromMap(@NotNull Map<String, Object> data) {
    return new Data(
        (String) data.get("name"),
        (Boolean) data.get("inviter_role"),
        (Integer) data.get("signing_order"),
        (String) data.get("delivery_type"),
        (String) data.get("default_email"),
        (String) data.get("role_id"),
        (Boolean) data.get("decline_by_signature"),
        (Boolean) data.get("reassign"),
        (Integer) data.get("expiration_days"),
        (Reminder) data.get("reminder"));
  }
}
