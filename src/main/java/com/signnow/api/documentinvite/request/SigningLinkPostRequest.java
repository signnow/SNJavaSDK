/*
 * This file is a part of signNow SDK API client.
 *
 * (с) Copyright © 2011-present airSlate Inc. (https://www.signnow.com)
 *
 * For more details on copyright, see LICENSE.md file
 * that was distributed with this source code.
 */

package com.signnow.api.documentinvite.request;

import com.signnow.core.request.ApiEndpoint;
import com.signnow.core.request.RequestInterface;
import java.util.HashMap;
import java.util.Map;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

@ApiEndpoint(
    name = "createSigningLink",
    url = "/link",
    method = "post",
    auth = "bearer",
    namespace = "documentInvite",
    entity = "signingLink",
    type = "application/json")
public final class SigningLinkPostRequest implements RequestInterface<String> {

  private final String documentId;

  private final String redirectUri;

  public SigningLinkPostRequest(String documentId, String redirectUri) {
    this.documentId = documentId;
    this.redirectUri = redirectUri;
  }

  public SigningLinkPostRequest(String documentId) {
    this(documentId, "");
  }

  public String getDocumentId() {
    return this.documentId;
  }

  public String getRedirectUri() {
    return this.redirectUri;
  }

  @NotNull
  @Contract(value = " -> new", pure = true)
  @Override
  public HashMap<String, String> uriParams() {
    return new HashMap<>();
  }

  @NotNull
  public Map<String, String> payload() {
    Map<String, String> map = new HashMap<>();
    map.put("document_id", this.getDocumentId());
    map.put("redirect_uri", this.getRedirectUri());
    return map;
  }
}
