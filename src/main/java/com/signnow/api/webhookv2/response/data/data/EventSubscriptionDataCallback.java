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

public final class EventSubscriptionDataCallback extends ApiData {

  @JsonProperty("id")
  private final String id;

  @JsonProperty("application_name")
  private final String applicationName;

  @JsonProperty("entity_id")
  private final String entityId;

  @JsonProperty("event_subscription_id")
  private final String eventSubscriptionId;

  @JsonProperty("event_subscription_active")
  private final boolean eventSubscriptionActive;

  @JsonProperty("event_name")
  private final String eventName;

  @JsonProperty("callback_url")
  private final String callbackUrl;

  @JsonProperty("request_method")
  private final String requestMethod;

  @JsonProperty("request_start_time")
  private final int requestStartTime;

  @JsonProperty("request_end_time")
  private final int requestEndTime;

  @JsonProperty("duration")
  private final float duration;

  @JsonProperty("request_content")
  private final RequestContent requestContent;

  @JsonProperty("response_content")
  private final String responseContent;

  @JsonProperty("response_status_code")
  private final int responseStatusCode;

  @JsonProperty("event_type")
  private final String eventType;

  @JsonProperty("entity_type")
  String entityType;

  @JsonProperty("request_headers")
  private final RequestHeader requestHeaders;

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

  public String getId() {
    return this.id;
  }

  public String getApplicationName() {
    return this.applicationName;
  }

  public String getEntityId() {
    return this.entityId;
  }

  public String getEventSubscriptionId() {
    return this.eventSubscriptionId;
  }

  public boolean isEventSubscriptionActive() {
    return this.eventSubscriptionActive;
  }

  public String getEventName() {
    return this.eventName;
  }

  public String getEventType() {
    return this.eventType;
  }

  public String getCallbackUrl() {
    return this.callbackUrl;
  }

  public String getRequestMethod() {
    return this.requestMethod;
  }

  public int getRequestStartTime() {
    return this.requestStartTime;
  }

  public int getRequestEndTime() {
    return this.requestEndTime;
  }

  public float getDuration() {
    return this.duration;
  }

  public RequestHeader getRequestHeaders() {
    return this.requestHeaders;
  }

  public RequestContent getRequestContent() {
    return this.requestContent;
  }

  public String getResponseContent() {
    return this.responseContent;
  }

  public int getResponseStatusCode() {
    return this.responseStatusCode;
  }

  public String getEntityType() {
    return entityType;
  }

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
