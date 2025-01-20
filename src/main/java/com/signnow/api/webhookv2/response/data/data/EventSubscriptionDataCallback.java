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
import com.signnow.core.util.Cast;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

/**
 * This class represents the data callback of an event subscription.
 */
public final class EventSubscriptionDataCallback extends ApiData {

  /**
   * The ID of the event subscription data callback.
   */
  @JsonProperty("id")
  private final String id;

  /**
   * The name of the application.
   */
  @JsonProperty("application_name")
  private final String applicationName;

  /**
   * The ID of the entity.
   */
  @JsonProperty("entity_id")
  private final String entityId;

  /**
   * The ID of the event subscription.
   */
  @JsonProperty("event_subscription_id")
  private final String eventSubscriptionId;

  /**
   * The active status of the event subscription.
   */
  @JsonProperty("event_subscription_active")
  private final boolean eventSubscriptionActive;

  /**
   * The name of the event.
   */
  @JsonProperty("event_name")
  private final String eventName;

  /**
   * The URL of the callback.
   */
  @JsonProperty("callback_url")
  private final String callbackUrl;

  /**
   * The method of the request.
   */
  @JsonProperty("request_method")
  private final String requestMethod;

  /**
   * The start time of the request.
   */
  @JsonProperty("request_start_time")
  private final int requestStartTime;

  /**
   * The end time of the request.
   */
  @JsonProperty("request_end_time")
  private final int requestEndTime;

  /**
   * The duration of the request.
   */
  @JsonProperty("duration")
  private final float duration;

  /**
   * The content of the request.
   */
  @JsonProperty("request_content")
  private final RequestContent requestContent;

  /**
   * The content of the response.
   */
  @JsonProperty("response_content")
  private final String responseContent;

  /**
   * The status code of the response.
   */
  @JsonProperty("response_status_code")
  private final int responseStatusCode;

  /**
   * The type of the event.
   */
  @JsonProperty("event_type")
  private final String eventType;

  /**
   * The type of the entity.
   */
  @JsonProperty("entity_type")
  String entityType;

  /**
   * The headers of the request.
   */
  @JsonProperty("request_headers")
  private final RequestHeader requestHeaders;

  /**
   * Constructor for EventSubscriptionDataCallback.
   *
   * @param id The ID of the event subscription data callback.
   * @param applicationName The name of the application.
   * @param entityId The ID of the entity.
   * @param eventSubscriptionId The ID of the event subscription.
   * @param eventSubscriptionActive The active status of the event subscription.
   * @param eventName The name of the event.
   * @param callbackUrl The URL of the callback.
   * @param requestMethod The method of the request.
   * @param requestStartTime The start time of the request.
   * @param requestEndTime The end time of the request.
   * @param duration The duration of the request.
   * @param requestContent The content of the request.
   * @param responseContent The content of the response.
   * @param responseStatusCode The status code of the response.
   * @param eventType The type of the event.
   * @param entityType The type of the entity.
   * @param requestHeaders The headers of the request.
   */
  @JsonCreator
  public EventSubscriptionDataCallback(
      @JsonProperty("id") String id,
      @JsonProperty("application_name") String applicationName,
      @JsonProperty("entity_id") String entityId,
      @JsonProperty("event_subscription_id") String eventSubscriptionId,
      @JsonProperty("event_subscription_active") boolean eventSubscriptionActive,
      @JsonProperty("event_name") String eventName,
      @JsonProperty("callback_url") String callbackUrl,
      @JsonProperty("request_method") String requestMethod,
      @JsonProperty("request_start_time") int requestStartTime,
      @JsonProperty("request_end_time") int requestEndTime,
      @JsonProperty("duration") float duration,
      @JsonProperty("request_content") RequestContent requestContent,
      @JsonProperty("response_content") String responseContent,
      @JsonProperty("response_status_code") int responseStatusCode,
      @JsonProperty("event_type") String eventType,
      @JsonProperty("entity_type") String entityType,
      @JsonProperty("request_headers") RequestHeader requestHeaders) {
    this.id = id;
    this.applicationName = applicationName;
    this.entityId = entityId;
    this.eventSubscriptionId = eventSubscriptionId;
    this.eventSubscriptionActive = eventSubscriptionActive;
    this.eventName = eventName;
    this.callbackUrl = callbackUrl;
    this.requestMethod = requestMethod;
    this.requestStartTime = requestStartTime;
    this.requestEndTime = requestEndTime;
    this.duration = duration;
    this.requestContent = requestContent;
    this.responseContent = responseContent;
    this.responseStatusCode = responseStatusCode;
    this.eventType = eventType;
    this.entityType = entityType;
    this.requestHeaders = requestHeaders;
  }

  /**
   * Returns the ID of the event subscription data callback.
   *
   * @return The ID of the event subscription data callback.
   */
  public String getId() {
    return this.id;
  }

  /**
   * Returns the name of the application.
   *
   * @return The name of the application.
   */
  public String getApplicationName() {
    return this.applicationName;
  }

  /**
   * Returns the ID of the entity.
   *
   * @return The ID of the entity.
   */
  public String getEntityId() {
    return this.entityId;
  }

  /**
   * Returns the ID of the event subscription.
   *
   * @return The ID of the event subscription.
   */
  public String getEventSubscriptionId() {
    return this.eventSubscriptionId;
  }

  /**
   * Returns the active status of the event subscription.
   *
   * @return The active status of the event subscription.
   */
  public boolean isEventSubscriptionActive() {
    return this.eventSubscriptionActive;
  }

  /**
   * Returns the name of the event.
   *
   * @return The name of the event.
   */
  public String getEventName() {
    return this.eventName;
  }

  /**
   * Returns the type of the event.
   *
   * @return The type of the event.
   */
  public String getEventType() {
    return this.eventType;
  }

  /**
   * Returns the URL of the callback.
   *
   * @return The URL of the callback.
   */
  public String getCallbackUrl() {
    return this.callbackUrl;
  }

  /**
   * Returns the method of the request.
   *
   * @return The method of the request.
   */
  public String getRequestMethod() {
    return this.requestMethod;
  }

  /**
   * Returns the start time of the request.
   *
   * @return The start time of the request.
   */
  public int getRequestStartTime() {
    return this.requestStartTime;
  }

  /**
   * Returns the end time of the request.
   *
   * @return The end time of the request.
   */
  public int getRequestEndTime() {
    return this.requestEndTime;
  }

  /**
   * Returns the duration of the request.
   *
   * @return The duration of the request.
   */
  public float getDuration() {
    return this.duration;
  }

  /**
   * Returns the headers of the request.
   *
   * @return The headers of the request.
   */
  public RequestHeader getRequestHeaders() {
    return this.requestHeaders;
  }

  /**
   * Returns the content of the request.
   *
   * @return The content of the request.
   */
  public RequestContent getRequestContent() {
    return this.requestContent;
  }

  /**
   * Returns the content of the response.
   *
   * @return The content of the response.
   */
  public String getResponseContent() {
    return this.responseContent;
  }

  /**
   * Returns the status code of the response.
   *
   * @return The status code of the response.
   */
  public int getResponseStatusCode() {
    return this.responseStatusCode;
  }

  /**
   * Returns the type of the entity.
   *
   * @return The type of the entity.
   */
  public String getEntityType() {
    return entityType;
  }

  /**
   * Converts the event subscription data callback to a map.
   *
   * @return A map representing the event subscription data callback.
   */
  @NotNull
  @Override
  public Map<String, Object> toMap() {
    Map<String, Object> map = new LinkedHashMap<>();
    map.put("id", this.getId());
    map.put("application_name", this.getApplicationName());
    map.put("entity_id", this.getEntityId());
    map.put("event_subscription_id", this.getEventSubscriptionId());
    map.put("event_subscription_active", this.isEventSubscriptionActive());
    map.put("event_name", this.getEventName());
    map.put("event_type", this.getEventType());
    map.put("entity_type", this.getEntityType());
    map.put("callback_url", this.getCallbackUrl());
    map.put("request_method", this.getRequestMethod());
    map.put("request_start_time", this.getRequestStartTime());
    map.put("request_end_time", this.getRequestEndTime());
    map.put("duration", this.getDuration());
    map.put("request_headers", this.getRequestHeaders().toMap());
    map.put("request_content", this.getRequestContent().toMap());
    map.put("response_content", this.getResponseContent());
    map.put("response_status_code", this.getResponseStatusCode());
    return map;
  }

  /**
   * Creates an event subscription data callback from a map.
   *
   * @param data The map representing the event subscription data callback.
   * @return An event subscription data callback.
   */
  @NotNull
  @Contract("_ -> new")
  public static EventSubscriptionDataCallback fromMap(@NotNull Map<String, Object> data) {
    return new EventSubscriptionDataCallback(
        (String) data.get("id"),
        (String) data.get("application_name"),
        (String) data.get("entity_id"),
        (String) data.get("event_subscription_id"),
        (Boolean) data.get("event_subscription_active"),
        (String) data.get("event_name"),
        (String) data.get("callback_url"),
        (String) data.get("request_method"),
        (Integer) data.get("request_start_time"),
        (Integer) data.get("request_end_time"),
        (Float) data.get("duration"),
        RequestContent.fromMap(
            Cast.safeToMap(data.get("request_content"), String.class, Object.class)),
        (String) data.get("response_content"),
        (Integer) data.get("response_status_code"),
        (String) data.get("event_type"),
        (String) data.get("entity_type"),
        data.get("request_headers") != null
            ? RequestHeader.fromMap(
                Cast.safeToMap(data.get("request_headers"), String.class, Object.class))
            : null);
  }
}