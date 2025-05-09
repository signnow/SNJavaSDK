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
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

/** Represents a reminder with specific timing details. */
public final class Reminder extends ApiData {

  /**
   * Number of days after the invite, a recipient gets a reminder email.
   */
  @JsonProperty("remind_after")
  private final int remindAfter;

  /**
   * Number of days before the invite, a recipient gets a reminder email.
   */
  @JsonProperty("remind_before")
  private final int remindBefore;

  /**
   * Number of days recipient gets repetitive a reminder email after the invite is sent.
   */
  @JsonProperty("remind_repeat")
  private final int remindRepeat;

  /**
   * Constructs a Reminder with specified timing details.
   *
   * @param remindAfter the time after which to remind
   * @param remindBefore the time before which to remind
   * @param remindRepeat the repeat interval for reminders
   */
  @JsonCreator
  public Reminder(
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
   * @return the reminder after time
   */
  public int getRemindAfter() {
    return remindAfter;
  }

  /**
   * Gets the time before which to remind.
   *
   * @return the reminder before time
   */
  public int getRemindBefore() {
    return remindBefore;
  }

  /**
   * Gets the repeat interval for reminders.
   *
   * @return the reminder repeat interval
   */
  public int getRemindRepeat() {
    return remindRepeat;
  }

  /**
   * Converts the reminder details to a map.
   *
   * @return a map representation of the reminder
   */
  @NotNull
  public Map<String, Object> toMap() {
    Map<String, Object> map = new LinkedHashMap<>();
    map.put("remind_after", getRemindAfter());
    map.put("remind_before", getRemindBefore());
    map.put("remind_repeat", getRemindRepeat());
    return map;
  }

  /**
   * Creates a Reminder from a map of data.
   *
   * @param data the map containing reminder details
   * @return a new Reminder instance
   */
  @NotNull
  @Contract("_ -> new")
  public static Reminder fromMap(@NotNull Map<String, Integer> data) {
    return new Reminder(
        data.getOrDefault("remind_after", 0),
        data.getOrDefault("remind_before", 0),
        data.getOrDefault("remind_repeat", 0));
  }
}
