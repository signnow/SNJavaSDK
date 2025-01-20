/*
 * This file is a part of signNow SDK API client.
 *
 * (с) Copyright © 2011-present airSlate Inc. (https://www.signnow.com)
 *
 * For more details on copyright, see LICENSE.md file
 * that was distributed with this source code.
 */

package com.signnow.api.template.request.data.routingdetail;

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
   * The name of the document.
   */
  @JsonProperty("document_name")
  private final String documentName;

  /**
   * Flag to allow reassignment of the invite.
   */
  @JsonProperty("allow_reassign")
  private final String allowReassign;

  /**
   * Flag to allow decline by signature.
   */
  @JsonProperty("decline_by_signature")
  private final String declineBySignature;

  /**
   * Constructor for InviteAction.
   *
   * @param email The email of the invitee.
   * @param roleName The role name of the invitee.
   * @param action The action to be performed.
   * @param documentId The ID of the document.
   * @param documentName The name of the document.
   * @param allowReassign Flag to allow reassignment of the invite.
   * @param declineBySignature Flag to allow decline by signature.
   */
  @JsonCreator
  public InviteAction(
      @JsonProperty("email") String email,
      @JsonProperty("role_name") String roleName,
      @JsonProperty("action") String action,
      @JsonProperty("document_id") String documentId,
      @JsonProperty("document_name") String documentName,
      @JsonProperty("allow_reassign") String allowReassign,
      @JsonProperty("decline_by_signature") String declineBySignature) {
    this.email = email;
    this.roleName = roleName;
    this.action = action;
    this.documentId = documentId;
    this.documentName = documentName;
    this.allowReassign = allowReassign;
    this.declineBySignature = declineBySignature;
  }

  /**
   * Constructor for InviteAction.
   *
   * @param email The email of the invitee.
   * @param roleName The role name of the invitee.
   * @param action The action to be performed.
   * @param documentId The ID of the document.
   * @param documentName The name of the document.
   */
  public InviteAction(
      @JsonProperty("email") String email,
      @JsonProperty("role_name") String roleName,
      @JsonProperty("action") String action,
      @JsonProperty("document_id") String documentId,
      @JsonProperty("document_name") String documentName) {
    this.email = email;
    this.roleName = roleName;
    this.action = action;
    this.documentId = documentId;
    this.documentName = documentName;
    this.allowReassign = null;
    this.declineBySignature = null;
  }

  /**
   * @return The email of the invitee.
   */
  public String getEmail() {
    return this.email;
  }

  /**
   * @return The role name of the invitee.
   */
  public String getRoleName() {
    return this.roleName;
  }

  /**
   * @return The action to be performed.
   */
  public String getAction() {
    return this.action;
  }

  /**
   * @return The ID of the document.
   */
  public String getDocumentId() {
    return this.documentId;
  }

  /**
   * @return The name of the document.
   */
  public String getDocumentName() {
    return this.documentName;
  }

  /**
   * @return Flag to allow reassignment of the invite.
   */
  public String getAllowReassign() {
    return this.allowReassign;
  }

  /**
   * @return Flag to allow decline by signature.
   */
  public String getDeclineBySignature() {
    return this.declineBySignature;
  }

  /**
   * Converts this object to a Map.
   *
   * @return A Map representation of this object.
   */
  @NotNull
  @Override
  public Map<String, Object> toMap() {
    Map<String, Object> map = new LinkedHashMap<>();
    map.put("email", this.getEmail());
    map.put("role_name", this.getRoleName());
    map.put("action", this.getAction());
    map.put("document_id", this.getDocumentId());
    map.put("document_name", this.getDocumentName());
    map.put("allow_reassign", this.getAllowReassign());
    map.put("decline_by_signature", this.getDeclineBySignature());
    return map;
  }

  /**
   * Creates an InviteAction object from a Map.
   *
   * @param data The Map to convert.
   * @return A new InviteAction object.
   */
  @NotNull
  @Contract("_ -> new")
  public static InviteAction fromMap(@NotNull Map<String, Object> data) {
    return new InviteAction(
        (String) data.get("email"),
        (String) data.get("role_name"),
        (String) data.get("action"),
        (String) data.get("document_id"),
        (String) data.get("document_name"),
        (String) data.getOrDefault("allow_reassign", ""),
        (String) data.getOrDefault("decline_by_signature", ""));
  }
}