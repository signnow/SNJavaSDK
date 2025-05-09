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
import com.signnow.api.template.response.data.*;

/**
 * This class represents the response for getting routing details.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class RoutingDetailsGetResponse {

  /**
   * Collection of routing details.
   */
  @JsonProperty("routing_details")
  private final RoutingDetailGetCollection routingDetails;

  /**
   * Collection of CCs.
   */
  @JsonProperty("cc")
  private final CcGetCollection cc;

  /**
   * Collection of CC steps.
   */
  @JsonProperty("cc_step")
  private final CcStepGetCollection ccStep;

  /**
   * Collection of viewers.
   */
  @JsonProperty("viewers")
  private final ViewerGetCollection viewers;

  /**
   * Collection of persons who approve the signing.
   */
  @JsonProperty("approvers")
  private final ApproverGetCollection approvers;

  /**
   * Attributes.
   */
  @JsonProperty("attributes")
  private final AttributeGet attributes;

  /**
   * Collection of invite link instructions.
   */
  @JsonProperty("invite_link_instructions")
  private final InviteLinkInstructionGetCollection inviteLinkInstructions;

  /**
   * Constructor for RoutingDetailsGetResponse.
   *
   * @param routingDetails Collection of routing details.
   * @param cc Collection of CCs.
   * @param ccStep Collection of CC steps.
   * @param viewers Collection of viewers.
   * @param approvers Collection of persons who approve the signing.
   * @param inviteLinkInstructions Collection of invite link instructions.
   */
  public RoutingDetailsGetResponse(
      @JsonProperty("routing_details") RoutingDetailGetCollection routingDetails,
      @JsonProperty("cc") CcGetCollection cc,
      @JsonProperty("cc_step") CcStepGetCollection ccStep,
      @JsonProperty("viewers") ViewerGetCollection viewers,
      @JsonProperty("approvers") ApproverGetCollection approvers,
      @JsonProperty("attributes") AttributeGet attributes,
      @JsonProperty("invite_link_instructions")
          InviteLinkInstructionGetCollection inviteLinkInstructions) {
    this.routingDetails = routingDetails;
    this.cc = cc;
    this.ccStep = ccStep;
    this.viewers = viewers;
    this.approvers = approvers;
    this.attributes = attributes;
    this.inviteLinkInstructions = inviteLinkInstructions;
  }

  /**
   * Returns the collection of routing details.
   *
   * @return Collection of routing details.
   */
  public RoutingDetailGetCollection getRoutingDetails() {
    return routingDetails;
  }

  /**
   * Returns the collection of CCs.
   *
   * @return Collection of CCs.
   */
  public CcGetCollection getCc() {
    return this.cc;
  }

  /**
   * Returns the collection of CC steps.
   *
   * @return Collection of CC steps.
   */
  public CcStepGetCollection getCcStep() {
    return this.ccStep;
  }

  /**
   * Returns the collection of viewers.
   *
   * @return Collection of viewers.
   */
  public ViewerGetCollection getViewers() {
    return this.viewers;
  }

  /**
   * Returns the collection of approvers.
   *
   * @return Collection of approvers.
   */
  public ApproverGetCollection getApprovers() {
    return this.approvers;
  }

  /**
   * Returns the attributes.
   *
   * @return attributes.
   */
  public AttributeGet getAttributes() {
    return this.attributes;
  }

  /**
   * Returns the collection of invite link instructions.
   *
   * @return Collection of invite link instructions.
   */
  public InviteLinkInstructionGetCollection getInviteLinkInstructions() {
    return this.inviteLinkInstructions;
  }
}