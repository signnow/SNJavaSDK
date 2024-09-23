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

public final class InviteEmail extends ApiData {

  @JsonProperty("email")
  private final String email;

  @JsonProperty("subject")
  private final String subject;

  @JsonProperty("message")
  private final String message;

  @JsonProperty("email_group")
  private final EmailGroup emailGroup;

  @JsonProperty("expiration_days")
  private final int expirationDays;

  @JsonProperty("reminder")
  private final int reminder;

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

  public String getEmail() {
    return this.email;
  }

  public EmailGroup getEmailGroup() {
    return this.emailGroup;
  }

  public String getSubject() {
    return this.subject;
  }

  public String getMessage() {
    return this.message;
  }

  public int getExpirationDays() {
    return this.expirationDays;
  }

  public int getReminder() {
    return this.reminder;
  }

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
