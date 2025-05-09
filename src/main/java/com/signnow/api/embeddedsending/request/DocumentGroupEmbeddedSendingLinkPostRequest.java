/*
 * This file is a part of signNow SDK API client.
 *
 * (с) Copyright © 2011-present airSlate Inc. (https://www.signnow.com)
 *
 * For more details on copyright, see LICENSE.md file
 * that was distributed with this source code.
 */

package com.signnow.api.embeddedsending.request;

import com.signnow.core.request.ApiEndpoint;
import com.signnow.core.request.RequestInterface;
import java.util.HashMap;
import java.util.Map;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

/**
 * This class represents a request to create a document group embedded sending link. It implements
 * the RequestInterface with an Object type.
 */
@ApiEndpoint(
    name = "createDocumentGroupEmbeddedSendingLink",
    url = "/v2/document-groups/{document_group_id}/embedded-sending",
    method = "post",
    auth = "bearer",
    namespace = "embeddedSending",
    entity = "documentGroupEmbeddedSendingLink",
    type = "application/json")
public final class DocumentGroupEmbeddedSendingLinkPostRequest implements RequestInterface<Object> {

  /** The redirect URI for the request. */
  private final String redirectUri;

  /** The link expiration time for the request. */
  private final int linkExpiration;

  /** The redirect target for the request. */
  private final String redirectTarget;

  /** The URI parameters for the request. */
  private final HashMap<String, String> uriParams = new HashMap<>();

  /**
   * Constructs a new DocumentGroupEmbeddedSendingLinkPostRequest with the specified redirect URI,
   * link expiration, and redirect target.
   *
   * @param redirectUri the redirect URI for the request
   * @param linkExpiration the link expiration time for the request
   * @param redirectTarget the redirect target for the request
   */
  public DocumentGroupEmbeddedSendingLinkPostRequest(
      String redirectUri, int linkExpiration, String redirectTarget) {
    this.redirectUri = redirectUri;
    this.linkExpiration = linkExpiration;
    this.redirectTarget = redirectTarget;
  }

  /**
   * Returns the redirect URI for the request.
   *
   * @return the redirect URI for the request
   */
  public String getRedirectUri() {
    return this.redirectUri;
  }

  /**
   * Returns the link expiration time for the request.
   *
   * @return the link expiration time for the request
   */
  public int getLinkExpiration() {
    return this.linkExpiration;
  }

  /**
   * Returns the redirect target for the request.
   *
   * @return the redirect target for the request
   */
  public String getRedirectTarget() {
    return this.redirectTarget;
  }

  /**
   * Adds the document group ID to the URI parameters.
   *
   * @param documentGroupId the document group ID to add
   * @return the current instance of DocumentGroupEmbeddedSendingLinkPostRequest
   */
  public DocumentGroupEmbeddedSendingLinkPostRequest withDocumentGroupId(String documentGroupId) {
    this.uriParams.put("document_group_id", documentGroupId);
    return this;
  }

  /**
   * Returns the URI parameters for the request.
   *
   * @return a HashMap containing the URI parameters as key-value pairs
   */
  @NotNull
  @Contract(value = " -> new", pure = true)
  @Override
  public HashMap<String, String> uriParams() {
    return new HashMap<>(this.uriParams);
  }

  /**
   * Returns a Map with the payload of the request.
   *
   * @return a Map with the payload of the request
   */
  @NotNull
  public Map<String, Object> payload() {
    Map<String, Object> map = new HashMap<>();
    map.put("redirect_uri", this.getRedirectUri());
    map.put("link_expiration", this.getLinkExpiration());
    map.put("redirect_target", this.getRedirectTarget());
    return map;
  }
}
