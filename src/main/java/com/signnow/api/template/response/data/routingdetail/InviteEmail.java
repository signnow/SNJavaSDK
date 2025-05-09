/*
 * This file is a part of signNow SDK API client.
 *
 * (с) Copyright © 2011-present airSlate Inc. (https://www.signnow.com)
 *
 * For more details on copyright, see LICENSE.md file
 * that was distributed with this source code.
 */

package com.signnow.api.template.response.data.routingdetail;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.signnow.core.data.ApiData;
import com.signnow.core.util.Cast;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * Represents an invitation email with details such as email, subject, message, expiration days,
 * sign actions, and reminder.
 */
public final class InviteEmail extends ApiData {

  /**
   * Email address of the recipient.
   */
  @JsonProperty("email")
  private final String email;

  /**
   * Subject line of the message or notification.
   */
  @JsonProperty("subject")
  private final String subject;

  /**
   * Body text of the message or custom note.
   */
  @JsonProperty("message")
  private final String message;

  /**
   * Number of days before the document expires.
   */
  @JsonProperty("expiration_days")
  private final int expirationDays;

  /**
   * Indicates whether the document has sign actions.
   */
  @JsonProperty("has_sign_actions")
  private final boolean hasSignActions;

  /**
   * Reminder settings for the document or action.
   */
  @JsonProperty("reminder")
  private final Reminder reminder;

  /**
   * Constructs an InviteEmail instance with the specified details.
   *
   * @param email the email address
   * @param subject the subject of the email
   * @param message the message content
   * @param expirationDays the number of days until expiration
   * @param hasSignActions whether the email has sign actions
   * @param reminder the reminder details, can be null
   */
  @JsonCreator
  public InviteEmail(
      @JsonProperty("email") String email,
      @JsonProperty("subject") String subject,
      @JsonProperty("message") String message,
      @JsonProperty("expiration_days") int expirationDays,
      @JsonProperty("has_sign_actions") boolean hasSignActions,
      @JsonProperty("reminder") @Nullable Reminder reminder) {
    this.email = email;
    this.subject = subject;
    this.message = message;
    this.expirationDays = expirationDays;
    this.hasSignActions = hasSignActions;
    this.reminder = reminder;
  }

  /**
   * Gets the email address.
   *
   * @return the email address
   */
  public String getEmail() {
    return this.email;
  }

  /**
   * Gets the subject of the email.
   *
   * @return the subject
   */
  public String getSubject() {
    return this.subject;
  }

  /**
   * Gets the message content.
   *
   * @return the message
   */
  public String getMessage() {
    return this.message;
  }

  /**
   * Gets the reminder details.
   *
   * @return the reminder, can be null
   */
  @Nullable
  public Reminder getReminder() {
    return this.reminder;
  }

  /**
   * Gets the number of days until expiration.
   *
   * @return the expiration days
   */
  public int getExpirationDays() {
    return this.expirationDays;
  }

  /**
   * Checks if the email has sign actions.
   *
   * @return true if it has sign actions, false otherwise
   */
  public boolean hasSignActions() {
    return this.hasSignActions;
  }

  /**
   * Converts the invite email details to a map representation.
   *
   * @return a map containing the invite email details
   */
  @NotNull
  public Map<String, Object> toMap() {
    Map<String, Object> map = new LinkedHashMap<>();
    map.put("email", this.getEmail());
    map.put("subject", this.getSubject());
    map.put("message", this.getMessage());
    map.put("reminder", reminder != null ? reminder.toMap() : null);
    map.put("expiration_days", this.getExpirationDays());
    map.put("has_sign_actions", this.hasSignActions());
    return map;
  }

  /**
   * Creates an InviteEmail instance from a map representation.
   *
   * @param data the map containing invite email details
   * @return an InviteEmail instance
   */
  @NotNull
  public static InviteEmail fromMap(@NotNull Map<String, Object> data) {
    return new InviteEmail(
        (String) data.get("email"),
        (String) data.get("subject"),
        (String) data.get("message"),
        (int) data.get("expiration_days"),
        (boolean) data.get("has_sign_actions"),
        data.containsKey("reminder")
            ? Reminder.fromMap(Cast.safeToMap(data.get("reminder"), String.class, Integer.class))
            : null);
  }
}
