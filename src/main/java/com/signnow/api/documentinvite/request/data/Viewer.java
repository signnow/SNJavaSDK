/*
 * This file is a part of signNow SDK API client.
 *
 * (с) Copyright © 2011-present airSlate Inc. (https://www.signnow.com)
 *
 * For more details on copyright, see LICENSE.md file
 * that was distributed with this source code.
 */

package com.signnow.api.documentinvite.request.data;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.signnow.core.data.ApiData;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

public class Viewer extends ApiData {

  @JsonProperty("email")
  private final String email;

  @JsonProperty("role")
  private final String role;

  @JsonProperty("order")
  private final int order;

  @JsonProperty("subject")
  private final String subject;

  @JsonProperty("message")
  private final String message;

  @JsonProperty("close_redirect_uri")
  private final String closeRedirectUri;

  @JsonProperty("redirect_target")
  private final String redirectTarget;

  @JsonCreator
  public Viewer(
      @JsonProperty("email") String email,
      @JsonProperty("role") String role,
      @JsonProperty("order") int order,
      @JsonProperty("subject") String subject,
      @JsonProperty("message") String message,
      @JsonProperty("close_redirect_uri") String closeRedirectUri,
      @JsonProperty("redirect_target") String redirectTarget) {
    this.email = email;
    this.role = role;
    this.order = order;
    this.subject = subject;
    this.message = message;
    this.closeRedirectUri =
        (closeRedirectUri != null) ? closeRedirectUri : ""; // default to empty string
    this.redirectTarget = (redirectTarget != null) ? redirectTarget : ""; // default to empty string
  }

  public String getEmail() {
    return this.email;
  }

  public String getRole() {
    return this.role;
  }

  public int getOrder() {
    return this.order;
  }

  public String getCloseRedirectUri() {
    return this.closeRedirectUri;
  }

  public String getRedirectTarget() {
    return this.redirectTarget;
  }

  public String getSubject() {
    return this.subject;
  }

  public String getMessage() {
    return this.message;
  }

  @NotNull
  @Override
  public Map<String, Object> toMap() {
    Map<String, Object> map = new LinkedHashMap<>();
    map.put("email", this.getEmail());
    map.put("role", this.getRole());
    map.put("order", this.getOrder());
    map.put("close_redirect_uri", this.getCloseRedirectUri());
    map.put("redirect_target", this.getRedirectTarget());
    map.put("subject", this.getSubject());
    map.put("message", this.getMessage());
    return map;
  }

  @NotNull
  @Contract("_ -> new")
  public static Viewer fromMap(Map<String, Object> data) {
    return new Viewer(
        (String) data.get("email"),
        (String) data.get("role"),
        (int) data.get("order"),
        (String) data.get("subject"),
        (String) data.get("message"),
        (String) data.getOrDefault("close_redirect_uri", ""),
        (String) data.getOrDefault("redirect_target", ""));
  }
}
