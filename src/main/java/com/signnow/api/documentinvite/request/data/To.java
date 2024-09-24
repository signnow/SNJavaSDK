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

public final class To extends ApiData {

  @JsonProperty("email")
  private final String email;

  @JsonProperty("role_id")
  private final String roleId;

  @JsonProperty("role")
  private final String role;

  @JsonProperty("order")
  private final int order;

  @JsonProperty("subject")
  private final String subject;

  @JsonProperty("message")
  private final String message;

  @JsonProperty("email_group")
  private final EmailGroup emailGroup;

  @JsonProperty("prefill_signature_name")
  private final String prefillSignatureName;

  @JsonProperty("required_preset_signature_name")
  private final String requiredPresetSignatureName;

  @JsonProperty("force_new_signature")
  private final int forceNewSignature;

  @JsonProperty("reassign")
  private final String reassign;

  @JsonProperty("decline_by_signature")
  private final String declineBySignature;

  @JsonProperty("reminder")
  private final Integer reminder;

  @JsonProperty("expiration_days")
  private final Integer expirationDays;

  @JsonProperty("authentication_type")
  private final String authenticationType;

  @JsonProperty("password")
  private final String password;

  @JsonProperty("phone")
  private final String phone;

  @JsonProperty("phone_invite")
  private final String phoneInvite;

  @JsonProperty("method")
  private final String method;

  @JsonProperty("authentication_sms_message")
  private final String authenticationSmsMessage;

  @JsonProperty("redirect_uri")
  private final String redirectUri;

  @JsonProperty("decline_redirect_uri")
  private final String declineRedirectUri;

  @JsonProperty("close_redirect_uri")
  private final String closeRedirectUri;

  @JsonProperty("redirect_target")
  private final String redirectTarget;

  @JsonProperty("language")
  private final String language;

  @JsonProperty("signature")
  private final Signature signature;

  @JsonCreator
  public To(
      @JsonProperty("email") String email,
      @JsonProperty("role_id") String roleId,
      @JsonProperty("role") String role,
      @JsonProperty("order") int order,
      @JsonProperty("subject") String subject,
      @JsonProperty("message") String message,
      @JsonProperty("email_group") EmailGroup emailGroup,
      @JsonProperty("prefill_signature_name") String prefillSignatureName,
      @JsonProperty("required_preset_signature_name") String requiredPresetSignatureName,
      @JsonProperty("force_new_signature") int forceNewSignature,
      @JsonProperty("reassign") String reassign,
      @JsonProperty("decline_by_signature") String declineBySignature,
      @JsonProperty("reminder") Integer reminder,
      @JsonProperty("expiration_days") Integer expirationDays,
      @JsonProperty("authentication_type") String authenticationType,
      @JsonProperty("password") String password,
      @JsonProperty("phone") String phone,
      @JsonProperty("phone_invite") String phoneInvite,
      @JsonProperty("method") String method,
      @JsonProperty("authentication_sms_message") String authenticationSmsMessage,
      @JsonProperty("redirect_uri") String redirectUri,
      @JsonProperty("decline_redirect_uri") String declineRedirectUri,
      @JsonProperty("close_redirect_uri") String closeRedirectUri,
      @JsonProperty("redirect_target") String redirectTarget,
      @JsonProperty("language") String language,
      @JsonProperty("signature") Signature signature) {
    this.email = email;
    this.roleId = roleId;
    this.role = role;
    this.order = order;
    this.subject = subject;
    this.message = message;
    this.emailGroup = emailGroup;
    this.prefillSignatureName = prefillSignatureName;
    this.requiredPresetSignatureName = requiredPresetSignatureName;
    this.forceNewSignature = forceNewSignature;
    this.reassign = reassign;
    this.declineBySignature = declineBySignature;
    this.reminder = reminder;
    this.expirationDays = expirationDays;
    this.authenticationType = authenticationType;
    this.password = password;
    this.phone = phone;
    this.phoneInvite = phoneInvite;
    this.method = method;
    this.authenticationSmsMessage = authenticationSmsMessage;
    this.redirectUri = redirectUri;
    this.declineRedirectUri = declineRedirectUri;
    this.closeRedirectUri = closeRedirectUri;
    this.redirectTarget = redirectTarget;
    this.language = language;
    this.signature = signature;
  }

  public To(
      @JsonProperty("email") String email,
      @JsonProperty("role_id") String roleId,
      @JsonProperty("role") String role,
      @JsonProperty("order") int order,
      @JsonProperty("subject") String subject,
      @JsonProperty("message") String message) {
    this.email = email;
    this.roleId = roleId;
    this.role = role;
    this.order = order;
    this.subject = subject;
    this.message = message;
    this.emailGroup = null;
    this.prefillSignatureName = null;
    this.requiredPresetSignatureName = null;
    this.forceNewSignature = 0;
    this.reassign = null;
    this.declineBySignature = null;
    this.reminder = null;
    this.expirationDays = null;
    this.authenticationType = null;
    this.password = null;
    this.phone = null;
    this.phoneInvite = null;
    this.method = null;
    this.authenticationSmsMessage = null;
    this.redirectUri = null;
    this.declineRedirectUri = null;
    this.closeRedirectUri = null;
    this.redirectTarget = null;
    this.language = null;
    this.signature = null;
  }

  public String getEmail() {
    return this.email;
  }

  public String getRoleId() {
    return this.roleId;
  }

  public String getRole() {
    return this.role;
  }

  public int getOrder() {
    return this.order;
  }

  public EmailGroup getEmailGroup() {
    return this.emailGroup;
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

  public String getReassign() {
    return this.reassign;
  }

  public String getDeclineBySignature() {
    return this.declineBySignature;
  }

  public Integer getReminder() {
    return this.reminder;
  }

  public Integer getExpirationDays() {
    return this.expirationDays;
  }

  public String getAuthenticationType() {
    return this.authenticationType;
  }

  public String getPassword() {
    return this.password;
  }

  public String getPhone() {
    return this.phone;
  }

  public String getPhoneInvite() {
    return this.phoneInvite;
  }

  public String getMethod() {
    return this.method;
  }

  public String getAuthenticationSmsMessage() {
    return this.authenticationSmsMessage;
  }

  public String getSubject() {
    return this.subject;
  }

  public String getMessage() {
    return this.message;
  }

  public String getRedirectUri() {
    return this.redirectUri;
  }

  public String getDeclineRedirectUri() {
    return this.declineRedirectUri;
  }

  public String getCloseRedirectUri() {
    return this.closeRedirectUri;
  }

  public String getRedirectTarget() {
    return this.redirectTarget;
  }

  public String getLanguage() {
    return this.language;
  }

  public Signature getSignature() {
    return this.signature;
  }

  @NotNull
  @Override
  public Map<String, Object> toMap() {
    Map<String, Object> map = new LinkedHashMap<>();
    map.put("email", this.getEmail());
    map.put("role_id", this.getRoleId());
    map.put("role", this.getRole());
    map.put("order", this.getOrder());
    map.put("email_group", this.getEmailGroup());
    map.put("prefill_signature_name", this.getPrefillSignatureName());
    map.put("required_preset_signature_name", this.getRequiredPresetSignatureName());
    map.put("force_new_signature", this.getForceNewSignature());
    map.put("reassign", this.getReassign());
    map.put("decline_by_signature", this.getDeclineBySignature());
    map.put("reminder", this.getReminder());
    map.put("expiration_days", this.getExpirationDays());
    map.put("authentication_type", this.getAuthenticationType());
    map.put("password", this.getPassword());
    map.put("phone", this.getPhone());
    map.put("phone_invite", this.getPhoneInvite());
    map.put("method", this.getMethod());
    map.put("authentication_sms_message", this.getAuthenticationSmsMessage());
    map.put("subject", this.getSubject());
    map.put("message", this.getMessage());
    map.put("redirect_uri", this.getRedirectUri());
    map.put("decline_redirect_uri", this.getDeclineRedirectUri());
    map.put("close_redirect_uri", this.getCloseRedirectUri());
    map.put("redirect_target", this.getRedirectTarget());
    map.put("language", this.getLanguage());
    map.put("signature", this.getSignature());
    return map;
  }

  @NotNull
  @Contract("_ -> new")
  public static To fromMap(@NotNull Map<String, Object> data) {
    return new To(
        (String) data.get("email"),
        (String) data.get("role_id"),
        (String) data.get("role"),
        (Integer) data.get("order"),
        (String) data.get("subject"),
        (String) data.get("message"),
        (EmailGroup) data.get("email_group"),
        (String) data.getOrDefault("prefill_signature_name", ""),
        (String) data.getOrDefault("required_preset_signature_name", ""),
        (Integer) data.getOrDefault("force_new_signature", 0),
        (String) data.getOrDefault("reassign", ""),
        (String) data.getOrDefault("decline_by_signature", ""),
        (Integer) data.getOrDefault("reminder", null),
        (Integer) data.getOrDefault("expiration_days", null),
        (String) data.getOrDefault("authentication_type", ""),
        (String) data.getOrDefault("password", ""),
        (String) data.getOrDefault("phone", ""),
        (String) data.getOrDefault("phone_invite", ""),
        (String) data.getOrDefault("method", ""),
        (String) data.getOrDefault("authentication_sms_message", ""),
        (String) data.getOrDefault("redirect_uri", ""),
        (String) data.getOrDefault("decline_redirect_uri", ""),
        (String) data.getOrDefault("close_redirect_uri", ""),
        (String) data.getOrDefault("redirect_target", ""),
        (String) data.getOrDefault("language", ""),
        (Signature) data.get("signature"));
  }
}
