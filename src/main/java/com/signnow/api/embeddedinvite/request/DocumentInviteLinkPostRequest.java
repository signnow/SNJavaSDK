/*
 * This file is a part of signNow SDK API client.
 *
 * (с) Copyright © 2011-present airSlate Inc. (https://www.signnow.com)
 *
 * For more details on copyright, see LICENSE.md file
 * that was distributed with this source code.
 */

package com.signnow.api.embeddedinvite.request;

import com.signnow.core.request.ApiEndpoint;
import com.signnow.core.request.RequestInterface;
import java.util.HashMap;
import java.util.Map;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

/**
 * This class represents a request to create a link for an embedded invite.
 * It implements the RequestInterface with Object as the type parameter.
 */
@ApiEndpoint(
    name = "createLinkForEmbeddedInvite",
    url = "/v2/documents/{document_id}/embedded-invites/{field_invite_id}/link",
    method = "post",
    auth = "bearer",
    namespace = "embeddedInvite",
    entity = "documentInviteLink",
    type = "application/json")
public final class DocumentInviteLinkPostRequest implements RequestInterface<Object> {

  /**
   * The authentication method used for the request.
   */
  private final String authMethod;

  /**
   * The expiration time for the link.
   */
  private final int linkExpiration;

  /**
   * The parameters for the URI.
   */
  private final Map<String, String> uriParams = new HashMap<>();

  /**
   * Constructs a new DocumentInviteLinkPostRequest with the specified authentication method and link expiration time.
   *
   * @param authMethod the authentication method
   * @param linkExpiration the link expiration time
   */
  public DocumentInviteLinkPostRequest(String authMethod, int linkExpiration) {
    this.authMethod = authMethod;
    this.linkExpiration = linkExpiration;
  }

  /**
   * Returns the authentication method.
   *
   * @return the authentication method
   */
  public String getAuthMethod() {
    return this.authMethod;
  }

  /**
   * Returns the link expiration time.
   *
   * @return the link expiration time
   */
  public int getLinkExpiration() {
    return this.linkExpiration;
  }

  /**
   * Adds the document ID to the URI parameters and returns this request.
   *
   * @param documentId the document ID
   * @return this request
   */
  public DocumentInviteLinkPostRequest withDocumentId(String documentId) {
    this.uriParams.put("document_id", documentId);
    return this;
  }

  /**
   * Adds the field invite ID to the URI parameters and returns this request.
   *
   * @param fieldInviteId the field invite ID
   * @return this request
   */
  public DocumentInviteLinkPostRequest withFieldInviteId(String fieldInviteId) {
    this.uriParams.put("field_invite_id", fieldInviteId);
    return this;
  }

  /**
   * Returns a new HashMap containing the URI parameters.
   *
   * @return a new HashMap containing the URI parameters
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
    map.put("auth_method", this.getAuthMethod());
    map.put("link_expiration", this.getLinkExpiration());
    return map;
  }
}