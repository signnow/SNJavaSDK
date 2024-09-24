/*
 * This file is a part of signNow SDK API client.
 *
 * (с) Copyright © 2011-present airSlate Inc. (https://www.signnow.com)
 *
 * For more details on copyright, see LICENSE.md file
 * that was distributed with this source code.
 */

package com.signnow.api.folder.response.data;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.signnow.core.data.ApiData;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

@JsonIgnoreProperties(ignoreUnknown = true)
public final class Folder extends ApiData {

  @JsonProperty("id")
  private final String id;

  @JsonProperty("user_id")
  private final String userId;

  @JsonProperty("name")
  private final String name;

  @JsonProperty("created")
  private final String created;

  @JsonProperty("shared")
  private final boolean shared;

  @JsonProperty("document_count")
  private final String documentCount;

  @JsonProperty("template_count")
  private final String templateCount;

  @JsonProperty("folder_count")
  private final String folderCount;

  @JsonProperty("team_name")
  private final String teamName;

  @JsonProperty("team_id")
  private final String teamId;

  @JsonProperty("team_type")
  private final String teamType;

  @JsonCreator
  public Folder(
      @JsonProperty("id") String id,
      @JsonProperty("user_id") String userId,
      @JsonProperty("name") String name,
      @JsonProperty("created") String created,
      @JsonProperty("shared") boolean shared,
      @JsonProperty("document_count") String documentCount,
      @JsonProperty("template_count") String templateCount,
      @JsonProperty("folder_count") String folderCount,
      @JsonProperty("team_name") String teamName,
      @JsonProperty("team_id") String teamId,
      @JsonProperty("team_type") String teamType) {
    this.id = id;
    this.userId = userId;
    this.name = name;
    this.created = created;
    this.shared = shared;
    this.documentCount = documentCount;
    this.templateCount = templateCount;
    this.folderCount = folderCount;
    this.teamName = teamName;
    this.teamId = teamId;
    this.teamType = teamType;
  }

  public String getId() {
    return this.id;
  }

  public String getUserId() {
    return this.userId;
  }

  public String getName() {
    return this.name;
  }

  public String getCreated() {
    return this.created;
  }

  public boolean isShared() {
    return this.shared;
  }

  public String getDocumentCount() {
    return this.documentCount;
  }

  public String getTemplateCount() {
    return this.templateCount;
  }

  public String getFolderCount() {
    return this.folderCount;
  }

  public String getTeamName() {
    return this.teamName;
  }

  public String getTeamId() {
    return this.teamId;
  }

  public String getTeamType() {
    return this.teamType;
  }

  @NotNull
  @Override
  public Map<String, Object> toMap() {
    Map<String, Object> map = new LinkedHashMap<>();
    map.put("id", this.getId());
    map.put("user_id", this.getUserId());
    map.put("name", this.getName());
    map.put("created", this.getCreated());
    map.put("shared", this.isShared());
    map.put("document_count", this.getDocumentCount());
    map.put("template_count", this.getTemplateCount());
    map.put("folder_count", this.getFolderCount());
    map.put("team_id", this.getTeamId());
    map.put("team_name", this.getTeamName());
    map.put("team_type", this.getTeamType());
    return map;
  }

  @NotNull
  @Contract("_ -> new")
  public static Folder fromMap(@NotNull Map<String, Object> data) {
    return new Folder(
        (String) data.get("id"),
        (String) data.get("user_id"),
        (String) data.get("name"),
        (String) data.get("created"),
        (Boolean) data.get("shared"),
        (String) data.get("document_count"),
        (String) data.get("template_count"),
        (String) data.get("folder_count"),
        (String) data.get("team_name"),
        (String) data.get("team_id"),
        (String) data.get("team_type"));
  }
}
