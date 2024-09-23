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
    name = "getEventSubscriptionCallback",
    url = "/v2/event-subscriptions/{event_subscription_id}/callbacks/{callback_id}",
    method = "get",
    auth = "bearer",
    namespace = "webhookV2",
    entity = "callback",
    type = "application/json")
public class CallbackGetRequest implements RequestInterface<String> {
  private final Map<String, String> uriParams = new HashMap<>();

  public CallbackGetRequest withEventSubscriptionId(String eventSubscriptionId) {
    this.uriParams.put("event_subscription_id", eventSubscriptionId);
    return this;
  }

  public CallbackGetRequest withCallbackId(String callbackId) {
    this.uriParams.put("callback_id", callbackId);
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
