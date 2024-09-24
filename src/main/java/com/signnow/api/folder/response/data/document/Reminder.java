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

public final class Reminder extends ApiData {

  @JsonProperty("reminder_before")
  private final int reminderBefore;

  @JsonProperty("remind_after")
  private final int remindAfter;

  @JsonProperty("remind_repeat")
  private final int remindRepeat;

  @JsonCreator
  public Reminder(
      @JsonProperty("reminder_before") int reminderBefore,
      @JsonProperty("remind_after") int remindAfter,
      @JsonProperty("remind_repeat") int remindRepeat) {
    this.reminderBefore = reminderBefore;
    this.remindAfter = remindAfter;
    this.remindRepeat = remindRepeat;
  }

  public int getReminderBefore() {
    return this.reminderBefore;
  }

  public int getRemindAfter() {
    return this.remindAfter;
  }

  public int getRemindRepeat() {
    return this.remindRepeat;
  }

  @NotNull
  @Override
  public Map<String, Object> toMap() {
    Map<String, Object> map = new LinkedHashMap<>();
    map.put("reminder_before", this.getReminderBefore());
    map.put("remind_after", this.getRemindAfter());
    map.put("remind_repeat", this.getRemindRepeat());
    return map;
  }

  @NotNull
  @Contract("_ -> new")
  public static Reminder fromMap(@NotNull Map<String, Object> data) {
    return new Reminder(
        (int) data.getOrDefault("reminder_before", 0),
        (int) data.getOrDefault("remind_after", 0),
        (int) data.getOrDefault("remind_repeat", 0));
  }
}
