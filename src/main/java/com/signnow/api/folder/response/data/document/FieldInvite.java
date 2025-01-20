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

/**
 * This class represents a FieldInvite object.
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
   * The email of the FieldInvite.
   */
  @JsonProperty("email")
  private final String email;

  /**
   * The role of the FieldInvite.
   */
  @JsonProperty("role")
  private final String role;

  /**
   * The role id of the FieldInvite.
   */
  @JsonProperty("role_id")
  private final String roleId;

  /**
   * The email sent statuses of the FieldInvite.
   */
  @JsonProperty("email_sent_statuses")
  private final EmailSentStatusCollection emailSentStatuses;

  /**
   * The document locked status of the FieldInvite.
   */
  @JsonProperty("is_document_locked")
  private final String isDocumentLocked;

  /**
   * The password protected status of the FieldInvite.
   */
  @JsonProperty("password_protected")
  private final String passwordProtected;

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
   * The reassign status of the FieldInvite.
   */
  @JsonProperty("reassign")
  private final String reassign;

  /**
   * The id verification required status of the FieldInvite.
   */
  @JsonProperty("id_verification_required")
  private final String idVerificationRequired;

  /**
   * The id verified status of the FieldInvite.
   */
  @JsonProperty("id_verified")
  private final String idVerified;

  /**
   * The email group of the FieldInvite.
   */
  @JsonProperty("email_group")
  private final EmailGroup emailGroup;

  /**
   * The reminder of the FieldInvite.
   */
  @JsonProperty("reminder")
  private final String reminder;

  /**
   * The expiration time of the FieldInvite.
   */
  @JsonProperty("expiration_time")
  private final String expirationTime;

  /**
   * The electronic consent id of the FieldInvite.
   */
  @JsonProperty("electronic_consent_id")
  private final String electronicConsentId;

  /**
   * The prefill signature name of the FieldInvite.
   */
  @JsonProperty("prefill_signature_name")
  private final String prefillSignatureName;

  /**
   * The force new signature status of the FieldInvite.
   */
  @JsonProperty("force_new_signature")
  private final String forceNewSignature;

  /**
   * The electronic consent required status of the FieldInvite.
   */
  @JsonProperty("electronic_consent_required")
  private final String electronicConsentRequired;

  /**
   * The decline by signature status of the FieldInvite.
   */
  @JsonProperty("decline_by_signature")
  private final String declineBySignature;

  /**
   * The signing instructions of the FieldInvite.
   */
  @JsonProperty("signing_instructions")
  private final String signingInstructions;

  /**
   * The payment request of the FieldInvite.
   */
  @JsonProperty("payment_request")
  private final String paymentRequest;

  /**
   * The draft exists status of the FieldInvite.
   */
  @JsonProperty("is_draft_exists")
  private final String isDraftExists;

  /**
   * The full declined status of the FieldInvite.
   */
  @JsonProperty("is_full_declined")
  private final String isFullDeclined;

  /**
   * The embedded status of the FieldInvite.
   */
  @JsonProperty("is_embedded")
  private final String isEmbedded;

  /**
   * The delivery type of the FieldInvite.
   */
  @JsonProperty("delivery_type")
  private final String deliveryType;

  /**
   * The signer phone invite of the FieldInvite.
   */
  @JsonProperty("signer_phone_invite")
  private final String signerPhoneInvite;

  /**
   * The signature type of the FieldInvite.
   */
  @JsonProperty("signature_type")
  private final String signatureType;

  /**
   * Constructor for FieldInvite.
   *
   * @param id The id of the FieldInvite.
   * @param signerUserId The user id of the signer.
   * @param status The status of the FieldInvite.
   * @param created The creation time of the FieldInvite.
   * @param updated The last updated time of the FieldInvite.
   * @param email The email of the FieldInvite.
   * @param role The role of the FieldInvite.
   * @param roleId The role id of the FieldInvite.
   * @param emailSentStatuses The email sent statuses of the FieldInvite.
   * @param isDocumentLocked The document locked status of the FieldInvite.
   * @param passwordProtected The password protected status of the FieldInvite.
   * @param passwordType The password type of the FieldInvite.
   * @param passwordMethod The password method of the FieldInvite.
   * @param reassign The reassign status of the FieldInvite.
   * @param idVerificationRequired The id verification required status of the FieldInvite.
   * @param idVerified The id verified status of the FieldInvite.
   * @param emailGroup The email group of the FieldInvite.
   * @param reminder The reminder of the FieldInvite.
   * @param expirationTime The expiration time of the FieldInvite.
   * @param electronicConsentId The electronic consent id of the FieldInvite.
   * @param prefillSignatureName The prefill signature name of the FieldInvite.
   * @param forceNewSignature The force new signature status of the FieldInvite.
   * @param electronicConsentRequired The electronic consent required status of the FieldInvite.
   * @param declineBySignature The decline by signature status of the FieldInvite.
   * @param signingInstructions The signing instructions of the FieldInvite.
   * @param paymentRequest The payment request of the FieldInvite.
   * @param isDraftExists The draft exists status of the FieldInvite.
   * @param isFullDeclined The full declined status of the FieldInvite.
   * @param isEmbedded The embedded status of the FieldInvite.
   * @param deliveryType The delivery type of the FieldInvite.
   * @param signerPhoneInvite The signer phone invite of the FieldInvite.
   * @param signatureType The signature type of the FieldInvite.
   */
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

  /**
   * Returns the id of the FieldInvite.
   *
   * @return the id of the FieldInvite.
   */
  public String getId() {
    return this.id;
  }

  /**
   * Returns the user id of the signer.
   *
   * @return the user id of the signer.
   */
  public String getSignerUserId() {
    return this.signerUserId;
  }

  /**
   * Returns the status of the FieldInvite.
   *
   * @return the status of the FieldInvite.
   */
  public String getStatus() {
    return this.status;
  }

  /**
   * Returns the creation time of the FieldInvite.
   *
   * @return the creation time of the FieldInvite.
   */
  public String getCreated() {
    return this.created;
  }

  /**
   * Returns the last updated time of the FieldInvite.
   *
   * @return the last updated time of the FieldInvite.
   */
  public String getUpdated() {
    return this.updated;
  }

  /**
   * Returns the email of the FieldInvite.
   *
   * @return the email of the FieldInvite.
   */
  public String getEmail() {
    return this.email;
  }

  /**
   * Returns the role of the FieldInvite.
   *
   * @return the role of the FieldInvite.
   */
  public String getRole() {
    return this.role;
  }

  /**
   * Returns the role id of the FieldInvite.
   *
   * @return the role id of the FieldInvite.
   */
  public String getRoleId() {
    return this.roleId;
  }

  /**
   * Returns the email sent statuses of the FieldInvite.
   *
   * @return the email sent statuses of the FieldInvite.
   */
  public EmailSentStatusCollection getEmailSentStatuses() {
    return this.emailSentStatuses;
  }

  /**
   * Returns the document locked status of the FieldInvite.
   *
   * @return the document locked status of the FieldInvite.
   */
  public String getIsDocumentLocked() {
    return this.isDocumentLocked;
  }

  /**
   * Returns the password protected status of the FieldInvite.
   *
   * @return the password protected status of the FieldInvite.
   */
  public String getPasswordProtected() {
    return this.passwordProtected;
  }

  /**
   * Returns the password type of the FieldInvite.
   *
   * @return the password type of the FieldInvite.
   */
  public String getPasswordType() {
    return this.passwordType;
  }

  /**
   * Returns the password method of the FieldInvite.
   *
   * @return the password method of the FieldInvite.
   */
  public String getPasswordMethod() {
    return this.passwordMethod;
  }

  /**
   * Returns the reassign status of the FieldInvite.
   *
   * @return the reassign status of the FieldInvite.
   */
  public String getReassign() {
    return this.reassign;
  }

  /**
   * Returns the id verification required status of the FieldInvite.
   *
   * @return the id verification required status of the FieldInvite.
   */
  public String getIdVerificationRequired() {
    return this.idVerificationRequired;
  }

  /**
   * Returns the id verified status of the FieldInvite.
   *
   * @return the id verified status of the FieldInvite.
   */
  public String getIdVerified() {
    return this.idVerified;
  }

  /**
   * Returns the email group of the FieldInvite.
   *
   * @return the email group of the FieldInvite.
   */
  public EmailGroup getEmailGroup() {
    return this.emailGroup;
  }

  /**
   * Returns the reminder of the FieldInvite.
   *
   * @return the reminder of the FieldInvite.
   */
  public String getReminder() {
    return this.reminder;
  }

  /**
   * Returns the expiration time of the FieldInvite.
   *
   * @return the expiration time of the FieldInvite.
   */
  public String getExpirationTime() {
    return this.expirationTime;
  }

  /**
   * Returns the electronic consent id of the FieldInvite.
   *
   * @return the electronic consent id of the FieldInvite.
   */
  public String getElectronicConsentId() {
    return this.electronicConsentId;
  }

  /**
   * Returns the prefill signature name of the FieldInvite.
   *
   * @return the prefill signature name of the FieldInvite.
   */
  public String getPrefillSignatureName() {
    return this.prefillSignatureName;
  }

  /**
   * Returns the force new signature status of the FieldInvite.
   *
   * @return the force new signature status of the FieldInvite.
   */
  public String getForceNewSignature() {
    return this.forceNewSignature;
  }

  /**
   * Returns the electronic consent required status of the FieldInvite.
   *
   * @return the electronic consent required status of the FieldInvite.
   */
  public String getElectronicConsentRequired() {
    return this.electronicConsentRequired;
  }

  /**
   * Returns the decline by signature status of the FieldInvite.
   *
   * @return the decline by signature status of the FieldInvite.
   */
  public String getDeclineBySignature() {
    return this.declineBySignature;
  }

  /**
   * Returns the signing instructions of the FieldInvite.
   *
   * @return the signing instructions of the FieldInvite.
   */
  public String getSigningInstructions() {
    return this.signingInstructions;
  }

  /**
   * Returns the payment request of the FieldInvite.
   *
   * @return the payment request of the FieldInvite.
   */
  public String getPaymentRequest() {
    return this.paymentRequest;
  }

  /**
   * Returns the draft exists status of the FieldInvite.
   *
   * @return the draft exists status of the FieldInvite.
   */
  public String getIsDraftExists() {
    return this.isDraftExists;
  }

  /**
   * Returns the full declined status of the FieldInvite.
   *
   * @return the full declined status of the FieldInvite.
   */
  public String getIsFullDeclined() {
    return this.isFullDeclined;
  }

  /**
   * Returns the embedded status of the FieldInvite.
   *
   * @return the embedded status of the FieldInvite.
   */
  public String getIsEmbedded() {
    return this.isEmbedded;
  }

  /**
   * Returns the delivery type of the FieldInvite.
   *
   * @return the delivery type of the FieldInvite.
   */
  public String getDeliveryType() {
    return this.deliveryType;
  }

  /**
   * Returns the signer phone invite of the FieldInvite.
   *
   * @return the signer phone invite of the FieldInvite.
   */
  public String getSignerPhoneInvite() {
    return this.signerPhoneInvite;
  }

  /**
   * Returns the signature type of the FieldInvite.
   *
   * @return the signature type of the FieldInvite.
   */
  public String getSignatureType() {
    return this.signatureType;
  }

  /**
   * Converts the FieldInvite to a Map.
   *
   * @return a Map representing the FieldInvite.
   */
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

  /**
   * Creates a FieldInvite from a Map.
   *
   * @param data a Map representing a FieldInvite.
   * @return a FieldInvite.
   */
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