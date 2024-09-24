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
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

public final class FieldInviteFolder extends ApiData {

  @JsonProperty("id")
  private final String id;

  @JsonProperty("status")
  private final String status;

  @JsonProperty("updated")
  private final int updated;

  @JsonProperty("email")
  private final String email;

  @JsonProperty("role")
  private final String role;

  @JsonProperty("email_sent_statuses")
  private final EmailSentStatusCollection emailSentStatuses;

  @JsonCreator
  public FieldInviteFolder(
      @JsonProperty("id") String id,
      @JsonProperty("status") String status,
      @JsonProperty("updated") int updated,
      @JsonProperty("email") String email,
      @JsonProperty("role") String role,
      @JsonProperty("email_sent_statuses") EmailSentStatusCollection emailSentStatuses) {
    this.id = id;
    this.status = status;
    this.updated = updated;
    this.email = email;
    this.role = role;
    this.emailSentStatuses = emailSentStatuses;
  }

  public String getId() {
    return this.id;
  }

  public String getStatus() {
    return this.status;
  }

  public int getUpdated() {
    return this.updated;
  }

  public String getEmail() {
    return this.email;
  }

  public String getRole() {
    return this.role;
  }

  public EmailSentStatusCollection getEmailSentStatuses() {
    return this.emailSentStatuses;
  }

  @NotNull
  @Override
  public Map<String, Object> toMap() {
    Map<String, Object> map = new LinkedHashMap<>();
    map.put("id", this.getId());
    map.put("status", this.getStatus());
    map.put("updated", this.getUpdated());
    map.put("email", this.getEmail());
    map.put("role", this.getRole());
    map.put("email_sent_statuses", this.getEmailSentStatuses());
    return map;
  }

  @NotNull
  @Contract("_ -> new")
  public static FieldInviteFolder fromMap(@NotNull Map<String, Object> data) {
    return new FieldInviteFolder(
        (String) data.get("id"),
        (String) data.get("status"),
        (Integer) data.get("updated"),
        (String) data.get("email"),
        (String) data.get("role"),
        (EmailSentStatusCollection) data.get("email_sent_statuses"));
  }
}
