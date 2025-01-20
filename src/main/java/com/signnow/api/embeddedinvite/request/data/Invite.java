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

/**
 * This class represents an Invite in the signNow API.
 */
public final class Invite extends ApiData {

  /**
   * The email of the invitee.
   */
  @JsonProperty("email")
  private final String email;

  /**
   * The role id of the invitee.
   */
  @JsonProperty("role_id")
  private final String roleId;

  /**
   * The order of the invite.
   */
  @JsonProperty("order")
  private final int order;

  /**
   * The authentication method for the invite.
   */
  @JsonProperty("auth_method")
  private final String authMethod;

  /**
   * The language of the invite.
   */
  @JsonProperty("language")
  private final String language;

  /**
   * The first name of the invitee.
   */
  @JsonProperty("first_name")
  private final String firstName;

  /**
   * The last name of the invitee.
   */
  @JsonProperty("last_name")
  private final String lastName;

  /**
   * The prefill signature name for the invite.
   */
  @JsonProperty("prefill_signature_name")
  private final String prefillSignatureName;

  /**
   * The required preset signature name for the invite.
   */
  @JsonProperty("required_preset_signature_name")
  private final String requiredPresetSignatureName;

  /**
   * The flag to force new signature for the invite.
   */
  @JsonProperty("force_new_signature")
  private final int forceNewSignature;

  /**
   * The redirect URI for the invite.
   */
  @JsonProperty("redirect_uri")
  private final String redirectUri;

  /**
   * The decline redirect URI for the invite.
   */
  @JsonProperty("decline_redirect_uri")
  private final String declineRedirectUri;

  /**
   * The redirect target for the invite.
   */
  @JsonProperty("redirect_target")
  private final String redirectTarget;

  /**
   * The authentication details for the invite.
   */
  @JsonProperty("authentication")
  private final Authentication authentication;

  /**
   * Constructor for Invite class.
   *
   * @param email The email of the invitee.
   * @param roleId The role id of the invitee.
   * @param order The order of the invite.
   * @param authMethod The authentication method for the invite.
   * @param language The language of the invite.
   * @param firstName The first name of the invitee.
   * @param lastName The last name of the invitee.
   * @param prefillSignatureName The prefill signature name for the invite.
   * @param requiredPresetSignatureName The required preset signature name for the invite.
   * @param forceNewSignature The flag to force new signature for the invite.
   * @param redirectUri The redirect URI for the invite.
   * @param declineRedirectUri The decline redirect URI for the invite.
   * @param redirectTarget The redirect target for the invite.
   * @param authentication The authentication details for the invite.
   */
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

  /**
   * Constructor for Invite class with default values for some properties.
   *
   * @param email The email of the invitee.
   * @param roleId The role id of the invitee.
   * @param order The order of the invite.
   * @param firstName The first name of the invitee.
   * @param lastName The last name of the invitee.
   */
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

  /**
   * Constructor for Invite class with default values for some properties and redirect URIs.
   *
   * @param email The email of the invitee.
   * @param roleId The role id of the invitee.
   * @param order The order of the invite.
   * @param firstName The first name of the invitee.
   * @param lastName The last name of the invitee.
   * @param redirectUri The redirect URI for the invite.
   * @param declineRedirectUri The decline redirect URI for the invite.
   * @param redirectTarget The redirect target for the invite.
   */
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

  /**
   * Returns the email of the invitee.
   *
   * @return The email of the invitee.
   */
  public String getEmail() {
    return this.email;
  }

  /**
   * Returns the role id of the invitee.
   *
   * @return The role id of the invitee.
   */
  public String getRoleId() {
    return this.roleId;
  }

  /**
   * Returns the order of the invite.
   *
   * @return The order of the invite.
   */
  public int getOrder() {
    return this.order;
  }

  /**
   * Returns the language of the invite.
   *
   * @return The language of the invite.
   */
  public String getLanguage() {
    return this.language;
  }

  /**
   * Returns the authentication method for the invite.
   *
   * @return The authentication method for the invite.
   */
  public String getAuthMethod() {
    return this.authMethod;
  }

  /**
   * Returns the first name of the invitee.
   *
   * @return The first name of the invitee.
   */
  public String getFirstName() {
    return this.firstName;
  }

  /**
   * Returns the last name of the invitee.
   *
   * @return The last name of the invitee.
   */
  public String getLastName() {
    return this.lastName;
  }

  /**
   * Returns the prefill signature name for the invite.
   *
   * @return The prefill signature name for the invite.
   */
  public String getPrefillSignatureName() {
    return this.prefillSignatureName;
  }

  /**
   * Returns the required preset signature name for the invite.
   *
   * @return The required preset signature name for the invite.
   */
  public String getRequiredPresetSignatureName() {
    return this.requiredPresetSignatureName;
  }

  /**
   * Returns the flag to force new signature for the invite.
   *
   * @return The flag to force new signature for the invite.
   */
  public int getForceNewSignature() {
    return this.forceNewSignature;
  }

  /**
   * Returns the redirect URI for the invite.
   *
   * @return The redirect URI for the invite.
   */
  public String getRedirectUri() {
    return this.redirectUri;
  }

  /**
   * Returns the decline redirect URI for the invite.
   *
   * @return The decline redirect URI for the invite.
   */
  public String getDeclineRedirectUri() {
    return this.declineRedirectUri;
  }

  /**
   * Returns the redirect target for the invite.
   *
   * @return The redirect target for the invite.
   */
  public String getRedirectTarget() {
    return this.redirectTarget;
  }

  /**
   * Returns the authentication details for the invite.
   *
   * @return The authentication details for the invite.
   */
  public Authentication getAuthentication() {
    return this.authentication;
  }

  /**
   * Converts the Invite object to a Map.
   *
   * @return A Map representation of the Invite object.
   */
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

  /**
   * Creates an Invite object from a Map.
   *
   * @param data The Map containing the data for the Invite.
   * @return An Invite object.
   */
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
