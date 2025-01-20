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
 * This class represents a JSON attribute in the signNow SDK API client.
 */
public final class JsonAttribute extends ApiData {

  /**
   * A boolean indicating whether to use TLS 1.2.
   */
  @JsonProperty("use_tls_12")
  private final boolean useTls12;

  /**
   * The callback URL.
   */
  @JsonProperty("callback_url")
  private final String callbackUrl;

  /**
   * A boolean indicating whether to include the document ID in the query parameter.
   */
  @JsonProperty("docid_queryparam")
  private final boolean docidQueryparam;

  /**
   * The integration ID.
   */
  @JsonProperty("integration_id")
  private final String integrationId;

  /**
   * The headers for the request.
   */
  @JsonProperty("headers")
  private Map<String, Object> headers;

  /**
   * A boolean indicating whether to include metadata.
   */
  @JsonProperty("include_metadata")
  private final boolean includeMetadata;

  /**
   * A boolean indicating whether to delete the access token.
   */
  @JsonProperty("delete_access_token")
  private final boolean deleteAccessToken;

  /**
   * Constructor for the JsonAttribute class.
   *
   * @param useTls12           Whether to use TLS 1.2.
   * @param callbackUrl        The callback URL.
   * @param docidQueryparam    Whether to include the document ID in the query parameter.
   * @param integrationId      The integration ID.
   * @param headers            The headers for the request.
   * @param includeMetadata    Whether to include metadata.
   * @param deleteAccessToken  Whether to delete the access token.
   */
  @JsonCreator
  public JsonAttribute(
      @JsonProperty("use_tls_12") boolean useTls12,
      @JsonProperty("callback_url") String callbackUrl,
      @JsonProperty("docid_queryparam") boolean docidQueryparam,
      @JsonProperty("integration_id") String integrationId,
      @JsonProperty("headers") Map<String, Object> headers,
      @JsonProperty("include_metadata") boolean includeMetadata,
      @JsonProperty("delete_access_token") boolean deleteAccessToken) {
    this.useTls12 = useTls12;
    this.callbackUrl = callbackUrl;
    this.docidQueryparam = docidQueryparam;
    this.integrationId = integrationId;
    this.headers = headers;
    this.includeMetadata = includeMetadata;
    this.deleteAccessToken = deleteAccessToken;
  }

  /**
   * @return Whether to use TLS 1.2.
   */
  public boolean isUseTls12() {
    return this.useTls12;
  }

  /**
   * @return Whether to include the document ID in the query parameter.
   */
  public boolean isDocidQueryparam() {
    return this.docidQueryparam;
  }

  /**
   * @return The integration ID.
   */
  public String getIntegrationId() {
    return this.integrationId;
  }

  /**
   * @return The callback URL.
   */
  public String getCallbackUrl() {
    return this.callbackUrl;
  }

  /**
   * @return The headers for the request.
   */
  public Map<String, Object> getHeaders() {
    return this.headers;
  }

  /**
   * @return Whether to include metadata.
   */
  public boolean isIncludeMetadata() {
    return this.includeMetadata;
  }

  /**
   * @return Whether to delete the access token.
   */
  public boolean isDeleteAccessToken() {
    return this.deleteAccessToken;
  }

  /**
   * Converts this object to a map.
   *
   * @return A map representation of this object.
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
    map.put("include_metadata", this.isIncludeMetadata());
    map.put("delete_access_token", this.isDeleteAccessToken());
    return map;
  }

  /**
   * Creates a new JsonAttribute object from a map.
   *
   * @param data The map to create the object from.
   * @return A new JsonAttribute object.
   */
  @NotNull
  @Contract("_ -> new")
  public static JsonAttribute fromMap(@NotNull Map<String, Object> data) {
    return new JsonAttribute(
        (boolean) data.getOrDefault("use_tls_12", false),
        (String) data.get("callback_url"),
        (boolean) data.getOrDefault("docid_queryparam", false),
        (String) data.getOrDefault("integration_id", null),
        Cast.safeToMap(data.get("headers"), String.class, Object.class),
        (boolean) data.getOrDefault("include_metadata", false),
        (boolean) data.getOrDefault("delete_access_token", false));
  }
}