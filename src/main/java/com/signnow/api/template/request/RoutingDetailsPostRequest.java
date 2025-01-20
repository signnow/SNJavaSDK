/*
 * This file is a part of signNow SDK API client.
 *
 * (с) Copyright © 2011-present airSlate Inc. (https://www.signnow.com)
 *
 * For more details on copyright, see LICENSE.md file
 * that was distributed with this source code.
 */

package com.signnow.api.template.request;

import com.signnow.core.request.ApiEndpoint;
import com.signnow.core.request.RequestInterface;
import java.util.HashMap;
import java.util.Map;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

/**
 * This class represents a POST request for creating routing details in the template.
 * It implements the RequestInterface with a String type parameter.
 */
@ApiEndpoint(
    name = "createRoutingDetails",
    url = "/document/{document_id}/template/routing/detail",
    method = "post",
    auth = "bearer",
    namespace = "template",
    entity = "routingDetails",
    type = "application/json")
public final class RoutingDetailsPostRequest implements RequestInterface<String> {

  /**
   * A map to hold URI parameters for the request.
   */
  private final HashMap<String, String> uriParams = new HashMap<>();

  /**
   * Method to add a document ID to the URI parameters.
   *
   * @param documentId The ID of the document.
   * @return The current RoutingDetailsPostRequest instance.
   */
  public RoutingDetailsPostRequest withDocumentId(String documentId) {
    this.uriParams.put("document_id", documentId);
    return this;
  }

  /**
   * Method to get a copy of the URI parameters.
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
   * Method to get the payload for the request.
   *
   * @return A new HashMap. In this case, it's empty as the payload is not used.
   */
  @NotNull
  @Override
  public Map<String, String> payload() {
    return new HashMap<>();
  }
}