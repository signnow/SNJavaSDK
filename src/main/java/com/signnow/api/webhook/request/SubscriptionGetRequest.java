/*
 * This file is a part of signNow SDK API client.
 *
 * (с) Copyright © 2011-present airSlate Inc. (https://www.signnow.com)
 *
 * For more details on copyright, see LICENSE.md file
 * that was distributed with this source code.
 */

package com.signnow.api.webhook.request;

import com.signnow.core.request.ApiEndpoint;
import com.signnow.core.request.RequestInterface;
import java.util.HashMap;
import java.util.Map;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

/**
 * This class represents a GET request to the "getEventSubscriptions" API endpoint.
 * It is used to retrieve event subscriptions.
 */
@ApiEndpoint(
    name = "getEventSubscriptions",
    url = "/api/v2/events",
    method = "get",
    auth = "basic",
    namespace = "webhook",
    entity = "subscription",
    type = "application/json")
public final class SubscriptionGetRequest implements RequestInterface<String> {

  /**
   * This method is used to get the URI parameters for the request.
   * 
   * @return a new HashMap with the URI parameters for the request.
   */
  @NotNull
  @Contract(value = " -> new", pure = true)
  @Override
  public HashMap<String, String> uriParams() {
    return new HashMap<>();
  }

  /**
   * This method is used to get the payload for the request.
   * 
   * @return a new HashMap with the payload for the request.
   */
  @NotNull
  @Override
  public Map<String, String> payload() {
    return new HashMap<>();
  }
}