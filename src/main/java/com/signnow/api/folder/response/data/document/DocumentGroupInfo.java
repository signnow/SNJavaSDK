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

public final class DocumentGroupInfo extends ApiData {

  @JsonProperty("freeform_invite")
  private final FreeformInvite freeformInvite;

  @JsonProperty("document_group_id")
  private final String documentGroupId;

  @JsonProperty("document_group_name")
  private final String documentGroupName;

  @JsonProperty("invite_id")
  private final String inviteId;

  @JsonProperty("invite_status")
  private final String inviteStatus;

  @JsonProperty("state")
  private final String state;

  @JsonProperty("doc_count_in_group")
  private final Integer docCountInGroup;

  @JsonProperty("sign_as_merged")
  private final Boolean signAsMerged;

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

  public FreeformInvite getFreeformInvite() {
    return this.freeformInvite;
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

  public String getState() {
    return this.state;
  }

  public Integer getDocCountInGroup() {
    return this.docCountInGroup;
  }

  public Boolean isSignAsMerged() {
    return this.signAsMerged;
  }

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
