/*
 * This file is a part of signNow SDK API client.
 *
 * (с) Copyright © 2011-present airSlate Inc. (https://www.signnow.com)
 *
 * For more details on copyright, see LICENSE.md file
 * that was distributed with this source code.
 */

package com.signnow.api.user.response.data;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.signnow.core.data.ApiData;
import com.signnow.core.util.Cast;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

/**
 * This class represents a Subscription in the signNow API.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public final class Subscription extends ApiData {

  /**
   * The unique identifier of the subscription.
   */
  @JsonProperty("id")
  private final String id;

  /**
   * The identifier of the subscription.
   */
  @JsonProperty("subscription_id")
  private final String subscriptionId;

  /**
   * The name of the subscription.
   */
  @JsonProperty("name")
  private final String name;

  /**
   * The expiration date of the subscription.
   */
  @JsonProperty("expired")
  private final int expired;

  /**
   * The creation date of the subscription.
   */
  @JsonProperty("created")
  private final int created;

  /**
   * The last update date of the subscription.
   */
  @JsonProperty("updated")
  private final int updated;

  /**
   * The plan of the subscription.
   */
  @JsonProperty("plan")
  private final String plan;

  /**
   * The type of the mobile plan of the subscription.
   */
  @JsonProperty("mobile_plan_type")
  private final String mobilePlanType;

  /**
   * Indicates if the subscription is paid by credit card.
   */
  @JsonProperty("credit_card")
  private final boolean creditCard;

  /**
   * Indicates if the subscription is a trial.
   */
  @JsonProperty("trial")
  private final boolean trial;

  /**
   * The term of the subscription.
   */
  @JsonProperty("term")
  private final int term;

  /**
   * The email of the seat administrator of the subscription.
   */
  @JsonProperty("seat_admin_email")
  private final String seatAdminEmail;

  /**
   * The version of the plan of the subscription.
   */
  @JsonProperty("plan_version")
  private final int planVersion;

  /**
   * Indicates if the subscription is usage based.
   */
  @JsonProperty("is_usage_based")
  private final boolean isUsageBased;

  /**
   * Indicates if the usage based seat of the subscription is free.
   */
  @JsonProperty("is_usage_based_seat_free")
  private final boolean isUsageBasedSeatFree;

  /**
   * The gateway subscription of the subscription.
   */
  @JsonProperty("gateway_subscription")
  private final GatewaySubscription gatewaySubscription;

  /**
   * The number of seats of the subscription.
   */
  @JsonProperty("seats")
  private final int seats;

  /**
   * The number of used seats of the subscription.
   */
  @JsonProperty("used_seats")
  private final int usedSeats;

  /**
   * Constructs a Subscription object with the provided parameters.
   *
   * @param id The unique identifier of the subscription.
   * @param subscriptionId The identifier of the subscription.
   * @param name The name of the subscription.
   * @param expired The expiration date of the subscription.
   * @param created The creation date of the subscription.
   * @param updated The last update date of the subscription.
   * @param plan The plan of the subscription.
   * @param mobilePlanType The type of the mobile plan of the subscription.
   * @param creditCard Indicates if the subscription is paid by credit card.
   * @param trial Indicates if the subscription is a trial.
   * @param term The term of the subscription.
   * @param seatAdminEmail The email of the seat administrator of the subscription.
   * @param planVersion The version of the plan of the subscription.
   * @param isUsageBased Indicates if the subscription is usage based.
   * @param isUsageBasedSeatFree Indicates if the usage based seat of the subscription is free.
   * @param gatewaySubscription The gateway subscription of the subscription.
   * @param seats The number of seats of the subscription.
   * @param usedSeats The number of used seats of the subscription.
   */
  @JsonCreator
  public Subscription(
      @JsonProperty("id") String id,
      @JsonProperty("subscription_id") String subscriptionId,
      @JsonProperty("name") String name,
      @JsonProperty("expired") int expired,
      @JsonProperty("created") int created,
      @JsonProperty("updated") int updated,
      @JsonProperty("plan") String plan,
      @JsonProperty("mobile_plan_type") String mobilePlanType,
      @JsonProperty("credit_card") boolean creditCard,
      @JsonProperty("trial") boolean trial,
      @JsonProperty("term") int term,
      @JsonProperty("seat_admin_email") String seatAdminEmail,
      @JsonProperty("plan_version") int planVersion,
      @JsonProperty("is_usage_based") boolean isUsageBased,
      @JsonProperty("is_usage_based_seat_free") boolean isUsageBasedSeatFree,
      @JsonProperty("gateway_subscription") GatewaySubscription gatewaySubscription,
      @JsonProperty("seats") int seats,
      @JsonProperty("used_seats") int usedSeats) {
    this.id = id;
    this.subscriptionId = subscriptionId;
    this.name = name;
    this.expired = expired;
    this.created = created;
    this.updated = updated;
    this.plan = plan;
    this.mobilePlanType = mobilePlanType;
    this.creditCard = creditCard;
    this.trial = trial;
    this.term = term;
    this.seatAdminEmail = seatAdminEmail;
    this.planVersion = planVersion;
    this.isUsageBased = isUsageBased;
    this.isUsageBasedSeatFree = isUsageBasedSeatFree;
    this.gatewaySubscription = gatewaySubscription;
    this.seats = seats;
    this.usedSeats = usedSeats;
  }

  /**
   * Returns the unique identifier of the subscription.
   *
   * @return The unique identifier of the subscription.
   */
  public String getId() {
    return this.id;
  }

  /**
   * Returns the identifier of the subscription.
   *
   * @return The identifier of the subscription.
   */
  public String getSubscriptionId() {
    return this.subscriptionId;
  }

  /**
   * Returns the name of the subscription.
   *
   * @return The name of the subscription.
   */
  public String getName() {
    return this.name;
  }

  /**
   * Returns the expiration date of the subscription.
   *
   * @return The expiration date of the subscription.
   */
  public int getExpired() {
    return this.expired;
  }

  /**
   * Returns the creation date of the subscription.
   *
   * @return The creation date of the subscription.
   */
  public int getCreated() {
    return this.created;
  }

  /**
   * Returns the last update date of the subscription.
   *
   * @return The last update date of the subscription.
   */
  public int getUpdated() {
    return this.updated;
  }

  /**
   * Returns the plan of the subscription.
   *
   * @return The plan of the subscription.
   */
  public String getPlan() {
    return this.plan;
  }

  /**
   * Returns the type of the mobile plan of the subscription.
   *
   * @return The type of the mobile plan of the subscription.
   */
  public String getMobilePlanType() {
    return this.mobilePlanType;
  }

  /**
   * Returns whether the subscription is paid by credit card.
   *
   * @return True if the subscription is paid by credit card, false otherwise.
   */
  public boolean isCreditCard() {
    return this.creditCard;
  }

  /**
   * Returns whether the subscription is a trial.
   *
   * @return True if the subscription is a trial, false otherwise.
   */
  public boolean isTrial() {
    return this.trial;
  }

  /**
   * Returns the term of the subscription.
   *
   * @return The term of the subscription.
   */
  public int getTerm() {
    return this.term;
  }

  /**
   * Returns the email of the seat administrator of the subscription.
   *
   * @return The email of the seat administrator of the subscription.
   */
  public String getSeatAdminEmail() {
    return this.seatAdminEmail;
  }

  /**
   * Returns the version of the plan of the subscription.
   *
   * @return The version of the plan of the subscription.
   */
  public int getPlanVersion() {
    return this.planVersion;
  }

  /**
   * Returns whether the subscription is usage based.
   *
   * @return True if the subscription is usage based, false otherwise.
   */
  public boolean isUsageBased() {
    return this.isUsageBased;
  }

  /**
   * Returns whether the usage based seat of the subscription is free.
   *
   * @return True if the usage based seat of the subscription is free, false otherwise.
   */
  public boolean isUsageBasedSeatFree() {
    return this.isUsageBasedSeatFree;
  }

  /**
   * Returns the gateway subscription of the subscription.
   *
   * @return The gateway subscription of the subscription.
   */
  public GatewaySubscription getGatewaySubscription() {
    return this.gatewaySubscription;
  }

  /**
   * Returns the number of seats of the subscription.
   *
   * @return The number of seats of the subscription.
   */
  public int getSeats() {
    return seats;
  }

  /**
   * Returns the number of used seats of the subscription.
   *
   * @return The number of used seats of the subscription.
   */
  public int getUsedSeats() {
    return usedSeats;
  }

  /**
   * Converts the Subscription object to a Map.
   *
   * @return A Map representing the Subscription object.
   */
  @NotNull
  @Override
  public Map<String, Object> toMap() {
    Map<String, Object> map = new LinkedHashMap<>();
    map.put("id", this.getId());
    map.put("subscription_id", this.getSubscriptionId());
    map.put("name", this.getName());
    map.put("expired", this.getExpired());
    map.put("created", this.getCreated());
    map.put("updated", this.getUpdated());
    map.put("plan", this.getPlan());
    map.put("mobile_plan_type", this.getMobilePlanType());
    map.put("credit_card", this.isCreditCard());
    map.put("trial", this.isTrial());
    map.put("term", this.getTerm());
    map.put("seat_admin_email", this.getSeatAdminEmail());
    map.put("plan_version", this.getPlanVersion());
    map.put("is_usage_based", this.isUsageBased());
    map.put("is_usage_based_seat_free", this.isUsageBasedSeatFree());
    map.put("gateway_subscription", this.getGatewaySubscription());
    map.put("seats", this.getSeats());
    map.put("used_seats", this.getUsedSeats());
    return map;
  }

  /**
   * Creates a Subscription object from a Map.
   *
   * @param data A Map representing a Subscription object.
   * @return A Subscription object.
   */
  @NotNull
  @Contract("_ -> new")
  public static Subscription fromMap(@NotNull Map<String, Object> data) {
    return new Subscription(
        (String) data.get("id"),
        (String) data.get("subscription_id"),
        (String) data.get("name"),
        (Integer) data.get("expired"),
        (Integer) data.get("created"),
        (Integer) data.get("updated"),
        (String) data.get("plan"),
        (String) data.get("mobile_plan_type"),
        (Boolean) data.get("credit_card"),
        (Boolean) data.get("trial"),
        (Integer) data.get("term"),
        (String) data.get("seat_admin_email"),
        (Integer) data.get("plan_version"),
        (Boolean) data.get("is_usage_based"),
        (Boolean) data.get("is_usage_based_seat_free"),
        data.containsKey("gateway_subscription")
            ? GatewaySubscription.fromMap(
                Cast.safeToMap(data.get("gateway_subscription"), String.class, Object.class))
            : null,
        (Integer) data.get("seats"),
        (Integer) data.get("used_seats"));
  }
}