/*
 * This file is a part of signNow SDK API client.
 *
 * (с) Copyright © 2011-present airSlate Inc. (https://www.signnow.com)
 *
 * For more details on copyright, see LICENSE.md file
 * that was distributed with this source code.
 */

package com.signnow.api.template.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.signnow.api.template.response.data.ApproverPutCollection;
import com.signnow.api.template.response.data.CcPutCollection;
import com.signnow.api.template.response.data.CcStepPutCollection;
import com.signnow.api.template.response.data.Data;
import com.signnow.api.template.response.data.InviteLinkInstructionPutCollection;
import com.signnow.api.template.response.data.ViewerPutCollection;

/**
 * This class represents the response of the routing details put operation.
 */
public class RoutingDetailsPutResponse {

  /**
   * The unique identifier of the routing details.
   */
  @JsonProperty("id")
  private final String id;

  /**
   * The unique identifier of the document.
   */
  @JsonProperty("document_id")
  private final String documentId;

  /**
   * The data of the routing details.
   */
  @JsonProperty("data")
  private final Data data;

  /**
   * The collection of CC put operations.
   */
  @JsonProperty("cc")
  private final CcPutCollection cc;

  /**
   * The collection of CC step put operations.
   */
  @JsonProperty("cc_step")
  private final CcStepPutCollection ccStep;

  /**
   * The collection of viewers.
   */
  @JsonProperty("viewers")
  private final ViewerPutCollection viewers;

  /**
   * The collection of approvers.
   */
  @JsonProperty("approvers")
  private final ApproverPutCollection approvers;

  /**
   * The collection of invite link instructions.
   */
  @JsonProperty("invite_link_instructions")
  private final InviteLinkInstructionPutCollection inviteLinkInstructions;

  /**
   * Constructs a new RoutingDetailsPutResponse with the specified parameters.
   *
   * @param id the unique identifier of the routing details
   * @param documentId the unique identifier of the document
   * @param data the data of the routing details
   * @param cc the collection of CC put operations
   * @param ccStep the collection of CC step put operations
   * @param viewers the collection of viewers
   * @param approvers the collection of approvers
   * @param inviteLinkInstructions the collection of invite link instructions
   */
  public RoutingDetailsPutResponse(
      @JsonProperty("id") String id,
      @JsonProperty("document_id") String documentId,
      @JsonProperty("data") Data data,
      @JsonProperty("cc") CcPutCollection cc,
      @JsonProperty("cc_step") CcStepPutCollection ccStep,
      @JsonProperty("viewers") ViewerPutCollection viewers,
      @JsonProperty("approvers") ApproverPutCollection approvers,
      @JsonProperty("invite_link_instructions")
          InviteLinkInstructionPutCollection inviteLinkInstructions) {
    this.id = id;
    this.documentId = documentId;
    this.data = data;
    this.cc = cc;
    this.ccStep = ccStep;
    this.viewers = viewers;
    this.approvers = approvers;
    this.inviteLinkInstructions = inviteLinkInstructions;
  }

  /**
   * Returns the unique identifier of the routing details.
   *
   * @return the unique identifier of the routing details
   */
  public String getId() {
    return this.id;
  }

  /**
   * Returns the unique identifier of the document.
   *
   * @return the unique identifier of the document
   */
  public String getDocumentId() {
    return this.documentId;
  }

  /**
   * Returns the data of the routing details.
   *
   * @return the data of the routing details
   */
  public Data getData() {
    return this.data;
  }

  /**
   * Returns the collection of CC put operations.
   *
   * @return the collection of CC put operations
   */
  public CcPutCollection getCc() {
    return this.cc;
  }

  /**
   * Returns the collection of CC step put operations.
   *
   * @return the collection of CC step put operations
   */
  public CcStepPutCollection getCcStep() {
    return this.ccStep;
  }

  /**
   * Returns the collection of viewers.
   *
   * @return the collection of viewers
   */
  public ViewerPutCollection getViewers() {
    return this.viewers;
  }

  /**
   * Returns the collection of approvers.
   *
   * @return the collection of approvers
   */
  public ApproverPutCollection getApprovers() {
    return this.approvers;
  }

  /**
   * Returns the collection of invite link instructions.
   *
   * @return the collection of invite link instructions
   */
  public InviteLinkInstructionPutCollection getInviteLinkInstructions() {
    return this.inviteLinkInstructions;
  }
}