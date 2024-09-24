/*
 * This file is a part of signNow SDK API client.
 *
 * (с) Copyright © 2011-present airSlate Inc. (https://www.signnow.com)
 *
 * For more details on copyright, see LICENSE.md file
 * that was distributed with this source code.
 */

package com.signnow.api.documentgroup.response.data.data;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.signnow.core.data.ApiData;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

public final class Attribute extends ApiData {

  @JsonProperty("allow_forwarding")
  private final boolean allowForwarding;

  @JsonProperty("show_decline_button")
  private final boolean showDeclineButton;

  @JsonProperty("i_am_recipient")
  private final boolean iAmRecipient;

  @JsonProperty("message")
  private final String message;

  @JsonProperty("subject")
  private final String subject;

  @JsonProperty("expiration_days")
  private final int expirationDays;

  @JsonProperty("reminder")
  private final Reminder reminder;

  @JsonProperty("authentication")
  private final Authentication authentication;

  @JsonCreator
  public Attribute(
      @JsonProperty("allow_forwarding") boolean allowForwarding,
      @JsonProperty("show_decline_button") boolean showDeclineButton,
      @JsonProperty("i_am_recipient") boolean iAmRecipient,
      @JsonProperty("message") String message,
      @JsonProperty("subject") String subject,
      @JsonProperty("expiration_days") int expirationDays,
      @JsonProperty("reminder") Reminder reminder,
      @JsonProperty("authentication") Authentication authentication) {
    this.allowForwarding = allowForwarding;
    this.showDeclineButton = showDeclineButton;
    this.iAmRecipient = iAmRecipient;
    this.message = message;
    this.subject = subject;
    this.expirationDays = expirationDays;
    this.reminder = reminder;
    this.authentication = authentication;
  }

  public boolean isAllowForwarding() {
    return this.allowForwarding;
  }

  public boolean isShowDeclineButton() {
    return this.showDeclineButton;
  }

  public boolean isIAmRecipient() {
    return this.iAmRecipient;
  }

  public String getMessage() {
    return this.message;
  }

  public String getSubject() {
    return this.subject;
  }

  public int getExpirationDays() {
    return this.expirationDays;
  }

  public Reminder getReminder() {
    return this.reminder;
  }

  public Authentication getAuthentication() {
    return this.authentication;
  }

  @NotNull
  @Override
  public Map<String, Object> toMap() {
    Map<String, Object> map = new LinkedHashMap<>();
    map.put("allow_forwarding", this.isAllowForwarding());
    map.put("show_decline_button", this.isShowDeclineButton());
    map.put("i_am_recipient", this.isIAmRecipient());
    map.put("message", this.getMessage());
    map.put("subject", this.getSubject());
    map.put("expiration_days", this.getExpirationDays());
    map.put("reminder", this.getReminder());
    map.put("authentication", this.getAuthentication());
    return map;
  }

  @NotNull
  @Contract("_ -> new")
  public static Attribute fromMap(@NotNull Map<String, Object> data) {
    return new Attribute(
        (boolean) data.getOrDefault("allow_forwarding", false),
        (boolean) data.getOrDefault("show_decline_button", false),
        (boolean) data.getOrDefault("i_am_recipient", false),
        (String) data.getOrDefault("message", ""),
        (String) data.getOrDefault("subject", ""),
        (int) data.getOrDefault("expiration_days", 0),
        data.containsKey("reminder")
            ? Reminder.fromMap((Map<String, Object>) data.get("reminder"))
            : null,
        data.containsKey("authentication")
            ? Authentication.fromMap((Map<String, Object>) data.get("authentication"))
            : null);
  }
}
