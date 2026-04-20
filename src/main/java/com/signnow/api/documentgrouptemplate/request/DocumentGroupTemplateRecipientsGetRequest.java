/*
 * This file is a part of signNow SDK API client.
 *
 * (с) Copyright © 2011-present airSlate Inc. (https://www.signnow.com)
 *
 * For more details on copyright, see LICENSE.md file
 * that was distributed with this source code.
 */

package com.signnow.api.documentgrouptemplate.request;

import com.signnow.core.request.ApiEndpoint;
import com.signnow.core.request.RequestInterface;
import java.util.HashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;

/**
 * This class represents a request to get the recipients of a document group template.
 * It implements the RequestInterface with a String type parameter.
 */
@ApiEndpoint(
    name = "getDocumentGroupTemplateRecipients",
    url = "/v2/document-group-templates/{template_id}/recipients",
    method = "get",
    auth = "bearer",
    namespace = "documentGroupTemplate",
    entity = "documentGroupTemplateRecipients",
    type = "application/json")
public final class DocumentGroupTemplateRecipientsGetRequest implements RequestInterface<String> {

  /**
   * A map to hold the URI parameters for the request.
   */
  private final Map<String, String> uriParams = new HashMap<>();

  /**
   * Sets the document group template id in the URI parameters.
   *
   * @param templateId The id of the document group template.
   * @return The current instance of DocumentGroupTemplateRecipientsGetRequest.
   */
  public DocumentGroupTemplateRecipientsGetRequest withTemplateId(String templateId) {
    this.uriParams.put("template_id", templateId);
    return this;
  }

  /**
   * Returns the URI parameters for the request.
   *
   * @return A new HashMap containing the URI parameters.
   */
  @NotNull
  @Override
  public HashMap<String, String> uriParams() {
    return new HashMap<>(this.uriParams);
  }

  /**
   * Returns the payload for the request.
   *
   * @return A new HashMap as the payload for the request.
   */
  @NotNull
  @Override
  public Map<String, String> payload() {
    return new HashMap<>();
  }
}
