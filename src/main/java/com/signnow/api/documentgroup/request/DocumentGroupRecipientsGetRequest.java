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
 * This class represents a request to get the recipients of a document group.
 * It implements the RequestInterface with a String type parameter.
 * The API endpoint is defined by the @ApiEndpoint annotation.
 */
@ApiEndpoint(
    name = "getDocumentGroupRecipients",
    url = "/v2/document-groups/{document_group_id}/recipients",
    method = "get",
    auth = "bearer",
    namespace = "documentGroup",
    entity = "documentGroupRecipients",
    type = "application/json")
public final class DocumentGroupRecipientsGetRequest implements RequestInterface<String> {

  /**
   * A map to hold the URI parameters for the request.
   */
  private final Map<String, String> uriParams = new HashMap<>();

  /**
   * This method is used to set the document group id in the URI parameters.
   * @param documentGroupId The id of the document group.
   * @return The current instance of DocumentGroupRecipientsGetRequest.
   */
  public DocumentGroupRecipientsGetRequest withDocumentGroupId(String documentGroupId) {
    this.uriParams.put("document_group_id", documentGroupId);
    return this;
  }

  /**
   * This method is used to get the URI parameters for the request.
   * @return A new HashMap containing the URI parameters.
   */
  @NotNull
  @Override
  public HashMap<String, String> uriParams() {
    return new HashMap<>(this.uriParams);
  }

  /**
   * This method is used to get the payload for the request.
   * @return A new HashMap as the payload for the request.
   */
  @NotNull
  @Override
  public Map<String, String> payload() {
    return new HashMap<>();
  }
}