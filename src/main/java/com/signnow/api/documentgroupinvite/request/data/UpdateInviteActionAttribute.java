/*
 * This file is a part of signNow SDK API client.
 *
 * (с) Copyright © 2011-present airSlate Inc. (https://www.signnow.com)
 *
 * For more details on copyright, see LICENSE.md file
 * that was distributed with this source code.
 */

package com.signnow.api.documentgroupinvite.request.data;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.signnow.core.data.ApiData;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

/**
 * This class represents the attributes of an invite action that can be updated.
 */
public final class UpdateInviteActionAttribute extends ApiData {

  /**
   * The ID of the document associated with the invite action.
   */
  @JsonProperty("document_id")
  private final String documentId;

  /**
   * The flag indicating whether reassignment is allowed.
   */
  @JsonProperty("allow_reassign")
  private final int allowReassign;

  /**
   * The signature associated with the decline action.
   */
  @JsonProperty("decline_by_signature")
  private final String declineBySignature;

  /**
   * Constructs a new UpdateInviteActionAttribute with the specified document ID, reassignment flag, and decline signature.
   *
   * @param documentId the ID of the document
   * @param allowReassign the flag indicating whether reassignment is allowed
   * @param declineBySignature the signature associated with the decline action
   */
  @JsonCreator
  public UpdateInviteActionAttribute(
      @JsonProperty("document_id") String documentId,
      @JsonProperty("allow_reassign") int allowReassign,
      @JsonProperty("decline_by_signature") String declineBySignature) {
    this.documentId = documentId;
    this.allowReassign = allowReassign;
    this.declineBySignature = declineBySignature;
  }

  /**
   * Constructs a new UpdateInviteActionAttribute with the specified document ID.
   *
   * @param documentId the ID of the document
   */
  public UpdateInviteActionAttribute(@JsonProperty("document_id") String documentId) {
    this.documentId = documentId;
    this.allowReassign = 0;
    this.declineBySignature = null;
  }

  /**
   * Returns the ID of the document associated with the invite action.
   *
   * @return the document ID
   */
  public String getDocumentId() {
    return this.documentId;
  }

  /**
   * Returns the flag indicating whether reassignment is allowed.
   *
   * @return the reassignment flag
   */
  public int getAllowReassign() {
    return this.allowReassign;
  }

  /**
   * Returns the signature associated with the decline action.
   *
   * @return the decline signature
   */
  public String getDeclineBySignature() {
    return this.declineBySignature;
  }

  /**
   * Converts this object to a map.
   *
   * @return a map representing this object
   */
  @NotNull
  @Override
  public Map<String, Object> toMap() {
    Map<String, Object> map = new LinkedHashMap<>();
    map.put("document_id", this.getDocumentId());
    map.put("allow_reassign", this.getAllowReassign());
    map.put("decline_by_signature", this.getDeclineBySignature());
    return map;
  }

  /**
   * Creates a new UpdateInviteActionAttribute from the specified map.
   *
   * @param data the map containing the data
   * @return a new UpdateInviteActionAttribute
   */
  @NotNull
  @Contract("_ -> new")
  public static UpdateInviteActionAttribute fromMap(@NotNull Map<String, Object> data) {
    return new UpdateInviteActionAttribute(
        (String) data.getOrDefault("document_id", ""),
        (int) data.getOrDefault("allow_reassign", 0),
        (String) data.getOrDefault("decline_by_signature", ""));
  }
}
