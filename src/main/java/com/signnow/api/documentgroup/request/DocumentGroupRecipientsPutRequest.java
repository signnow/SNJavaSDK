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
import com.signnow.api.documentgroup.request.data.recipient.RecipientCollection;
import com.signnow.api.documentgroup.request.data.CcCollection;
import java.util.HashMap;
import java.util.Map;

/**
 * This class represents a request to update document group recipients.
 * It implements the RequestInterface with Object type.
 */
@ApiEndpoint(
    name = "updateDocumentGroupRecipients",
    url = "/v2/document-groups/{document_group_id}/recipients",
    method = "put",
    auth = "bearer",
    namespace = "documentGroup",
    entity = "documentGroupRecipients",
    type = "application/json")
public final class DocumentGroupRecipientsPutRequest implements RequestInterface<Object> {

  private final RecipientCollection recipients;

  private final CcCollection cc;

  private final HashMap<String, String> uriParams = new HashMap<>();

  /**
   * Constructs a new DocumentGroupRecipientsPutRequest with the specified recipients and cc.
   *
   * @param recipients the collection of recipients
   * @param cc the collection of cc
   */
  public DocumentGroupRecipientsPutRequest(RecipientCollection recipients, CcCollection cc) {
    this.recipients = recipients;
    this.cc = cc;
  }

  /**
   * Returns the collection of recipients.
   *
   * @return the collection of recipients
   */
  public RecipientCollection getRecipients() {
    return this.recipients;
  }

  /**
   * Returns the collection of cc.
   *
   * @return the collection of cc
   */
  public CcCollection getCc() {
    return this.cc;
  }

  /**
   * Sets the document group ID in the URI parameters.
   *
   * @param documentGroupId the document group ID
   * @return the current instance of DocumentGroupRecipientsPutRequest
   */
  public DocumentGroupRecipientsPutRequest withDocumentGroupId(String documentGroupId) {
    this.uriParams.put("document_group_id", documentGroupId);
    return this;
  }

  /**
   * Returns a HashMap containing the URI parameters as key-value pairs.
   *
   * @return a HashMap containing the URI parameters
   */
  @Override
  public HashMap<String, String> uriParams() {
    return this.uriParams;
  }

  /**
   * Returns a Map with the payload of the request.
   *
   * @return a Map with the payload of the request
   */
  @Override
  public Map<String, Object> payload() {
    Map<String, Object> map = new HashMap<>();
    map.put("recipients", this.getRecipients().toArray());
    map.put("cc", this.getCc().toArray());
    return map;
  }
}
