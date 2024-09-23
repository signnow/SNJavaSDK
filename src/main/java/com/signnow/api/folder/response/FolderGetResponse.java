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

@JsonIgnoreProperties(ignoreUnknown = true)
public class FolderGetResponse {

  @JsonProperty("id")
  private final String id;

  @JsonProperty("created")
  private final int created;

  @JsonProperty("name")
  private final String name;

  @JsonProperty("user_id")
  private final String userId;

  @JsonProperty("system_folder")
  private final boolean systemFolder;

  @JsonProperty("shared")
  private final boolean shared;

  @JsonProperty("folders")
  private final FolderCollection folders;

  @JsonProperty("total_documents")
  private final int totalDocuments;

  @JsonProperty("documents")
  private final DocumentFolderCollection documents;

  @JsonProperty("parent_id")
  private final String parentId;

  @JsonProperty("team_name")
  private final String teamName;

  @JsonProperty("team_id")
  private final String teamId;

  @JsonProperty("team_type")
  private final String teamType;

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

  public String getId() {
    return this.id;
  }

  public int getCreated() {
    return this.created;
  }

  public String getName() {
    return this.name;
  }

  public String getUserId() {
    return this.userId;
  }

  public String getParentId() {
    return this.parentId;
  }

  public boolean isSystemFolder() {
    return this.systemFolder;
  }

  public boolean isShared() {
    return this.shared;
  }

  public FolderCollection getFolders() {
    return this.folders;
  }

  public int getTotalDocuments() {
    return this.totalDocuments;
  }

  public DocumentFolderCollection getDocuments() {
    return this.documents;
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
}
