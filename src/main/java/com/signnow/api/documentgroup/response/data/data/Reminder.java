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
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.signnow.core.data.ApiData;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

/**
 * Reminder class extends ApiData.
 * It represents the reminder data in the document group response.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public final class Reminder extends ApiData {

  /**
   * The time after which the reminder should be sent.
   */
  @JsonProperty("remind_after")
  private final int remindAfter;

  /**
   * The time before which the reminder should be sent.
   */
  @JsonProperty("remind_before")
  private final int remindBefore;

  /**
   * The frequency of the reminder.
   */
  @JsonProperty("remind_repeat")
  private final int remindRepeat;

  /**
   * Constructor for Reminder class.
   *
   * @param remindAfter  The time after which the reminder should be sent.
   * @param remindBefore The time before which the reminder should be sent.
   * @param remindRepeat The frequency of the reminder.
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
   * Getter for remindAfter.
   *
   * @return The time after which the reminder should be sent.
   */
  public int getRemindAfter() {
    return this.remindAfter;
  }

  /**
   * Getter for remindBefore.
   *
   * @return The time before which the reminder should be sent.
   */
  public int getRemindBefore() {
    return this.remindBefore;
  }

  /**
   * Getter for remindRepeat.
   *
   * @return The frequency of the reminder.
   */
  public int getRemindRepeat() {
    return this.remindRepeat;
  }

  /**
   * Converts the Reminder object to a Map.
   *
   * @return A map representation of the Reminder object.
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
   * Creates a Reminder object from a Map.
   *
   * @param data The map containing the reminder data.
   * @return A new Reminder object.
   */
  @NotNull
  @Contract("_ -> new")
  public static Reminder fromMap(@NotNull Map<String, Object> data) {
    return new Reminder(
        (int) data.getOrDefault("remind_after", 0),
        (int) data.getOrDefault("remind_before", 0),
        (int) data.getOrDefault("remind_repeat", 0));
  }
}