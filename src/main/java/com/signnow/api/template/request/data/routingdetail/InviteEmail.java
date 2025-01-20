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

/**
 * This class represents an invitation email.
 */
public final class InviteEmail extends ApiData {

  /**
   * The email address to which the invitation is sent.
   */
  @JsonProperty("email")
  private final String email;

  /**
   * The subject of the invitation email.
   */
  @JsonProperty("subject")
  private final String subject;

  /**
   * The message content of the invitation email.
   */
  @JsonProperty("message")
  private final String message;

  /**
   * The permission to reassign the invitation.
   */
  @JsonProperty("allow_reassign")
  private final String allowReassign;

  /**
   * The number of days before the invitation expires.
   */
  @JsonProperty("expiration_days")
  private final int expirationDays;

  /**
   * The reminder setting for the invitation.
   */
  @JsonProperty("reminder")
  private final int reminder;

  /**
   * Constructs an InviteEmail object with the specified details.
   *
   * @param email the email address to which the invitation is sent
   * @param subject the subject of the invitation email
   * @param message the message content of the invitation email
   * @param allowReassign the permission to reassign the invitation
   * @param expirationDays the number of days before the invitation expires
   * @param reminder the reminder setting for the invitation
   */
  @JsonCreator
  public InviteEmail(
      @JsonProperty("email") String email,
      @JsonProperty("subject") String subject,
      @JsonProperty("message") String message,
      @JsonProperty("allow_reassign") String allowReassign,
      @JsonProperty("expiration_days") int expirationDays,
      @JsonProperty("reminder") int reminder) {
    this.email = email;
    this.subject = subject;
    this.message = message;
    this.allowReassign = allowReassign;
    this.expirationDays = expirationDays;
    this.reminder = reminder;
  }

  /**
   * Returns the email address to which the invitation is sent.
   *
   * @return the email address
   */
  public String getEmail() {
    return this.email;
  }

  /**
   * Returns the subject of the invitation email.
   *
   * @return the subject
   */
  public String getSubject() {
    return this.subject;
  }

  /**
   * Returns the message content of the invitation email.
   *
   * @return the message content
   */
  public String getMessage() {
    return this.message;
  }

  /**
   * Returns the number of days before the invitation expires.
   *
   * @return the number of days
   */
  public int getExpirationDays() {
    return this.expirationDays;
  }

  /**
   * Returns the reminder setting for the invitation.
   *
   * @return the reminder setting
   */
  public int getReminder() {
    return this.reminder;
  }

  /**
   * Returns the permission to reassign the invitation.
   *
   * @return the permission to reassign
   */
  public String getAllowReassign() {
    return this.allowReassign;
  }

  /**
   * Converts this InviteEmail object to a Map.
   *
   * @return a Map representing this InviteEmail object
   */
  @NotNull
  @Override
  public Map<String, Object> toMap() {
    Map<String, Object> map = new LinkedHashMap<>();
    map.put("email", this.getEmail());
    map.put("subject", this.getSubject());
    map.put("message", this.getMessage());
    map.put("expiration_days", this.getExpirationDays());
    map.put("reminder", this.getReminder());
    map.put("allow_reassign", this.getAllowReassign());
    return map;
  }

  /**
   * Creates an InviteEmail object from the specified Map.
   *
   * @param data a Map containing the details of the InviteEmail object
   * @return a new InviteEmail object
   */
  @NotNull
  @Contract("_ -> new")
  public static InviteEmail fromMap(@NotNull Map<String, Object> data) {
    return new InviteEmail(
        (String) data.get("email"),
        (String) data.get("subject"),
        (String) data.get("message"),
        (String) data.get("allow_reassign"),
        (int) data.getOrDefault("expiration_days", 0),
        (int) data.getOrDefault("reminder", 0));
  }
}
