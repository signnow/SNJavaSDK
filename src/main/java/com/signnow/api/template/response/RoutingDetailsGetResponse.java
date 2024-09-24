/*
 * This file is a part of signNow SDK API client.
 *
 * (с) Copyright © 2011-present airSlate Inc. (https://www.signnow.com)
 *
 * For more details on copyright, see LICENSE.md file
 * that was distributed with this source code.
 */

package com.signnow.api.template.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.signnow.api.template.response.data.ApproverGetCollection;
import com.signnow.api.template.response.data.CcGetCollection;
import com.signnow.api.template.response.data.CcStepGetCollection;
import com.signnow.api.template.response.data.InviteLinkInstructionGetCollection;
import com.signnow.api.template.response.data.RoutingDetailGetCollection;
import com.signnow.api.template.response.data.ViewerGetCollection;

@JsonIgnoreProperties(ignoreUnknown = true)
public class RoutingDetailsGetResponse {

  @JsonProperty("routing_details")
  private final RoutingDetailGetCollection routingDetails;

  @JsonProperty("cc")
  private final CcGetCollection cc;

  @JsonProperty("cc_step")
  private final CcStepGetCollection ccStep;

  @JsonProperty("viewers")
  private final ViewerGetCollection viewers;

  @JsonProperty("approvers")
  private final ApproverGetCollection approvers;

  @JsonProperty("invite_link_instructions")
  private final InviteLinkInstructionGetCollection inviteLinkInstructions;

  public RoutingDetailsGetResponse(
      @JsonProperty("routing_details") RoutingDetailGetCollection routingDetails,
      @JsonProperty("cc") CcGetCollection cc,
      @JsonProperty("cc_step") CcStepGetCollection ccStep,
      @JsonProperty("viewers") ViewerGetCollection viewers,
      @JsonProperty("approvers") ApproverGetCollection approvers,
      @JsonProperty("invite_link_instructions")
          InviteLinkInstructionGetCollection inviteLinkInstructions) {
    this.routingDetails = routingDetails;
    this.cc = cc;
    this.ccStep = ccStep;
    this.viewers = viewers;
    this.approvers = approvers;
    this.inviteLinkInstructions = inviteLinkInstructions;
  }

  public RoutingDetailGetCollection getRoutingDetails() {
    return routingDetails;
  }

  public CcGetCollection getCc() {
    return this.cc;
  }

  public CcStepGetCollection getCcStep() {
    return this.ccStep;
  }

  public ViewerGetCollection getViewers() {
    return this.viewers;
  }

  public ApproverGetCollection getApprovers() {
    return this.approvers;
  }

  public InviteLinkInstructionGetCollection getInviteLinkInstructions() {
    return this.inviteLinkInstructions;
  }
}
