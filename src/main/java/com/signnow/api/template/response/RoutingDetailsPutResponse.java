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

public class RoutingDetailsPutResponse {

  @JsonProperty("id")
  private final String id;

  @JsonProperty("document_id")
  private final String documentId;

  @JsonProperty("data")
  private final Data data;

  @JsonProperty("cc")
  private final CcPutCollection cc;

  @JsonProperty("cc_step")
  private final CcStepPutCollection ccStep;

  @JsonProperty("viewers")
  private final ViewerPutCollection viewers;

  @JsonProperty("approvers")
  private final ApproverPutCollection approvers;

  @JsonProperty("invite_link_instructions")
  private final InviteLinkInstructionPutCollection inviteLinkInstructions;

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

  public String getId() {
    return this.id;
  }

  public String getDocumentId() {
    return this.documentId;
  }

  public Data getData() {
    return this.data;
  }

  public CcPutCollection getCc() {
    return this.cc;
  }

  public CcStepPutCollection getCcStep() {
    return this.ccStep;
  }

  public ViewerPutCollection getViewers() {
    return this.viewers;
  }

  public ApproverPutCollection getApprovers() {
    return this.approvers;
  }

  public InviteLinkInstructionPutCollection getInviteLinkInstructions() {
    return this.inviteLinkInstructions;
  }
}
