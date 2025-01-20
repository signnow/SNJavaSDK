/*
 * This file is a part of signNow SDK API client.
 *
 * (с) Copyright © 2011-present airSlate Inc. (https://www.signnow.com)
 *
 * For more details on copyright, see LICENSE.md file
 * that was distributed with this source code.
 */

package com.signnow.api.user.response.data.team;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.signnow.core.data.ApiData;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

/**
 * Represents a Team in the signNow API.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public final class Team extends ApiData {

  /**
   * The unique identifier of the team.
   */
  @JsonProperty("id")
  private final String id;

  /**
   * The name of the team.
   */
  @JsonProperty("team")
  private final String team;

  /**
   * The type of the team.
   */
  @JsonProperty("type")
  private final String type;

  /**
   * The creation date of the team.
   */
  @JsonProperty("created_since")
  private final String createdSince;

  /**
   * The role of the team.
   */
  @JsonProperty("role")
  private final String role;

  /**
   * The count of documents in the team.
   */
  @JsonProperty("document_count")
  private final int documentCount;

  /**
   * The collection of admins in the team.
   */
  @JsonProperty("admins")
  private final AdminCollection admins;

  /**
   * The workspace id of the team.
   */
  @JsonProperty("workspace_id")
  private final String workspaceId;

  /**
   * The full name of the team owner.
   */
  @JsonProperty("team_owner_full_name")
  private final String teamOwnerFullName;

  /**
   * Constructs a new Team object.
   *
   * @param id the unique identifier of the team
   * @param team the name of the team
   * @param type the type of the team
   * @param createdSince the creation date of the team
   * @param role the role of the team
   * @param documentCount the count of documents in the team
   * @param admins the collection of admins in the team
   * @param workspaceId the workspace id of the team
   * @param teamOwnerFullName the full name of the team owner
   */
  @JsonCreator
  public Team(
      @JsonProperty("id") String id,
      @JsonProperty("team") String team,
      @JsonProperty("type") String type,
      @JsonProperty("created_since") String createdSince,
      @JsonProperty("role") String role,
      @JsonProperty("document_count") int documentCount,
      @JsonProperty("admins") AdminCollection admins,
      @JsonProperty("workspace_id") String workspaceId,
      @JsonProperty("team_owner_full_name") String teamOwnerFullName) {
    this.id = id;
    this.team = team;
    this.type = type;
    this.createdSince = createdSince;
    this.role = role;
    this.documentCount = documentCount;
    this.admins = admins;
    this.workspaceId = workspaceId;
    this.teamOwnerFullName = teamOwnerFullName;
  }

  /**
   * Returns the unique identifier of the team.
   *
   * @return the id of the team
   */
  public String getId() {
    return this.id;
  }

  /**
   * Returns the name of the team.
   *
   * @return the name of the team
   */
  public String getTeam() {
    return this.team;
  }

  /**
   * Returns the type of the team.
   *
   * @return the type of the team
   */
  public String getType() {
    return this.type;
  }

  /**
   * Returns the creation date of the team.
   *
   * @return the creation date of the team
   */
  public String getCreatedSince() {
    return this.createdSince;
  }

  /**
   * Returns the role of the team.
   *
   * @return the role of the team
   */
  public String getRole() {
    return this.role;
  }

  /**
   * Returns the count of documents in the team.
   *
   * @return the count of documents in the team
   */
  public int getDocumentCount() {
    return this.documentCount;
  }

  /**
   * Returns the workspace id of the team.
   *
   * @return the workspace id of the team
   */
  public String getWorkspaceId() {
    return this.workspaceId;
  }

  /**
   * Returns the collection of admins in the team.
   *
   * @return the collection of admins in the team
   */
  public AdminCollection getAdmins() {
    return this.admins;
  }

  /**
   * Returns the full name of the team owner.
   *
   * @return the full name of the team owner
   */
  public String getTeamOwnerFullName() {
    return teamOwnerFullName;
  }

  /**
   * Converts the Team object to a Map.
   *
   * @return a Map representing the Team object
   */
  @NotNull
  @Override
  public Map<String, Object> toMap() {
    Map<String, Object> map = new LinkedHashMap<>();
    map.put("id", this.getId());
    map.put("team", this.getTeam());
    map.put("type", this.getType());
    map.put("created_since", this.getCreatedSince());
    map.put("role", this.getRole());
    map.put("document_count", this.getDocumentCount());
    map.put("workspace_id", this.getWorkspaceId());
    map.put("admins", this.getAdmins());
    map.put("team_owner_full_name", this.getTeamOwnerFullName());
    return map;
  }

  /**
   * Creates a new Team object from a Map.
   *
   * @param data a Map containing the data for the Team object
   * @return a new Team object
   */
  @NotNull
  @Contract("_ -> new")
  public static Team fromMap(@NotNull Map<String, Object> data) {
    return new Team(
        (String) data.get("id"),
        (String) data.get("team"),
        (String) data.get("type"),
        (String) data.get("created_since"),
        (String) data.get("role"),
        (Integer) data.get("document_count"),
        (AdminCollection) data.get("admins"),
        (String) data.getOrDefault("workspace_id", null),
        (String) data.get("team_owner_full_name"));
  }
}