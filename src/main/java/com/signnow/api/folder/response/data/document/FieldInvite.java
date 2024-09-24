/*
 * This file is a part of signNow SDK API client.
 *
 * (с) Copyright © 2011-present airSlate Inc. (https://www.signnow.com)
 *
 * For more details on copyright, see LICENSE.md file
 * that was distributed with this source code.
 */

package com.signnow.api.folder.response.data.document;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.signnow.core.data.ApiData;
import com.signnow.core.util.Cast;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

public final class FieldInvite extends ApiData {

  @JsonProperty("id")
  private final String id;

  @JsonProperty("signer_user_id")
  private final String signerUserId;

  @JsonProperty("status")
  private final String status;

  @JsonProperty("created")
  private final String created;

  @JsonProperty("updated")
  private final String updated;

  @JsonProperty("email")
  private final String email;

  @JsonProperty("role")
  private final String role;

  @JsonProperty("role_id")
  private final String roleId;

  @JsonProperty("email_sent_statuses")
  private final EmailSentStatusCollection emailSentStatuses;

  @JsonProperty("is_document_locked")
  private final String isDocumentLocked;

  @JsonProperty("password_protected")
  private final String passwordProtected;

  @JsonProperty("password_type")
  private final String passwordType;

  @JsonProperty("password_method")
  private final String passwordMethod;

  @JsonProperty("reassign")
  private final String reassign;

  @JsonProperty("id_verification_required")
  private final String idVerificationRequired;

  @JsonProperty("id_verified")
  private final String idVerified;

  @JsonProperty("email_group")
  private final EmailGroup emailGroup;

  @JsonProperty("reminder")
  private final String reminder;

  @JsonProperty("expiration_time")
  private final String expirationTime;

  @JsonProperty("electronic_consent_id")
  private final String electronicConsentId;

  @JsonProperty("prefill_signature_name")
  private final String prefillSignatureName;

  @JsonProperty("force_new_signature")
  private final String forceNewSignature;

  @JsonProperty("electronic_consent_required")
  private final String electronicConsentRequired;

  @JsonProperty("decline_by_signature")
  private final String declineBySignature;

  @JsonProperty("signing_instructions")
  private final String signingInstructions;

  @JsonProperty("payment_request")
  private final String paymentRequest;

  @JsonProperty("is_draft_exists")
  private final String isDraftExists;

  @JsonProperty("is_full_declined")
  private final String isFullDeclined;

  @JsonProperty("is_embedded")
  private final String isEmbedded;

  @JsonProperty("delivery_type")
  private final String deliveryType;

  @JsonProperty("signer_phone_invite")
  private final String signerPhoneInvite;

  @JsonProperty("signature_type")
  private final String signatureType;

  @JsonCreator
  public FieldInvite(
      @JsonProperty("id") String id,
      @JsonProperty("signer_user_id") String signerUserId,
      @JsonProperty("status") String status,
      @JsonProperty("created") String created,
      @JsonProperty("updated") String updated,
      @JsonProperty("email") String email,
      @JsonProperty("role") String role,
      @JsonProperty("role_id") String roleId,
      @JsonProperty("email_sent_statuses") EmailSentStatusCollection emailSentStatuses,
      @JsonProperty("is_document_locked") String isDocumentLocked,
      @JsonProperty("password_protected") String passwordProtected,
      @JsonProperty("password_type") String passwordType,
      @JsonProperty("password_method") String passwordMethod,
      @JsonProperty("reassign") String reassign,
      @JsonProperty("id_verification_required") String idVerificationRequired,
      @JsonProperty("id_verified") String idVerified,
      @JsonProperty("email_group") EmailGroup emailGroup,
      @JsonProperty("reminder") String reminder,
      @JsonProperty("expiration_time") String expirationTime,
      @JsonProperty("electronic_consent_id") String electronicConsentId,
      @JsonProperty("prefill_signature_name") String prefillSignatureName,
      @JsonProperty("force_new_signature") String forceNewSignature,
      @JsonProperty("electronic_consent_required") String electronicConsentRequired,
      @JsonProperty("decline_by_signature") String declineBySignature,
      @JsonProperty("signing_instructions") String signingInstructions,
      @JsonProperty("payment_request") String paymentRequest,
      @JsonProperty("is_draft_exists") String isDraftExists,
      @JsonProperty("is_full_declined") String isFullDeclined,
      @JsonProperty("is_embedded") String isEmbedded,
      @JsonProperty("delivery_type") String deliveryType,
      @JsonProperty("signer_phone_invite") String signerPhoneInvite,
      @JsonProperty("signature_type") String signatureType) {
    this.id = id;
    this.signerUserId = signerUserId;
    this.status = status;
    this.created = created;
    this.updated = updated;
    this.email = email;
    this.role = role;
    this.roleId = roleId;
    this.emailSentStatuses = emailSentStatuses;
    this.isDocumentLocked = isDocumentLocked;
    this.passwordProtected = passwordProtected;
    this.passwordType = passwordType;
    this.passwordMethod = passwordMethod;
    this.reassign = reassign;
    this.idVerificationRequired = idVerificationRequired;
    this.idVerified = idVerified;
    this.emailGroup = emailGroup;
    this.reminder = reminder;
    this.expirationTime = expirationTime;
    this.electronicConsentId = electronicConsentId;
    this.prefillSignatureName = prefillSignatureName;
    this.forceNewSignature = forceNewSignature;
    this.electronicConsentRequired = electronicConsentRequired;
    this.declineBySignature = declineBySignature;
    this.signingInstructions = signingInstructions;
    this.paymentRequest = paymentRequest;
    this.isDraftExists = isDraftExists;
    this.isFullDeclined = isFullDeclined;
    this.isEmbedded = isEmbedded;
    this.deliveryType = deliveryType;
    this.signerPhoneInvite = signerPhoneInvite;
    this.signatureType = signatureType;
  }

  public String getId() {
    return this.id;
  }

  public String getSignerUserId() {
    return this.signerUserId;
  }

  public String getStatus() {
    return this.status;
  }

  public String getCreated() {
    return this.created;
  }

  public String getUpdated() {
    return this.updated;
  }

  public String getEmail() {
    return this.email;
  }

  public String getRole() {
    return this.role;
  }

  public String getRoleId() {
    return this.roleId;
  }

  public EmailSentStatusCollection getEmailSentStatuses() {
    return this.emailSentStatuses;
  }

  public String getIsDocumentLocked() {
    return this.isDocumentLocked;
  }

  public String getPasswordProtected() {
    return this.passwordProtected;
  }

  public String getPasswordType() {
    return this.passwordType;
  }

  public String getPasswordMethod() {
    return this.passwordMethod;
  }

  public String getReassign() {
    return this.reassign;
  }

  public String getIdVerificationRequired() {
    return this.idVerificationRequired;
  }

  public String getIdVerified() {
    return this.idVerified;
  }

  public EmailGroup getEmailGroup() {
    return this.emailGroup;
  }

  public String getReminder() {
    return this.reminder;
  }

  public String getExpirationTime() {
    return this.expirationTime;
  }

  public String getElectronicConsentId() {
    return this.electronicConsentId;
  }

  public String getPrefillSignatureName() {
    return this.prefillSignatureName;
  }

  public String getForceNewSignature() {
    return this.forceNewSignature;
  }

  public String getElectronicConsentRequired() {
    return this.electronicConsentRequired;
  }

  public String getDeclineBySignature() {
    return this.declineBySignature;
  }

  public String getSigningInstructions() {
    return this.signingInstructions;
  }

  public String getPaymentRequest() {
    return this.paymentRequest;
  }

  public String getIsDraftExists() {
    return this.isDraftExists;
  }

  public String getIsFullDeclined() {
    return this.isFullDeclined;
  }

  public String getIsEmbedded() {
    return this.isEmbedded;
  }

  public String getDeliveryType() {
    return this.deliveryType;
  }

  public String getSignerPhoneInvite() {
    return this.signerPhoneInvite;
  }

  public String getSignatureType() {
    return this.signatureType;
  }

  @NotNull
  @Override
  public Map<String, Object> toMap() {
    Map<String, Object> map = new LinkedHashMap<>();
    map.put("id", this.getId());
    map.put("signer_user_id", this.getSignerUserId());
    map.put("status", this.getStatus());
    map.put("created", this.getCreated());
    map.put("updated", this.getUpdated());
    map.put("email", this.getEmail());
    map.put("role", this.getRole());
    map.put("role_id", this.getRoleId());
    map.put("email_sent_statuses", this.getEmailSentStatuses());
    map.put("is_document_locked", this.getIsDocumentLocked());
    map.put("password_protected", this.getPasswordProtected());
    map.put("password_type", this.getPasswordType());
    map.put("password_method", this.getPasswordMethod());
    map.put("reassign", this.getReassign());
    map.put("id_verification_required", this.getIdVerificationRequired());
    map.put("id_verified", this.getIdVerified());
    map.put("reminder", this.getReminder());
    map.put("expiration_time", this.getExpirationTime());
    map.put("electronic_consent_id", this.getElectronicConsentId());
    map.put("prefill_signature_name", this.getPrefillSignatureName());
    map.put("force_new_signature", this.getForceNewSignature());
    map.put("electronic_consent_required", this.getElectronicConsentRequired());
    map.put("decline_by_signature", this.getDeclineBySignature());
    map.put("signing_instructions", this.getSigningInstructions());
    map.put("payment_request", this.getPaymentRequest());
    map.put("is_draft_exists", this.getIsDraftExists());
    map.put("is_full_declined", this.getIsFullDeclined());
    map.put("is_embedded", this.getIsEmbedded());
    map.put("delivery_type", this.getDeliveryType());
    map.put("signer_phone_invite", this.getSignerPhoneInvite());
    map.put("signature_type", this.getSignatureType());
    map.put("email_group", this.getEmailGroup());
    return map;
  }

  @NotNull
  @Contract("_ -> new")
  public static FieldInvite fromMap(@NotNull Map<String, Object> data) {
    return new FieldInvite(
        (String) data.get("id"),
        (String) data.get("signer_user_id"),
        (String) data.get("status"),
        (String) data.get("created"),
        (String) data.get("updated"),
        (String) data.get("email"),
        (String) data.get("role"),
        (String) data.get("role_id"),
        (EmailSentStatusCollection) data.get("email_sent_statuses"),
        (String) data.get("is_document_locked"),
        (String) data.get("password_protected"),
        (String) data.get("password_type"),
        (String) data.get("password_method"),
        (String) data.get("reassign"),
        (String) data.get("id_verification_required"),
        (String) data.get("id_verified"),
        EmailGroup.fromMap(Cast.safeToMap(data.get("email_group"), String.class, Object.class)),
        (String) data.get("reminder"),
        (String) data.get("expiration_time"),
        (String) data.get("electronic_consent_id"),
        (String) data.get("prefill_signature_name"),
        (String) data.get("force_new_signature"),
        (String) data.get("electronic_consent_required"),
        (String) data.get("decline_by_signature"),
        (String) data.get("signing_instructions"),
        (String) data.get("payment_request"),
        (String) data.get("is_draft_exists"),
        (String) data.get("is_full_declined"),
        (String) data.get("is_embedded"),
        (String) data.get("delivery_type"),
        (String) data.get("signer_phone_invite"),
        (String) data.get("signature_type"));
  }
}
