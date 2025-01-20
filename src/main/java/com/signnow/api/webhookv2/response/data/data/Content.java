/*
 * This file is a part of signNow SDK API client.
 *
 * (с) Copyright © 2011-present airSlate Inc. (https://www.signnow.com)
 *
 * For more details on copyright, see LICENSE.md file
 * that was distributed with this source code.
 */

package com.signnow.api.webhookv2.response.data.data;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.signnow.core.data.ApiData;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

/**
 * This class represents the content of a document.
 */
public final class Content extends ApiData {

  /**
   * The ID of the document.
   */
  @JsonProperty("document_id")
  private final String documentId;

  /**
   * The name of the document.
   */
  @JsonProperty("document_name")
  private final String documentName;

  /**
   * The ID of the user.
   */
  @JsonProperty("user_id")
  private final String userId;

  /**
   * The unique ID of the viewer user.
   */
  @JsonProperty("viewer_user_unique_id")
  private final String viewerUserUniqueId;

  /**
   * Constructs a new Content object.
   *
   * @param documentId The ID of the document.
   * @param documentName The name of the document.
   * @param userId The ID of the user.
   * @param viewerUserUniqueId The unique ID of the viewer user.
   */
  @JsonCreator
  public Content(
      @JsonProperty("document_id") String documentId,
      @JsonProperty("document_name") String documentName,
      @JsonProperty("user_id") String userId,
      @JsonProperty("viewer_user_unique_id") String viewerUserUniqueId) {
    this.documentId = documentId;
    this.documentName = documentName;
    this.userId = userId;
    this.viewerUserUniqueId = viewerUserUniqueId;
  }

  /**
   * Returns the ID of the document.
   *
   * @return The ID of the document.
   */
  public String getDocumentId() {
    return this.documentId;
  }

  /**
   * Returns the name of the document.
   *
   * @return The name of the document.
   */
  public String getDocumentName() {
    return this.documentName;
  }

  /**
   * Returns the ID of the user.
   *
   * @return The ID of the user.
   */
  public String getUserId() {
    return this.userId;
  }

  /**
   * Returns the unique ID of the viewer user.
   *
   * @return The unique ID of the viewer user.
   */
  public String getViewerUserUniqueId() {
    return this.viewerUserUniqueId;
  }

  /**
   * Converts this Content object to a Map.
   *
   * @return A Map representation of this Content object.
   */
  @NotNull
  @Override
  public Map<String, Object> toMap() {
    Map<String, Object> map = new LinkedHashMap<>();
    map.put("document_id", this.getDocumentId());
    map.put("document_name", this.getDocumentName());
    map.put("user_id", this.getUserId());
    map.put("viewer_user_unique_id", this.getViewerUserUniqueId());
    return map;
  }

  /**
   * Creates a new Content object from a Map.
   *
   * @param data The Map to convert.
   * @return A new Content object.
   */
  @NotNull
  @Contract("_ -> new")
  public static Content fromMap(@NotNull Map<String, Object> data) {
    return new Content(
        (String) data.get("document_id"),
        (String) data.get("document_name"),
        (String) data.get("user_id"),
        (String) data.get("viewer_user_unique_id"));
  }
}