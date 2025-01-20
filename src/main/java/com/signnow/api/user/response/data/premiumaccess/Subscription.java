/*
 * This file is a part of signNow SDK API client.
 *
 * (с) Copyright © 2011-present airSlate Inc. (https://www.signnow.com)
 *
 * For more details on copyright, see LICENSE.md file
 * that was distributed with this source code.
 */

package com.signnow.api.user.response.data.premiumaccess;

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
 * Represents a Subscription object with various properties.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public final class Subscription extends ApiData {

  /**
   * Serial number of the subscription.
   */
  @JsonProperty("serial_number")
  private final String serialNumber;

  /**
   * Name of the subscription.
   */
  @JsonProperty("name")
  private final String name;

  /**
   * Term of the subscription.
   */
  @JsonProperty("term")
  private final int term;

  /**
   * Number of seats in the subscription.
   */
  @JsonProperty("seats")
  private final int seats;

  /**
   * Number of used seats in the subscription.
   */
  @JsonProperty("used_seats")
  private final int usedSeats;

  /**
   * Expiration date of the subscription.
   */
  @JsonProperty("expired_at")
  private final int expiredAt;

  /**
   * Creation date of the subscription.
   */
  @JsonProperty("created_at")
  private final int createdAt;

  /**
   * Last update date of the subscription.
   */
  @JsonProperty("updated_at")
  private final int updatedAt;

  /**
   * Key of the subscription.
   */
  @JsonProperty("key")
  private final String key;

  /**
   * Version of the subscription.
   */
  @JsonProperty("version")
  private final String version;

  /**
   * Plan of the subscription.
   */
  @JsonProperty("plan")
  private final Plan plan;

  /**
   * Admin email of the subscription.
   */
  @JsonProperty("admin_email")
  private final String adminEmail;

  /**
   * Status of the subscription.
   */
  @JsonProperty("status")
  private final String status;

  /**
   * Marketplace of the subscription.
   */
  @JsonProperty("marketplace")
  private final Marketplace marketplace;

  /**
   * Gateway subscription of the subscription.
   */
  @JsonProperty("gateway_subscription")
  private final GatewaySubscription gatewaySubscription;

  /**
   * Trial period of the subscription.
   */
  @JsonProperty("trial_period")
  private final int trialPeriod;

  /**
   * Constructor for Subscription class.
   *
   * @param serialNumber Serial number of the subscription.
   * @param name Name of the subscription.
   * @param term Term of the subscription.
   * @param seats Number of seats in the subscription.
   * @param usedSeats Number of used seats in the subscription.
   * @param expiredAt Expiration date of the subscription.
   * @param createdAt Creation date of the subscription.
   * @param updatedAt Last update date of the subscription.
   * @param key Key of the subscription.
   * @param version Version of the subscription.
   * @param plan Plan of the subscription.
   * @param adminEmail Admin email of the subscription.
   * @param status Status of the subscription.
   * @param marketplace Marketplace of the subscription.
   * @param gatewaySubscription Gateway subscription of the subscription.
   * @param trialPeriod Trial period of the subscription.
   */
  @JsonCreator
  public Subscription(
      @JsonProperty("serial_number") String serialNumber,
      @JsonProperty("name") String name,
      @JsonProperty("term") int term,
      @JsonProperty("seats") int seats,
      @JsonProperty("used_seats") int usedSeats,
      @JsonProperty("expired_at") int expiredAt,
      @JsonProperty("created_at") int createdAt,
      @JsonProperty("updated_at") int updatedAt,
      @JsonProperty("key") String key,
      @JsonProperty("version") String version,
      @JsonProperty("plan") Plan plan,
      @JsonProperty("admin_email") String adminEmail,
      @JsonProperty("status") String status,
      @JsonProperty("marketplace") Marketplace marketplace,
      @JsonProperty("gateway_subscription") GatewaySubscription gatewaySubscription,
      @JsonProperty("trial_period") int trialPeriod) {
    this.serialNumber = serialNumber;
    this.name = name;
    this.term = term;
    this.seats = seats;
    this.usedSeats = usedSeats;
    this.expiredAt = expiredAt;
    this.createdAt = createdAt;
    this.updatedAt = updatedAt;
    this.key = key;
    this.version = version;
    this.plan = plan;
    this.adminEmail = adminEmail;
    this.status = status;
    this.marketplace = marketplace;
    this.gatewaySubscription = gatewaySubscription;
    this.trialPeriod = trialPeriod;
  }

  /**
   * @return the serial number of the subscription.
   */
  public String getSerialNumber() {
    return this.serialNumber;
  }

  /**
   * @return the name of the subscription.
   */
  public String getName() {
    return this.name;
  }

  /**
   * @return the term of the subscription.
   */
  public int getTerm() {
    return this.term;
  }

  /**
   * @return the number of seats in the subscription.
   */
  public int getSeats() {
    return this.seats;
  }

  /**
   * @return the number of used seats in the subscription.
   */
  public int getUsedSeats() {
    return this.usedSeats;
  }

  /**
   * @return the expiration date of the subscription.
   */
  public int getExpiredAt() {
    return this.expiredAt;
  }

  /**
   * @return the creation date of the subscription.
   */
  public int getCreatedAt() {
    return this.createdAt;
  }

  /**
   * @return the last update date of the subscription.
   */
  public int getUpdatedAt() {
    return this.updatedAt;
  }

  /**
   * @return the key of the subscription.
   */
  public String getKey() {
    return this.key;
  }

  /**
   * @return the version of the subscription.
   */
  public String getVersion() {
    return this.version;
  }

  /**
   * @return the plan of the subscription.
   */
  public Plan getPlan() {
    return this.plan;
  }

  /**
   * @return the admin email of the subscription.
   */
  public String getAdminEmail() {
    return this.adminEmail;
  }

  /**
   * @return the status of the subscription.
   */
  public String getStatus() {
    return this.status;
  }

  /**
   * @return the marketplace of the subscription.
   */
  public Marketplace getMarketplace() {
    return this.marketplace;
  }

  /**
   * @return the gateway subscription of the subscription.
   */
  public GatewaySubscription getGatewaySubscription() {
    return this.gatewaySubscription;
  }

  /**
   * @return the trial period of the subscription.
   */
  public int getTrialPeriod() {
    return trialPeriod;
  }

  /**
   * Converts the Subscription object to a Map.
   *
   * @return a Map containing the properties of the Subscription object.
   */
  @NotNull
  @Override
  public Map<String, Object> toMap() {
    Map<String, Object> map = new LinkedHashMap<>();
    map.put("serial_number", this.getSerialNumber());
    map.put("name", this.getName());
    map.put("term", this.getTerm());
    map.put("seats", this.getSeats());
    map.put("used_seats", this.getUsedSeats());
    map.put("expired_at", this.getExpiredAt());
    map.put("created_at", this.getCreatedAt());
    map.put("updated_at", this.getUpdatedAt());
    map.put("key", this.getKey());
    map.put("version", this.getVersion());
    map.put("plan", this.getPlan());
    map.put("admin_email", this.getAdminEmail());
    map.put("status", this.getStatus());
    map.put("marketplace", this.getMarketplace());
    map.put("gateway_subscription", this.getGatewaySubscription());
    map.put("trial_period", this.getTrialPeriod());
    return map;
  }

  /**
   * Creates a Subscription object from a Map.
   *
   * @param data a Map containing the properties of the Subscription object.
   * @return a new Subscription object.
   */
  @NotNull
  @Contract("_ -> new")
  public static Subscription fromMap(@NotNull Map<String, Object> data) {
    return new Subscription(
        (String) data.get("serial_number"),
        (String) data.get("name"),
        (Integer) data.get("term"),
        (Integer) data.get("seats"),
        (Integer) data.get("used_seats"),
        (Integer) data.get("expired_at"),
        (Integer) data.get("created_at"),
        (Integer) data.get("updated_at"),
        (String) data.get("key"),
        (String) data.get("version"),
        Plan.fromMap(Cast.safeToMap(data.get("plan"), String.class, Object.class)),
        (String) data.get("admin_email"),
        (String) data.get("status"),
        data.containsKey("marketplace")
            ? Marketplace.fromMap(
                Cast.safeToMap(data.get("marketplace"), String.class, Object.class))
            : null,
        data.containsKey("gateway_subscription")
            ? GatewaySubscription.fromMap(
                Cast.safeToMap(data.get("gateway_subscription"), String.class, Object.class))
            : null,
        (Integer) data.get("trial_period"));
  }
}