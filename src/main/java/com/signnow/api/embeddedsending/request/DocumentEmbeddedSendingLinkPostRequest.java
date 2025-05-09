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
 * This class represents a request to create a document embedded sending link. It implements the
 * RequestInterface with an Object type.
 */
@ApiEndpoint(
    name = "createDocumentEmbeddedSendingLink",
    url = "/v2/documents/{document_id}/embedded-sending",
    method = "post",
    auth = "bearer",
    namespace = "embeddedSending",
    entity = "documentEmbeddedSendingLink",
    type = "application/json")
public final class DocumentEmbeddedSendingLinkPostRequest implements RequestInterface<Object> {

  /** The type of the request. */
  private final String type;

  /** The redirect URI of the request. */
  private final String redirectUri;

  /** The link expiration time of the request. */
  private final int linkExpiration;

  /** The redirect target of the request. */
  private final String redirectTarget;

  /** The URI parameters of the request. */
  private final HashMap<String, String> uriParams = new HashMap<>();

  /**
   * Constructs a new DocumentEmbeddedSendingLinkPostRequest with the specified type, redirect URI,
   * link expiration, and redirect target.
   *
   * @param type the type of the request
   * @param redirectUri the redirect URI of the request
   * @param linkExpiration the link expiration time of the request
   * @param redirectTarget the redirect target of the request
   */
  public DocumentEmbeddedSendingLinkPostRequest(
      String type, String redirectUri, int linkExpiration, String redirectTarget) {
    this.type = type;
    this.redirectUri = redirectUri;
    this.linkExpiration = linkExpiration;
    this.redirectTarget = redirectTarget;
  }

  /**
   * Returns the type of the request.
   *
   * @return the type of the request
   */
  public String getType() {
    return this.type;
  }

  /**
   * Returns the redirect URI of the request.
   *
   * @return the redirect URI of the request
   */
  public String getRedirectUri() {
    return this.redirectUri;
  }

  /**
   * Returns the link expiration time of the request.
   *
   * @return the link expiration time of the request
   */
  public int getLinkExpiration() {
    return this.linkExpiration;
  }

  /**
   * Returns the redirect target of the request.
   *
   * @return the redirect target of the request
   */
  public String getRedirectTarget() {
    return this.redirectTarget;
  }

  /**
   * Adds the document ID to the URI parameters and returns the current instance.
   *
   * @param documentId the document ID to be added
   * @return the current instance with the updated URI parameters
   */
  public DocumentEmbeddedSendingLinkPostRequest withDocumentId(String documentId) {
    this.uriParams.put("document_id", documentId);
    return this;
  }

  /**
   * Returns the URI parameters of the request.
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
    map.put("type", this.getType());
    map.put("redirect_uri", this.getRedirectUri());
    map.put("link_expiration", this.getLinkExpiration());
    map.put("redirect_target", this.getRedirectTarget());
    return map;
  }
}
