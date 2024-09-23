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
    name = "deleteDocumentGroup",
    url = "/documentgroup/{document_group_id}",
    method = "delete",
    auth = "bearer",
    namespace = "documentGroup",
    entity = "documentGroup",
    type = "application/json")
public final class DocumentGroupDeleteRequest implements RequestInterface<String> {

  private final HashMap<String, String> uriParams = new HashMap<>();

  public DocumentGroupDeleteRequest withDocumentGroupId(String documentGroupId) {
    this.uriParams.put("document_group_id", documentGroupId);
    return this;
  }

  @NotNull
  @Override
  public HashMap<String, String> uriParams() {
    return this.uriParams;
  }

  @NotNull
  @Override
  public Map<String, String> payload() {
    return new HashMap<>();
  }
}
