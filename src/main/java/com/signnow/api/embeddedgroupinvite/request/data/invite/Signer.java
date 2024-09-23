/*
 * This file is a part of signNow SDK API client.
 *
 * (с) Copyright © 2011-present airSlate Inc. (https://www.signnow.com)
 *
 * For more details on copyright, see LICENSE.md file
 * that was distributed with this source code.
 */

package com.signnow.api.embeddedgroupinvite.request.data.invite;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.signnow.core.data.ApiData;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

public final class Signer extends ApiData {

  @JsonProperty("email")
  private final String email;

  @JsonProperty("auth_method")
  private final String authMethod;

  @JsonProperty("documents")
  private final DocumentCollection documents;

  @JsonProperty("first_name")
  private final String firstName;

  @JsonProperty("last_name")
  private final String lastName;

  @JsonProperty("language")
  private final String language;

  @JsonProperty("required_preset_signature_name")
  private final String requiredPresetSignatureName;

  @JsonProperty("redirect_uri")
  private final String redirectUri;

  @JsonProperty("decline_redirect_uri")
  private final String declineRedirectUri;

  @JsonProperty("redirect_target")
  private final String redirectTarget;

  @JsonCreator
  public Signer(
      @JsonProperty("email") String email,
      @JsonProperty("auth_method") String authMethod,
      @JsonProperty("documents") DocumentCollection documents,
      @JsonProperty("first_name") String firstName,
      @JsonProperty("last_name") String lastName,
      @JsonProperty("language") String language,
      @JsonProperty("required_preset_signature_name") String requiredPresetSignatureName,
      @JsonProperty("redirect_uri") String redirectUri,
      @JsonProperty("decline_redirect_uri") String declineRedirectUri,
      @JsonProperty("redirect_target") String redirectTarget) {
    this.email = email;
    this.authMethod = authMethod;
    this.documents = documents;
    this.firstName = firstName;
    this.lastName = lastName;
    this.language = language;
    this.requiredPresetSignatureName = requiredPresetSignatureName;
    this.redirectUri = redirectUri;
    this.declineRedirectUri = declineRedirectUri;
    this.redirectTarget = redirectTarget;
  }

  public Signer(
      @JsonProperty("email") String email,
      @JsonProperty("auth_method") String authMethod,
      @JsonProperty("documents") DocumentCollection documents,
      @JsonProperty("first_name") String firstName,
      @JsonProperty("last_name") String lastName) {
    this.email = email;
    this.authMethod = authMethod;
    this.documents = documents;
    this.firstName = firstName;
    this.lastName = lastName;
    this.language = null;
    this.requiredPresetSignatureName = null;
    this.redirectUri = null;
    this.declineRedirectUri = null;
    this.redirectTarget = null;
  }

  public String getEmail() {
    return this.email;
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

  public DocumentCollection getDocuments() {
    return this.documents;
  }

  public String getLanguage() {
    return this.language;
  }

  public String getRequiredPresetSignatureName() {
    return this.requiredPresetSignatureName;
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

  @NotNull
  @Override
  public Map<String, Object> toMap() {
    Map<String, Object> map = new LinkedHashMap<>();
    map.put("email", this.getEmail());
    map.put("auth_method", this.getAuthMethod());
    map.put("first_name", this.getFirstName());
    map.put("last_name", this.getLastName());
    map.put("documents", this.getDocuments());
    map.put("language", this.getLanguage());
    map.put("required_preset_signature_name", this.getRequiredPresetSignatureName());
    map.put("redirect_uri", this.getRedirectUri());
    map.put("decline_redirect_uri", this.getDeclineRedirectUri());
    map.put("redirect_target", this.getRedirectTarget());
    return map;
  }

  @NotNull
  @Contract("_ -> new")
  public static Signer fromMap(@NotNull Map<String, Object> data) {
    return new Signer(
        (String) data.get("email"),
        (String) data.get("auth_method"),
        (DocumentCollection) data.get("documents"),
        (String) data.getOrDefault("first_name", null),
        (String) data.getOrDefault("last_name", null),
        (String) data.getOrDefault("language", ""),
        (String) data.getOrDefault("required_preset_signature_name", ""),
        (String) data.getOrDefault("redirect_uri", ""),
        (String) data.getOrDefault("decline_redirect_uri", ""),
        (String) data.getOrDefault("redirect_target", ""));
  }
}
