/*
 * This file is a part of signNow SDK API client.
 *
 * (с) Copyright © 2011-present airSlate Inc. (https://www.signnow.com)
 *
 * For more details on copyright, see LICENSE.md file
 * that was distributed with this source code.
 */

package com.signnow.api.documentgroupinvite.request;

import com.signnow.core.request.ApiEndpoint;
import com.signnow.core.request.RequestInterface;
import java.util.HashMap;
import java.util.Map;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

/**
 * Represents a request to resend a group invite.
 * This class is used to construct the request body and URI parameters for the API endpoint.
 */
@ApiEndpoint(
    name = "resendDocumentGroupInvite",
    url = "/documentgroup/{document_group_id}/groupinvite/{invite_id}/resendinvites",
    method = "post",
    auth = "bearer",
    namespace = "documentGroupInvite",
    entity = "resendGroupInvite",
    type = "application/json")
public final class ResendGroupInvitePostRequest implements RequestInterface<String> {

  /**
   * The email address to which the invite is to be sent.
   */
  private final String email;

  /**
   * A map of URI parameters to be included in the request.
   */
  private final Map<String, String> uriParams = new HashMap<>();

  /**
   * Constructs a new ResendGroupInvitePostRequest with the specified email.
   *
   * @param email the email address to which the invite is to be sent
   */
  public ResendGroupInvitePostRequest(String email) {
    this.email = email;
  }

  /**
   * Returns the email address to which the invite is to be sent.
   *
   * @return the email address
   */
  public String getEmail() {
    return this.email;
  }

  /**
   * Adds the document group ID to the URI parameters.
   *
   * @param documentGroupId the document group ID
   * @return this ResendGroupInvitePostRequest, for chaining
   */
  public ResendGroupInvitePostRequest withDocumentGroupId(String documentGroupId) {
    this.uriParams.put("document_group_id", documentGroupId);
    return this;
  }

  /**
   * Adds the invite ID to the URI parameters.
   *
   * @param inviteId the invite ID
   * @return this ResendGroupInvitePostRequest, for chaining
   */
  public ResendGroupInvitePostRequest withInviteId(String inviteId) {
    this.uriParams.put("invite_id", inviteId);
    return this;
  }

  /**
   * Returns a new map containing the URI parameters for this request.
   *
   * @return a new map containing the URI parameters
   */
  @NotNull
  @Contract(value = " -> new", pure = true)
  @Override
  public HashMap<String, String> uriParams() {
    return new HashMap<>(this.uriParams);
  }

  /**
   * Returns a map representing the payload for this request.
   * The map contains a single entry with the key "email" and the value being the email address.
   *
   * @return a map representing the payload for this request
   */
  @NotNull
  public Map<String, String> payload() {
    Map<String, String> map = new HashMap<>();
    map.put("email", this.getEmail());
    return map;
  }
}
