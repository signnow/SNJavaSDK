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

public final class InviteAction extends ApiData {

  @JsonProperty("email")
  private final String email;

  @JsonProperty("role_name")
  private final String roleName;

  @JsonProperty("action")
  private final String action;

  @JsonProperty("document_id")
  private final String documentId;

  @JsonProperty("document_name")
  private final String documentName;

  @JsonProperty("allow_reassign")
  private final String allowReassign;

  @JsonProperty("decline_by_signature")
  private final String declineBySignature;

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

  public String getEmail() {
    return this.email;
  }

  public String getRoleName() {
    return this.roleName;
  }

  public String getAction() {
    return this.action;
  }

  public String getDocumentId() {
    return this.documentId;
  }

  public String getDocumentName() {
    return this.documentName;
  }

  public String getAllowReassign() {
    return this.allowReassign;
  }

  public String getDeclineBySignature() {
    return this.declineBySignature;
  }

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
