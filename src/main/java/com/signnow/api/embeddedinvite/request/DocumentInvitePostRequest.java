/*
 * This file is a part of signNow SDK API client.
 *
 * (с) Copyright © 2011-present airSlate Inc. (https://www.signnow.com)
 *
 * For more details on copyright, see LICENSE.md file
 * that was distributed with this source code.
 */

package com.signnow.api.embeddedinvite.request;

import com.signnow.api.embeddedinvite.request.data.InviteCollection;
import com.signnow.core.request.ApiEndpoint;
import com.signnow.core.request.RequestInterface;
import java.util.HashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;

/**
 * This class represents a request to create an embedded invite.
 */
@ApiEndpoint(
    name = "createEmbeddedInvite",
    url = "/v2/documents/{document_id}/embedded-invites",
    method = "post",
    auth = "bearer",
    namespace = "embeddedInvite",
    entity = "documentInvite",
    type = "application/json")
public final class DocumentInvitePostRequest implements RequestInterface<Object> {

  /**
   * Collection of invites.
   */
  private final InviteCollection invites;

  /**
   * Formula for the name.
   */
  private final String nameFormula;

  /**
   * Parameters for the URI.
   */
  private final Map<String, String> uriParams = new HashMap<>();

  /**
   * Constructor for DocumentInvitePostRequest.
   *
   * @param invites     The collection of invites.
   * @param nameFormula The formula for the name.
   */
  public DocumentInvitePostRequest(InviteCollection invites, String nameFormula) {
    this.invites = invites;
    this.nameFormula = nameFormula;
  }

  /**
   * Getter for the name formula.
   *
   * @return The name formula.
   */
  public String getNameFormula() {
    return this.nameFormula;
  }

  /**
   * Getter for the invites.
   *
   * @return The collection of invites.
   */
  public InviteCollection getInvites() {
    return this.invites;
  }

  /**
   * Method to add a document ID to the URI parameters.
   *
   * @param documentId The document ID.
   * @return The updated DocumentInvitePostRequest.
   */
  public DocumentInvitePostRequest withDocumentId(String documentId) {
    this.uriParams.put("document_id", documentId);
    return this;
  }

  /**
   * Getter for the URI parameters.
   *
   * @return A copy of the URI parameters.
   */
  @NotNull
  @Override
  public HashMap<String, String> uriParams() {
    return new HashMap<>(this.uriParams);
  }

  /**
   * Method to generate the payload for the request.
   *
   * @return The payload as a map.
   */
  @NotNull
  @Override
  public Map<String, Object> payload() {
    Map<String, Object> map = new HashMap<>();
    map.put("name_formula", this.getNameFormula());
    map.put("invites", this.getInvites());
    return map;
  }
}
