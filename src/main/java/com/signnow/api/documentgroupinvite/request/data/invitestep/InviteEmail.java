/*
 * This file is a part of signNow SDK API client.
 *
 * (с) Copyright © 2011-present airSlate Inc. (https://www.signnow.com)
 *
 * For more details on copyright, see LICENSE.md file
 * that was distributed with this source code.
 */

package com.signnow.api.documentgroupinvite.request.data.invitestep;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.signnow.core.data.ApiData;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

/**
 * This class represents an invite email.
 */
public final class InviteEmail extends ApiData {

  /**
   * The email address to which the invite is sent.
   */
  @JsonProperty("email")
  private final String email;

  /**
   * The subject of the invite email.
   */
  @JsonProperty("subject")
  private final String subject;

  /**
   * The message content of the invite email.
   */
  @JsonProperty("message")
  private final String message;

  /**
   * The group of emails to which the invite is sent.
   */
  @JsonProperty("email_group")
  private final EmailGroup emailGroup;

  /**
   * The number of days until the invite expires.
   */
  @JsonProperty("expiration_days")
  private final int expirationDays;

  /**
   * The reminder setting for the invite.
   */
  @JsonProperty("reminder")
  private final int reminder;

  /**
   * Constructs an InviteEmail object with all properties.
   *
   * @param email The email address to which the invite is sent.
   * @param subject The subject of the invite email.
   * @param message The message content of the invite email.
   * @param emailGroup The group of emails to which the invite is sent.
   * @param expirationDays The number of days until the invite expires.
   * @param reminder The reminder setting for the invite.
   */
  @JsonCreator
  public InviteEmail(
      @JsonProperty("email") String email,
      @JsonProperty("subject") String subject,
      @JsonProperty("message") String message,
      @JsonProperty("email_group") EmailGroup emailGroup,
      @JsonProperty("expiration_days") int expirationDays,
      @JsonProperty("reminder") int reminder) {
    this.email = email;
    this.subject = subject;
    this.message = message;
    this.emailGroup = emailGroup;
    this.expirationDays = expirationDays;
    this.reminder = reminder;
  }

  /**
   * Constructs an InviteEmail object with only email, subject, and message properties.
   *
   * @param email The email address to which the invite is sent.
   * @param subject The subject of the invite email.
   * @param message The message content of the invite email.
   */
  public InviteEmail(
      @JsonProperty("email") String email,
      @JsonProperty("subject") String subject,
      @JsonProperty("message") String message) {
    this.email = email;
    this.subject = subject;
    this.message = message;
    this.emailGroup = null;
    this.expirationDays = 0;
    this.reminder = 0;
  }

  /**
   * Returns the email address to which the invite is sent.
   *
   * @return The email address.
   */
  public String getEmail() {
    return this.email;
  }

  /**
   * Returns the group of emails to which the invite is sent.
   *
   * @return The email group.
   */
  public EmailGroup getEmailGroup() {
    return this.emailGroup;
  }

  /**
   * Returns the subject of the invite email.
   *
   * @return The subject.
   */
  public String getSubject() {
    return this.subject;
  }

  /**
   * Returns the message content of the invite email.
   *
   * @return The message content.
   */
  public String getMessage() {
    return this.message;
  }

  /**
   * Returns the number of days until the invite expires.
   *
   * @return The number of days until expiration.
   */
  public int getExpirationDays() {
    return this.expirationDays;
  }

  /**
   * Returns the reminder setting for the invite.
   *
   * @return The reminder setting.
   */
  public int getReminder() {
    return this.reminder;
  }

  /**
   * Converts this InviteEmail object to a Map.
   *
   * @return A Map representation of this InviteEmail object.
   */
  @NotNull
  @Override
  public Map<String, Object> toMap() {
    Map<String, Object> map = new LinkedHashMap<>();
    map.put("email", this.getEmail());
    map.put("email_group", this.getEmailGroup());
    map.put("subject", this.getSubject());
    map.put("message", this.getMessage());
    map.put("expiration_days", this.getExpirationDays());
    map.put("reminder", this.getReminder());
    return map;
  }

  /**
   * Creates an InviteEmail object from a Map.
   *
   * @param data A Map containing the data for the InviteEmail object.
   * @return A new InviteEmail object.
   */
  @NotNull
  @Contract("_ -> new")
  public static InviteEmail fromMap(@NotNull Map<String, Object> data) {
    return new InviteEmail(
        (String) data.get("email"),
        (String) data.get("subject"),
        (String) data.get("message"),
        (EmailGroup) data.get("email_group"),
        (int) data.getOrDefault("expiration_days", 0),
        (int) data.getOrDefault("reminder", 0));
  }
}
