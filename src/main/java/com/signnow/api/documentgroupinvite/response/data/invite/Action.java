/*
 * This file is a part of signNow SDK API client.
 *
 * (с) Copyright © 2011-present airSlate Inc. (https://www.signnow.com)
 *
 * For more details on copyright, see LICENSE.md file
 * that was distributed with this source code.
 */

package com.signnow.api.documentgroupinvite.response.data.invite;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.signnow.core.data.ApiData;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

public final class Action extends ApiData {

  @JsonProperty("action")
  private final String action;

  @JsonProperty("document_id")
  private final String documentId;

  @JsonProperty("status")
  private final String status;

  @JsonProperty("role_name")
  private final String roleName;

  @JsonProperty("email")
  private final String email;

  @JsonCreator
  public Action(
      @JsonProperty("action") String action,
      @JsonProperty("document_id") String documentId,
      @JsonProperty("status") String status,
      @JsonProperty("role_name") String roleName,
      @JsonProperty("email") String email) {
    this.action = action;
    this.documentId = documentId;
    this.status = status;
    this.roleName = roleName;
    this.email = email;
  }

  public String getAction() {
    return this.action;
  }

  public String getEmail() {
    return this.email;
  }

  public String getDocumentId() {
    return this.documentId;
  }

  public String getStatus() {
    return this.status;
  }

  public String getRoleName() {
    return this.roleName;
  }

  @NotNull
  @Override
  public Map<String, Object> toMap() {
    Map<String, Object> map = new LinkedHashMap<>();
    map.put("action", this.getAction());
    map.put("email", this.getEmail());
    map.put("document_id", this.getDocumentId());
    map.put("status", this.getStatus());
    map.put("role_name", this.getRoleName());
    return map;
  }

  @NotNull
  @Contract("_ -> new")
  public static Action fromMap(@NotNull Map<String, Object> data) {
    return new Action(
        (String) data.get("action"),
        (String) data.get("document_id"),
        (String) data.get("status"),
        (String) data.get("role_name"),
        (String) data.getOrDefault("email", ""));
  }
}
