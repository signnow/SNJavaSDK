/*
 * This file is a part of signNow SDK API client.
 *
 * (с) Copyright © 2011-present airSlate Inc. (https://www.signnow.com)
 *
 * For more details on copyright, see LICENSE.md file
 * that was distributed with this source code.
 */

package com.signnow.api.folder.response;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.signnow.api.folder.response.data.FolderCollection;
import com.signnow.api.folder.response.data.document.DocumentFolderCollection;

/**
 * Represents the response received after a request to get a folder.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class FolderGetResponse {

  /**
   * The unique identifier of the folder.
   */
  @JsonProperty("id")
  private final String id;

  /**
   * The timestamp when the folder was created.
   */
  @JsonProperty("created")
  private final int created;

  /**
   * The name of the folder.
   */
  @JsonProperty("name")
  private final String name;

  /**
   * The unique identifier of the user who owns the folder.
   */
  @JsonProperty("user_id")
  private final String userId;

  /**
   * Indicates whether the folder is a system folder.
   */
  @JsonProperty("system_folder")
  private final boolean systemFolder;

  /**
   * Indicates whether the folder is shared.
   */
  @JsonProperty("shared")
  private final boolean shared;

  /**
   * The collection of folders within this folder.
   */
  @JsonProperty("folders")
  private final FolderCollection folders;

  /**
   * The total number of documents in the folder.
   */
  @JsonProperty("total_documents")
  private final int totalDocuments;

  /**
   * The collection of documents within this folder.
   */
  @JsonProperty("documents")
  private final DocumentFolderCollection documents;

  /**
   * The unique identifier of the parent folder.
   */
  @JsonProperty("parent_id")
  private final String parentId;

  /**
   * The name of the team that owns the folder.
   */
  @JsonProperty("team_name")
  private final String teamName;

  /**
   * The unique identifier of the team that owns the folder.
   */
  @JsonProperty("team_id")
  private final String teamId;

  /**
   * The type of the team that owns the folder.
   */
  @JsonProperty("team_type")
  private final String teamType;

  /**
   * Constructs a new FolderGetResponse with the specified details.
   *
   * @param id the unique identifier of the folder
   * @param created the timestamp when the folder was created
   * @param name the name of the folder
   * @param userId the unique identifier of the user who owns the folder
   * @param systemFolder whether the folder is a system folder
   * @param shared whether the folder is shared
   * @param folders the collection of folders within this folder
   * @param totalDocuments the total number of documents in the folder
   * @param documents the collection of documents within this folder
   * @param parentId the unique identifier of the parent folder
   * @param teamName the name of the team that owns the folder
   * @param teamId the unique identifier of the team that owns the folder
   * @param teamType the type of the team that owns the folder
   */
  @JsonCreator
  public FolderGetResponse(
      @JsonProperty("id") String id,
      @JsonProperty("created") int created,
      @JsonProperty("name") String name,
      @JsonProperty("user_id") String userId,
      @JsonProperty("system_folder") boolean systemFolder,
      @JsonProperty("shared") boolean shared,
      @JsonProperty("folders") FolderCollection folders,
      @JsonProperty("total_documents") int totalDocuments,
      @JsonProperty("documents") DocumentFolderCollection documents,
      @JsonProperty("parent_id") String parentId,
      @JsonProperty("team_name") String teamName,
      @JsonProperty("team_id") String teamId,
      @JsonProperty("team_type") String teamType) {
    this.id = id;
    this.created = created;
    this.name = name;
    this.userId = userId;
    this.systemFolder = systemFolder;
    this.shared = shared;
    this.folders = folders;
    this.totalDocuments = totalDocuments;
    this.documents = documents;
    this.parentId = parentId;
    this.teamName = teamName;
    this.teamId = teamId;
    this.teamType = teamType;
  }

  /**
   * Returns the unique identifier of the folder.
   *
   * @return the unique identifier of the folder
   */
  public String getId() {
    return this.id;
  }

  /**
   * Returns the timestamp when the folder was created.
   *
   * @return the timestamp when the folder was created
   */
  public int getCreated() {
    return this.created;
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
   * Returns the unique identifier of the user who owns the folder.
   *
   * @return the unique identifier of the user who owns the folder
   */
  public String getUserId() {
    return this.userId;
  }

  /**
   * Returns the unique identifier of the parent folder.
   *
   * @return the unique identifier of the parent folder
   */
  public String getParentId() {
    return this.parentId;
  }

  /**
   * Returns whether the folder is a system folder.
   *
   * @return true if the folder is a system folder, false otherwise
   */
  public boolean isSystemFolder() {
    return this.systemFolder;
  }

  /**
   * Returns whether the folder is shared.
   *
   * @return true if the folder is shared, false otherwise
   */
  public boolean isShared() {
    return this.shared;
  }

  /**
   * Returns the collection of folders within this folder.
   *
   * @return the collection of folders within this folder
   */
  public FolderCollection getFolders() {
    return this.folders;
  }

  /**
   * Returns the total number of documents in the folder.
   *
   * @return the total number of documents in the folder
   */
  public int getTotalDocuments() {
    return this.totalDocuments;
  }

  /**
   * Returns the collection of documents within this folder.
   *
   * @return the collection of documents within this folder
   */
  public DocumentFolderCollection getDocuments() {
    return this.documents;
  }

  /**
   * Returns the name of the team that owns the folder.
   *
   * @return the name of the team that owns the folder
   */
  public String getTeamName() {
    return this.teamName;
  }

  /**
   * Returns the unique identifier of the team that owns the folder.
   *
   * @return the unique identifier of the team that owns the folder
   */
  public String getTeamId() {
    return this.teamId;
  }

  /**
   * Returns the type of the team that owns the folder.
   *
   * @return the type of the team that owns the folder
   */
  public String getTeamType() {
    return this.teamType;
  }
}