/*
 * This file is a part of signNow SDK API client.
 *
 * (с) Copyright © 2011-present airSlate Inc. (https://www.signnow.com)
 *
 * For more details on copyright, see LICENSE.md file
 */

package com.signnow.api.embeddededitor.request;

import com.signnow.core.request.ApiEndpoint;
import com.signnow.core.request.RequestInterface;
import java.util.HashMap;
import java.util.Map;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

/**
 * This class represents a request to create a document embedded editor link. It implements the
 * RequestInterface with an Object type.
 */
@ApiEndpoint(
    name = "createDocumentEmbeddedEditorLink",
    url = "/v2/documents/{document_id}/embedded-editor",
    method = "post",
    auth = "bearer",
    namespace = "embeddedEditor",
    entity = "documentEmbeddedEditorLink",
    type = "application/json")
public final class DocumentEmbeddedEditorLinkPostRequest implements RequestInterface<Object> {

  /** The redirect URI for the request. */
  private final String redirectUri;

  /** The redirect target for the request. */
  private final String redirectTarget;

  /** The link expiration time for the request. */
  private final int linkExpiration;

  /** The URI parameters for the request. */
  private final HashMap<String, String> uriParams = new HashMap<>();

  /**
   * Constructs a new DocumentEmbeddedEditorLinkPostRequest with the specified redirect URI,
   * redirect target, and link expiration.
   *
   * @param redirectUri link that opens after the user has completed editing the document.
   * @param redirectTarget determines on what browser's tab should be opened the redirectUri
   * @param linkExpiration the link expiration time in minutes
   */
  public DocumentEmbeddedEditorLinkPostRequest(
      String redirectUri, String redirectTarget, int linkExpiration) {
    this.redirectUri = redirectUri;
    this.redirectTarget = redirectTarget;
    this.linkExpiration = linkExpiration;
  }

  /**
   * Returns link that opens after the user has completed editing the document.
   *
   * @return the redirect URI for the request
   */
  public String getRedirectUri() {
    return this.redirectUri;
  }

  /**
   * Returns the redirect target for the request (on what browser's tab should be opened the
   * redirectUri).
   *
   * @return the redirect target for the request (on what browser's tab should be opened the
   *     redirectUri)
   */
  public String getRedirectTarget() {
    return this.redirectTarget;
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
   * Adds the document ID to the URI parameters and returns the current instance.
   *
   * @param documentId the document ID to add
   * @return the current instance with the updated URI parameters
   */
  public DocumentEmbeddedEditorLinkPostRequest withDocumentId(String documentId) {
    this.uriParams.put("document_id", documentId);
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
    map.put("redirect_target", this.getRedirectTarget());
    map.put("link_expiration", this.getLinkExpiration());
    return map;
  }
}
