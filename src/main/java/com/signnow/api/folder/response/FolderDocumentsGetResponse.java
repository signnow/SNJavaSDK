/*
 * This file is a part of signNow SDK API client.
 *
 * (с) Copyright © 2011-present airSlate Inc. (https://www.signnow.com)
 *
 * For more details on copyright, see LICENSE.md file
 * that was distributed with this source code.
 */

package com.signnow.api.folder.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.signnow.api.folder.response.data.FolderCollection;
import com.signnow.api.folder.response.data.document.DocumentCollection;

/**
 * This class represents the response from the FolderDocumentsGet API.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class FolderDocumentsGetResponse {

  /**
   * The unique identifier of the folder.
   */
  @JsonProperty("id")
  private final String id;

  /**
   * The creation date of the folder.
   */
  @JsonProperty("created")
  private final String created;

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
   * A flag indicating whether the folder is a system folder.
   */
  @JsonProperty("system_folder")
  private final boolean systemFolder;

  /**
   * A flag indicating whether the folder is shared.
   */
  @JsonProperty("shared")
  private final boolean shared;

  /**
   * The collection of folders within the folder.
   */
  @JsonProperty("folders")
  private final FolderCollection folders;

  /**
   * The total number of documents in the folder.
   */
  @JsonProperty("total_documents")
  private final int totalDocuments;

  /**
   * The collection of documents in the folder.
   */
  @JsonProperty("documents")
  private final DocumentCollection documents;

  /**
   * The unique identifier of the parent folder.
   */
  @JsonProperty("parent_id")
  private final String parentId;

  /**
   * Constructs a new FolderDocumentsGetResponse with the specified parameters.
   *
   * @param id the unique identifier of the folder
   * @param created the creation date of the folder
   * @param name the name of the folder
   * @param userId the unique identifier of the user who owns the folder
   * @param systemFolder a flag indicating whether the folder is a system folder
   * @param shared a flag indicating whether the folder is shared
   * @param folders the collection of folders within the folder
   * @param totalDocuments the total number of documents in the folder
   * @param documents the collection of documents in the folder
   * @param parentId the unique identifier of the parent folder
   */
  public FolderDocumentsGetResponse(
      @JsonProperty("id") String id,
      @JsonProperty("created") String created,
      @JsonProperty("name") String name,
      @JsonProperty("user_id") String userId,
      @JsonProperty("system_folder") boolean systemFolder,
      @JsonProperty("shared") boolean shared,
      @JsonProperty("folders") FolderCollection folders,
      @JsonProperty("total_documents") int totalDocuments,
      @JsonProperty("documents") DocumentCollection documents,
      @JsonProperty("parent_id") String parentId) {
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
   * Returns the creation date of the folder.
   *
   * @return the creation date of the folder
   */
  public String getCreated() {
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
   * Returns the collection of folders within the folder.
   *
   * @return the collection of folders within the folder
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
   * Returns the collection of documents in the folder.
   *
   * @return the collection of documents in the folder
   */
  public DocumentCollection getDocuments() {
    return this.documents;
  }
}