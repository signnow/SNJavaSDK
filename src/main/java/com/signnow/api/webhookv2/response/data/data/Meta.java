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

/**
 * Meta is a final class that extends ApiData.
 * It represents the metadata of a webhook response.
 */
public final class Meta extends ApiData {

  /**
   * The timestamp of the event.
   */
  @JsonProperty("timestamp")
  private final int timestamp;

  /**
   * The event that triggered the webhook.
   */
  @JsonProperty("event")
  private final String event;

  /**
   * The environment where the event occurred.
   */
  @JsonProperty("environment")
  private final String environment;

  /**
   * The URL where the callback will be sent.
   */
  @JsonProperty("callback_url")
  private final String callbackUrl;

  /**
   * The ID of the initiator of the event.
   */
  @JsonProperty("initiator_id")
  private final String initiatorId;

  /**
   * The access token used for authentication.
   */
  @JsonProperty("access_token")
  private final String accessToken;

  /**
   * Constructor for Meta class.
   *
   * @param timestamp The timestamp of the event.
   * @param event The event that triggered the webhook.
   * @param environment The environment where the event occurred.
   * @param callbackUrl The URL where the callback will be sent.
   * @param initiatorId The ID of the initiator of the event.
   * @param accessToken The access token used for authentication.
   */
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

  /**
   * @return The timestamp of the event.
   */
  public int getTimestamp() {
    return this.timestamp;
  }

  /**
   * @return The event that triggered the webhook.
   */
  public String getEvent() {
    return this.event;
  }

  /**
   * @return The environment where the event occurred.
   */
  public String getEnvironment() {
    return this.environment;
  }

  /**
   * @return The URL where the callback will be sent.
   */
  public String getCallbackUrl() {
    return this.callbackUrl;
  }

  /**
   * @return The ID of the initiator of the event.
   */
  public String getInitiatorId() {
    return this.initiatorId;
  }

  /**
   * @return The access token used for authentication.
   */
  public String getAccessToken() {
    return this.accessToken;
  }

  /**
   * Converts the Meta object to a Map.
   *
   * @return A Map representation of the Meta object.
   */
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

  /**
   * Creates a Meta object from a Map.
   *
   * @param data The Map containing the data to create the Meta object.
   * @return A new Meta object.
   */
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