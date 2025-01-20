/*
 * This file is a part of signNow SDK API client.
 *
 * (с) Copyright © 2011-present airSlate Inc. (https://www.signnow.com)
 *
 * For more details on copyright, see LICENSE.md file
 * that was distributed with this source code.
 */

package com.signnow.api.webhook.response.data.data;

import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.signnow.core.data.ApiData;
import com.signnow.core.util.Cast;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

/**
 * This class represents a JSON attribute.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public final class JsonAttribute extends ApiData {

  /**
   * A boolean indicating whether to use TLS 1.2.
   */
  @JsonProperty("use_tls_12")
  private final boolean useTls12;

  /**
   * A boolean indicating whether to use docid query parameter.
   */
  @JsonProperty("docid_queryparam")
  private final boolean docidQueryparam;

  /**
   * The callback URL.
   */
  @JsonProperty("callback_url")
  private final String callbackUrl;

  /**
   * The integration ID.
   */
  @JsonProperty("integration_id")
  private final String integrationId;

  /**
   * The headers.
   */
  @JsonProperty("headers")
  private Map<String, Object> headers;

  /**
   * The secret key.
   */
  @JsonProperty("secret_key")
  private final String secretKey;

  /**
   * Constructor for JsonAttribute.
   *
   * @param useTls12         Whether to use TLS 1.2.
   * @param docidQueryparam  Whether to use docid query parameter.
   * @param callbackUrl      The callback URL.
   * @param integrationId    The integration ID.
   * @param headers          The headers.
   * @param secretKey        The secret key.
   */
  @JsonCreator
  public JsonAttribute(
      @JsonProperty("use_tls_12") boolean useTls12,
      @JsonProperty("docid_queryparam") boolean docidQueryparam,
      @JsonProperty("callback_url") String callbackUrl,
      @JsonProperty("integration_id") String integrationId,
      @JsonProperty("headers") Map<String, Object> headers,
      @JsonProperty("secret_key") String secretKey) {
    this.useTls12 = useTls12;
    this.docidQueryparam = docidQueryparam;
    this.callbackUrl = callbackUrl;
    this.integrationId = integrationId;
    this.headers = headers;
    this.secretKey = secretKey;
  }

  /**
   * Adds a header.
   *
   * @param key   The key of the header.
   * @param value The value of the header.
   */
  @JsonAnySetter
  public void addHeader(String key, Object value) {
    this.headers.put(key, value);
  }

  /**
   * Returns the headers.
   *
   * @return The headers.
   */
  public Map<String, Object> getHeaders() {
    return this.headers;
  }

  /**
   * Returns whether to use TLS 1.2.
   *
   * @return Whether to use TLS 1.2.
   */
  public boolean isUseTls12() {
    return this.useTls12;
  }

  /**
   * Returns whether to use docid query parameter.
   *
   * @return Whether to use docid query parameter.
   */
  public boolean isDocidQueryparam() {
    return this.docidQueryparam;
  }

  /**
   * Returns the callback URL.
   *
   * @return The callback URL.
   */
  public String getCallbackUrl() {
    return this.callbackUrl;
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
   * Returns the secret key.
   *
   * @return The secret key.
   */
  public String getSecretKey() {
    return this.secretKey;
  }

  /**
   * Converts this object to a map.
   *
   * @return The map representation of this object.
   */
  @NotNull
  @Override
  public Map<String, Object> toMap() {
    Map<String, Object> map = new LinkedHashMap<>();
    map.put("use_tls_12", this.isUseTls12());
    map.put("docid_queryparam", this.isDocidQueryparam());
    map.put("integration_id", this.getIntegrationId());
    map.put("callback_url", this.getCallbackUrl());
    map.put("headers", this.getHeaders());
    map.put("secret_key", this.getSecretKey());
    return map;
  }

  /**
   * Creates a JsonAttribute object from a map.
   *
   * @param data The map.
   * @return The JsonAttribute object.
   */
  @NotNull
  @Contract("_ -> new")
  public static JsonAttribute fromMap(@NotNull Map<String, Object> data) {
    return new JsonAttribute(
        (boolean) data.getOrDefault("use_tls_12", false),
        (boolean) data.getOrDefault("docid_queryparam", false),
        (String) data.get("callback_url"),
        (String) data.getOrDefault("integration_id", null),
        Cast.safeToMap(data.get("headers"), String.class, Object.class),
        (String) data.getOrDefault("secret_key", ""));
  }
}