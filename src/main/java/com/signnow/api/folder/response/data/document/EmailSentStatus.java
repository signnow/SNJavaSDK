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

public final class EmailSentStatus extends ApiData {

  @JsonProperty("status")
  private final String status;

  @JsonProperty("created_at")
  private final int createdAt;

  @JsonProperty("last_reaction_at")
  private final int lastReactionAt;

  @JsonCreator
  public EmailSentStatus(
      @JsonProperty("status") String status,
      @JsonProperty("created_at") int createdAt,
      @JsonProperty("last_reaction_at") int lastReactionAt) {
    this.status = status;
    this.createdAt = createdAt;
    this.lastReactionAt = lastReactionAt;
  }

  public String getStatus() {
    return this.status;
  }

  public int getCreatedAt() {
    return this.createdAt;
  }

  public int getLastReactionAt() {
    return this.lastReactionAt;
  }

  @NotNull
  @Override
  public Map<String, Object> toMap() {
    Map<String, Object> map = new LinkedHashMap<>();
    map.put("status", this.getStatus());
    map.put("created_at", this.getCreatedAt());
    map.put("last_reaction_at", this.getLastReactionAt());
    return map;
  }

  @NotNull
  @Contract("_ -> new")
  public static EmailSentStatus fromMap(@NotNull Map<String, Object> data) {
    return new EmailSentStatus(
        (String) data.get("status"),
        (Integer) data.get("created_at"),
        (Integer) data.get("last_reaction_at"));
  }
}
