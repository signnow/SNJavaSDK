/*
 * This file is a part of signNow SDK API client.
 *
 * (с) Copyright © 2011-present airSlate Inc. (https://www.signnow.com)
 *
 * For more details on copyright, see LICENSE.md file
 * that was distributed with this source code.
 */

package com.signnow.api.document.response.data.viewerfieldinvite;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.signnow.core.data.ApiData;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

/**
 * This class represents the email status.
 */
public final class EmailStatus extends ApiData {

  /**
   * The status of the email.
   */
  @JsonProperty("status")
  private final String status;

  /**
   * The time when the email was created.
   */
  @JsonProperty("created_at")
  private final int createdAt;

  /**
   * The time of the last reaction to the email.
   */
  @JsonProperty("last_reaction_at")
  private final int lastReactionAt;

  /**
   * Constructs an EmailStatus object with the specified status, creation time, and last reaction time.
   *
   * @param status the status of the email
   * @param createdAt the time when the email was created
   * @param lastReactionAt the time of the last reaction to the email
   */
  @JsonCreator
  public EmailStatus(
      @JsonProperty("status") String status,
      @JsonProperty("created_at") int createdAt,
      @JsonProperty("last_reaction_at") int lastReactionAt) {
    this.status = status;
    this.createdAt = createdAt;
    this.lastReactionAt = lastReactionAt;
  }

  /**
   * Returns the status of the email.
   *
   * @return the status of the email
   */
  public String getStatus() {
    return this.status;
  }

  /**
   * Returns the time when the email was created.
   *
   * @return the time when the email was created
   */
  public int getCreatedAt() {
    return this.createdAt;
  }

  /**
   * Returns the time of the last reaction to the email.
   *
   * @return the time of the last reaction to the email
   */
  public int getLastReactionAt() {
    return this.lastReactionAt;
  }

  /**
   * Returns a map representation of the EmailStatus object.
   *
   * @return a map representation of the EmailStatus object
   */
  @NotNull
  @Override
  public Map<String, Object> toMap() {
    Map<String, Object> map = new LinkedHashMap<>();
    map.put("status", this.getStatus());
    map.put("created_at", this.getCreatedAt());
    map.put("last_reaction_at", this.getLastReactionAt());
    return map;
  }

  /**
   * Returns an EmailStatus object created from the specified map.
   *
   * @param data the map from which to create the EmailStatus object
   * @return an EmailStatus object created from the specified map
   */
  @NotNull
  @Contract("_ -> new")
  public static EmailStatus fromMap(@NotNull Map<String, Object> data) {
    return new EmailStatus(
        (String) data.get("status"),
        (Integer) data.get("created_at"),
        (Integer) data.get("last_reaction_at"));
  }
}