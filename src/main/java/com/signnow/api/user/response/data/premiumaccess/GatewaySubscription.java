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
 * This class represents a GatewaySubscription object.
 */
public final class GatewaySubscription extends ApiData {

  /**
   * The gateway property of the GatewaySubscription.
   */
  @JsonProperty("gateway")
  private final String gateway;

  /**
   * The autoRenew property of the GatewaySubscription.
   */
  @JsonProperty("auto_renew")
  private final Boolean autoRenew;

  /**
   * Constructs a GatewaySubscription object.
   *
   * @param gateway the gateway of the GatewaySubscription
   * @param autoRenew the autoRenew status of the GatewaySubscription
   */
  @JsonCreator
  public GatewaySubscription(
      @JsonProperty("gateway") String gateway, @JsonProperty("auto_renew") Boolean autoRenew) {
    this.gateway = gateway;
    this.autoRenew = autoRenew;
  }

  /**
   * Returns the gateway of the GatewaySubscription.
   *
   * @return the gateway of the GatewaySubscription
   */
  public String getGateway() {
    return this.gateway;
  }

  /**
   * Returns the autoRenew status of the GatewaySubscription.
   *
   * @return the autoRenew status of the GatewaySubscription
   */
  public Boolean isAutoRenew() {
    return this.autoRenew;
  }

  /**
   * Converts the GatewaySubscription object to a Map.
   *
   * @return a Map representing the GatewaySubscription object
   */
  @NotNull
  @Override
  public Map<String, Object> toMap() {
    Map<String, Object> map = new LinkedHashMap<>();
    map.put("gateway", this.getGateway());
    map.put("auto_renew", this.isAutoRenew());
    return map;
  }

  /**
   * Constructs a GatewaySubscription object from a Map.
   *
   * @param data a Map representing a GatewaySubscription object
   * @return a GatewaySubscription object
   */
  @NotNull
  @Contract("_ -> new")
  public static GatewaySubscription fromMap(@NotNull Map<String, Object> data) {
    return new GatewaySubscription(
        (String) data.getOrDefault("gateway", null),
        (Boolean) data.getOrDefault("auto_renew", null));
  }
}