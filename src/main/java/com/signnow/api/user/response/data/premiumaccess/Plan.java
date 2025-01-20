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

/**
 * This class represents a Plan in the signNow API.
 */
public final class Plan extends ApiData {

  /**
   * The id of the plan.
   */
  @JsonProperty("id")
  private final int id;

  /**
   * The plan id of the plan.
   */
  @JsonProperty("plan_id")
  private final String planId;

  /**
   * The name of the plan.
   */
  @JsonProperty("name")
  private final String name;

  /**
   * The price of the plan.
   */
  @JsonProperty("price")
  private final String price;

  /**
   * The billing cycle of the plan.
   */
  @JsonProperty("billing_cycle")
  private final int billingCycle;

  /**
   * The active status of the plan.
   */
  @JsonProperty("active")
  private final boolean active;

  /**
   * The groups associated with the plan.
   */
  @JsonProperty("groups")
  private final GroupCollection groups;

  /**
   * The level of the plan.
   */
  @JsonProperty("level")
  private final String level;

  /**
   * The type of the plan.
   */
  @JsonProperty("type")
  private final String type;

  /**
   * The number of API requests allowed for the plan.
   */
  @JsonProperty("api_requests")
  private final int apiRequests;

  /**
   * The unit price of the plan.
   */
  @JsonProperty("unit_price")
  private final int unitPrice;

  /**
   * The trial status of the plan.
   */
  @JsonProperty("is_trial")
  private final boolean isTrial;

  /**
   * The marketplace status of the plan.
   */
  @JsonProperty("is_marketplace")
  private final boolean isMarketplace;

  /**
   * Constructor for the Plan class.
   *
   * @param id The id of the plan.
   * @param planId The plan id of the plan.
   * @param name The name of the plan.
   * @param price The price of the plan.
   * @param billingCycle The billing cycle of the plan.
   * @param active The active status of the plan.
   * @param groups The groups associated with the plan.
   * @param level The level of the plan.
   * @param type The type of the plan.
   * @param apiRequests The number of API requests allowed for the plan.
   * @param unitPrice The unit price of the plan.
   * @param isTrial The trial status of the plan.
   * @param isMarketplace The marketplace status of the plan.
   */
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

  /**
   * Returns the id of the plan.
   *
   * @return The id of the plan.
   */
  public int getId() {
    return this.id;
  }

  /**
   * Returns the plan id of the plan.
   *
   * @return The plan id of the plan.
   */
  public String getPlanId() {
    return this.planId;
  }

  /**
   * Returns the name of the plan.
   *
   * @return The name of the plan.
   */
  public String getName() {
    return this.name;
  }

  /**
   * Returns the price of the plan.
   *
   * @return The price of the plan.
   */
  public String getPrice() {
    return this.price;
  }

  /**
   * Returns the billing cycle of the plan.
   *
   * @return The billing cycle of the plan.
   */
  public int getBillingCycle() {
    return this.billingCycle;
  }

  /**
   * Returns the active status of the plan.
   *
   * @return The active status of the plan.
   */
  public boolean isActive() {
    return this.active;
  }

  /**
   * Returns the groups associated with the plan.
   *
   * @return The groups associated with the plan.
   */
  public GroupCollection getGroups() {
    return this.groups;
  }

  /**
   * Returns the level of the plan.
   *
   * @return The level of the plan.
   */
  public String getLevel() {
    return this.level;
  }

  /**
   * Returns the type of the plan.
   *
   * @return The type of the plan.
   */
  public String getType() {
    return this.type;
  }

  /**
   * Returns the number of API requests allowed for the plan.
   *
   * @return The number of API requests allowed for the plan.
   */
  public int getApiRequests() {
    return this.apiRequests;
  }

  /**
   * Returns the unit price of the plan.
   *
   * @return The unit price of the plan.
   */
  public int getUnitPrice() {
    return this.unitPrice;
  }

  /**
   * Returns the trial status of the plan.
   *
   * @return The trial status of the plan.
   */
  public boolean isTrial() {
    return this.isTrial;
  }

  /**
   * Returns the marketplace status of the plan.
   *
   * @return The marketplace status of the plan.
   */
  public boolean isMarketplace() {
    return this.isMarketplace;
  }

  /**
   * Converts the Plan object to a Map.
   *
   * @return A Map representing the Plan object.
   */
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

  /**
   * Creates a Plan object from a Map.
   *
   * @param data A Map representing a Plan object.
   * @return A Plan object.
   */
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