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

@JsonIgnoreProperties(ignoreUnknown = true)
public final class Team extends ApiData {

  @JsonProperty("id")
  private final String id;

  @JsonProperty("team")
  private final String team;

  @JsonProperty("type")
  private final String type;

  @JsonProperty("created_since")
  private final String createdSince;

  @JsonProperty("role")
  private final String role;

  @JsonProperty("document_count")
  private final int documentCount;

  @JsonProperty("admins")
  private final AdminCollection admins;

  @JsonProperty("workspace_id")
  private final String workspaceId;

  @JsonProperty("team_owner_full_name")
  private final String teamOwnerFullName;

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

  public String getId() {
    return this.id;
  }

  public String getTeam() {
    return this.team;
  }

  public String getType() {
    return this.type;
  }

  public String getCreatedSince() {
    return this.createdSince;
  }

  public String getRole() {
    return this.role;
  }

  public int getDocumentCount() {
    return this.documentCount;
  }

  public String getWorkspaceId() {
    return this.workspaceId;
  }

  public AdminCollection getAdmins() {
    return this.admins;
  }

  public String getTeamOwnerFullName() {
    return teamOwnerFullName;
  }

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
