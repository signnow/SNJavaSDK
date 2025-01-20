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
 * This class represents the document group information.
 */
public final class DocumentGroupInfo extends ApiData {

  /**
   * Represents the freeform invite.
   */
  @JsonProperty("freeform_invite")
  private final FreeformInvite freeformInvite;

  /**
   * Represents the document group id.
   */
  @JsonProperty("document_group_id")
  private final String documentGroupId;

  /**
   * Represents the document group name.
   */
  @JsonProperty("document_group_name")
  private final String documentGroupName;

  /**
   * Represents the invite id.
   */
  @JsonProperty("invite_id")
  private final String inviteId;

  /**
   * Represents the invite status.
   */
  @JsonProperty("invite_status")
  private final String inviteStatus;

  /**
   * Represents the state.
   */
  @JsonProperty("state")
  private final String state;

  /**
   * Represents the document count in group.
   */
  @JsonProperty("doc_count_in_group")
  private final Integer docCountInGroup;

  /**
   * Represents the sign as merged status.
   */
  @JsonProperty("sign_as_merged")
  private final Boolean signAsMerged;

  /**
   * Constructor for DocumentGroupInfo.
   *
   * @param freeformInvite the freeform invite
   * @param documentGroupId the document group id
   * @param documentGroupName the document group name
   * @param inviteId the invite id
   * @param inviteStatus the invite status
   * @param state the state
   * @param docCountInGroup the document count in group
   * @param signAsMerged the sign as merged status
   */
  @JsonCreator
  public DocumentGroupInfo(
      @JsonProperty("freeform_invite") FreeformInvite freeformInvite,
      @JsonProperty("document_group_id") String documentGroupId,
      @JsonProperty("document_group_name") String documentGroupName,
      @JsonProperty("invite_id") String inviteId,
      @JsonProperty("invite_status") String inviteStatus,
      @JsonProperty("state") String state,
      @JsonProperty("doc_count_in_group") Integer docCountInGroup,
      @JsonProperty("sign_as_merged") Boolean signAsMerged) {
    this.freeformInvite = freeformInvite;
    this.documentGroupId = documentGroupId;
    this.documentGroupName = documentGroupName;
    this.inviteId = inviteId;
    this.inviteStatus = inviteStatus;
    this.state = state;
    this.docCountInGroup = docCountInGroup;
    this.signAsMerged = signAsMerged;
  }

  /**
   * Returns the freeform invite.
   *
   * @return the freeform invite
   */
  public FreeformInvite getFreeformInvite() {
    return this.freeformInvite;
  }

  /**
   * Returns the document group id.
   *
   * @return the document group id
   */
  public String getDocumentGroupId() {
    return this.documentGroupId;
  }

  /**
   * Returns the document group name.
   *
   * @return the document group name
   */
  public String getDocumentGroupName() {
    return this.documentGroupName;
  }

  /**
   * Returns the invite id.
   *
   * @return the invite id
   */
  public String getInviteId() {
    return this.inviteId;
  }

  /**
   * Returns the invite status.
   *
   * @return the invite status
   */
  public String getInviteStatus() {
    return this.inviteStatus;
  }

  /**
   * Returns the state.
   *
   * @return the state
   */
  public String getState() {
    return this.state;
  }

  /**
   * Returns the document count in group.
   *
   * @return the document count in group
   */
  public Integer getDocCountInGroup() {
    return this.docCountInGroup;
  }

  /**
   * Returns the sign as merged status.
   *
   * @return the sign as merged status
   */
  public Boolean isSignAsMerged() {
    return this.signAsMerged;
  }

  /**
   * Converts the DocumentGroupInfo to a map.
   *
   * @return the map representation of the DocumentGroupInfo
   */
  @NotNull
  @Override
  public Map<String, Object> toMap() {
    Map<String, Object> map = new LinkedHashMap<>();
    map.put("freeform_invite", this.getFreeformInvite());
    map.put("document_group_id", this.getDocumentGroupId());
    map.put("document_group_name", this.getDocumentGroupName());
    map.put("invite_id", this.getInviteId());
    map.put("invite_status", this.getInviteStatus());
    map.put("state", this.getState());
    map.put("doc_count_in_group", this.getDocCountInGroup());
    map.put("sign_as_merged", this.isSignAsMerged());
    return map;
  }

  /**
   * Creates a DocumentGroupInfo from a map.
   *
   * @param data the map containing the data
   * @return the created DocumentGroupInfo
   */
  @NotNull
  @Contract("_ -> new")
  public static DocumentGroupInfo fromMap(@NotNull Map<String, Object> data) {
    return new DocumentGroupInfo(
        FreeformInvite.fromMap(
            Cast.safeToMap(data.get("freeform_invite"), String.class, Object.class)),
        (String) data.get("document_group_id"),
        (String) data.get("document_group_name"),
        (String) data.get("invite_id"),
        (String) data.get("invite_status"),
        (String) data.get("state"),
        (Integer) data.get("doc_count_in_group"),
        (Boolean) data.get("sign_as_merged"));
  }
}