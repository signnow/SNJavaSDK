/*
 * This file is a part of signNow SDK API client.
 *
 * (с) Copyright © 2011-present airSlate Inc. (https://www.signnow.com)
 *
 * For more details on copyright, see LICENSE.md file
 * that was distributed with this source code.
 */

package com.signnow.api.webhook.request.data;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.signnow.core.data.ApiData;
import com.signnow.core.util.Cast;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

/**
 * This class represents the attributes of a webhook request.
 */
public final class Attribute extends ApiData {

  /**
   * The callback URL for the webhook.
   */
  @JsonProperty("callback")
  private final String callback;

  /**
   * Flag to indicate if TLS 1.2 should be used.
   */
  @JsonProperty("use_tls_12")
  private final boolean useTls12;

  /**
   * The ID of the integration.
   */
  @JsonProperty("integration_id")
  private final String integrationId;

  /**
   * Flag to indicate if document ID should be included in the query parameters.
   */
  @JsonProperty("docid_queryparam")
  private final boolean docidQueryparam;

  /**
   * The headers for the webhook request.
   */
  @JsonProperty("headers")
  private Map<String, Object> headers;

  /**
   * Constructor for the Attribute class.
   *
   * @param callback The callback URL for the webhook.
   * @param useTls12 Flag to indicate if TLS 1.2 should be used.
   * @param integrationId The ID of the integration.
   * @param docidQueryparam Flag to indicate if document ID should be included in the query parameters.
   * @param headers The headers for the webhook request.
   */
  @JsonCreator
  public Attribute(
      @JsonProperty("callback") String callback,
      @JsonProperty("use_tls_12") boolean useTls12,
      @JsonProperty("integration_id") String integrationId,
      @JsonProperty("docid_queryparam") boolean docidQueryparam,
      @JsonProperty("headers") Map<String, Object> headers) {
    this.callback = callback;
    this.useTls12 = useTls12;
    this.integrationId = integrationId;
    this.docidQueryparam = docidQueryparam;
    this.headers = headers;
  }

  /**
   * Constructor for the Attribute class with only callback parameter.
   *
   * @param callback The callback URL for the webhook.
   */
  public Attribute(@JsonProperty("callback") String callback) {
    this.callback = callback;
    this.useTls12 = false;
    this.integrationId = null;
    this.docidQueryparam = false;
    this.headers = new HashMap<>();
  }

  /**
   * Returns the callback URL.
   *
   * @return The callback URL.
   */
  public String getCallback() {
    return this.callback;
  }

  /**
   * Returns the flag indicating if TLS 1.2 should be used.
   *
   * @return The flag indicating if TLS 1.2 should be used.
   */
  public boolean isUseTls12() {
    return this.useTls12;
  }

  /**
   * Returns the integration ID.
   *
   * @return The integration ID.
   */
  public String getIntegrationId() {
    return this.integrationId;
  }

  /**
   * Returns the flag indicating if document ID should be included in the query parameters.
   *
   * @return The flag indicating if document ID should be included in the query parameters.
   */
  public boolean isDocidQueryparam() {
    return this.docidQueryparam;
  }

  /**
   * Returns the headers for the webhook request.
   *
   * @return The headers for the webhook request.
   */
  public Map<String, Object> getHeaders() {
    return this.headers;
  }

  /**
   * Converts the Attribute object to a Map.
   *
   * @return A Map representation of the Attribute object.
   */
  @NotNull
  @Override
  public Map<String, Object> toMap() {
    Map<String, Object> map = new LinkedHashMap<>();
    map.put("callback", this.getCallback());
    map.put("use_tls_12", this.isUseTls12());
    map.put("integration_id", this.getIntegrationId());
    map.put("docid_queryparam", this.isDocidQueryparam());
    map.put("headers", this.getHeaders());
    return map;
  }

  /**
   * Creates an Attribute object from a Map.
   *
   * @param data The Map to convert to an Attribute object.
   * @return The created Attribute object.
   */
  @NotNull
  @Contract("_ -> new")
  public static Attribute fromMap(@NotNull Map<String, Object> data) {
    return new Attribute(
        (String) data.get("callback"),
        (Boolean) data.getOrDefault("use_tls_12", false),
        (String) data.getOrDefault("integration_id", ""),
        (Boolean) data.getOrDefault("docid_queryparam", false),
        Cast.safeToMap(data.get("headers"), String.class, Object.class));
  }
}