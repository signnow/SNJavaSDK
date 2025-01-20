/*
 * This file is a part of signNow SDK API client.
 *
 * (с) Copyright © 2011-present airSlate Inc. (https://www.signnow.com)
 *
 * For more details on copyright, see LICENSE.md file
 * that was distributed with this source code.
 */

package com.signnow.api.webhookv2.request.data;

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
   * Flag to indicate if the access token should be deleted.
   */
  @JsonProperty("delete_access_token")
  private final boolean deleteAccessToken;

  /**
   * Flag to indicate if TLS 1.2 should be used.
   */
  @JsonProperty("use_tls_12")
  private final boolean useTls12;

  /**
   * The integration ID for the webhook.
   */
  @JsonProperty("integration_id")
  private final String integrationId;

  /**
   * Flag to indicate if the document ID should be included in the query parameters.
   */
  @JsonProperty("docid_queryparam")
  private final boolean docidQueryparam;

  /**
   * The headers for the webhook request.
   */
  @JsonProperty("headers")
  private Map<String, Object> headers;

  /**
   * Flag to indicate if metadata should be included in the webhook request.
   */
  @JsonProperty("include_metadata")
  private final boolean includeMetadata;

  /**
   * The secret key for the webhook.
   */
  @JsonProperty("secret_key")
  private final String secretKey;

  /**
   * Constructor for the Attribute class.
   *
   * @param callback The callback URL for the webhook.
   * @param deleteAccessToken Flag to indicate if the access token should be deleted.
   * @param useTls12 Flag to indicate if TLS 1.2 should be used.
   * @param integrationId The integration ID for the webhook.
   * @param docidQueryparam Flag to indicate if the document ID should be included in the query parameters.
   * @param headers The headers for the webhook request.
   * @param includeMetadata Flag to indicate if metadata should be included in the webhook request.
   * @param secretKey The secret key for the webhook.
   */
  @JsonCreator
  public Attribute(
      @JsonProperty("callback") String callback,
      @JsonProperty("delete_access_token") boolean deleteAccessToken,
      @JsonProperty("use_tls_12") boolean useTls12,
      @JsonProperty("integration_id") String integrationId,
      @JsonProperty("docid_queryparam") boolean docidQueryparam,
      @JsonProperty("headers") Map<String, Object> headers,
      @JsonProperty("include_metadata") boolean includeMetadata,
      @JsonProperty("secret_key") String secretKey) {
    this.callback = callback;
    this.deleteAccessToken = deleteAccessToken;
    this.useTls12 = useTls12;
    this.integrationId = integrationId;
    this.docidQueryparam = docidQueryparam;
    this.headers = headers;
    this.includeMetadata = includeMetadata;
    this.secretKey = secretKey;
  }

  /**
   * Constructor for the Attribute class with only the callback parameter.
   *
   * @param callback The callback URL for the webhook.
   */
  public Attribute(@JsonProperty("callback") String callback) {
    this.callback = callback;
    this.deleteAccessToken = false;
    this.useTls12 = false;
    this.integrationId = null;
    this.docidQueryparam = false;
    this.headers = new HashMap<>();
    this.includeMetadata = false;
    this.secretKey = null;
  }

  /**
   * Returns the callback URL for the webhook.
   *
   * @return The callback URL.
   */
  public String getCallback() {
    return this.callback;
  }

  /**
   * Returns the flag indicating if the access token should be deleted.
   *
   * @return The delete access token flag.
   */
  public boolean isDeleteAccessToken() {
    return this.deleteAccessToken;
  }

  /**
   * Returns the flag indicating if TLS 1.2 should be used.
   *
   * @return The use TLS 1.2 flag.
   */
  public boolean isUseTls12() {
    return this.useTls12;
  }

  /**
   * Returns the integration ID for the webhook.
   *
   * @return The integration ID.
   */
  public String getIntegrationId() {
    return this.integrationId;
  }

  /**
   * Returns the flag indicating if the document ID should be included in the query parameters.
   *
   * @return The document ID query parameter flag.
   */
  public boolean isDocidQueryparam() {
    return this.docidQueryparam;
  }

  /**
   * Returns the headers for the webhook request.
   *
   * @return The headers.
   */
  public Map<String, Object> getHeaders() {
    return this.headers;
  }

  /**
   * Returns the flag indicating if metadata should be included in the webhook request.
   *
   * @return The include metadata flag.
   */
  public boolean isIncludeMetadata() {
    return this.includeMetadata;
  }

  /**
   * Returns the secret key for the webhook.
   *
   * @return The secret key.
   */
  public String getSecretKey() {
    return this.secretKey;
  }

  /**
   * Converts the Attribute object to a Map.
   *
   * @return The Map representation of the Attribute object.
   */
  @NotNull
  @Override
  public Map<String, Object> toMap() {
    Map<String, Object> map = new LinkedHashMap<>();
    map.put("callback", this.getCallback());
    map.put("delete_access_token", this.isDeleteAccessToken());
    map.put("use_tls_12", this.isUseTls12());
    map.put("integration_id", this.getIntegrationId());
    map.put("docid_queryparam", this.isDocidQueryparam());
    map.put("headers", this.getHeaders());
    map.put("include_metadata", this.isIncludeMetadata());
    map.put("secret_key", this.getSecretKey());
    return map;
  }

  /**
   * Creates an Attribute object from a Map.
   *
   * @param data The Map containing the data for the Attribute object.
   * @return The created Attribute object.
   */
  @NotNull
  @Contract("_ -> new")
  public static Attribute fromMap(@NotNull Map<String, Object> data) {
    return new Attribute(
        (String) data.get("callback"),
        (Boolean) data.getOrDefault("delete_access_token", false),
        (Boolean) data.getOrDefault("use_tls_12", false),
        (String) data.getOrDefault("integration_id", ""),
        (Boolean) data.getOrDefault("docid_queryparam", false),
        Cast.safeToMap(data.get("headers"), String.class, Object.class),
        (Boolean) data.getOrDefault("include_metadata", false),
        (String) data.getOrDefault("secret_key", ""));
  }
}