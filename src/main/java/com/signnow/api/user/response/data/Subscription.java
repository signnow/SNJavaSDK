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

@JsonIgnoreProperties(ignoreUnknown = true)
public final class Subscription extends ApiData {

  @JsonProperty("id")
  private final String id;

  @JsonProperty("subscription_id")
  private final String subscriptionId;

  @JsonProperty("name")
  private final String name;

  @JsonProperty("expired")
  private final int expired;

  @JsonProperty("created")
  private final int created;

  @JsonProperty("updated")
  private final int updated;

  @JsonProperty("plan")
  private final String plan;

  @JsonProperty("mobile_plan_type")
  private final String mobilePlanType;

  @JsonProperty("credit_card")
  private final boolean creditCard;

  @JsonProperty("trial")
  private final boolean trial;

  @JsonProperty("term")
  private final int term;

  @JsonProperty("seat_admin_email")
  private final String seatAdminEmail;

  @JsonProperty("plan_version")
  private final int planVersion;

  @JsonProperty("is_usage_based")
  private final boolean isUsageBased;

  @JsonProperty("is_usage_based_seat_free")
  private final boolean isUsageBasedSeatFree;

  @JsonProperty("gateway_subscription")
  private final GatewaySubscription gatewaySubscription;

  @JsonProperty("seats")
  private final int seats;

  @JsonProperty("used_seats")
  private final int usedSeats;

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

  public String getId() {
    return this.id;
  }

  public String getSubscriptionId() {
    return this.subscriptionId;
  }

  public String getName() {
    return this.name;
  }

  public int getExpired() {
    return this.expired;
  }

  public int getCreated() {
    return this.created;
  }

  public int getUpdated() {
    return this.updated;
  }

  public String getPlan() {
    return this.plan;
  }

  public String getMobilePlanType() {
    return this.mobilePlanType;
  }

  public boolean isCreditCard() {
    return this.creditCard;
  }

  public boolean isTrial() {
    return this.trial;
  }

  public int getTerm() {
    return this.term;
  }

  public String getSeatAdminEmail() {
    return this.seatAdminEmail;
  }

  public int getPlanVersion() {
    return this.planVersion;
  }

  public boolean isUsageBased() {
    return this.isUsageBased;
  }

  public boolean isUsageBasedSeatFree() {
    return this.isUsageBasedSeatFree;
  }

  public GatewaySubscription getGatewaySubscription() {
    return this.gatewaySubscription;
  }

  public int getSeats() {
    return seats;
  }

  public int getUsedSeats() {
    return usedSeats;
  }

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
