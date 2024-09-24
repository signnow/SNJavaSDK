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
import com.signnow.api.template.response.data.ApproverPostCollection;
import com.signnow.api.template.response.data.CcPostCollection;
import com.signnow.api.template.response.data.CcStepPostCollection;
import com.signnow.api.template.response.data.InviteLinkInstructionPostCollection;
import com.signnow.api.template.response.data.RoutingDetailPostCollection;
import com.signnow.api.template.response.data.ViewerPostCollection;

@JsonIgnoreProperties(ignoreUnknown = true)
public class RoutingDetailsPostResponse {

  @JsonProperty("routing_details")
  private final RoutingDetailPostCollection routingDetails;

  @JsonProperty("cc")
  private final CcPostCollection cc;

  @JsonProperty("cc_step")
  private final CcStepPostCollection ccStep;

  @JsonProperty("viewers")
  private final ViewerPostCollection viewers;

  @JsonProperty("approvers")
  private final ApproverPostCollection approvers;

  @JsonProperty("invite_link_instructions")
  private final InviteLinkInstructionPostCollection inviteLinkInstructions;

  public RoutingDetailsPostResponse(
      @JsonProperty("routing_details") RoutingDetailPostCollection routingDetails,
      @JsonProperty("cc") CcPostCollection cc,
      @JsonProperty("cc_step") CcStepPostCollection ccStep,
      @JsonProperty("viewers") ViewerPostCollection viewers,
      @JsonProperty("approvers") ApproverPostCollection approvers,
      @JsonProperty("invite_link_instructions")
          InviteLinkInstructionPostCollection inviteLinkInstructions) {
    this.routingDetails = routingDetails;
    this.cc = cc;
    this.ccStep = ccStep;
    this.viewers = viewers;
    this.approvers = approvers;
    this.inviteLinkInstructions = inviteLinkInstructions;
  }

  public RoutingDetailPostCollection getRoutingDetails() {
    return this.routingDetails;
  }

  public CcPostCollection getCc() {
    return this.cc;
  }

  public CcStepPostCollection getCcStep() {
    return this.ccStep;
  }

  public ViewerPostCollection getViewers() {
    return this.viewers;
  }

  public ApproverPostCollection getApprovers() {
    return this.approvers;
  }

  public InviteLinkInstructionPostCollection getInviteLinkInstructions() {
    return this.inviteLinkInstructions;
  }
}
