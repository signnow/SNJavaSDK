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

public final class DocumentGroupInfo extends ApiData {

  @JsonProperty("document_group_id")
  private final String documentGroupId;

  @JsonProperty("document_group_name")
  private final String documentGroupName;

  @JsonProperty("invite_id")
  private final String inviteId;

  @JsonProperty("invite_status")
  private final String inviteStatus;

  @JsonProperty("sign_as_merged")
  private final boolean signAsMerged;

  @JsonProperty("doc_count_in_group")
  private final int docCountInGroup;

  @JsonProperty("freeform_invite")
  private final FreeformInvite freeformInvite;

  @JsonProperty("state")
  private final String state;

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

  public String getDocumentGroupId() {
    return this.documentGroupId;
  }

  public String getDocumentGroupName() {
    return this.documentGroupName;
  }

  public String getInviteId() {
    return this.inviteId;
  }

  public String getInviteStatus() {
    return this.inviteStatus;
  }

  public boolean isSignAsMerged() {
    return this.signAsMerged;
  }

  public int getDocCountInGroup() {
    return this.docCountInGroup;
  }

  public FreeformInvite getFreeformInvite() {
    return this.freeformInvite;
  }

  public String getState() {
    return this.state;
  }

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
