/*
 * This file is a part of signNow SDK API client.
 *
 * (с) Copyright © 2011-present airSlate Inc. (https://www.signnow.com)
 *
 * For more details on copyright, see LICENSE.md file
 * that was distributed with this source code.
 */

package com.signnow.api.documentgroup.request.data;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.signnow.core.data.ApiData;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

/**
 * Represents a general reminder with specific time intervals for the document group request.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public final class GeneralReminder extends ApiData {

  @JsonProperty("remind_after")
  private final int remindAfter;

  @JsonProperty("remind_before")
  private final int remindBefore;

  @JsonProperty("remind_repeat")
  private final int remindRepeat;

  /**
   * Constructs a new GeneralReminder instance.
   *
   * @param remindAfter  the time after which to remind
   * @param remindBefore the time before which to remind
   * @param remindRepeat the repeat interval for reminders
   */
  @JsonCreator
  public GeneralReminder(
      @JsonProperty("remind_after") int remindAfter,
      @JsonProperty("remind_before") int remindBefore,
      @JsonProperty("remind_repeat") int remindRepeat) {
    this.remindAfter = remindAfter;
    this.remindBefore = remindBefore;
    this.remindRepeat = remindRepeat;
  }

  /**
   * Gets the time after which to remind.
   *
   * @return the remind after time
   */
  public int getRemindAfter() {
    return this.remindAfter;
  }

  /**
   * Gets the time before which to remind.
   *
   * @return the remind before time
   */
  public int getRemindBefore() {
    return this.remindBefore;
  }

  /**
   * Gets the repeat interval for reminders.
   *
   * @return the remind repeat interval
   */
  public int getRemindRepeat() {
    return this.remindRepeat;
  }

  /**
   * Converts the general reminder data to a map.
   *
   * @return a map representation of the general reminder data
   */
  @NotNull
  @Override
  public Map<String, Object> toMap() {
    Map<String, Object> map = new LinkedHashMap<>();
    map.put("remind_after", this.getRemindAfter());
    map.put("remind_before", this.getRemindBefore());
    map.put("remind_repeat", this.getRemindRepeat());
    return map;
  }

  /**
   * Creates a GeneralReminder instance from a map.
   *
   * @param data the map containing general reminder data
   * @return a new GeneralReminder instance
   */
  @NotNull
  @Contract("_ -> new")
  public static GeneralReminder fromMap(@NotNull Map<String, Object> data) {
    return new GeneralReminder(
        (int) data.getOrDefault("remind_after", 0),
        (int) data.getOrDefault("remind_before", 0),
        (int) data.getOrDefault("remind_repeat", 0));
  }
}
