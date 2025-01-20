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
 * Data class extends ApiData.
 * Represents the data related to a document.
 */
public final class Data extends ApiData {

  /**
   * The name of the document.
   */
  @JsonProperty("name")
  private final String name;

  /**
   * The role of the inviter.
   */
  @JsonProperty("inviter_role")
  private final Boolean inviterRole;

  /**
   * The order of signing.
   */
  @JsonProperty("signing_order")
  private final Integer signingOrder;

  /**
   * The type of delivery.
   */
  @JsonProperty("delivery_type")
  private final String deliveryType;

  /**
   * The default email.
   */
  @JsonProperty("default_email")
  private final String defaultEmail;

  /**
   * The id of the role.
   */
  @JsonProperty("role_id")
  private final String roleId;

  /**
   * The decline by signature status.
   */
  @JsonProperty("decline_by_signature")
  private final Boolean declineBySignature;

  /**
   * The reassign status.
   */
  @JsonProperty("reassign")
  private final Boolean reassign;

  /**
   * The number of expiration days.
   */
  @JsonProperty("expiration_days")
  private final Integer expirationDays;

  /**
   * The reminder.
   */
  @JsonProperty("reminder")
  private final Reminder reminder;

  /**
   * Constructor for Data class.
   *
   * @param name The name of the document.
   * @param inviterRole The role of the inviter.
   * @param signingOrder The order of signing.
   * @param deliveryType The type of delivery.
   * @param defaultEmail The default email.
   * @param roleId The id of the role.
   * @param declineBySignature The decline by signature status.
   * @param reassign The reassign status.
   * @param expirationDays The number of expiration days.
   * @param reminder The reminder.
   */
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

  /**
   * @return The name of the document.
   */
  public String getName() {
    return this.name;
  }

  /**
   * @return The role of the inviter.
   */
  public Boolean isInviterRole() {
    return this.inviterRole;
  }

  /**
   * @return The order of signing.
   */
  public Integer getSigningOrder() {
    return this.signingOrder;
  }

  /**
   * @return The type of delivery.
   */
  public String getDeliveryType() {
    return this.deliveryType;
  }

  /**
   * @return The default email.
   */
  public String getDefaultEmail() {
    return this.defaultEmail;
  }

  /**
   * @return The id of the role.
   */
  public String getRoleId() {
    return this.roleId;
  }

  /**
   * @return The decline by signature status.
   */
  public Boolean isDeclineBySignature() {
    return this.declineBySignature;
  }

  /**
   * @return The reassign status.
   */
  public Boolean isReassign() {
    return this.reassign;
  }

  /**
   * @return The number of expiration days.
   */
  public Integer getExpirationDays() {
    return this.expirationDays;
  }

  /**
   * @return The reminder.
   */
  public Reminder getReminder() {
    return this.reminder;
  }

  /**
   * Converts the Data object to a Map.
   *
   * @return A Map representation of the Data object.
   */
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

  /**
   * Creates a Data object from a Map.
   *
   * @param data The Map to convert to a Data object.
   * @return A new Data object.
   */
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