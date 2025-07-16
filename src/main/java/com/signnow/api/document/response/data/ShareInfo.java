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
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.signnow.core.data.ApiData;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

/** This class represents the share information of a document. */
@JsonIgnoreProperties(ignoreUnknown = true)
public final class ShareInfo extends ApiData {

  /** A boolean value indicating whether the document is shared with the team. */
  @JsonProperty("is_team_shared")
  private final boolean isTeamShared;

  /** A string role assigned for a shared document */
  @JsonProperty("role")
  private final String role;

  /** A boolean value indicating whether the document is personally shared with other users. */
  @JsonProperty("is_personally_shared_to_others")
  private final boolean isPersonallySharedToOthers;

  /**
   * Constructs a new ShareInfo object with the specified share status.
   *
   * @param isTeamShared a boolean value indicating whether the document is shared with the team.
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
   * Returns the share status of the document.
   *
   * @return a boolean value indicating whether the document is shared with the team.
   */
  public boolean isTeamShared() {
    return this.isTeamShared;
  }

  /**
   * Returns true if the template has been personally shared with other users (via the Share
   * button). The attribute is visible to the template owner and users with access rights.
   *
   * @return a boolean value indicating whether the document is personally shared with other users.
   */
  public boolean isPersonallySharedToOthers() {
    return isPersonallySharedToOthers;
  }

  /**
   * Returns the shared role, indicating the user's access level for shared document Allowed values
   * are "sender", "viewer", "editor" or "owner"
   *
   * @return a string value specifying shared role
   */
  public String getRole() {
    return role;
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
    map.put("is_personally_shared_to_others", this.isPersonallySharedToOthers());
    map.put("role", this.getRole());
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
    return new ShareInfo(
        (boolean) data.getOrDefault("is_team_shared", false),
        (String) data.getOrDefault("role", ""),
        (boolean) data.getOrDefault("is_personally_shared_to_others", false));
  }
}
