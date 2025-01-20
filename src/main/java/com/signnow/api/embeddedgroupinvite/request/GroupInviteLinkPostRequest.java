/*
 * This file is a part of signNow SDK API client.
 *
 * (с) Copyright © 2011-present airSlate Inc. (https://www.signnow.com)
 *
 * For more details on copyright, see LICENSE.md file
 * that was distributed with this source code.
 */

package com.signnow.api.embeddedgroupinvite.request;

import com.signnow.core.request.ApiEndpoint;
import com.signnow.core.request.RequestInterface;
import java.util.HashMap;
import java.util.Map;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

/**
 * This class represents a request to create a link for an embedded invite document group.
 * It implements the RequestInterface with Object as the type parameter.
 */
@ApiEndpoint(
    name = "createLinkForEmbeddedInviteDocumentGroup",
    url = "/v2/document-groups/{document_group_id}/embedded-invites/{embedded_invite_id}/link",
    method = "post",
    auth = "bearer",
    namespace = "embeddedGroupInvite",
    entity = "groupInviteLink",
    type = "application/json")
public final class GroupInviteLinkPostRequest implements RequestInterface<Object> {

  /**
   * The email of the user.
   */
  private final String email;

  /**
   * The authentication method used.
   */
  private final String authMethod;

  /**
   * The expiration time of the link.
   */
  private final int linkExpiration;

  /**
   * The URI parameters for the request.
   */
  private final Map<String, String> uriParams = new HashMap<>();

  /**
   * Constructs a new GroupInviteLinkPostRequest with the specified email, authentication method, and link expiration time.
   *
   * @param email the email of the user
   * @param authMethod the authentication method used
   * @param linkExpiration the expiration time of the link
   */
  public GroupInviteLinkPostRequest(String email, String authMethod, int linkExpiration) {
    this.email = email;
    this.authMethod = authMethod;
    this.linkExpiration = linkExpiration;
  }

  /**
   * Returns the email of the user.
   *
   * @return the email of the user
   */
  public String getEmail() {
    return this.email;
  }

  /**
   * Returns the authentication method used.
   *
   * @return the authentication method used
   */
  public String getAuthMethod() {
    return this.authMethod;
  }

  /**
   * Returns the expiration time of the link.
   *
   * @return the expiration time of the link
   */
  public int getLinkExpiration() {
    return this.linkExpiration;
  }

  /**
   * Adds the document group ID to the URI parameters and returns this request.
   *
   * @param documentGroupId the document group ID
   * @return this request
   */
  public GroupInviteLinkPostRequest withDocumentGroupId(String documentGroupId) {
    this.uriParams.put("document_group_id", documentGroupId);
    return this;
  }

  /**
   * Adds the embedded invite ID to the URI parameters and returns this request.
   *
   * @param embeddedInviteId the embedded invite ID
   * @return this request
   */
  public GroupInviteLinkPostRequest withEmbeddedInviteId(String embeddedInviteId) {
    this.uriParams.put("embedded_invite_id", embeddedInviteId);
    return this;
  }

  /**
   * Returns a new HashMap containing the URI parameters for this request.
   *
   * @return a new HashMap containing the URI parameters for this request
   */
  @NotNull
  @Contract(value = " -> new", pure = true)
  @Override
  public HashMap<String, String> uriParams() {
    return new HashMap<>(this.uriParams);
  }

  /**
   * Returns a Map containing the payload for this request.
   *
   * @return a Map containing the payload for this request
   */
  @NotNull
  public Map<String, Object> payload() {
    Map<String, Object> map = new HashMap<>();
    map.put("email", this.getEmail());
    map.put("auth_method", this.getAuthMethod());
    map.put("link_expiration", this.getLinkExpiration());
    return map;
  }
}
