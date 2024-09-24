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

public final class Reminder extends ApiData {

  @JsonProperty("remind_after")
  private final int remindAfter;

  @JsonProperty("remind_before")
  private final int remindBefore;

  @JsonProperty("remind_repeat")
  private final int remindRepeat;

  @JsonCreator
  public Reminder(
      @JsonProperty("remind_after") int remindAfter,
      @JsonProperty("remind_before") int remindBefore,
      @JsonProperty("remind_repeat") int remindRepeat) {
    this.remindAfter = remindAfter;
    this.remindBefore = remindBefore;
    this.remindRepeat = remindRepeat;
  }

  public int getRemindAfter() {
    return this.remindAfter;
  }

  public int getRemindBefore() {
    return this.remindBefore;
  }

  public int getRemindRepeat() {
    return this.remindRepeat;
  }

  @NotNull
  @Override
  public Map<String, Object> toMap() {
    Map<String, Object> map = new LinkedHashMap<>();
    map.put("remind_after", this.getRemindAfter());
    map.put("remind_before", this.getRemindBefore());
    map.put("remind_repeat", this.getRemindRepeat());
    return map;
  }

  @NotNull
  @Contract("_ -> new")
  public static Reminder fromMap(@NotNull Map<String, Object> data) {
    return new Reminder(
        (int) data.getOrDefault("remind_after", 0),
        (int) data.getOrDefault("remind_before", 0),
        (int) data.getOrDefault("remind_repeat", 0));
  }
}
