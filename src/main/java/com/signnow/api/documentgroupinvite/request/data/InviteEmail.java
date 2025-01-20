/*
 * This file is a part of signNow SDK API client.
 *
 * (с) Copyright © 2011-present airSlate Inc. (https://www.signnow.com)
 *
 * For more details on copyright, see LICENSE.md file
 * that was distributed with this source code.
 */

package com.signnow.api.documentgroupinvite.request.data;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.signnow.core.data.ApiData;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

/**
 * This class represents an invite email with reminder and expiration days.
 */
public final class InviteEmail extends ApiData {

  /**
   * The email address to which the invite is sent.
   */
  @JsonProperty("email")
  private final String email;

  /**
   * The reminder period for the invite.
   */
  @JsonProperty("reminder")
  private final int reminder;

  /**
   * The number of days before the invite expires.
   */
  @JsonProperty("expiration_days")
  private final int expirationDays;

  /**
   * Constructs an InviteEmail object with the specified email, reminder, and expiration days.
   *
   * @param email the email address to which the invite is sent
   * @param reminder the reminder period for the invite
   * @param expirationDays the number of days before the invite expires
   */
  @JsonCreator
  public InviteEmail(
      @JsonProperty("email") String email,
      @JsonProperty("reminder") int reminder,
      @JsonProperty("expiration_days") int expirationDays) {
    this.email = email;
    this.reminder = reminder;
    this.expirationDays = expirationDays;
  }

  /**
   * Returns the email address to which the invite is sent.
   *
   * @return the email address
   */
  public String getEmail() {
    return this.email;
  }

  /**
   * Returns the reminder period for the invite.
   *
   * @return the reminder period
   */
  public int getReminder() {
    return this.reminder;
  }

  /**
   * Returns the number of days before the invite expires.
   *
   * @return the number of expiration days
   */
  public int getExpirationDays() {
    return this.expirationDays;
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
    map.put("reminder", this.getReminder());
    map.put("expiration_days", this.getExpirationDays());
    return map;
  }

  /**
   * Creates an InviteEmail object from the specified Map.
   *
   * @param data a Map containing the data for the InviteEmail object
   * @return a new InviteEmail object
   */
  @NotNull
  @Contract("_ -> new")
  public static InviteEmail fromMap(@NotNull Map<String, Object> data) {
    return new InviteEmail(
        (String) data.getOrDefault("email", ""),
        (int) data.getOrDefault("reminder", 0),
        (int) data.getOrDefault("expiration_days", 0));
  }
}