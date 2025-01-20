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
 * This class represents the premium access data for a user.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public final class PremiumAccess extends ApiData {

  /**
   * The subscription details of the user.
   */
  @JsonProperty("subscription")
  private final Subscription subscription;

  /**
   * The API details.
   */
  @JsonProperty("api")
  private final Api api;

  /**
   * The error status.
   */
  @JsonProperty("error")
  private final boolean error;

  /**
   * The user details.
   */
  @JsonProperty("user")
  private final User user;

  /**
   * The active status of the user.
   */
  @JsonProperty("active")
  private final boolean active;

  /**
   * The plan details of the user.
   */
  @JsonProperty("plan")
  private final String plan;

  /**
   * The business status of the user.
   */
  @JsonProperty("business")
  private final boolean business;

  /**
   * The trial status of the user.
   */
  @JsonProperty("trial")
  private final boolean trial;

  /**
   * The credit card status of the user.
   */
  @JsonProperty("credit_card")
  private final boolean creditCard;

  /**
   * Constructor for PremiumAccess class.
   *
   * @param subscription The subscription details of the user.
   * @param api The API details.
   * @param error The error status.
   * @param user The user details.
   * @param active The active status of the user.
   * @param plan The plan details of the user.
   * @param business The business status of the user.
   * @param trial The trial status of the user.
   * @param creditCard The credit card status of the user.
   */
  @JsonCreator
  public PremiumAccess(
      @JsonProperty("subscription") Subscription subscription,
      @JsonProperty("api") Api api,
      @JsonProperty("error") boolean error,
      @JsonProperty("user") User user,
      @JsonProperty("active") boolean active,
      @JsonProperty("plan") String plan,
      @JsonProperty("business") boolean business,
      @JsonProperty("trial") boolean trial,
      @JsonProperty("credit_card") boolean creditCard) {
    this.subscription = subscription;
    this.api = api;
    this.error = error;
    this.user = user;
    this.active = active;
    this.plan = plan;
    this.business = business;
    this.trial = trial;
    this.creditCard = creditCard;
  }

  /**
   * Returns the error status.
   *
   * @return The error status.
   */
  public boolean isError() {
    return this.error;
  }

  /**
   * Returns the user details.
   *
   * @return The user details.
   */
  public User getUser() {
    return this.user;
  }

  /**
   * Returns the active status of the user.
   *
   * @return The active status of the user.
   */
  public boolean isActive() {
    return this.active;
  }

  /**
   * Returns the subscription details of the user.
   *
   * @return The subscription details of the user.
   */
  public Subscription getSubscription() {
    return this.subscription;
  }

  /**
   * Returns the plan details of the user.
   *
   * @return The plan details of the user.
   */
  public String getPlan() {
    return this.plan;
  }

  /**
   * Returns the business status of the user.
   *
   * @return The business status of the user.
   */
  public boolean isBusiness() {
    return this.business;
  }

  /**
   * Returns the trial status of the user.
   *
   * @return The trial status of the user.
   */
  public boolean isTrial() {
    return this.trial;
  }

  /**
   * Returns the credit card status of the user.
   *
   * @return The credit card status of the user.
   */
  public boolean isCreditCard() {
    return this.creditCard;
  }

  /**
   * Returns the API details.
   *
   * @return The API details.
   */
  public Api getApi() {
    return this.api;
  }

  /**
   * Converts the PremiumAccess object to a Map.
   *
   * @return A Map representing the PremiumAccess object.
   */
  @NotNull
  @Override
  public Map<String, Object> toMap() {
    Map<String, Object> map = new LinkedHashMap<>();
    map.put("error", this.isError());
    map.put("user", this.getUser());
    map.put("active", this.isActive());
    map.put("subscription", this.getSubscription());
    map.put("plan", this.getPlan());
    map.put("business", this.isBusiness());
    map.put("trial", this.isTrial());
    map.put("credit_card", this.isCreditCard());
    map.put("api", this.getApi());
    return map;
  }

  /**
   * Creates a PremiumAccess object from a Map.
   *
   * @param data The Map to convert.
   * @return A new PremiumAccess object.
   */
  @NotNull
  @Contract("_ -> new")
  public static PremiumAccess fromMap(@NotNull Map<String, Object> data) {
    return new PremiumAccess(
        Subscription.fromMap(Cast.safeToMap(data.get("subscription"), String.class, Object.class)),
        Api.fromMap(Cast.safeToMap(data.get("api"), String.class, Object.class)),
        (boolean) data.getOrDefault("error", false),
        data.containsKey("user")
            ? User.fromMap(Cast.safeToMap(data.get("user"), String.class, Object.class))
            : null,
        (boolean) data.getOrDefault("active", false),
        (String) data.getOrDefault("plan", ""),
        (boolean) data.getOrDefault("business", false),
        (boolean) data.getOrDefault("trial", false),
        (boolean) data.getOrDefault("credit_card", false));
  }
}