/*
 * This file is a part of signNow SDK API client.
 *
 * (с) Copyright © 2011-present airSlate Inc. (https://www.signnow.com)
 *
 * For more details on copyright, see LICENSE.md file
 * that was distributed with this source code.
 */

package com.signnow.api.webhookv2.response.data;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.signnow.core.data.ApiData;
import com.signnow.core.util.Cast;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

/**
 * This class represents the JSON attributes of the API data.
 */
public final class JsonAttribute extends ApiData {

  /**
   * Represents the use of TLS 1.2 protocol.
   */
  @JsonProperty("use_tls_12")
  private final boolean useTls12;

  /**
   * Represents the document ID query parameter.
   */
  @JsonProperty("docid_queryparam")
  private final boolean docidQueryparam;

  /**
   * Represents the callback URL.
   */
  @JsonProperty("callback_url")
  private final String callbackUrl;

  /**
   * Represents the deletion of access token.
   */
  @JsonProperty("delete_access_token")
  private final boolean deleteAccessToken;

  /**
   * Represents the inclusion of metadata.
   */
  @JsonProperty("include_metadata")
  private final boolean includeMetadata;

  /**
   * Represents the integration ID.
   */
  @JsonProperty("integration_id")
  private final String integrationId;

  /**
   * Represents the headers of the API data.
   */
  @JsonProperty("headers")
  private Map<String, Object> headers;

  /**
   * Constructor for JsonAttribute class.
   *
   * @param useTls12            the use of TLS 1.2 protocol
   * @param docidQueryparam     the document ID query parameter
   * @param callbackUrl         the callback URL
   * @param deleteAccessToken   the deletion of access token
   * @param includeMetadata     the inclusion of metadata
   * @param integrationId       the integration ID
   * @param headers             the headers of the API data
   */
  @JsonCreator
  public JsonAttribute(
      @JsonProperty("use_tls_12") boolean useTls12,
      @JsonProperty("docid_queryparam") boolean docidQueryparam,
      @JsonProperty("callback_url") String callbackUrl,
      @JsonProperty("delete_access_token") boolean deleteAccessToken,
      @JsonProperty("include_metadata") boolean includeMetadata,
      @JsonProperty("integration_id") String integrationId,
      @JsonProperty("headers") Map<String, Object> headers) {
    this.useTls12 = useTls12;
    this.docidQueryparam = docidQueryparam;
    this.callbackUrl = callbackUrl;
    this.deleteAccessToken = deleteAccessToken;
    this.includeMetadata = includeMetadata;
    this.integrationId = integrationId;
    this.headers = headers;
  }

  /**
   * @return the use of TLS 1.2 protocol
   */
  public boolean isUseTls12() {
    return this.useTls12;
  }

  /**
   * @return the document ID query parameter
   */
  public boolean isDocidQueryparam() {
    return this.docidQueryparam;
  }

  /**
   * @return the integration ID
   */
  public String getIntegrationId() {
    return this.integrationId;
  }

  /**
   * @return the callback URL
   */
  public String getCallbackUrl() {
    return this.callbackUrl;
  }

  /**
   * @return the headers of the API data
   */
  public Map<String, Object> getHeaders() {
    return this.headers;
  }

  /**
   * @return the deletion of access token
   */
  public boolean isDeleteAccessToken() {
    return this.deleteAccessToken;
  }

  /**
   * @return the inclusion of metadata
   */
  public boolean isIncludeMetadata() {
    return this.includeMetadata;
  }

  /**
   * Converts the JSON attributes to a map.
   *
   * @return a map of JSON attributes
   */
  @NotNull
  @Override
  public Map<String, Object> toMap() {
    Map<String, Object> map = new LinkedHashMap<>();
    map.put("use_tls_12", this.isUseTls12());
    map.put("docid_queryparam", this.isDocidQueryparam());
    map.put("callback_url", this.getCallbackUrl());
    if (this.getIntegrationId() != null) {
      map.put("integration_id", this.getIntegrationId());
    }
    map.put("headers", this.getHeaders());
    map.put("delete_access_token", this.isDeleteAccessToken());
    map.put("include_metadata", this.isIncludeMetadata());
    return map;
  }

  /**
   * Creates a new JsonAttribute object from a map.
   *
   * @param data the map of JSON attributes
   * @return a new JsonAttribute object
   */
  @NotNull
  @Contract("_ -> new")
  public static JsonAttribute fromMap(@NotNull Map<String, Object> data) {
    return new JsonAttribute(
        (boolean) data.getOrDefault("use_tls_12", false),
        (boolean) data.getOrDefault("docid_queryparam", false),
        (String) data.getOrDefault("callback_url", ""),
        (boolean) data.getOrDefault("delete_access_token", false),
        (boolean) data.getOrDefault("include_metadata", false),
        (String) data.getOrDefault("integration_id", ""),
        Cast.safeToMap(data.get("headers"), String.class, Object.class));
  }
}