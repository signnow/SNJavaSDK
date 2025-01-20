/*
 * This file is a part of signNow SDK API client.
 *
 * (с) Copyright © 2011-present airSlate Inc. (https://www.signnow.com)
 *
 * For more details on copyright, see LICENSE.md file
 * that was distributed with this source code.
 */

package com.signnow.api.document.response.data;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.signnow.core.data.ApiData;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

/**
 * This class represents the share information of a document.
 */
public final class ShareInfo extends ApiData {

  /**
   * A boolean value indicating whether the document is shared with the team.
   */
  @JsonProperty("is_team_shared")
  private final boolean isTeamShared;

  /**
   * Constructs a new ShareInfo object with the specified share status.
   *
   * @param isTeamShared a boolean value indicating whether the document is shared with the team.
   */
  @JsonCreator
  public ShareInfo(@JsonProperty("is_team_shared") boolean isTeamShared) {
    this.isTeamShared = isTeamShared;
  }

  /**
   * Returns the share status of the document.
   *
   * @return a boolean value indicating whether the document is shared with the team.
   */
  public boolean isTeamShared() {
    return this.isTeamShared;
  }

  /**
   * Converts this ShareInfo object to a Map.
   *
   * @return a Map containing the share status of the document.
   */
  @NotNull
  @Override
  public Map<String, Object> toMap() {
    Map<String, Object> map = new LinkedHashMap<>();
    map.put("is_team_shared", this.isTeamShared());
    return map;
  }

  /**
   * Creates a new ShareInfo object from the specified Map.
   *
   * @param data a Map containing the share status of the document.
   * @return a new ShareInfo object containing the share status from the specified Map.
   */
  @NotNull
  @Contract("_ -> new")
  public static ShareInfo fromMap(@NotNull Map<String, Object> data) {
    return new ShareInfo((boolean) data.getOrDefault("is_team_shared", false));
  }
}