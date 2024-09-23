/*
 * This file is a part of signNow SDK API client.
 *
 * (с) Copyright © 2011-present airSlate Inc. (https://www.signnow.com)
 *
 * For more details on copyright, see LICENSE.md file
 * that was distributed with this source code.
 */

package com.signnow.api.webhookv2.response.data.data;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.signnow.core.data.ApiData;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

public final class Meta extends ApiData {

  @JsonProperty("timestamp")
  private final int timestamp;

  @JsonProperty("event")
  private final String event;

  @JsonProperty("environment")
  private final String environment;

  @JsonProperty("callback_url")
  private final String callbackUrl;

  @JsonProperty("initiator_id")
  private final String initiatorId;

  @JsonProperty("access_token")
  private final String accessToken;

  @JsonCreator
  public Meta(
      @JsonProperty("timestamp") int timestamp,
      @JsonProperty("event") String event,
      @JsonProperty("environment") String environment,
      @JsonProperty("callback_url") String callbackUrl,
      @JsonProperty("initiator_id") String initiatorId,
      @JsonProperty("access_token") String accessToken) {
    this.timestamp = timestamp;
    this.event = event;
    this.environment = environment;
    this.callbackUrl = callbackUrl;
    this.initiatorId = initiatorId;
    this.accessToken = accessToken;
  }

  public int getTimestamp() {
    return this.timestamp;
  }

  public String getEvent() {
    return this.event;
  }

  public String getEnvironment() {
    return this.environment;
  }

  public String getCallbackUrl() {
    return this.callbackUrl;
  }

  public String getInitiatorId() {
    return this.initiatorId;
  }

  public String getAccessToken() {
    return this.accessToken;
  }

  @NotNull
  @Override
  public Map<String, Object> toMap() {
    Map<String, Object> map = new LinkedHashMap<>();
    map.put("timestamp", this.getTimestamp());
    map.put("event", this.getEvent());
    map.put("environment", this.getEnvironment());
    map.put("callback_url", this.getCallbackUrl());
    map.put("initiator_id", this.getInitiatorId());
    map.put("access_token", this.getAccessToken());
    return map;
  }

  @NotNull
  @Contract("_ -> new")
  public static Meta fromMap(@NotNull Map<String, Object> data) {
    return new Meta(
        (int) data.get("timestamp"),
        (String) data.get("event"),
        (String) data.get("environment"),
        (String) data.get("callback_url"),
        (String) data.get("initiator_id"),
        (String) data.get("access_token"));
  }
}
