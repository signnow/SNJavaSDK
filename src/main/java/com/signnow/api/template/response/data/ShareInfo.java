/*
 * This file is a part of signNow SDK API client.
 *
 * (с) Copyright © 2011-present airSlate Inc. (https://www.signnow.com)
 *
 * For more details on copyright, see LICENSE.md file
 * that was distributed with this source code.
 */

package com.signnow.api.template.response.data;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.LinkedHashMap;
import java.util.Map;

import com.signnow.core.data.ApiData;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

/**
 * Represents the sharing information of a template.
 */
public final class ShareInfo extends ApiData {

  /**
   * Indicates whether the document is shared with a team.
   */
  @JsonProperty("is_team_shared")
  private final boolean isTeamShared;

  /**
   * The role assigned to the user for the document or resource.
   */
  @JsonProperty("role")
  private final String role;

  /**
   * Indicates whether the document is personally shared with others by the user.
   */
  @JsonProperty("is_personally_shared_to_others")
  private final boolean isPersonallySharedToOthers;

  /**
   * Constructs a new ShareInfo instance.
   *
   * @param isTeamShared Indicates if the template is shared with a team.
   * @param role The role associated with the shared template.
   * @param isPersonallySharedToOthers Indicates if the template is personally shared with others.
   */
  @JsonCreator
  public ShareInfo(
      @JsonProperty("is_team_shared") boolean isTeamShared,
      @JsonProperty("role") String role,
      @JsonProperty("is_personally_shared_to_others") boolean isPersonallySharedToOthers) {
    this.isTeamShared = isTeamShared;
    this.role = role;
    this.isPersonallySharedToOthers = isPersonallySharedToOthers;
  }

  /**
   * Checks if the template is shared with a team.
   *
   * @return true if the template is team shared, false otherwise.
   */
  public boolean isTeamShared() {
    return this.isTeamShared;
  }

  /**
   * Gets the role associated with the shared template.
   *
   * @return The role as a string.
   */
  public String getRole() {
    return this.role;
  }

  /**
   * Checks if the template is personally shared with others.
   *
   * @return true if the template is personally shared, false otherwise.
   */
  public boolean isPersonallySharedToOthers() {
    return this.isPersonallySharedToOthers;
  }

  /**
   * Converts the ShareInfo object to a map representation.
   *
   * @return A map containing the share information.
   */
  @NotNull
  public Map<String, Object> toMap() {
    Map<String, Object> map = new LinkedHashMap<>();
    map.put("is_team_shared", this.isTeamShared());
    map.put("role", this.getRole());
    map.put("is_personally_shared_to_others", this.isPersonallySharedToOthers());
    return map;
  }

  /**
   * Creates a ShareInfo instance from a map.
   *
   * @param data The map containing share information.
   * @return A new ShareInfo instance.
   */
  @NotNull
  @Contract("_ -> new")
  public static ShareInfo fromMap(@NotNull Map<String, Object> data) {
    return new ShareInfo(
        (Boolean) data.getOrDefault("is_team_shared", false),
        (String) data.getOrDefault("role", ""),
        (Boolean) data.getOrDefault("is_personally_shared_to_others", false));
  }
}
