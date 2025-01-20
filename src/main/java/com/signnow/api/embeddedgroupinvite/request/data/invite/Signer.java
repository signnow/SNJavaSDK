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

/**
 * This class represents a Signer in the signNow API.
 */
public final class Signer extends ApiData {

  /**
   * The email of the signer.
   */
  @JsonProperty("email")
  private final String email;

  /**
   * The authentication method of the signer.
   */
  @JsonProperty("auth_method")
  private final String authMethod;

  /**
   * The documents associated with the signer.
   */
  @JsonProperty("documents")
  private final DocumentCollection documents;

  /**
   * The first name of the signer.
   */
  @JsonProperty("first_name")
  private final String firstName;

  /**
   * The last name of the signer.
   */
  @JsonProperty("last_name")
  private final String lastName;

  /**
   * The language of the signer.
   */
  @JsonProperty("language")
  private final String language;

  /**
   * The required preset signature name of the signer.
   */
  @JsonProperty("required_preset_signature_name")
  private final String requiredPresetSignatureName;

  /**
   * The redirect URI of the signer.
   */
  @JsonProperty("redirect_uri")
  private final String redirectUri;

  /**
   * The decline redirect URI of the signer.
   */
  @JsonProperty("decline_redirect_uri")
  private final String declineRedirectUri;

  /**
   * The redirect target of the signer.
   */
  @JsonProperty("redirect_target")
  private final String redirectTarget;

  /**
   * Constructor for the Signer class.
   *
   * @param email The email of the signer.
   * @param authMethod The authentication method of the signer.
   * @param documents The documents associated with the signer.
   * @param firstName The first name of the signer.
   * @param lastName The last name of the signer.
   * @param language The language of the signer.
   * @param requiredPresetSignatureName The required preset signature name of the signer.
   * @param redirectUri The redirect URI of the signer.
   * @param declineRedirectUri The decline redirect URI of the signer.
   * @param redirectTarget The redirect target of the signer.
   */
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

  /**
   * Constructor for the Signer class with fewer parameters.
   *
   * @param email The email of the signer.
   * @param authMethod The authentication method of the signer.
   * @param documents The documents associated with the signer.
   * @param firstName The first name of the signer.
   * @param lastName The last name of the signer.
   */
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

  /**
   * @return The email of the signer.
   */
  public String getEmail() {
    return this.email;
  }

  /**
   * @return The authentication method of the signer.
   */
  public String getAuthMethod() {
    return this.authMethod;
  }

  /**
   * @return The first name of the signer.
   */
  public String getFirstName() {
    return this.firstName;
  }

  /**
   * @return The last name of the signer.
   */
  public String getLastName() {
    return this.lastName;
  }

  /**
   * @return The documents associated with the signer.
   */
  public DocumentCollection getDocuments() {
    return this.documents;
  }

  /**
   * @return The language of the signer.
   */
  public String getLanguage() {
    return this.language;
  }

  /**
   * @return The required preset signature name of the signer.
   */
  public String getRequiredPresetSignatureName() {
    return this.requiredPresetSignatureName;
  }

  /**
   * @return The redirect URI of the signer.
   */
  public String getRedirectUri() {
    return this.redirectUri;
  }

  /**
   * @return The decline redirect URI of the signer.
   */
  public String getDeclineRedirectUri() {
    return this.declineRedirectUri;
  }

  /**
   * @return The redirect target of the signer.
   */
  public String getRedirectTarget() {
    return this.redirectTarget;
  }

  /**
   * Converts the Signer object to a Map.
   *
   * @return A Map representation of the Signer object.
   */
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

  /**
   * Creates a Signer object from a Map.
   *
   * @param data The Map to convert to a Signer object.
   * @return A new Signer object.
   */
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