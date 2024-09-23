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

public final class InviteEmail extends ApiData {

  @JsonProperty("email")
  private final String email;

  @JsonProperty("reminder")
  private final int reminder;

  @JsonProperty("expiration_days")
  private final int expirationDays;

  @JsonCreator
  public InviteEmail(
      @JsonProperty("email") String email,
      @JsonProperty("reminder") int reminder,
      @JsonProperty("expiration_days") int expirationDays) {
    this.email = email;
    this.reminder = reminder;
    this.expirationDays = expirationDays;
  }

  public String getEmail() {
    return this.email;
  }

  public int getReminder() {
    return this.reminder;
  }

  public int getExpirationDays() {
    return this.expirationDays;
  }

  @NotNull
  @Override
  public Map<String, Object> toMap() {
    Map<String, Object> map = new LinkedHashMap<>();
    map.put("email", this.getEmail());
    map.put("reminder", this.getReminder());
    map.put("expiration_days", this.getExpirationDays());
    return map;
  }

  @NotNull
  @Contract("_ -> new")
  public static InviteEmail fromMap(@NotNull Map<String, Object> data) {
    return new InviteEmail(
        (String) data.getOrDefault("email", ""),
        (int) data.getOrDefault("reminder", 0),
        (int) data.getOrDefault("expiration_days", 0));
  }
}
