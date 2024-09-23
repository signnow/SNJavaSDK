/*
 * This file is a part of signNow SDK API client.
 *
 * (с) Copyright © 2011-present airSlate Inc. (https://www.signnow.com)
 *
 * For more details on copyright, see LICENSE.md file
 * that was distributed with this source code.
 */

package com.signnow.api.embeddedinvite.request.data;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.signnow.core.data.ApiData;
import com.signnow.core.util.Cast;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

public final class Invite extends ApiData {

  @JsonProperty("email")
  private final String email;

  @JsonProperty("role_id")
  private final String roleId;

  @JsonProperty("order")
  private final int order;

  @JsonProperty("auth_method")
  private final String authMethod;

  @JsonProperty("language")
  private final String language;

  @JsonProperty("first_name")
  private final String firstName;

  @JsonProperty("last_name")
  private final String lastName;

  @JsonProperty("prefill_signature_name")
  private final String prefillSignatureName;

  @JsonProperty("required_preset_signature_name")
  private final String requiredPresetSignatureName;

  @JsonProperty("force_new_signature")
  private final int forceNewSignature;

  @JsonProperty("redirect_uri")
  private final String redirectUri;

  @JsonProperty("decline_redirect_uri")
  private final String declineRedirectUri;

  @JsonProperty("redirect_target")
  private final String redirectTarget;

  @JsonProperty("authentication")
  private final Authentication authentication;

  @JsonCreator
  public Invite(
      @JsonProperty("email") String email,
      @JsonProperty("role_id") String roleId,
      @JsonProperty("order") int order,
      @JsonProperty("auth_method") String authMethod,
      @JsonProperty("language") String language,
      @JsonProperty("first_name") String firstName,
      @JsonProperty("last_name") String lastName,
      @JsonProperty("prefill_signature_name") String prefillSignatureName,
      @JsonProperty("required_preset_signature_name") String requiredPresetSignatureName,
      @JsonProperty("force_new_signature") int forceNewSignature,
      @JsonProperty("redirect_uri") String redirectUri,
      @JsonProperty("decline_redirect_uri") String declineRedirectUri,
      @JsonProperty("redirect_target") String redirectTarget,
      @JsonProperty("authentication") Authentication authentication) {
    this.email = email;
    this.roleId = roleId;
    this.order = order;
    this.authMethod = authMethod;
    this.language = language;
    this.firstName = firstName;
    this.lastName = lastName;
    this.prefillSignatureName = prefillSignatureName;
    this.requiredPresetSignatureName = requiredPresetSignatureName;
    this.forceNewSignature = forceNewSignature;
    this.redirectUri = redirectUri;
    this.declineRedirectUri = declineRedirectUri;
    this.redirectTarget = redirectTarget;
    this.authentication = authentication;
  }

  public Invite(
      @JsonProperty("email") String email,
      @JsonProperty("role_id") String roleId,
      @JsonProperty("order") int order,
      @JsonProperty("first_name") String firstName,
      @JsonProperty("last_name") String lastName) {
    this.email = email;
    this.roleId = roleId;
    this.order = order;
    this.authMethod = "none";
    this.language = "en";
    this.firstName = firstName;
    this.lastName = lastName;
    this.prefillSignatureName = null;
    this.requiredPresetSignatureName = null;
    this.forceNewSignature = 0;
    this.redirectUri = null;
    this.declineRedirectUri = null;
    this.redirectTarget = null;
    this.authentication = null;
  }

  public Invite(
      @JsonProperty("email") String email,
      @JsonProperty("role_id") String roleId,
      @JsonProperty("order") int order,
      @JsonProperty("first_name") String firstName,
      @JsonProperty("last_name") String lastName,
      @JsonProperty("redirect_uri") String redirectUri,
      @JsonProperty("decline_redirect_uri") String declineRedirectUri,
      @JsonProperty("redirect_target") String redirectTarget) {
    this.email = email;
    this.roleId = roleId;
    this.order = order;
    this.authMethod = "none";
    this.language = "en";
    this.firstName = firstName;
    this.lastName = lastName;
    this.prefillSignatureName = null;
    this.requiredPresetSignatureName = null;
    this.forceNewSignature = 0;
    this.redirectUri = redirectUri;
    this.declineRedirectUri = declineRedirectUri;
    this.redirectTarget = redirectTarget;
    this.authentication = null;
  }

  public String getEmail() {
    return this.email;
  }

  public String getRoleId() {
    return this.roleId;
  }

  public int getOrder() {
    return this.order;
  }

  public String getLanguage() {
    return this.language;
  }

  public String getAuthMethod() {
    return this.authMethod;
  }

  public String getFirstName() {
    return this.firstName;
  }

  public String getLastName() {
    return this.lastName;
  }

  public String getPrefillSignatureName() {
    return this.prefillSignatureName;
  }

  public String getRequiredPresetSignatureName() {
    return this.requiredPresetSignatureName;
  }

  public int getForceNewSignature() {
    return this.forceNewSignature;
  }

  public String getRedirectUri() {
    return this.redirectUri;
  }

  public String getDeclineRedirectUri() {
    return this.declineRedirectUri;
  }

  public String getRedirectTarget() {
    return this.redirectTarget;
  }

  public Authentication getAuthentication() {
    return this.authentication;
  }

  @NotNull
  @Override
  public Map<String, Object> toMap() {
    Map<String, Object> map = new LinkedHashMap<>();
    map.put("email", this.getEmail());
    map.put("role_id", this.getRoleId());
    map.put("order", this.getOrder());
    map.put("language", this.getLanguage());
    map.put("auth_method", this.getAuthMethod());
    map.put("first_name", this.getFirstName());
    map.put("last_name", this.getLastName());
    map.put("prefill_signature_name", this.getPrefillSignatureName());
    map.put("required_preset_signature_name", this.getRequiredPresetSignatureName());
    map.put("force_new_signature", this.getForceNewSignature());
    map.put("redirect_uri", this.getRedirectUri());
    map.put("decline_redirect_uri", this.getDeclineRedirectUri());
    map.put("redirect_target", this.getRedirectTarget());
    map.put("authentication", this.getAuthentication());
    return map;
  }

  @NotNull
  @Contract("_ -> new")
  public static Invite fromMap(@NotNull Map<String, Object> data) {
    return new Invite(
        (String) data.get("email"),
        (String) data.get("role_id"),
        (Integer) data.get("order"),
        (String) data.get("auth_method"),
        (String) data.getOrDefault("language", ""),
        (String) data.getOrDefault("first_name", ""),
        (String) data.getOrDefault("last_name", ""),
        (String) data.getOrDefault("prefill_signature_name", ""),
        (String) data.getOrDefault("required_preset_signature_name", ""),
        (Integer) data.getOrDefault("force_new_signature", 0),
        (String) data.getOrDefault("redirect_uri", ""),
        (String) data.getOrDefault("decline_redirect_uri", ""),
        (String) data.getOrDefault("redirect_target", ""),
        data.get("authentication") != null
            ? Authentication.fromMap(
                Cast.safeToMap(data.get("authentication"), String.class, Object.class))
            : null);
  }
}
