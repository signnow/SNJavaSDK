/*
 * This file is a part of signNow SDK API client.
 *
 * (с) Copyright © 2011-present airSlate Inc. (https://www.signnow.com)
 *
 * For more details on copyright, see LICENSE.md file
 * that was distributed with this source code.
 */

package com.signnow.api.embeddededitor.request;

import com.signnow.core.request.ApiEndpoint;
import com.signnow.core.request.RequestInterface;
import java.util.HashMap;
import java.util.Map;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

/**
 * This class represents a request to create a link to embedded document group editor. It implements
 * the RequestInterface with Object as the type parameter.
 */
@ApiEndpoint(
    name = "createDocumentGroupEmbeddedEditorLink",
    url = "/v2/document-groups/{document_group_id}/embedded-editor",
    method = "post",
    auth = "bearer",
    namespace = "embeddedEditor",
    entity = "documentGroupEmbeddedEditorLink",
    type = "application/json")
public final class DocumentGroupEmbeddedEditorLinkPostRequest implements RequestInterface<Object> {

  /** Optional: link that opens after the user has completed editing the document group. */
  private final String redirectUri;

  /**
   * Determines whether to open the redirect link in the new tab in the browser, or in the same tab
   * after the signing session. Possible values: blank - opens the link in the new tab, self - opens
   * the link in the same tab, default value.
   */
  private final String redirectTarget;

  /**
   * Link expiration time in minutes. By default, 15 minutes. Can be set max to 43200 minutes by a
   * user with Admin level of access.
   */
  private final int linkExpiration;

  /** A HashMap to store the URI parameters for the request. */
  private final HashMap<String, String> uriParams = new HashMap<>();

  /**
   * Constructor for DocumentEmbeddedEditorLinkRequest.
   *
   * @param redirectUri Link that opens after the user has completed editing the document group.
   * @param redirectTarget Determines on what browser's tab should be opened the redirectUri.
   * @param linkExpiration Link expiration time in minutes.
   */
  public DocumentGroupEmbeddedEditorLinkPostRequest(
      String redirectUri, String redirectTarget, int linkExpiration) {
    this.redirectUri = redirectUri;
    this.redirectTarget = redirectTarget;
    this.linkExpiration = linkExpiration;
  }

  /**
   * Link that opens after the user has completed editing the document group.
   *
   * @return String Link that opens after the user has completed editing the document group.
   */
  public String getRedirectUri() {
    return this.redirectUri;
  }

  /**
   * Determines on what browser's tab should be opened the redirectUri.
   *
   * @return String Determines on what browser's tab should be opened the redirectUri.
   */
  public String getRedirectTarget() {
    return this.redirectTarget;
  }

  /**
   * Link expiration time in minutes.
   *
   * @return int Link expiration time in minutes.
   */
  public int getLinkExpiration() {
    return this.linkExpiration;
  }

  /**
   * Method to add a document group ID to the URI parameters.
   *
   * @param documentGroupId The ID of the document group to be edited as embedded one.
   * @return The current DocumentGroupEmbeddedEditorLinkPostRequest instance.
   */
  public DocumentGroupEmbeddedEditorLinkPostRequest withDocumentGroupId(String documentGroupId) {
    this.uriParams.put("document_group_id", documentGroupId);
    return this;
  }

  /**
   * This method is used to get the URI parameters for the request.
   *
   * @return a new HashMap containing URI parameters
   */
  @NotNull
  @Contract(value = " -> new", pure = true)
  @Override
  public HashMap<String, String> uriParams() {
    return new HashMap<>(this.uriParams);
  }

  /**
   * Returns a Map containing the payload for the request.
   *
   * @return a Map containing the payload for the request
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
