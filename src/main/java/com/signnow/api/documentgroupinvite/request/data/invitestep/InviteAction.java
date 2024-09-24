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

public final class InviteAction extends ApiData {

  @JsonProperty("email")
  private final String email;

  @JsonProperty("role_name")
  private final String roleName;

  @JsonProperty("action")
  private final String action;

  @JsonProperty("document_id")
  private final String documentId;

  @JsonProperty("email_group")
  private final EmailGroup emailGroup;

  @JsonProperty("required_preset_signature_name")
  private final String requiredPresetSignatureName;

  @JsonProperty("allow_reassign")
  private final String allowReassign;

  @JsonProperty("decline_by_signature")
  private final String declineBySignature;

  @JsonProperty("authentication")
  private final Authentication authentication;

  @JsonProperty("payment_request")
  private final PaymentRequest paymentRequest;

  @JsonProperty("redirect_uri")
  private final String redirectUri;

  @JsonProperty("decline_redirect_uri")
  private final String declineRedirectUri;

  @JsonProperty("redirect_target")
  private final String redirectTarget;

  @JsonProperty("language")
  private final String language;

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

  public String getEmail() {
    return this.email;
  }

  public EmailGroup getEmailGroup() {
    return this.emailGroup;
  }

  public String getRoleName() {
    return this.roleName;
  }

  public String getAction() {
    return this.action;
  }

  public String getDocumentId() {
    return this.documentId;
  }

  public String getRequiredPresetSignatureName() {
    return this.requiredPresetSignatureName;
  }

  public String getAllowReassign() {
    return this.allowReassign;
  }

  public String getDeclineBySignature() {
    return this.declineBySignature;
  }

  public Authentication getAuthentication() {
    return this.authentication;
  }

  public PaymentRequest getPaymentRequest() {
    return this.paymentRequest;
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

  public String getLanguage() {
    return this.language;
  }

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
