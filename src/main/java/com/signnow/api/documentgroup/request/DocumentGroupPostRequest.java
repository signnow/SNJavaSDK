/*
 * This file is a part of signNow SDK API client.
 *
 * (с) Copyright © 2011-present airSlate Inc. (https://www.signnow.com)
 *
 * For more details on copyright, see LICENSE.md file
 * that was distributed with this source code.
 */

package com.signnow.api.documentgroup.request;

import com.signnow.api.documentgroup.request.data.DocumentIdCollection;
import com.signnow.core.request.ApiEndpoint;
import com.signnow.core.request.RequestInterface;
import java.util.HashMap;
import java.util.Map;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

/**
 * This class represents a request to create a document group.
 * It implements the RequestInterface with Object as the type parameter.
 */
@ApiEndpoint(
    name = "createDocumentGroup",
    url = "/documentgroup",
    method = "post",
    auth = "bearer",
    namespace = "documentGroup",
    entity = "documentGroup",
    type = "application/json")
public final class DocumentGroupPostRequest implements RequestInterface<Object> {

  /**
   * Collection of document IDs to be included in the group.
   */
  private final DocumentIdCollection documentIds;

  /**
   * Name of the document group.
   */
  private final String groupName;

  /**
   * Constructor for DocumentGroupPostRequest.
   *
   * @param documentIds Collection of document IDs to be included in the group.
   * @param groupName Name of the document group.
   */
  public DocumentGroupPostRequest(DocumentIdCollection documentIds, String groupName) {
    this.documentIds = documentIds;
    this.groupName = groupName;
  }

  /**
   * Getter for documentIds.
   *
   * @return DocumentIdCollection The collection of document IDs.
   */
  public DocumentIdCollection getDocumentIds() {
    return this.documentIds;
  }

  /**
   * Getter for groupName.
   *
   * @return String The name of the document group.
   */
  public String getGroupName() {
    return this.groupName;
  }

  /**
   * This method returns an empty HashMap.
   * It is required by the RequestInterface but not used in this class.
   *
   * @return HashMap An empty HashMap.
   */
  @NotNull
  @Contract(value = " -> new", pure = true)
  @Override
  public HashMap<String, String> uriParams() {
    return new HashMap<>();
  }

  /**
   * This method returns a Map with the payload for the request.
   * The payload includes the document IDs and the group name.
   *
   * @return Map A Map with the payload for the request.
   */
  @NotNull
  public Map<String, Object> payload() {
    Map<String, Object> map = new HashMap<>();
    map.put("document_ids", this.getDocumentIds());
    map.put("group_name", this.getGroupName());
    return map;
  }
}