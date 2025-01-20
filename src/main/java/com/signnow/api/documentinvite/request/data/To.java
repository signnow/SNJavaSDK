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
 * This class represents the 'To' object in the signNow API.
 */
public final class To extends ApiData {

  /**
   * The email of the recipient.
   */
  @JsonProperty("email")
  private final String email;

  /**
   * The role id of the recipient.
   */
  @JsonProperty("role_id")
  private final String roleId;

  /**
   * The role of the recipient.
   */
  @JsonProperty("role")
  private final String role;

  /**
   * The order of the recipient.
   */
  @JsonProperty("order")
  private final int order;

  /**
   * The subject of the email.
   */
  @JsonProperty("subject")
  private final String subject;

  /**
   * The message of the email.
   */
  @JsonProperty("message")
  private final String message;

  /**
   * The email group of the recipient.
   */
  @JsonProperty("email_group")
  private final EmailGroup emailGroup;

  /**
   * The prefill signature name of the recipient.
   */
  @JsonProperty("prefill_signature_name")
  private final String prefillSignatureName;

  /**
   * The required preset signature name of the recipient.
   */
  @JsonProperty("required_preset_signature_name")
  private final String requiredPresetSignatureName;

  /**
   * The force new signature of the recipient.
   */
  @JsonProperty("force_new_signature")
  private final int forceNewSignature;

  /**
   * The reassign of the recipient.
   */
  @JsonProperty("reassign")
  private final String reassign;

  /**
   * The decline by signature of the recipient.
   */
  @JsonProperty("decline_by_signature")
  private final String declineBySignature;

  /**
   * The reminder of the recipient.
   */
  @JsonProperty("reminder")
  private final Integer reminder;

  /**
   * The expiration days of the recipient.
   */
  @JsonProperty("expiration_days")
  private final Integer expirationDays;

  /**
   * The authentication type of the recipient.
   */
  @JsonProperty("authentication_type")
  private final String authenticationType;

  /**
   * The password of the recipient.
   */
  @JsonProperty("password")
  private final String password;

  /**
   * The phone of the recipient.
   */
  @JsonProperty("phone")
  private final String phone;

  /**
   * The phone invite of the recipient.
   */
  @JsonProperty("phone_invite")
  private final String phoneInvite;

  /**
   * The method of the recipient.
   */
  @JsonProperty("method")
  private final String method;

  /**
   * The authentication sms message of the recipient.
   */
  @JsonProperty("authentication_sms_message")
  private final String authenticationSmsMessage;

  /**
   * The redirect uri of the recipient.
   */
  @JsonProperty("redirect_uri")
  private final String redirectUri;

  /**
   * The decline redirect uri of the recipient.
   */
  @JsonProperty("decline_redirect_uri")
  private final String declineRedirectUri;

  /**
   * The close redirect uri of the recipient.
   */
  @JsonProperty("close_redirect_uri")
  private final String closeRedirectUri;

  /**
   * The redirect target of the recipient.
   */
  @JsonProperty("redirect_target")
  private final String redirectTarget;

  /**
   * The language of the recipient.
   */
  @JsonProperty("language")
  private final String language;

  /**
   * The signature of the recipient.
   */
  @JsonProperty("signature")
  private final Signature signature;

  /**
   * Constructor for the 'To' class.
   *
   * @param email The email of the recipient.
   * @param roleId The role id of the recipient.
   * @param role The role of the recipient.
   * @param order The order of the recipient.
   * @param subject The subject of the email.
   * @param message The message of the email.
   * @param emailGroup The email group of the recipient.
   * @param prefillSignatureName The prefill signature name of the recipient.
   * @param requiredPresetSignatureName The required preset signature name of the recipient.
   * @param forceNewSignature The force new signature of the recipient.
   * @param reassign The reassign of the recipient.
   * @param declineBySignature The decline by signature of the recipient.
   * @param reminder The reminder of the recipient.
   * @param expirationDays The expiration days of the recipient.
   * @param authenticationType The authentication type of the recipient.
   * @param password The password of the recipient.
   * @param phone The phone of the recipient.
   * @param phoneInvite The phone invite of the recipient.
   * @param method The method of the recipient.
   * @param authenticationSmsMessage The authentication sms message of the recipient.
   * @param redirectUri The redirect uri of the recipient.
   * @param declineRedirectUri The decline redirect uri of the recipient.
   * @param closeRedirectUri The close redirect uri of the recipient.
   * @param redirectTarget The redirect target of the recipient.
   * @param language The language of the recipient.
   * @param signature The signature of the recipient.
   */
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

  /**
   * Constructor for the 'To' class with fewer parameters.
   *
   * @param email The email of the recipient.
   * @param roleId The role id of the recipient.
   * @param role The role of the recipient.
   * @param order The order of the recipient.
   * @param subject The subject of the email.
   * @param message The message of the email.
   */
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

  /**
   * Returns the email of the recipient.
   *
   * @return The email of the recipient.
   */
  public String getEmail() {
    return this.email;
  }

  /**
   * Returns the role id of the recipient.
   *
   * @return The role id of the recipient.
   */
  public String getRoleId() {
    return this.roleId;
  }

  /**
   * Returns the role of the recipient.
   *
   * @return The role of the recipient.
   */
  public String getRole() {
    return this.role;
  }

  /**
   * Returns the order of the recipient.
   *
   * @return The order of the recipient.
   */
  public int getOrder() {
    return this.order;
  }

  /**
   * Returns the email group of the recipient.
   *
   * @return The email group of the recipient.
   */
  public EmailGroup getEmailGroup() {
    return this.emailGroup;
  }

  /**
   * Returns the prefill signature name of the recipient.
   *
   * @return The prefill signature name of the recipient.
   */
  public String getPrefillSignatureName() {
    return this.prefillSignatureName;
  }

  /**
   * Returns the required preset signature name of the recipient.
   *
   * @return The required preset signature name of the recipient.
   */
  public String getRequiredPresetSignatureName() {
    return this.requiredPresetSignatureName;
  }

  /**
   * Returns the force new signature of the recipient.
   *
   * @return The force new signature of the recipient.
   */
  public int getForceNewSignature() {
    return this.forceNewSignature;
  }

  /**
   * Returns the reassign of the recipient.
   *
   * @return The reassign of the recipient.
   */
  public String getReassign() {
    return this.reassign;
  }

  /**
   * Returns the decline by signature of the recipient.
   *
   * @return The decline by signature of the recipient.
   */
  public String getDeclineBySignature() {
    return this.declineBySignature;
  }

  /**
   * Returns the reminder of the recipient.
   *
   * @return The reminder of the recipient.
   */
  public Integer getReminder() {
    return this.reminder;
  }

  /**
   * Returns the expiration days of the recipient.
   *
   * @return The expiration days of the recipient.
   */
  public Integer getExpirationDays() {
    return this.expirationDays;
  }

  /**
   * Returns the authentication type of the recipient.
   *
   * @return The authentication type of the recipient.
   */
  public String getAuthenticationType() {
    return this.authenticationType;
  }

  /**
   * Returns the password of the recipient.
   *
   * @return The password of the recipient.
   */
  public String getPassword() {
    return this.password;
  }

  /**
   * Returns the phone of the recipient.
   *
   * @return The phone of the recipient.
   */
  public String getPhone() {
    return this.phone;
  }

  /**
   * Returns the phone invite of the recipient.
   *
   * @return The phone invite of the recipient.
   */
  public String getPhoneInvite() {
    return this.phoneInvite;
  }

  /**
   * Returns the method of the recipient.
   *
   * @return The method of the recipient.
   */
  public String getMethod() {
    return this.method;
  }

  /**
   * Returns the authentication sms message of the recipient.
   *
   * @return The authentication sms message of the recipient.
   */
  public String getAuthenticationSmsMessage() {
    return this.authenticationSmsMessage;
  }

  /**
   * Returns the subject of the email.
   *
   * @return The subject of the email.
   */
  public String getSubject() {
    return this.subject;
  }

  /**
   * Returns the message of the email.
   *
   * @return The message of the email.
   */
  public String getMessage() {
    return this.message;
  }

  /**
   * Returns the redirect uri of the recipient.
   *
   * @return The redirect uri of the recipient.
   */
  public String getRedirectUri() {
    return this.redirectUri;
  }

  /**
   * Returns the decline redirect uri of the recipient.
   *
   * @return The decline redirect uri of the recipient.
   */
  public String getDeclineRedirectUri() {
    return this.declineRedirectUri;
  }

  /**
   * Returns the close redirect uri of the recipient.
   *
   * @return The close redirect uri of the recipient.
   */
  public String getCloseRedirectUri() {
    return this.closeRedirectUri;
  }

  /**
   * Returns the redirect target of the recipient.
   *
   * @return The redirect target of the recipient.
   */
  public String getRedirectTarget() {
    return this.redirectTarget;
  }

  /**
   * Returns the language of the recipient.
   *
   * @return The language of the recipient.
   */
  public String getLanguage() {
    return this.language;
  }

  /**
   * Returns the signature of the recipient.
   *
   * @return The signature of the recipient.
   */
  public Signature getSignature() {
    return this.signature;
  }

  /**
   * Converts the 'To' object to a map.
   *
   * @return A map representation of the 'To' object.
   */
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

  /**
   * Creates a 'To' object from a map.
   *
   * @param data The map to create the 'To' object from.
   * @return A 'To' object.
   */
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