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

public final class UpdateInviteActionAttribute extends ApiData {

  @JsonProperty("document_id")
  private final String documentId;

  @JsonProperty("allow_reassign")
  private final int allowReassign;

  @JsonProperty("decline_by_signature")
  private final String declineBySignature;

  @JsonCreator
  public UpdateInviteActionAttribute(
      @JsonProperty("document_id") String documentId,
      @JsonProperty("allow_reassign") int allowReassign,
      @JsonProperty("decline_by_signature") String declineBySignature) {
    this.documentId = documentId;
    this.allowReassign = allowReassign;
    this.declineBySignature = declineBySignature;
  }

  public UpdateInviteActionAttribute(@JsonProperty("document_id") String documentId) {
    this.documentId = documentId;
    this.allowReassign = 0;
    this.declineBySignature = null;
  }

  public String getDocumentId() {
    return this.documentId;
  }

  public int getAllowReassign() {
    return this.allowReassign;
  }

  public String getDeclineBySignature() {
    return this.declineBySignature;
  }

  @NotNull
  @Override
  public Map<String, Object> toMap() {
    Map<String, Object> map = new LinkedHashMap<>();
    map.put("document_id", this.getDocumentId());
    map.put("allow_reassign", this.getAllowReassign());
    map.put("decline_by_signature", this.getDeclineBySignature());
    return map;
  }

  @NotNull
  @Contract("_ -> new")
  public static UpdateInviteActionAttribute fromMap(@NotNull Map<String, Object> data) {
    return new UpdateInviteActionAttribute(
        (String) data.getOrDefault("document_id", ""),
        (int) data.getOrDefault("allow_reassign", 0),
        (String) data.getOrDefault("decline_by_signature", ""));
  }
}
