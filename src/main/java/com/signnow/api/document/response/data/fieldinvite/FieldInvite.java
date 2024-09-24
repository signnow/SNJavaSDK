/*
 * This file is a part of signNow SDK API client.
 *
 * (с) Copyright © 2011-present airSlate Inc. (https://www.signnow.com)
 *
 * For more details on copyright, see LICENSE.md file
 * that was distributed with this source code.
 */

package com.signnow.api.document.response.data.fieldinvite;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.signnow.core.data.ApiData;
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

  @JsonProperty("password_protected")
  private final String passwordProtected;

  @JsonProperty("created")
  private final String created;

  @JsonProperty("updated")
  private final String updated;

  @JsonProperty("email_group")
  private final EmailGroup emailGroup;

  @JsonProperty("email")
  private final String email;

  @JsonProperty("email_statuses")
  private final EmailStatusCollection emailStatuses;

  @JsonProperty("role")
  private final String role;

  @JsonProperty("role_id")
  private final String roleId;

  @JsonProperty("reminder")
  private final String reminder;

  @JsonProperty("expiration_time")
  private final String expirationTime;

  @JsonProperty("redirect_target")
  private final String redirectTarget;

  @JsonProperty("is_full_declined")
  private final boolean isFullDeclined;

  @JsonProperty("is_embedded")
  private final boolean isEmbedded;

  @JsonProperty("is_document_locked")
  private final String isDocumentLocked;

  @JsonProperty("declined")
  private final DeclinedCollection declined;

  @JsonProperty("delivery_type")
  private final String deliveryType;

  @JsonProperty("id_verification_required")
  private final String idVerificationRequired;

  @JsonProperty("id_verified")
  private final String idVerified;

  @JsonProperty("embedded_signer")
  private final EmbeddedSignerCollection embeddedSigner;

  @JsonProperty("language")
  private final String language;

  @JsonProperty("signer_phone_invite")
  private final String signerPhoneInvite;

  @JsonProperty("password_type")
  private final String passwordType;

  @JsonProperty("password_method")
  private final String passwordMethod;

  @JsonProperty("reassign")
  private final String reassign;

  @JsonProperty("pfrmerchant_account_name")
  private final String pfrmerchantAccountName;

  @JsonProperty("redirect_uri")
  private final String redirectUri;

  @JsonProperty("decline_redirect_uri")
  private final String declineRedirectUri;

  @JsonProperty("close_redirect_uri")
  private final String closeRedirectUri;

  @JsonProperty("is_draft_exists")
  private final String isDraftExists;

  @JsonProperty("required_preset_signature_name")
  private final String requiredPresetSignatureName;

  @JsonProperty("decline_by_signature")
  private final String declineBySignature;

  @JsonProperty("electronic_consent_required")
  private final Integer electronicConsentRequired;

  @JsonProperty("payment_request")
  private final String paymentRequest;

  @JsonProperty("pfrid")
  private final String pfrid;

  @JsonProperty("pfrtype")
  private final String pfrtype;

  @JsonProperty("pfrmerchant_id")
  private final String pfrmerchantId;

  @JsonProperty("pfrstatus")
  private final String pfrstatus;

  @JsonProperty("pframount")
  private final String pframount;

  @JsonProperty("pfrpayment_transaction_id")
  private final String pfrpaymentTransactionId;

  @JsonProperty("pfrcreated")
  private final String pfrcreated;

  @JsonProperty("pfrmerchant_type")
  private final String pfrmerchantType;

  @JsonProperty("pfrcurrency_name")
  private final String pfrcurrencyName;

  @JsonProperty("pfrjson_attributes")
  private final String pfrjsonAttributes;

  @JsonProperty("electronic_consent_id")
  private final String electronicConsentId;

  @JsonProperty("stripe_ach_bank_account_verified")
  private final String stripeAchBankAccountVerified;

  @JsonProperty("stripe_ach_bank_account_present")
  private final String stripeAchBankAccountPresent;

  @JsonProperty("prefill_signature_name")
  private final String prefillSignatureName;

  @JsonProperty("force_new_signature")
  private final int forceNewSignature;

  @JsonProperty("signing_instructions")
  private final String signingInstructions;

  @JsonProperty("signature_type")
  private final String signatureType;

  @JsonCreator
  public FieldInvite(
      @JsonProperty("id") String id,
      @JsonProperty("signer_user_id") String signerUserId,
      @JsonProperty("status") String status,
      @JsonProperty("password_protected") String passwordProtected,
      @JsonProperty("created") String created,
      @JsonProperty("updated") String updated,
      @JsonProperty("email_group") EmailGroup emailGroup,
      @JsonProperty("email") String email,
      @JsonProperty("email_statuses") EmailStatusCollection emailStatuses,
      @JsonProperty("role") String role,
      @JsonProperty("role_id") String roleId,
      @JsonProperty("reminder") String reminder,
      @JsonProperty("expiration_time") String expirationTime,
      @JsonProperty("redirect_target") String redirectTarget,
      @JsonProperty("is_full_declined") boolean isFullDeclined,
      @JsonProperty("is_embedded") boolean isEmbedded,
      @JsonProperty("is_document_locked") String isDocumentLocked,
      @JsonProperty("declined") DeclinedCollection declined,
      @JsonProperty("delivery_type") String deliveryType,
      @JsonProperty("id_verification_required") String idVerificationRequired,
      @JsonProperty("id_verified") String idVerified,
      @JsonProperty("embedded_signer") EmbeddedSignerCollection embeddedSigner,
      @JsonProperty("language") String language,
      @JsonProperty("signer_phone_invite") String signerPhoneInvite,
      @JsonProperty("password_type") String passwordType,
      @JsonProperty("password_method") String passwordMethod,
      @JsonProperty("reassign") String reassign,
      @JsonProperty("pfrmerchant_account_name") String pfrmerchantAccountName,
      @JsonProperty("redirect_uri") String redirectUri,
      @JsonProperty("decline_redirect_uri") String declineRedirectUri,
      @JsonProperty("close_redirect_uri") String closeRedirectUri,
      @JsonProperty("is_draft_exists") String isDraftExists,
      @JsonProperty("required_preset_signature_name") String requiredPresetSignatureName,
      @JsonProperty("decline_by_signature") String declineBySignature,
      @JsonProperty("electronic_consent_required") Integer electronicConsentRequired,
      @JsonProperty("payment_request") String paymentRequest,
      @JsonProperty("pfrid") String pfrid,
      @JsonProperty("pfrtype") String pfrtype,
      @JsonProperty("pfrmerchant_id") String pfrmerchantId,
      @JsonProperty("pfrstatus") String pfrstatus,
      @JsonProperty("pframount") String pframount,
      @JsonProperty("pfrpayment_transaction_id") String pfrpaymentTransactionId,
      @JsonProperty("pfrcreated") String pfrcreated,
      @JsonProperty("pfrmerchant_type") String pfrmerchantType,
      @JsonProperty("pfrcurrency_name") String pfrcurrencyName,
      @JsonProperty("pfrjson_attributes") String pfrjsonAttributes,
      @JsonProperty("electronic_consent_id") String electronicConsentId,
      @JsonProperty("stripe_ach_bank_account_verified") String stripeAchBankAccountVerified,
      @JsonProperty("stripe_ach_bank_account_present") String stripeAchBankAccountPresent,
      @JsonProperty("prefill_signature_name") String prefillSignatureName,
      @JsonProperty("force_new_signature") int forceNewSignature,
      @JsonProperty("signing_instructions") String signingInstructions,
      @JsonProperty("signature_type") String signatureType) {
    this.id = id;
    this.signerUserId = signerUserId;
    this.status = status;
    this.passwordProtected = passwordProtected;
    this.created = created;
    this.updated = updated;
    this.emailGroup = emailGroup;
    this.email = email;
    this.emailStatuses = emailStatuses;
    this.role = role;
    this.roleId = roleId;
    this.reminder = reminder;
    this.expirationTime = expirationTime;
    this.redirectTarget = redirectTarget;
    this.isFullDeclined = isFullDeclined;
    this.isEmbedded = isEmbedded;
    this.isDocumentLocked = isDocumentLocked;
    this.declined = declined;
    this.deliveryType = deliveryType;
    this.idVerificationRequired = idVerificationRequired;
    this.idVerified = idVerified;
    this.embeddedSigner = embeddedSigner;
    this.language = language;
    this.signerPhoneInvite = signerPhoneInvite;
    this.passwordType = passwordType;
    this.passwordMethod = passwordMethod;
    this.reassign = reassign;
    this.pfrmerchantAccountName = pfrmerchantAccountName;
    this.redirectUri = redirectUri;
    this.declineRedirectUri = declineRedirectUri;
    this.closeRedirectUri = closeRedirectUri;
    this.isDraftExists = isDraftExists;
    this.requiredPresetSignatureName = requiredPresetSignatureName;
    this.declineBySignature = declineBySignature;
    this.electronicConsentRequired = electronicConsentRequired;
    this.paymentRequest = paymentRequest;
    this.pfrid = pfrid;
    this.pfrtype = pfrtype;
    this.pfrmerchantId = pfrmerchantId;
    this.pfrstatus = pfrstatus;
    this.pframount = pframount;
    this.pfrpaymentTransactionId = pfrpaymentTransactionId;
    this.pfrcreated = pfrcreated;
    this.pfrmerchantType = pfrmerchantType;
    this.pfrcurrencyName = pfrcurrencyName;
    this.pfrjsonAttributes = pfrjsonAttributes;
    this.electronicConsentId = electronicConsentId;
    this.stripeAchBankAccountVerified = stripeAchBankAccountVerified;
    this.stripeAchBankAccountPresent = stripeAchBankAccountPresent;
    this.prefillSignatureName = prefillSignatureName;
    this.forceNewSignature = forceNewSignature;
    this.signingInstructions = signingInstructions;
    this.signatureType = signatureType;
  }

  public String getId() {
    return this.id;
  }

  public String getSignerUserId() {
    return this.signerUserId;
  }

  public String getSignerPhoneInvite() {
    return this.signerPhoneInvite;
  }

  public String getStatus() {
    return this.status;
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

  public String getPfrMerchantAccountName() {
    return this.pfrmerchantAccountName;
  }

  public String getCreated() {
    return this.created;
  }

  public String getUpdated() {
    return this.updated;
  }

  public EmailGroup getEmailGroup() {
    return this.emailGroup;
  }

  public String getEmail() {
    return this.email;
  }

  public EmailStatusCollection getEmailStatuses() {
    return this.emailStatuses;
  }

  public String getRole() {
    return this.role;
  }

  public String getRoleId() {
    return this.roleId;
  }

  public String getReminder() {
    return this.reminder;
  }

  public String getExpirationTime() {
    return this.expirationTime;
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

  public String getIsDraftExists() {
    return this.isDraftExists;
  }

  public boolean isFullDeclined() {
    return this.isFullDeclined;
  }

  public boolean isEmbedded() {
    return this.isEmbedded;
  }

  public String getIsDocumentLocked() {
    return this.isDocumentLocked;
  }

  public DeclinedCollection getDeclined() {
    return this.declined;
  }

  public String getRequiredPresetSignatureName() {
    return this.requiredPresetSignatureName;
  }

  public String getDeclineBySignature() {
    return this.declineBySignature;
  }

  public Integer getElectronicConsentRequired() {
    return this.electronicConsentRequired;
  }

  public String getPaymentRequest() {
    return this.paymentRequest;
  }

  public String getDeliveryType() {
    return this.deliveryType;
  }

  public String getPfrId() {
    return this.pfrid;
  }

  public String getPfrType() {
    return this.pfrtype;
  }

  public String getPfrMerchantId() {
    return this.pfrmerchantId;
  }

  public String getPfrStatus() {
    return this.pfrstatus;
  }

  public String getPfrAmount() {
    return this.pframount;
  }

  public String getPfrPaymentTransactionId() {
    return this.pfrpaymentTransactionId;
  }

  public String getPfrCreated() {
    return this.pfrcreated;
  }

  public String getPfrmerchantType() {
    return this.pfrmerchantType;
  }

  public String getPfrCurrencyName() {
    return this.pfrcurrencyName;
  }

  public String getPfrJsonAttributes() {
    return this.pfrjsonAttributes;
  }

  public String getIdVerificationRequired() {
    return this.idVerificationRequired;
  }

  public String getIdVerified() {
    return this.idVerified;
  }

  public String getElectronicConsentId() {
    return this.electronicConsentId;
  }

  public String getStripeAchBankAccountVerified() {
    return this.stripeAchBankAccountVerified;
  }

  public String getStripeAchBankAccountPresent() {
    return this.stripeAchBankAccountPresent;
  }

  public EmbeddedSignerCollection getEmbeddedSigner() {
    return this.embeddedSigner;
  }

  public String getPrefillSignatureName() {
    return this.prefillSignatureName;
  }

  public int getForceNewSignature() {
    return this.forceNewSignature;
  }

  public String getSigningInstructions() {
    return this.signingInstructions;
  }

  public String getSignatureType() {
    return this.signatureType;
  }

  public String getLanguage() {
    return this.language;
  }

  @NotNull
  @Override
  public Map<String, Object> toMap() {
    Map<String, Object> map = new LinkedHashMap<>();
    map.put("id", this.getId());
    map.put("signer_user_id", this.getSignerUserId());
    map.put("signer_phone_invite", this.getSignerPhoneInvite());
    map.put("status", this.getStatus());
    map.put("password_protected", this.getPasswordProtected());
    map.put("password_type", this.getPasswordType());
    map.put("password_method", this.getPasswordMethod());
    map.put("reassign", this.getReassign());
    map.put("pfrmerchant_account_name", this.getPfrMerchantAccountName());
    map.put("created", this.getCreated());
    map.put("updated", this.getUpdated());
    map.put("email_group", this.getEmailGroup());
    map.put("email", this.getEmail());
    map.put("email_statuses", this.getEmailStatuses());
    map.put("role", this.getRole());
    map.put("role_id", this.getRoleId());
    map.put("reminder", this.getReminder());
    map.put("expiration_time", this.getExpirationTime());
    map.put("redirect_uri", this.getRedirectUri());
    map.put("decline_redirect_uri", this.getDeclineRedirectUri());
    map.put("close_redirect_uri", this.getCloseRedirectUri());
    map.put("redirect_target", this.getRedirectTarget());
    map.put("is_draft_exists", this.getIsDraftExists());
    map.put("is_full_declined", this.isFullDeclined());
    map.put("is_embedded", this.isEmbedded());
    map.put("is_document_locked", this.getIsDocumentLocked());
    map.put("declined", this.getDeclined());
    map.put("required_preset_signature_name", this.getRequiredPresetSignatureName());
    map.put("decline_by_signature", this.getDeclineBySignature());
    map.put("electronic_consent_required", this.getElectronicConsentRequired());
    map.put("payment_request", this.getPaymentRequest());
    map.put("delivery_type", this.getDeliveryType());
    map.put("pfrid", this.getPfrId());
    map.put("pfrtype", this.getPfrType());
    map.put("pfrmerchant_id", this.getPfrMerchantId());
    map.put("pfrstatus", this.getPfrStatus());
    map.put("pframount", this.getPfrAmount());
    map.put("pfrpayment_transaction_id", this.getPfrPaymentTransactionId());
    map.put("pfrcreated", this.getPfrCreated());
    map.put("pfrmerchant_type", this.getPfrmerchantType());
    map.put("pfrcurrency_name", this.getPfrCurrencyName());
    map.put("pfrjson_attributes", this.getPfrJsonAttributes());
    map.put("id_verification_required", this.getIdVerificationRequired());
    map.put("id_verified", this.getIdVerified());
    map.put("electronic_consent_id", this.getElectronicConsentId());
    map.put("stripe_ach_bank_account_verified", this.getStripeAchBankAccountVerified());
    map.put("stripe_ach_bank_account_present", this.getStripeAchBankAccountPresent());
    map.put("embedded_signer", this.getEmbeddedSigner());
    map.put("prefill_signature_name", this.getPrefillSignatureName());
    map.put("force_new_signature", this.getForceNewSignature());
    map.put("signing_instructions", this.getSigningInstructions());
    map.put("signature_type", this.getSignatureType());
    map.put("language", this.getLanguage());
    return map;
  }

  @NotNull
  @Contract("_ -> new")
  public static FieldInvite fromMap(@NotNull Map<String, Object> data) {
    return new FieldInvite(
        (String) data.get("id"),
        (String) data.get("signer_user_id"),
        (String) data.get("status"),
        (String) data.get("password_protected"),
        (String) data.get("created"),
        (String) data.get("updated"),
        (EmailGroup) data.get("email_group"),
        (String) data.get("email"),
        (EmailStatusCollection) data.get("email_statuses"),
        (String) data.get("role"),
        (String) data.get("role_id"),
        (String) data.get("reminder"),
        (String) data.get("expiration_time"),
        (String) data.get("redirect_target"),
        (Boolean) data.get("is_full_declined"),
        (Boolean) data.get("is_embedded"),
        (String) data.get("is_document_locked"),
        (DeclinedCollection) data.get("declined"),
        (String) data.get("delivery_type"),
        (String) data.get("id_verification_required"),
        (String) data.get("id_verified"),
        (EmbeddedSignerCollection) data.get("embedded_signer"),
        (String) data.get("language"),
        (String) data.get("signer_phone_invite"),
        (String) data.get("password_type"),
        (String) data.get("password_method"),
        (String) data.get("reassign"),
        (String) data.get("pfrmerchant_account_name"),
        (String) data.get("redirect_uri"),
        (String) data.get("decline_redirect_uri"),
        (String) data.get("close_redirect_uri"),
        (String) data.get("is_draft_exists"),
        (String) data.get("required_preset_signature_name"),
        (String) data.get("decline_by_signature"),
        (Integer) data.get("electronic_consent_required"),
        (String) data.get("payment_request"),
        (String) data.get("pfrid"),
        (String) data.get("pfrtype"),
        (String) data.get("pfrmerchant_id"),
        (String) data.get("pfrstatus"),
        (String) data.get("pframount"),
        (String) data.get("pfrpayment_transaction_id"),
        (String) data.get("pfrcreated"),
        (String) data.get("pfrmerchant_type"),
        (String) data.get("pfrcurrency_name"),
        (String) data.get("pfrjson_attributes"),
        (String) data.get("electronic_consent_id"),
        (String) data.get("stripe_ach_bank_account_verified"),
        (String) data.get("stripe_ach_bank_account_present"),
        (String) data.get("prefill_signature_name"),
        (Integer) data.get("force_new_signature"),
        (String) data.get("signing_instructions"),
        (String) data.get("signature_type"));
  }
}
