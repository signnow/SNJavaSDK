/*
 * This file is a part of signNow SDK API client.
 *
 * (с) Copyright © 2011-present airSlate Inc. (https://www.signnow.com)
 *
 * For more details on copyright, see LICENSE.md file
 * that was distributed with this source code.
 */

package com.signnow.api.documentgroup.request;

import com.signnow.core.request.ApiEndpoint;
import com.signnow.core.request.RequestInterface;
import java.util.HashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;

/**
 * This class represents a request to delete a document group.
 * It implements the RequestInterface with a String type parameter.
 * The API endpoint is defined by the @ApiEndpoint annotation.
 */
@ApiEndpoint(
    name = "deleteDocumentGroup",
    url = "/documentgroup/{document_group_id}",
    method = "delete",
    auth = "bearer",
    namespace = "documentGroup",
    entity = "documentGroup",
    type = "application/json")
public final class DocumentGroupDeleteRequest implements RequestInterface<String> {

  /**
   * A map to hold the URI parameters for the request.
   */
  private final HashMap<String, String> uriParams = new HashMap<>();

  /**
   * Adds the document group id to the URI parameters.
   *
   * @param documentGroupId the id of the document group to be deleted.
   * @return the current instance of DocumentGroupDeleteRequest.
   */
  public DocumentGroupDeleteRequest withDocumentGroupId(String documentGroupId) {
    this.uriParams.put("document_group_id", documentGroupId);
    return this;
  }

  /**
   * Returns the URI parameters for the request.
   *
   * @return a map of the URI parameters.
   */
  @NotNull
  @Override
  public HashMap<String, String> uriParams() {
    return this.uriParams;
  }

  /**
   * Returns the payload for the request.
   * In this case, the payload is an empty map.
   *
   * @return an empty map.
   */
  @NotNull
  @Override
  public Map<String, String> payload() {
    return new HashMap<>();
  }
}