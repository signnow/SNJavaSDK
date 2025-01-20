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

/**
 * This class represents the response of the routing details post request.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class RoutingDetailsPostResponse {

  /**
   * The routing details of the post response.
   */
  @JsonProperty("routing_details")
  private final RoutingDetailPostCollection routingDetails;

  /**
   * The cc of the post response.
   */
  @JsonProperty("cc")
  private final CcPostCollection cc;

  /**
   * The cc step of the post response.
   */
  @JsonProperty("cc_step")
  private final CcStepPostCollection ccStep;

  /**
   * The viewers of the post response.
   */
  @JsonProperty("viewers")
  private final ViewerPostCollection viewers;

  /**
   * The approvers of the post response.
   */
  @JsonProperty("approvers")
  private final ApproverPostCollection approvers;

  /**
   * The invite link instructions of the post response.
   */
  @JsonProperty("invite_link_instructions")
  private final InviteLinkInstructionPostCollection inviteLinkInstructions;

  /**
   * Constructs a new RoutingDetailsPostResponse with the specified parameters.
   *
   * @param routingDetails the routing details of the post response
   * @param cc the cc of the post response
   * @param ccStep the cc step of the post response
   * @param viewers the viewers of the post response
   * @param approvers the approvers of the post response
   * @param inviteLinkInstructions the invite link instructions of the post response
   */
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

  /**
   * Returns the routing details of the post response.
   *
   * @return the routing details of the post response
   */
  public RoutingDetailPostCollection getRoutingDetails() {
    return this.routingDetails;
  }

  /**
   * Returns the cc of the post response.
   *
   * @return the cc of the post response
   */
  public CcPostCollection getCc() {
    return this.cc;
  }

  /**
   * Returns the cc step of the post response.
   *
   * @return the cc step of the post response
   */
  public CcStepPostCollection getCcStep() {
    return this.ccStep;
  }

  /**
   * Returns the viewers of the post response.
   *
   * @return the viewers of the post response
   */
  public ViewerPostCollection getViewers() {
    return this.viewers;
  }

  /**
   * Returns the approvers of the post response.
   *
   * @return the approvers of the post response
   */
  public ApproverPostCollection getApprovers() {
    return this.approvers;
  }

  /**
   * Returns the invite link instructions of the post response.
   *
   * @return the invite link instructions of the post response
   */
  public InviteLinkInstructionPostCollection getInviteLinkInstructions() {
    return this.inviteLinkInstructions;
  }
}