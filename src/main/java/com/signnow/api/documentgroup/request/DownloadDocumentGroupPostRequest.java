/*
 * This file is a part of signNow SDK API client.
 *
 * (с) Copyright © 2011-present airSlate Inc. (https://www.signnow.com)
 *
 * For more details on copyright, see LICENSE.md file
 * that was distributed with this source code.
 */

package com.signnow.api.documentgroup.request;

import com.signnow.api.documentgroup.request.data.DocumentOrderCollection;
import com.signnow.core.request.ApiEndpoint;
import com.signnow.core.request.RequestInterface;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

/**
 * Represents a request to download a document group.
 * This class is used to build and send a POST request to the specified API endpoint.
 */
@ApiEndpoint(
    name = "downloadDocumentGroup",
    url = "/documentgroup/{document_group_id}/downloadall",
    method = "post",
    auth = "bearer",
    namespace = "documentGroup",
    entity = "downloadDocumentGroup",
    type = "application/json")
public final class DownloadDocumentGroupPostRequest implements RequestInterface<Object> {

  /**
   * The type of the document group.
   */
  private final String type;

  /**
   * The history of the document group.
   */
  private final String withHistory;

  /**
   * The order of the documents in the group.
   */
  private final DocumentOrderCollection documentOrder;

  /**
   * The parameters to be included in the URI of the request.
   */
  private final HashMap<String, String> uriParams = new HashMap<>();

  /**
   * Constructs a new DownloadDocumentGroupPostRequest with the specified type, history, and document order.
   *
   * @param type the type of the document group
   * @param withHistory the history of the document group
   * @param documentOrder the order of the documents in the group
   */
  public DownloadDocumentGroupPostRequest(
      String type, String withHistory, DocumentOrderCollection documentOrder) {
    this.type = type;
    this.withHistory = withHistory;
    this.documentOrder = documentOrder;
  }

  /**
   * Returns the type of the document group.
   *
   * @return the type of the document group
   */
  public String getType() {
    return this.type;
  }

  /**
   * Returns the history of the document group.
   *
   * @return the history of the document group
   */
  public String getWithHistory() {
    return this.withHistory;
  }

  /**
   * Returns the order of the documents in the group.
   *
   * @return the order of the documents in the group
   */
  public DocumentOrderCollection getDocumentOrder() {
    return this.documentOrder;
  }

  /**
   * Adds the specified document group ID to the URI parameters of the request.
   *
   * @param documentGroupId the ID of the document group
   * @return this request, for chaining
   */
  public DownloadDocumentGroupPostRequest withDocumentGroupId(String documentGroupId) {
    this.uriParams.put("document_group_id", documentGroupId);
    return this;
  }

  /**
   * Returns a new HashMap containing the URI parameters of the request.
   *
   * @return a new HashMap containing the URI parameters of the request
   */
  @NotNull
  @Contract(value = " -> new", pure = true)
  @Override
  public HashMap<String, String> uriParams() {
    return new HashMap<>(this.uriParams);
  }

  /**
   * Returns a Map containing the payload of the request.
   *
   * @return a Map containing the payload of the request
   */
  @NotNull
  public Map<String, Object> payload() {
    Map<String, Object> map = new LinkedHashMap<>();
    map.put("type", this.getType());
    map.put("with_history", this.getWithHistory());
    map.put("document_order", this.getDocumentOrder());
    return map;
  }
}