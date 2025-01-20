/*
 * This file is a part of signNow SDK API client.
 *
 * (с) Copyright © 2011-present airSlate Inc. (https://www.signnow.com)
 *
 * For more details on copyright, see LICENSE.md file
 * that was distributed with this source code.
 */

package com.signnow.api.smartfields.request;

import com.signnow.api.smartfields.request.data.DataCollection;
import com.signnow.core.request.ApiEndpoint;
import com.signnow.core.request.RequestInterface;
import java.util.HashMap;
import java.util.Map;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

/**
 * Represents a request to prefill smart fields in a document.
 * This class is used to send a POST request to the specified API endpoint.
 */
@ApiEndpoint(
    name = "prefillSmartFields",
    url = "/document/{document_id}/integration/object/smartfields",
    method = "post",
    auth = "bearer",
    namespace = "smartFields",
    entity = "documentPrefillSmartField",
    type = "application/json")
public final class DocumentPrefillSmartFieldPostRequest implements RequestInterface<Object> {

  /**
   * The data collection to be sent in the request.
   */
  private final DataCollection data;

  /**
   * The client timestamp to be sent in the request.
   */
  private final String clientTimestamp;

  /**
   * The URI parameters to be included in the request.
   */
  private final HashMap<String, String> uriParams = new HashMap<>();

  /**
   * Constructs a new DocumentPrefillSmartFieldPostRequest with the specified data and client timestamp.
   *
   * @param data the data collection to be sent in the request
   * @param clientTimestamp the client timestamp to be sent in the request
   */
  public DocumentPrefillSmartFieldPostRequest(DataCollection data, String clientTimestamp) {
    this.data = data;
    this.clientTimestamp = clientTimestamp;
  }

  /**
   * Returns the data collection of this request.
   *
   * @return the data collection of this request
   */
  public DataCollection getData() {
    return this.data;
  }

  /**
   * Returns the client timestamp of this request.
   *
   * @return the client timestamp of this request
   */
  public String getClientTimestamp() {
    return this.clientTimestamp;
  }

  /**
   * Adds the specified document ID to the URI parameters of this request.
   *
   * @param documentId the document ID to be added
   * @return this request with the added document ID
   */
  public DocumentPrefillSmartFieldPostRequest withDocumentId(String documentId) {
    this.uriParams.put("document_id", documentId);
    return this;
  }

  /**
   * Returns a new HashMap containing the URI parameters of this request.
   *
   * @return a new HashMap containing the URI parameters of this request
   */
  @NotNull
  @Contract(value = " -> new", pure = true)
  @Override
  public HashMap<String, String> uriParams() {
    return new HashMap<>(this.uriParams);
  }

  /**
   * Returns a Map containing the payload of this request.
   *
   * @return a Map containing the payload of this request
   */
  @NotNull
  @Override
  public Map<String, Object> payload() {
    Map<String, Object> map = new HashMap<>();
    map.put("data", this.getData());
    map.put("client_timestamp", this.getClientTimestamp());
    return map;
  }
}
