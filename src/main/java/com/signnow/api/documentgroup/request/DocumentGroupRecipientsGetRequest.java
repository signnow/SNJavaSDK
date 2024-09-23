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

@ApiEndpoint(
    name = "getDocumentGroupRecipients",
    url = "/v2/document-groups/{document_group_id}/recipients",
    method = "get",
    auth = "bearer",
    namespace = "documentGroup",
    entity = "documentGroupRecipients",
    type = "application/json")
public final class DocumentGroupRecipientsGetRequest implements RequestInterface<String> {

  private final Map<String, String> uriParams = new HashMap<>();

  public DocumentGroupRecipientsGetRequest withDocumentGroupId(String documentGroupId) {
    this.uriParams.put("document_group_id", documentGroupId);
    return this;
  }

  @NotNull
  @Override
  public HashMap<String, String> uriParams() {
    return new HashMap<>(this.uriParams);
  }

  @NotNull
  @Override
  public Map<String, String> payload() {
    return new HashMap<>();
  }
}
