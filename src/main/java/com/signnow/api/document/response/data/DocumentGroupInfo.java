/*
 * This file is a part of signNow SDK API client.
 *
 * (с) Copyright © 2011-present airSlate Inc. (https://www.signnow.com)
 *
 * For more details on copyright, see LICENSE.md file
 * that was distributed with this source code.
 */

package com.signnow.api.document.response.data;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.signnow.core.data.ApiData;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

/**
 * This class represents the information about a document group.
 */
public final class DocumentGroupInfo extends ApiData {

  /**
   * The ID of the document group.
   */
  @JsonProperty("document_group_id")
  private final String documentGroupId;

  /**
   * The name of the document group.
   */
  @JsonProperty("document_group_name")
  private final String documentGroupName;

  /**
   * The ID of the invite.
   */
  @JsonProperty("invite_id")
  private final String inviteId;

  /**
   * The status of the invite.
   */
  @JsonProperty("invite_status")
  private final String inviteStatus;

  /**
   * Indicates if the document is signed as merged.
   */
  @JsonProperty("sign_as_merged")
  private final boolean signAsMerged;

  /**
   * The count of documents in the group.
   */
  @JsonProperty("doc_count_in_group")
  private final int docCountInGroup;

  /**
   * The freeform invite of the document group.
   */
  @JsonProperty("freeform_invite")
  private final FreeformInvite freeformInvite;

  /**
   * The state of the document group.
   */
  @JsonProperty("state")
  private final String state;

  /**
   * Constructs a new DocumentGroupInfo with the specified details.
   *
   * @param documentGroupId the ID of the document group
   * @param documentGroupName the name of the document group
   * @param inviteId the ID of the invite
   * @param inviteStatus the status of the invite
   * @param signAsMerged indicates if the document is signed as merged
   * @param docCountInGroup the count of documents in the group
   * @param freeformInvite the freeform invite of the document group
   * @param state the state of the document group
   */
  @JsonCreator
  public DocumentGroupInfo(
      @JsonProperty("document_group_id") String documentGroupId,
      @JsonProperty("document_group_name") String documentGroupName,
      @JsonProperty("invite_id") String inviteId,
      @JsonProperty("invite_status") String inviteStatus,
      @JsonProperty("sign_as_merged") boolean signAsMerged,
      @JsonProperty("doc_count_in_group") int docCountInGroup,
      @JsonProperty("freeform_invite") FreeformInvite freeformInvite,
      @JsonProperty("state") String state) {
    this.documentGroupId = documentGroupId;
    this.documentGroupName = documentGroupName;
    this.inviteId = inviteId;
    this.inviteStatus = inviteStatus;
    this.signAsMerged = signAsMerged;
    this.docCountInGroup = docCountInGroup;
    this.freeformInvite = freeformInvite;
    this.state = state;
  }

  /**
   * Returns the ID of the document group.
   *
   * @return the ID of the document group
   */
  public String getDocumentGroupId() {
    return this.documentGroupId;
  }

  /**
   * Returns the name of the document group.
   *
   * @return the name of the document group
   */
  public String getDocumentGroupName() {
    return this.documentGroupName;
  }

  /**
   * Returns the ID of the invite.
   *
   * @return the ID of the invite
   */
  public String getInviteId() {
    return this.inviteId;
  }

  /**
   * Returns the status of the invite.
   *
   * @return the status of the invite
   */
  public String getInviteStatus() {
    return this.inviteStatus;
  }

  /**
   * Returns whether the document is signed as merged.
   *
   * @return true if the document is signed as merged, false otherwise
   */
  public boolean isSignAsMerged() {
    return this.signAsMerged;
  }

  /**
   * Returns the count of documents in the group.
   *
   * @return the count of documents in the group
   */
  public int getDocCountInGroup() {
    return this.docCountInGroup;
  }

  /**
   * Returns the freeform invite of the document group.
   *
   * @return the freeform invite of the document group
   */
  public FreeformInvite getFreeformInvite() {
    return this.freeformInvite;
  }

  /**
   * Returns the state of the document group.
   *
   * @return the state of the document group
   */
  public String getState() {
    return this.state;
  }

  /**
   * Converts this DocumentGroupInfo to a Map.
   *
   * @return a Map representing this DocumentGroupInfo
   */
  @NotNull
  @Override
  public Map<String, Object> toMap() {
    Map<String, Object> map = new LinkedHashMap<>();
    map.put("document_group_id", this.getDocumentGroupId());
    map.put("document_group_name", this.getDocumentGroupName());
    map.put("invite_id", this.getInviteId());
    map.put("invite_status", this.getInviteStatus());
    map.put("sign_as_merged", this.isSignAsMerged());
    map.put("doc_count_in_group", this.getDocCountInGroup());
    map.put("freeform_invite", this.getFreeformInvite());
    map.put("state", this.getState());
    return map;
  }

  /**
   * Creates a new DocumentGroupInfo from the specified Map.
   *
   * @param data a Map containing the data to create the DocumentGroupInfo from
   * @return a new DocumentGroupInfo created from the specified Map
   */
  @NotNull
  @Contract("_ -> new")
  public static DocumentGroupInfo fromMap(@NotNull Map<String, Object> data) {
    return new DocumentGroupInfo(
        (String) data.getOrDefault("document_group_id", null),
        (String) data.getOrDefault("document_group_name", null),
        (String) data.getOrDefault("invite_id", null),
        (String) data.getOrDefault("invite_status", null),
        (boolean) data.getOrDefault("sign_as_merged", false),
        (int) data.getOrDefault("doc_count_in_group", 0),
        (FreeformInvite) data.get("freeform_invite"),
        (String) data.getOrDefault("state", null));
  }
}