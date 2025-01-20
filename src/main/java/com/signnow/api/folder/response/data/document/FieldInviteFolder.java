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

/**
 * This class represents a FieldInviteFolder object.
 */
public final class FieldInviteFolder extends ApiData {

  /**
   * The id of the FieldInviteFolder.
   */
  @JsonProperty("id")
  private final String id;

  /**
   * The status of the FieldInviteFolder.
   */
  @JsonProperty("status")
  private final String status;

  /**
   * The updated timestamp of the FieldInviteFolder.
   */
  @JsonProperty("updated")
  private final int updated;

  /**
   * The email associated with the FieldInviteFolder.
   */
  @JsonProperty("email")
  private final String email;

  /**
   * The role associated with the FieldInviteFolder.
   */
  @JsonProperty("role")
  private final String role;

  /**
   * The email sent statuses of the FieldInviteFolder.
   */
  @JsonProperty("email_sent_statuses")
  private final EmailSentStatusCollection emailSentStatuses;

  /**
   * Constructor for FieldInviteFolder.
   *
   * @param id The id of the FieldInviteFolder.
   * @param status The status of the FieldInviteFolder.
   * @param updated The updated timestamp of the FieldInviteFolder.
   * @param email The email associated with the FieldInviteFolder.
   * @param role The role associated with the FieldInviteFolder.
   * @param emailSentStatuses The email sent statuses of the FieldInviteFolder.
   */
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

  /**
   * Returns the id of the FieldInviteFolder.
   *
   * @return The id of the FieldInviteFolder.
   */
  public String getId() {
    return this.id;
  }

  /**
   * Returns the status of the FieldInviteFolder.
   *
   * @return The status of the FieldInviteFolder.
   */
  public String getStatus() {
    return this.status;
  }

  /**
   * Returns the updated timestamp of the FieldInviteFolder.
   *
   * @return The updated timestamp of the FieldInviteFolder.
   */
  public int getUpdated() {
    return this.updated;
  }

  /**
   * Returns the email associated with the FieldInviteFolder.
   *
   * @return The email associated with the FieldInviteFolder.
   */
  public String getEmail() {
    return this.email;
  }

  /**
   * Returns the role associated with the FieldInviteFolder.
   *
   * @return The role associated with the FieldInviteFolder.
   */
  public String getRole() {
    return this.role;
  }

  /**
   * Returns the email sent statuses of the FieldInviteFolder.
   *
   * @return The email sent statuses of the FieldInviteFolder.
   */
  public EmailSentStatusCollection getEmailSentStatuses() {
    return this.emailSentStatuses;
  }

  /**
   * Converts the FieldInviteFolder object to a Map.
   *
   * @return A Map representation of the FieldInviteFolder object.
   */
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

  /**
   * Creates a FieldInviteFolder object from a Map.
   *
   * @param data The Map to convert to a FieldInviteFolder object.
   * @return A new FieldInviteFolder object.
   */
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