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

/**
 * Viewer class extends ApiData.
 * Represents a viewer with properties like email, role, order, subject, message, closeRedirectUri, redirectTarget.
 */
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

  /**
   * Constructor for Viewer class.
   *
   * @param email            the email of the viewer
   * @param role             the role of the viewer
   * @param order            the order of the viewer
   * @param subject          the subject of the viewer
   * @param message          the message of the viewer
   * @param closeRedirectUri the close redirect URI of the viewer
   * @param redirectTarget   the redirect target of the viewer
   */
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

  /**
   * @return the email of the viewer
   */
  public String getEmail() {
    return this.email;
  }

  /**
   * @return the role of the viewer
   */
  public String getRole() {
    return this.role;
  }

  /**
   * @return the order of the viewer
   */
  public int getOrder() {
    return this.order;
  }

  /**
   * @return the close redirect URI of the viewer
   */
  public String getCloseRedirectUri() {
    return this.closeRedirectUri;
  }

  /**
   * @return the redirect target of the viewer
   */
  public String getRedirectTarget() {
    return this.redirectTarget;
  }

  /**
   * @return the subject of the viewer
   */
  public String getSubject() {
    return this.subject;
  }

  /**
   * @return the message of the viewer
   */
  public String getMessage() {
    return this.message;
  }

  /**
   * Converts the viewer object to a map.
   *
   * @return a map with viewer properties as key-value pairs
   */
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

  /**
   * Creates a viewer object from a map.
   *
   * @param data a map with viewer properties as key-value pairs
   * @return a new viewer object
   */
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