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

public final class Content extends ApiData {

  @JsonProperty("document_id")
  private final String documentId;

  @JsonProperty("document_name")
  private final String documentName;

  @JsonProperty("user_id")
  private final String userId;

  @JsonProperty("viewer_user_unique_id")
  private final String viewerUserUniqueId;

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

  public String getDocumentId() {
    return this.documentId;
  }

  public String getDocumentName() {
    return this.documentName;
  }

  public String getUserId() {
    return this.userId;
  }

  public String getViewerUserUniqueId() {
    return this.viewerUserUniqueId;
  }

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
