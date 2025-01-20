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
import com.fasterxml.jackson.annotation.JsonProperty;
import com.signnow.core.data.ApiData;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

/**
 * This class represents a GatewaySubscription which extends ApiData.
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
  private final boolean autoRenew;

  /**
   * Constructs a GatewaySubscription with the specified gateway and autoRenew.
   *
   * @param gateway the gateway of the GatewaySubscription
   * @param autoRenew the autoRenew status of the GatewaySubscription
   */
  @JsonCreator
  public GatewaySubscription(
      @JsonProperty("gateway") String gateway, @JsonProperty("auto_renew") boolean autoRenew) {
    this.gateway = gateway;
    this.autoRenew = autoRenew;
  }

  /**
   * Returns the gateway of this GatewaySubscription.
   *
   * @return the gateway of this GatewaySubscription
   */
  public String getGateway() {
    return this.gateway;
  }

  /**
   * Returns the autoRenew status of this GatewaySubscription.
   *
   * @return the autoRenew status of this GatewaySubscription
   */
  public boolean isAutoRenew() {
    return this.autoRenew;
  }

  /**
   * Returns a Map representation of this GatewaySubscription.
   *
   * @return a Map representation of this GatewaySubscription
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
   * Returns a new GatewaySubscription created from the specified Map.
   *
   * @param data the Map to create the GatewaySubscription from
   * @return a new GatewaySubscription created from the specified Map
   */
  @NotNull
  @Contract("_ -> new")
  public static GatewaySubscription fromMap(@NotNull Map<String, Object> data) {
    return new GatewaySubscription(
        (String) data.getOrDefault("gateway", ""),
        (Boolean) data.getOrDefault("auto_renew", false));
  }
}