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
import com.fasterxml.jackson.annotation.JsonProperty;
import com.signnow.core.data.ApiData;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

public final class Plan extends ApiData {

  @JsonProperty("id")
  private final int id;

  @JsonProperty("plan_id")
  private final String planId;

  @JsonProperty("name")
  private final String name;

  @JsonProperty("price")
  private final String price;

  @JsonProperty("billing_cycle")
  private final int billingCycle;

  @JsonProperty("active")
  private final boolean active;

  @JsonProperty("groups")
  private final GroupCollection groups;

  @JsonProperty("level")
  private final String level;

  @JsonProperty("type")
  private final String type;

  @JsonProperty("api_requests")
  private final int apiRequests;

  @JsonProperty("unit_price")
  private final int unitPrice;

  @JsonProperty("is_trial")
  private final boolean isTrial;

  @JsonProperty("is_marketplace")
  private final boolean isMarketplace;

  @JsonCreator
  public Plan(
      @JsonProperty("id") int id,
      @JsonProperty("plan_id") String planId,
      @JsonProperty("name") String name,
      @JsonProperty("price") String price,
      @JsonProperty("billing_cycle") int billingCycle,
      @JsonProperty("active") boolean active,
      @JsonProperty("groups") GroupCollection groups,
      @JsonProperty("level") String level,
      @JsonProperty("type") String type,
      @JsonProperty("api_requests") int apiRequests,
      @JsonProperty("unit_price") int unitPrice,
      @JsonProperty("is_trial") boolean isTrial,
      @JsonProperty("is_marketplace") boolean isMarketplace) {
    this.id = id;
    this.planId = planId;
    this.name = name;
    this.price = price;
    this.billingCycle = billingCycle;
    this.active = active;
    this.groups = groups;
    this.level = level;
    this.type = type;
    this.apiRequests = apiRequests;
    this.unitPrice = unitPrice;
    this.isTrial = isTrial;
    this.isMarketplace = isMarketplace;
  }

  public int getId() {
    return this.id;
  }

  public String getPlanId() {
    return this.planId;
  }

  public String getName() {
    return this.name;
  }

  public String getPrice() {
    return this.price;
  }

  public int getBillingCycle() {
    return this.billingCycle;
  }

  public boolean isActive() {
    return this.active;
  }

  public GroupCollection getGroups() {
    return this.groups;
  }

  public String getLevel() {
    return this.level;
  }

  public String getType() {
    return this.type;
  }

  public int getApiRequests() {
    return this.apiRequests;
  }

  public int getUnitPrice() {
    return this.unitPrice;
  }

  public boolean isTrial() {
    return this.isTrial;
  }

  public boolean isMarketplace() {
    return this.isMarketplace;
  }

  @NotNull
  @Override
  public Map<String, Object> toMap() {
    Map<String, Object> map = new LinkedHashMap<>();
    map.put("id", this.getId());
    map.put("plan_id", this.getPlanId());
    map.put("name", this.getName());
    map.put("price", this.getPrice());
    map.put("billing_cycle", this.getBillingCycle());
    map.put("active", this.isActive());
    map.put("groups", this.getGroups());
    map.put("level", this.getLevel());
    map.put("type", this.getType());
    map.put("api_requests", this.getApiRequests());
    map.put("unit_price", this.getUnitPrice());
    map.put("is_trial", this.isTrial());
    map.put("is_marketplace", this.isMarketplace());
    return map;
  }

  @NotNull
  @Contract("_ -> new")
  public static Plan fromMap(@NotNull Map<String, Object> data) {
    return new Plan(
        (int) data.get("id"),
        (String) data.get("plan_id"),
        (String) data.get("name"),
        (String) data.get("price"),
        (int) data.get("billing_cycle"),
        (boolean) data.get("active"),
        (GroupCollection) data.get("groups"),
        (String) data.get("level"),
        (String) data.get("type"),
        (int) data.get("api_requests"),
        (int) data.get("unit_price"),
        (boolean) data.get("is_trial"),
        (boolean) data.get("is_marketplace"));
  }
}
