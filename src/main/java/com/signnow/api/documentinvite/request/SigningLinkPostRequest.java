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

/**
 * This class represents a request to create a signing link.
 * It implements the RequestInterface with a String type.
 */
@ApiEndpoint(
    name = "createSigningLink",
    url = "/link",
    method = "post",
    auth = "bearer",
    namespace = "documentInvite",
    entity = "signingLink",
    type = "application/json")
public final class SigningLinkPostRequest implements RequestInterface<String> {

  /**
   * The ID of the document for which the signing link is to be created.
   */
  private final String documentId;

  /**
   * The URI to which the user will be redirected after signing the document.
   */
  private final String redirectUri;

  /**
   * Constructor for SigningLinkPostRequest.
   *
   * @param documentId The ID of the document.
   * @param redirectUri The URI for redirection after signing.
   */
  public SigningLinkPostRequest(String documentId, String redirectUri) {
    this.documentId = documentId;
    this.redirectUri = redirectUri;
  }

  /**
   * Constructor for SigningLinkPostRequest with only documentId.
   *
   * @param documentId The ID of the document.
   */
  public SigningLinkPostRequest(String documentId) {
    this(documentId, "");
  }

  /**
   * Getter for documentId.
   *
   * @return The ID of the document.
   */
  public String getDocumentId() {
    return this.documentId;
  }

  /**
   * Getter for redirectUri.
   *
   * @return The URI for redirection after signing.
   */
  public String getRedirectUri() {
    return this.redirectUri;
  }

  /**
   * This method returns an empty HashMap.
   *
   * @return An empty HashMap.
   */
  @NotNull
  @Contract(value = " -> new", pure = true)
  @Override
  public HashMap<String, String> uriParams() {
    return new HashMap<>();
  }

  /**
   * This method returns a Map with the documentId and redirectUri as key-value pairs.
   *
   * @return A Map with the documentId and redirectUri.
   */
  @NotNull
  public Map<String, String> payload() {
    Map<String, String> map = new HashMap<>();
    map.put("document_id", this.getDocumentId());
    map.put("redirect_uri", this.getRedirectUri());
    return map;
  }
}