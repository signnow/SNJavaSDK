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
public final class PremiumAccess extends ApiData {

  @JsonProperty("subscription")
  private final Subscription subscription;

  @JsonProperty("api")
  private final Api api;

  @JsonProperty("error")
  private final boolean error;

  @JsonProperty("user")
  private final User user;

  @JsonProperty("active")
  private final boolean active;

  @JsonProperty("plan")
  private final String plan;

  @JsonProperty("business")
  private final boolean business;

  @JsonProperty("trial")
  private final boolean trial;

  @JsonProperty("credit_card")
  private final boolean creditCard;

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

  public boolean isError() {
    return this.error;
  }

  public User getUser() {
    return this.user;
  }

  public boolean isActive() {
    return this.active;
  }

  public Subscription getSubscription() {
    return this.subscription;
  }

  public String getPlan() {
    return this.plan;
  }

  public boolean isBusiness() {
    return this.business;
  }

  public boolean isTrial() {
    return this.trial;
  }

  public boolean isCreditCard() {
    return this.creditCard;
  }

  public Api getApi() {
    return this.api;
  }

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
