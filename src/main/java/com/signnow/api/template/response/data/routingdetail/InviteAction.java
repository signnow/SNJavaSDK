/*
 * This file is a part of signNow SDK API client.
 *
 * (с) Copyright © 2011-present airSlate Inc. (https://www.signnow.com)
 *
 * For more details on copyright, see LICENSE.md file
 * that was distributed with this source code.
 */

package com.signnow.api.template.response.data.routingdetail;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.signnow.core.data.ApiData;
import com.signnow.core.util.Cast;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * Represents an invitation with details such as email, document information, and permissions.
 */
public final class InviteAction extends ApiData {

  /**
   * Email address of the recipient or user.
   */
  @JsonProperty("email")
  private final String email;

  /**
   * Identifier of the associated document.
   */
  @JsonProperty("document_id")
  private final String documentId;

  /**
   * Name of the associated document.
   */
  @JsonProperty("document_name")
  private final String documentName;

  /**
   * Indicates if reassignment is allowed (1 = allowed, 0 = not allowed).
   */
  @JsonProperty("allow_reassign")
  private final int allowReassign;

  /**
   * Indicates if the document can be declined by signature (1 = yes, 0 = no).
   */
  @JsonProperty("decline_by_signature")
  private final int declineBySignature;

  /**
   * Indicates whether the document is locked.
   */
  @JsonProperty("lock")
  private final boolean lock;

  /**
   * Action assigned to the user (e.g., "sign", "view").
   */
  @JsonProperty("action")
  private final String action;

  /**
   * Name of the role assigned to the user in the document workflow.
   */
  @JsonProperty("role_name")
  private final String roleName;

  /**
   * Authentication method required for accessing or signing the document.
   */
  @JsonProperty("authentication")
  private final Authentication authentication;

  /**
   * Constructs an InviteAction with the specified details.
   *
   * @param email the email address associated with the invite
   * @param documentId the ID of the document
   * @param documentName the name of the document
   * @param allowReassign the reassign permission
   * @param declineBySignature the decline by signature permission
   * @param lock the lock status
   * @param action the action to be performed
   * @param roleName the role name associated with the invite
   * @param authentication the authentication details, if any
   */
  @JsonCreator
  public InviteAction(
      @JsonProperty("email") String email,
      @JsonProperty("document_id") String documentId,
      @JsonProperty("document_name") String documentName,
      @JsonProperty("allow_reassign") int allowReassign,
      @JsonProperty("decline_by_signature") int declineBySignature,
      @JsonProperty("lock") boolean lock,
      @JsonProperty("action") String action,
      @JsonProperty("role_name") String roleName,
      @JsonProperty("authentication") @Nullable Authentication authentication) {
    this.email = email;
    this.documentId = documentId;
    this.documentName = documentName;
    this.allowReassign = allowReassign;
    this.declineBySignature = declineBySignature;
    this.lock = lock;
    this.action = action;
    this.roleName = roleName;
    this.authentication = authentication;
  }

  /**
   * Gets the email address associated with the invite.
   *
   * @return the email address
   */
  public String getEmail() {
    return email;
  }

  /**
   * Gets the ID of the document.
   *
   * @return the document ID
   */
  public String getDocumentId() {
    return documentId;
  }

  /**
   * Gets the name of the document.
   *
   * @return the document name
   */
  public String getDocumentName() {
    return documentName;
  }

  /**
   * Gets the authentication details, if any.
   *
   * @return the authentication details or null if not present
   */
  @Nullable
  public Authentication getAuthentication() {
    return this.authentication;
  }

  /**
   * Gets the reassign permission.
   *
   * @return the reassign permission
   */
  public int getAllowReassign() {
    return this.allowReassign;
  }

  /**
   * Gets the decline by signature permission.
   *
   * @return the decline by signature permission
   */
  public int getDeclineBySignature() {
    return this.declineBySignature;
  }

  /**
   * Checks if the invite is locked.
   *
   * @return true if locked, false otherwise
   */
  public boolean isLock() {
    return this.lock;
  }

  /**
   * Gets the action to be performed.
   *
   * @return the action
   */
  public String getAction() {
    return this.action;
  }

  /**
   * Gets the role name associated with the invite.
   *
   * @return the role name
   */
  public String getRoleName() {
    return this.roleName;
  }

  /**
   * Converts the invite action details to a map.
   *
   * @return a map representation of the invite action
   */
  @NotNull
  public Map<String, Object> toMap() {
    Map<String, Object> map = new LinkedHashMap<>();
    map.put("email", this.getEmail());
    map.put("document_id", this.getDocumentId());
    map.put("document_name", this.getDocumentName());
    map.put("authentication", this.getAuthentication());
    map.put("allow_reassign", this.getAllowReassign());
    map.put("decline_by_signature", this.getDeclineBySignature());
    map.put("lock", this.isLock());
    map.put("action", this.getAction());
    map.put("role_name", this.getRoleName());
    return map;
  }

  /**
   * Creates an InviteAction from a map of data.
   *
   * @param data the map containing invite action details
   * @return a new InviteAction instance
   */
  @NotNull
  public static InviteAction fromMap(@NotNull Map<String, Object> data) {
    return new InviteAction(
        (String) data.get("email"),
        (String) data.get("document_id"),
        (String) data.get("document_name"),
        (int) data.get("allow_reassign"),
        (int) data.get("decline_by_signature"),
        (boolean) data.get("lock"),
        (String) data.get("action"),
        (String) data.get("role_name"),
        data.containsKey("authentication")
            ? Authentication.fromMap(
                Cast.safeToMap(data.get("authentication"), String.class, Object.class))
            : null);
  }
}
