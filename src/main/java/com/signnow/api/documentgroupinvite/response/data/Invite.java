/*
 * This file is a part of signNow SDK API client.
 *
 * (с) Copyright © 2011-present airSlate Inc. (https://www.signnow.com)
 *
 * For more details on copyright, see LICENSE.md file
 * that was distributed with this source code.
 */

package com.signnow.api.documentgroupinvite.response.data;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.signnow.core.data.ApiData;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

public final class Invite extends ApiData {

  @JsonProperty("link")
  private final String link;

  @JsonProperty("document_name")
  private final String documentName;

  @JsonProperty("inviter_email")
  private final String inviterEmail;

  @JsonProperty("action")
  private final String action;

  @JsonProperty("status")
  private final String status;

  @JsonCreator
  public Invite(
      @JsonProperty("link") String link,
      @JsonProperty("document_name") String documentName,
      @JsonProperty("inviter_email") String inviterEmail,
      @JsonProperty("action") String action,
      @JsonProperty("status") String status) {
    this.link = link;
    this.documentName = documentName;
    this.inviterEmail = inviterEmail;
    this.action = action;
    this.status = status;
  }

  public String getLink() {
    return this.link;
  }

  public String getDocumentName() {
    return this.documentName;
  }

  public String getInviterEmail() {
    return this.inviterEmail;
  }

  public String getAction() {
    return this.action;
  }

  public String getStatus() {
    return this.status;
  }

  @NotNull
  @Override
  public Map<String, Object> toMap() {
    Map<String, Object> map = new LinkedHashMap<>();
    map.put("link", this.getLink());
    map.put("document_name", this.getDocumentName());
    map.put("inviter_email", this.getInviterEmail());
    map.put("action", this.getAction());
    map.put("status", this.getStatus());
    return map;
  }

  @NotNull
  @Contract("_ -> new")
  public static Invite fromMap(@NotNull Map<String, Object> data) {
    return new Invite(
        (String) data.get("link"),
        (String) data.get("document_name"),
        (String) data.get("inviter_email"),
        (String) data.get("action"),
        (String) data.get("status"));
  }
}
