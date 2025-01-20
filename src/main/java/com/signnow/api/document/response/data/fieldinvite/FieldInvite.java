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

/**
 * This class represents a FieldInvite which is a part of the signNow SDK API client.
 */
public final class FieldInvite extends ApiData {

  /**
   * The id of the FieldInvite.
   */
  @JsonProperty("id")
  private final String id;

  /**
   * The user id of the signer.
   */
  @JsonProperty("signer_user_id")
  private final String signerUserId;

  /**
   * The status of the FieldInvite.
   */
  @JsonProperty("status")
  private final String status;

  /**
   * Indicates if the FieldInvite is password protected.
   */
  @JsonProperty("password_protected")
  private final String passwordProtected;

  /**
   * The creation time of the FieldInvite.
   */
  @JsonProperty("created")
  private final String created;

  /**
   * The last updated time of the FieldInvite.
   */
  @JsonProperty("updated")
  private final String updated;

  /**
   * The email group associated with the FieldInvite.
   */
  @JsonProperty("email_group")
  private final EmailGroup emailGroup;

  /**
   * The email associated with the FieldInvite.
   */
  @JsonProperty("email")
  private final String email;

  /**
   * The email statuses associated with the FieldInvite.
   */
  @JsonProperty("email_statuses")
  private final EmailStatusCollection emailStatuses;

  /**
   * The role associated with the FieldInvite.
   */
  @JsonProperty("role")
  private final String role;

  /**
   * The role id associated with the FieldInvite.
   */
  @JsonProperty("role_id")
  private final String roleId;

  /**
   * The reminder associated with the FieldInvite.
   */
  @JsonProperty("reminder")
  private final String reminder;

  /**
   * The expiration time of the FieldInvite.
   */
  @JsonProperty("expiration_time")
  private final String expirationTime;

  /**
   * The redirect target of the FieldInvite.
   */
  @JsonProperty("redirect_target")
  private final String redirectTarget;

  /**
   * Indicates if the FieldInvite is fully declined.
   */
  @JsonProperty("is_full_declined")
  private final boolean isFullDeclined;

  /**
   * Indicates if the FieldInvite is embedded.
   */
  @JsonProperty("is_embedded")
  private final boolean isEmbedded;

  /**
   * Indicates if the document associated with the FieldInvite is locked.
   */
  @JsonProperty("is_document_locked")
  private final String isDocumentLocked;

  /**
   * The declined collection associated with the FieldInvite.
   */
  @JsonProperty("declined")
  private final DeclinedCollection declined;

  /**
   * The delivery type of the FieldInvite.
   */
  @JsonProperty("delivery_type")
  private final String deliveryType;

  /**
   * Indicates if id verification is required for the FieldInvite.
   */
  @JsonProperty("id_verification_required")
  private final String idVerificationRequired;

  /**
   * Indicates if the id associated with the FieldInvite is verified.
   */
  @JsonProperty("id_verified")
  private final String idVerified;

  /**
   * The embedded signer collection associated with the FieldInvite.
   */
  @JsonProperty("embedded_signer")
  private final EmbeddedSignerCollection embeddedSigner;

  /**
   * The language of the FieldInvite.
   */
  @JsonProperty("language")
  private final String language;

  /**
   * The phone invite of the signer associated with the FieldInvite.
   */
  @JsonProperty("signer_phone_invite")
  private final String signerPhoneInvite;

  /**
   * The password type of the FieldInvite.
   */
  @JsonProperty("password_type")
  private final String passwordType;

  /**
   * The password method of the FieldInvite.
   */
  @JsonProperty("password_method")
  private final String passwordMethod;

  /**
   * The reassign associated with the FieldInvite.
   */
  @JsonProperty("reassign")
  private final String reassign;

  /**
   * The merchant account name associated with the FieldInvite.
   */
  @JsonProperty("pfrmerchant_account_name")
  private final String pfrmerchantAccountName;

  /**
   * The redirect uri of the FieldInvite.
   */
  @JsonProperty("redirect_uri")
  private final String redirectUri;

  /**
   * The decline redirect uri of the FieldInvite.
   */
  @JsonProperty("decline_redirect_uri")
  private final String declineRedirectUri;

  /**
   * The close redirect uri of the FieldInvite.
   */
  @JsonProperty("close_redirect_uri")
  private final String closeRedirectUri;

  /**
   * Indicates if a draft exists for the FieldInvite.
   */
  @JsonProperty("is_draft_exists")
  private final String isDraftExists;

  /**
   * The required preset signature name associated with the FieldInvite.
   */
  @JsonProperty("required_preset_signature_name")
  private final String requiredPresetSignatureName;

  /**
   * The decline by signature associated with the FieldInvite.
   */
  @JsonProperty("decline_by_signature")
  private final String declineBySignature;

  /**
   * The electronic consent required for the FieldInvite.
   */
  @JsonProperty("electronic_consent_required")
  private final Integer electronicConsentRequired;

  /**
   * The payment request associated with the FieldInvite.
   */
  @JsonProperty("payment_request")
  private final String paymentRequest;

  /**
   * The pfrid associated with the FieldInvite.
   */
  @JsonProperty("pfrid")
  private final String pfrid;

  /**
   * The pfrtype associated with the FieldInvite.
   */
  @JsonProperty("pfrtype")
  private final String pfrtype;

  /**
   * The merchant id associated with the FieldInvite.
   */
  @JsonProperty("pfrmerchant_id")
  private final String pfrmerchantId;

  /**
   * The pfrstatus associated with the FieldInvite.
   */
  @JsonProperty("pfrstatus")
  private final String pfrstatus;

  /**
   * The pframount associated with the FieldInvite.
   */
  @JsonProperty("pframount")
  private final String pframount;

  /**
   * The payment transaction id associated with the FieldInvite.
   */
  @JsonProperty("pfrpayment_transaction_id")
  private final String pfrpaymentTransactionId;

  /**
   * The pfrcreated associated with the FieldInvite.
   */
  @JsonProperty("pfrcreated")
  private final String pfrcreated;

  /**
   * The merchant type associated with the FieldInvite.
   */
  @JsonProperty("pfrmerchant_type")
  private final String pfrmerchantType;

  /**
   * The currency name associated with the FieldInvite.
   */
  @JsonProperty("pfrcurrency_name")
  private final String pfrcurrencyName;

  /**
   * The json attributes associated with the FieldInvite.
   */
  @JsonProperty("pfrjson_attributes")
  private final String pfrjsonAttributes;

  /**
   * The electronic consent id associated with the FieldInvite.
   */
  @JsonProperty("electronic_consent_id")
  private final String electronicConsentId;

  /**
   * Indicates if the stripe ach bank account is verified for the FieldInvite.
   */
  @JsonProperty("stripe_ach_bank_account_verified")
  private final String stripeAchBankAccountVerified;

  /**
   * Indicates if the stripe ach bank account is present for the FieldInvite.
   */
  @JsonProperty("stripe_ach_bank_account_present")
  private final String stripeAchBankAccountPresent;

  /**
   * The prefill signature name associated with the FieldInvite.
   */
  @JsonProperty("prefill_signature_name")
  private final String prefillSignatureName;

  /**
   * Indicates if a new signature is forced for the FieldInvite.
   */
  @JsonProperty("force_new_signature")
  private final int forceNewSignature;

  /**
   * The signing instructions associated with the FieldInvite.
   */
  @JsonProperty("signing_instructions")
  private final String signingInstructions;

  /**
   * The signature type associated with the FieldInvite.
   */
  @JsonProperty("signature_type")
  private final String signatureType;

  /**
   * Constructs a new FieldInvite with the provided parameters.
   *
   * @param id the id of the FieldInvite
   * @param signerUserId the user id of the signer
   * @param status the status of the FieldInvite
   * @param passwordProtected indicates if the FieldInvite is password protected
   * @param created the creation time of the FieldInvite
   * @param updated the last updated time of the FieldInvite
   * @param emailGroup the email group associated with the FieldInvite
   * @param email the email associated with the FieldInvite
   * @param emailStatuses the email statuses associated with the FieldInvite
   * @param role the role associated with the FieldInvite
   * @param roleId the role id associated with the FieldInvite
   * @param reminder the reminder associated with the FieldInvite
   * @param expirationTime the expiration time of the FieldInvite
   * @param redirectTarget the redirect target of the FieldInvite
   * @param isFullDeclined indicates if the FieldInvite is fully declined
   * @param isEmbedded indicates if the FieldInvite is embedded
   * @param isDocumentLocked indicates if the document associated with the FieldInvite is locked
   * @param declined the declined collection associated with the FieldInvite
   * @param deliveryType the delivery type of the FieldInvite
   * @param idVerificationRequired indicates if id verification is required for the FieldInvite
   * @param idVerified indicates if the id associated with the FieldInvite is verified
   * @param embeddedSigner the embedded signer collection associated with the FieldInvite
   * @param language the language of the FieldInvite
   * @param signerPhoneInvite the phone invite of the signer associated with the FieldInvite
   * @param passwordType the password type of the FieldInvite
   * @param passwordMethod the password method of the FieldInvite
   * @param reassign the reassign associated with the FieldInvite
   * @param pfrmerchantAccountName the merchant account name associated with the FieldInvite
   * @param redirectUri the redirect uri of the FieldInvite
   * @param declineRedirectUri the decline redirect uri of the FieldInvite
   * @param closeRedirectUri the close redirect uri of the FieldInvite
   * @param isDraftExists indicates if a draft exists for the FieldInvite
   * @param requiredPresetSignatureName the required preset signature name associated with the FieldInvite
   * @param declineBySignature the decline by signature associated with the FieldInvite
   * @param electronicConsentRequired the electronic consent required for the FieldInvite
   * @param paymentRequest the payment request associated with the FieldInvite
   * @param pfrid the pfrid associated with the FieldInvite
   * @param pfrtype the pfrtype associated with the FieldInvite
   * @param pfrmerchantId the merchant id associated with the FieldInvite
   * @param pfrstatus the pfrstatus associated with the FieldInvite
   * @param pframount the pframount associated with the FieldInvite
   * @param pfrpaymentTransactionId the payment transaction id associated with the FieldInvite
   * @param pfrcreated the pfrcreated associated with the FieldInvite
   * @param pfrmerchantType the merchant type associated with the FieldInvite
   * @param pfrcurrencyName the currency name associated with the FieldInvite
   * @param pfrjsonAttributes the json attributes associated with the FieldInvite
   * @param electronicConsentId the electronic consent id associated with the FieldInvite
   * @param stripeAchBankAccountVerified indicates if the stripe ach bank account is verified for the FieldInvite
   * @param stripeAchBankAccountPresent indicates if the stripe ach bank account is present for the FieldInvite
   * @param prefillSignatureName the prefill signature name associated with the FieldInvite
   * @param forceNewSignature indicates if a new signature is forced for the FieldInvite
   * @param signingInstructions the signing instructions associated with the FieldInvite
   * @param signatureType the signature type associated with the FieldInvite
   */
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