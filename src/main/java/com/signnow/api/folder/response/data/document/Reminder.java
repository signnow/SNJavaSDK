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

/**
 * This class represents a Reminder in the signNow API.
 */
public final class Reminder extends ApiData {

  /**
   * The time before the event when the reminder should be sent.
   */
  @JsonProperty("reminder_before")
  private final int reminderBefore;

  /**
   * The time after the event when the reminder should be sent.
   */
  @JsonProperty("remind_after")
  private final int remindAfter;

  /**
   * The frequency of the reminder.
   */
  @JsonProperty("remind_repeat")
  private final int remindRepeat;

  /**
   * Constructs a new Reminder with the specified reminderBefore, remindAfter, and remindRepeat.
   *
   * @param reminderBefore the time before the event when the reminder should be sent
   * @param remindAfter the time after the event when the reminder should be sent
   * @param remindRepeat the frequency of the reminder
   */
  @JsonCreator
  public Reminder(
      @JsonProperty("reminder_before") int reminderBefore,
      @JsonProperty("remind_after") int remindAfter,
      @JsonProperty("remind_repeat") int remindRepeat) {
    this.reminderBefore = reminderBefore;
    this.remindAfter = remindAfter;
    this.remindRepeat = remindRepeat;
  }

  /**
   * Returns the time before the event when the reminder should be sent.
   *
   * @return the reminderBefore
   */
  public int getReminderBefore() {
    return this.reminderBefore;
  }

  /**
   * Returns the time after the event when the reminder should be sent.
   *
   * @return the remindAfter
   */
  public int getRemindAfter() {
    return this.remindAfter;
  }

  /**
   * Returns the frequency of the reminder.
   *
   * @return the remindRepeat
   */
  public int getRemindRepeat() {
    return this.remindRepeat;
  }

  /**
   * Converts this Reminder to a Map.
   *
   * @return a Map representing this Reminder
   */
  @NotNull
  @Override
  public Map<String, Object> toMap() {
    Map<String, Object> map = new LinkedHashMap<>();
    map.put("reminder_before", this.getReminderBefore());
    map.put("remind_after", this.getRemindAfter());
    map.put("remind_repeat", this.getRemindRepeat());
    return map;
  }

  /**
   * Creates a new Reminder from the specified Map.
   *
   * @param data a Map containing the data to create the Reminder from
   * @return a new Reminder created from the specified Map
   */
  @NotNull
  @Contract("_ -> new")
  public static Reminder fromMap(@NotNull Map<String, Object> data) {
    return new Reminder(
        (int) data.getOrDefault("reminder_before", 0),
        (int) data.getOrDefault("remind_after", 0),
        (int) data.getOrDefault("remind_repeat", 0));
  }
}