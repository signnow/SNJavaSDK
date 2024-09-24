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

public final class Attribute extends ApiData {

  @JsonProperty("callback")
  private final String callback;

  @JsonProperty("use_tls_12")
  private final boolean useTls12;

  @JsonProperty("integration_id")
  private final String integrationId;

  @JsonProperty("docid_queryparam")
  private final boolean docidQueryparam;

  @JsonProperty("headers")
  private Map<String, Object> headers;

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

  public Attribute(@JsonProperty("callback") String callback) {
    this.callback = callback;
    this.useTls12 = false;
    this.integrationId = null;
    this.docidQueryparam = false;
    this.headers = new HashMap<>();
  }

  public String getCallback() {
    return this.callback;
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
