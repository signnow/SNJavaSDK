/*
 * This file is a part of signNow SDK API client.
 *
 * (с) Copyright © 2011-present airSlate Inc. (https://www.signnow.com)
 *
 * For more details on copyright, see LICENSE.md file
 * that was distributed with this source code.
 */

package com.signnow.api.webhookv2.request;

import com.signnow.core.request.ApiEndpoint;
import com.signnow.core.request.RequestInterface;
import java.util.HashMap;
import java.util.Map;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

@ApiEndpoint(
    name = "getEventSubscriptionCallbacksV2",
    url = "/v2/event-subscriptions/{event_subscription_id}/callbacks",
    method = "get",
    auth = "bearer",
    namespace = "webhookV2",
    entity = "callbacksAll",
    type = "application/json")
public final class CallbacksAllGetRequest implements RequestInterface<String> {

  private final Map<String, String> uriParams = new HashMap<>();

  public CallbacksAllGetRequest withEventSubscriptionId(String eventSubscriptionId) {
    this.uriParams.put("event_subscription_id", eventSubscriptionId);
    return this;
  }

  @NotNull
  @Contract(value = " -> new", pure = true)
  @Override
  public HashMap<String, String> uriParams() {
    return new HashMap<>(this.uriParams);
  }

  @NotNull
  @Override
  public Map<String, String> payload() {
    return new HashMap<>();
  }
}
