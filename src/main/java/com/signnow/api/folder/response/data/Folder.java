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

/**
 * Represents a Folder in the signNow API.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public final class Folder extends ApiData {

  /**
   * The id of the folder.
   */
  @JsonProperty("id")
  private final String id;

  /**
   * The user id of the folder owner.
   */
  @JsonProperty("user_id")
  private final String userId;

  /**
   * The name of the folder.
   */
  @JsonProperty("name")
  private final String name;

  /**
   * The creation date of the folder.
   */
  @JsonProperty("created")
  private final String created;

  /**
   * Indicates if the folder is shared.
   */
  @JsonProperty("shared")
  private final boolean shared;

  /**
   * The count of documents in the folder.
   */
  @JsonProperty("document_count")
  private final String documentCount;

  /**
   * The count of templates in the folder.
   */
  @JsonProperty("template_count")
  private final String templateCount;

  /**
   * The count of sub-folders in the folder.
   */
  @JsonProperty("folder_count")
  private final String folderCount;

  /**
   * The name of the team that the folder belongs to.
   */
  @JsonProperty("team_name")
  private final String teamName;

  /**
   * The id of the team that the folder belongs to.
   */
  @JsonProperty("team_id")
  private final String teamId;

  /**
   * The type of the team that the folder belongs to.
   */
  @JsonProperty("team_type")
  private final String teamType;

  /**
   * Constructs a new Folder with the given parameters.
   *
   * @param id the id of the folder
   * @param userId the user id of the folder owner
   * @param name the name of the folder
   * @param created the creation date of the folder
   * @param shared indicates if the folder is shared
   * @param documentCount the count of documents in the folder
   * @param templateCount the count of templates in the folder
   * @param folderCount the count of sub-folders in the folder
   * @param teamName the name of the team that the folder belongs to
   * @param teamId the id of the team that the folder belongs to
   * @param teamType the type of the team that the folder belongs to
   */
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

  /**
   * Returns the id of the folder.
   *
   * @return the id of the folder
   */
  public String getId() {
    return this.id;
  }

  /**
   * Returns the user id of the folder owner.
   *
   * @return the user id of the folder owner
   */
  public String getUserId() {
    return this.userId;
  }

  /**
   * Returns the name of the folder.
   *
   * @return the name of the folder
   */
  public String getName() {
    return this.name;
  }

  /**
   * Returns the creation date of the folder.
   *
   * @return the creation date of the folder
   */
  public String getCreated() {
    return this.created;
  }

  /**
   * Returns whether the folder is shared or not.
   *
   * @return true if the folder is shared, false otherwise
   */
  public boolean isShared() {
    return this.shared;
  }

  /**
   * Returns the count of documents in the folder.
   *
   * @return the count of documents in the folder
   */
  public String getDocumentCount() {
    return this.documentCount;
  }

  /**
   * Returns the count of templates in the folder.
   *
   * @return the count of templates in the folder
   */
  public String getTemplateCount() {
    return this.templateCount;
  }

  /**
   * Returns the count of sub-folders in the folder.
   *
   * @return the count of sub-folders in the folder
   */
  public String getFolderCount() {
    return this.folderCount;
  }

  /**
   * Returns the name of the team that the folder belongs to.
   *
   * @return the name of the team that the folder belongs to
   */
  public String getTeamName() {
    return this.teamName;
  }

  /**
   * Returns the id of the team that the folder belongs to.
   *
   * @return the id of the team that the folder belongs to
   */
  public String getTeamId() {
    return this.teamId;
  }

  /**
   * Returns the type of the team that the folder belongs to.
   *
   * @return the type of the team that the folder belongs to
   */
  public String getTeamType() {
    return this.teamType;
  }

  /**
   * Converts this Folder object to a Map.
   *
   * @return a Map representing this Folder object
   */
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

  /**
   * Creates a new Folder object from the given Map.
   *
   * @param data a Map containing the data for the new Folder object
   * @return a new Folder object created from the given Map
   */
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