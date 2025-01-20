/*
 * This file is a part of signNow SDK API client.
 *
 * (с) Copyright © 2011-present airSlate Inc. (https://www.signnow.com)
 *
 * For more details on copyright, see LICENSE.md file
 * that was distributed with this source code.
 */

package com.signnow.api.document.request;

import com.signnow.core.request.ApiEndpoint;
import com.signnow.core.request.RequestInterface;
import java.util.HashMap;
import java.util.Map;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

/**
 * This class represents a request to get the full history of a document.
 * It implements the RequestInterface with a String type parameter.
 */
@ApiEndpoint(
    name = "getDocumentHistoryFull",
    url = "/document/{document_id}/historyfull",
    method = "get",
    auth = "bearer",
    namespace = "document",
    entity = "documentHistory",
    type = "application/json")
public final class DocumentHistoryGetRequest implements RequestInterface<String> {

  /**
   * A map to hold the URI parameters for the request.
   */
  private final HashMap<String, String> uriParams = new HashMap<>();

  /**
   * This method is used to add a document ID to the URI parameters.
   *
   * @param documentId The ID of the document.
   * @return The current DocumentHistoryGetRequest instance.
   */
  public DocumentHistoryGetRequest withDocumentId(String documentId) {
    this.uriParams.put("document_id", documentId);
    return this;
  }

  /**
   * This method is used to get a copy of the URI parameters.
   *
   * @return A new HashMap containing the URI parameters.
   */
  @NotNull
  @Contract(value = " -> new", pure = true)
  @Override
  public HashMap<String, String> uriParams() {
    return new HashMap<>(this.uriParams);
  }

  /**
   * This method is used to get the payload of the request.
   *
   * @return A new HashMap. In this case, it's empty as there's no payload for this request.
   */
  @NotNull
  @Override
  public Map<String, String> payload() {
    return new HashMap<>();
  }
}