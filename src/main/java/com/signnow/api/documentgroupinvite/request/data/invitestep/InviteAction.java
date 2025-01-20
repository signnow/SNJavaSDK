/*
 * This file is a part of signNow SDK API client.
 *
 * (с) Copyright © 2011-present airSlate Inc. (https://www.signnow.com)
 *
 * For more details on copyright, see LICENSE.md file
 * that was distributed with this source code.
 */

package com.signnow.api.documentgroupinvite.request.data.invitestep;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.signnow.core.data.ApiData;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

/**
 * This class represents an invite action in the signNow API.
 */
public final class InviteAction extends ApiData {

  /**
   * The email of the invitee.
   */
  @JsonProperty("email")
  private final String email;

  /**
   * The role name of the invitee.
   */
  @JsonProperty("role_name")
  private final String roleName;

  /**
   * The action to be performed.
   */
  @JsonProperty("action")
  private final String action;

  /**
   * The ID of the document.
   */
  @JsonProperty("document_id")
  private final String documentId;

  /**
   * The email group of the invitee.
   */
  @JsonProperty("email_group")
  private final EmailGroup emailGroup;

  /**
   * The required preset signature name.
   */
  @JsonProperty("required_preset_signature_name")
  private final String requiredPresetSignatureName;

  /**
   * The flag to allow reassign.
   */
  @JsonProperty("allow_reassign")
  private final String allowReassign;

  /**
   * The flag to decline by signature.
   */
  @JsonProperty("decline_by_signature")
  private final String declineBySignature;

  /**
   * The authentication details.
   */
  @JsonProperty("authentication")
  private final Authentication authentication;

  /**
   * The payment request details.
   */
  @JsonProperty("payment_request")
  private final PaymentRequest paymentRequest;

  /**
   * The redirect URI.
   */
  @JsonProperty("redirect_uri")
  private final String redirectUri;

  /**
   * The decline redirect URI.
   */
  @JsonProperty("decline_redirect_uri")
  private final String declineRedirectUri;

  /**
   * The redirect target.
   */
  @JsonProperty("redirect_target")
  private final String redirectTarget;

  /**
   * The language of the invitee.
   */
  @JsonProperty("language")
  private final String language;

  /**
   * Constructor for InviteAction class.
   *
   * @param email The email of the invitee.
   * @param roleName The role name of the invitee.
   * @param action The action to be performed.
   * @param documentId The ID of the document.
   * @param emailGroup The email group of the invitee.
   * @param requiredPresetSignatureName The required preset signature name.
   * @param allowReassign The flag to allow reassign.
   * @param declineBySignature The flag to decline by signature.
   * @param authentication The authentication details.
   * @param paymentRequest The payment request details.
   * @param redirectUri The redirect URI.
   * @param declineRedirectUri The decline redirect URI.
   * @param redirectTarget The redirect target.
   * @param language The language of the invitee.
   */
  @JsonCreator
  public InviteAction(
      @JsonProperty("email") String email,
      @JsonProperty("role_name") String roleName,
      @JsonProperty("action") String action,
      @JsonProperty("document_id") String documentId,
      @JsonProperty("email_group") EmailGroup emailGroup,
      @JsonProperty("required_preset_signature_name") String requiredPresetSignatureName,
      @JsonProperty("allow_reassign") String allowReassign,
      @JsonProperty("decline_by_signature") String declineBySignature,
      @JsonProperty("authentication") Authentication authentication,
      @JsonProperty("payment_request") PaymentRequest paymentRequest,
      @JsonProperty("redirect_uri") String redirectUri,
      @JsonProperty("decline_redirect_uri") String declineRedirectUri,
      @JsonProperty("redirect_target") String redirectTarget,
      @JsonProperty("language") String language) {
    this.email = email;
    this.roleName = roleName;
    this.action = action;
    this.documentId = documentId;
    this.emailGroup = emailGroup;
    this.requiredPresetSignatureName = requiredPresetSignatureName;
    this.allowReassign = allowReassign;
    this.declineBySignature = declineBySignature;
    this.authentication = authentication;
    this.paymentRequest = paymentRequest;
    this.redirectUri = redirectUri;
    this.declineRedirectUri = declineRedirectUri;
    this.redirectTarget = redirectTarget;
    this.language = language;
  }

  /**
   * Constructor for InviteAction class with minimal parameters.
   *
   * @param email The email of the invitee.
   * @param roleName The role name of the invitee.
   * @param action The action to be performed.
   * @param documentId The ID of the document.
   */
  public InviteAction(
      @JsonProperty("email") String email,
      @JsonProperty("role_name") String roleName,
      @JsonProperty("action") String action,
      @JsonProperty("document_id") String documentId) {
    this.email = email;
    this.roleName = roleName;
    this.action = action;
    this.documentId = documentId;
    this.emailGroup = null;
    this.requiredPresetSignatureName = null;
    this.allowReassign = null;
    this.declineBySignature = null;
    this.authentication = null;
    this.paymentRequest = null;
    this.redirectUri = null;
    this.declineRedirectUri = null;
    this.redirectTarget = null;
    this.language = null;
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
   * Returns the email group of the invitee.
   *
   * @return The email group of the invitee.
   */
  public EmailGroup getEmailGroup() {
    return this.emailGroup;
  }

  /**
   * Returns the role name of the invitee.
   *
   * @return The role name of the invitee.
   */
  public String getRoleName() {
    return this.roleName;
  }

  /**
   * Returns the action to be performed.
   *
   * @return The action to be performed.
   */
  public String getAction() {
    return this.action;
  }

  /**
   * Returns the ID of the document.
   *
   * @return The ID of the document.
   */
  public String getDocumentId() {
    return this.documentId;
  }

  /**
   * Returns the required preset signature name.
   *
   * @return The required preset signature name.
   */
  public String getRequiredPresetSignatureName() {
    return this.requiredPresetSignatureName;
  }

  /**
   * Returns the flag to allow reassign.
   *
   * @return The flag to allow reassign.
   */
  public String getAllowReassign() {
    return this.allowReassign;
  }

  /**
   * Returns the flag to decline by signature.
   *
   * @return The flag to decline by signature.
   */
  public String getDeclineBySignature() {
    return this.declineBySignature;
  }

  /**
   * Returns the authentication details.
   *
   * @return The authentication details.
   */
  public Authentication getAuthentication() {
    return this.authentication;
  }

  /**
   * Returns the payment request details.
   *
   * @return The payment request details.
   */
  public PaymentRequest getPaymentRequest() {
    return this.paymentRequest;
  }

  /**
   * Returns the redirect URI.
   *
   * @return The redirect URI.
   */
  public String getRedirectUri() {
    return this.redirectUri;
  }

  /**
   * Returns the decline redirect URI.
   *
   * @return The decline redirect URI.
   */
  public String getDeclineRedirectUri() {
    return this.declineRedirectUri;
  }

  /**
   * Returns the redirect target.
   *
   * @return The redirect target.
   */
  public String getRedirectTarget() {
    return this.redirectTarget;
  }

  /**
   * Returns the language of the invitee.
   *
   * @return The language of the invitee.
   */
  public String getLanguage() {
    return this.language;
  }

  /**
   * Converts the InviteAction object to a Map.
   *
   * @return A Map representing the InviteAction object.
   */
  @NotNull
  @Override
  public Map<String, Object> toMap() {
    Map<String, Object> map = new LinkedHashMap<>();
    map.put("email", this.getEmail());
    map.put("email_group", this.getEmailGroup());
    map.put("role_name", this.getRoleName());
    map.put("action", this.getAction());
    map.put("document_id", this.getDocumentId());
    map.put("required_preset_signature_name", this.getRequiredPresetSignatureName());
    map.put("allow_reassign", this.getAllowReassign());
    map.put("decline_by_signature", this.getDeclineBySignature());
    map.put("authentication", this.getAuthentication());
    map.put("payment_request", this.getPaymentRequest());
    map.put("redirect_uri", this.getRedirectUri());
    map.put("decline_redirect_uri", this.getDeclineRedirectUri());
    map.put("redirect_target", this.getRedirectTarget());
    map.put("language", this.getLanguage());
    return map;
  }

  /**
   * Creates an InviteAction object from a Map.
   *
   * @param data A Map representing the InviteAction object.
   * @return An InviteAction object.
   */
  @NotNull
  @Contract("_ -> new")
  public static InviteAction fromMap(@NotNull Map<String, Object> data) {
    return new InviteAction(
        (String) data.get("email"),
        (String) data.get("role_name"),
        (String) data.get("action"),
        (String) data.get("document_id"),
        (EmailGroup) data.get("email_group"),
        (String) data.getOrDefault("required_preset_signature_name", ""),
        (String) data.getOrDefault("allow_reassign", ""),
        (String) data.getOrDefault("decline_by_signature", ""),
        (Authentication) data.get("authentication"),
        (PaymentRequest) data.get("payment_request"),
        (String) data.getOrDefault("redirect_uri", ""),
        (String) data.getOrDefault("decline_redirect_uri", ""),
        (String) data.getOrDefault("redirect_target", ""),
        (String) data.getOrDefault("language", ""));
  }
}