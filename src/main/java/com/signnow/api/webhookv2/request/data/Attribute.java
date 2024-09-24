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

public final class Attribute extends ApiData {

  @JsonProperty("callback")
  private final String callback;

  @JsonProperty("delete_access_token")
  private final boolean deleteAccessToken;

  @JsonProperty("use_tls_12")
  private final boolean useTls12;

  @JsonProperty("integration_id")
  private final String integrationId;

  @JsonProperty("docid_queryparam")
  private final boolean docidQueryparam;

  @JsonProperty("headers")
  private Map<String, Object> headers;

  @JsonProperty("include_metadata")
  private final boolean includeMetadata;

  @JsonProperty("secret_key")
  private final String secretKey;

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

  public String getCallback() {
    return this.callback;
  }

  public boolean isDeleteAccessToken() {
    return this.deleteAccessToken;
  }

  public boolean isUseTls12() {
    return this.useTls12;
  }

  public String getIntegrationId() {
    return this.integrationId;
  }

  public boolean isDocidQueryparam() {
    return this.docidQueryparam;
  }

  public Map<String, Object> getHeaders() {
    return this.headers;
  }

  public boolean isIncludeMetadata() {
    return this.includeMetadata;
  }

  public String getSecretKey() {
    return this.secretKey;
  }

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
