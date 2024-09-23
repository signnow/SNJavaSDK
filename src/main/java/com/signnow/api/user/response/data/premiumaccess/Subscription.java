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

@JsonIgnoreProperties(ignoreUnknown = true)
public final class Subscription extends ApiData {

  @JsonProperty("serial_number")
  private final String serialNumber;

  @JsonProperty("name")
  private final String name;

  @JsonProperty("term")
  private final int term;

  @JsonProperty("seats")
  private final int seats;

  @JsonProperty("used_seats")
  private final int usedSeats;

  @JsonProperty("expired_at")
  private final int expiredAt;

  @JsonProperty("created_at")
  private final int createdAt;

  @JsonProperty("updated_at")
  private final int updatedAt;

  @JsonProperty("key")
  private final String key;

  @JsonProperty("version")
  private final String version;

  @JsonProperty("plan")
  private final Plan plan;

  @JsonProperty("admin_email")
  private final String adminEmail;

  @JsonProperty("status")
  private final String status;

  @JsonProperty("marketplace")
  private final Marketplace marketplace;

  @JsonProperty("gateway_subscription")
  private final GatewaySubscription gatewaySubscription;

  @JsonProperty("trial_period")
  private final int trialPeriod;

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

  public String getSerialNumber() {
    return this.serialNumber;
  }

  public String getName() {
    return this.name;
  }

  public int getTerm() {
    return this.term;
  }

  public int getSeats() {
    return this.seats;
  }

  public int getUsedSeats() {
    return this.usedSeats;
  }

  public int getExpiredAt() {
    return this.expiredAt;
  }

  public int getCreatedAt() {
    return this.createdAt;
  }

  public int getUpdatedAt() {
    return this.updatedAt;
  }

  public String getKey() {
    return this.key;
  }

  public String getVersion() {
    return this.version;
  }

  public Plan getPlan() {
    return this.plan;
  }

  public String getAdminEmail() {
    return this.adminEmail;
  }

  public String getStatus() {
    return this.status;
  }

  public Marketplace getMarketplace() {
    return this.marketplace;
  }

  public GatewaySubscription getGatewaySubscription() {
    return this.gatewaySubscription;
  }

  public int getTrialPeriod() {
    return trialPeriod;
  }

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
