/*
 * This file is a part of signNow SDK API client.
 *
 * (с) Copyright © 2011-present airSlate Inc. (https://www.signnow.com)
 *
 * For more details on copyright, see LICENSE.md file
 * that was distributed with this source code.
 */

package com.signnow.api.template.request.data.routingdetail;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.signnow.core.data.ApiData;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

/**
 * This class represents the routing details of a request.
 */
public final class RoutingDetail extends ApiData {

  /**
   * Collection of invite steps.
   */
  @JsonProperty("invite_steps")
  private final InviteStepCollection inviteSteps;

  /**
   * Flag to include email attachments.
   */
  @JsonProperty("include_email_attachments")
  private final int includeEmailAttachments;

  /**
   * Constructor to initialize RoutingDetail with invite steps and email attachment flag.
   *
   * @param inviteSteps Collection of invite steps.
   * @param includeEmailAttachments Flag to include email attachments.
   */
  @JsonCreator
  public RoutingDetail(
      @JsonProperty("invite_steps") InviteStepCollection inviteSteps,
      @JsonProperty("include_email_attachments") int includeEmailAttachments) {
    this.inviteSteps = inviteSteps;
    this.includeEmailAttachments = includeEmailAttachments;
  }

  /**
   * Constructor to initialize RoutingDetail with invite steps.
   *
   * @param inviteSteps Collection of invite steps.
   */
  public RoutingDetail(@JsonProperty("invite_steps") InviteStepCollection inviteSteps) {
    this.inviteSteps = inviteSteps;
    this.includeEmailAttachments = 0;
  }

  /**
   * Getter for invite steps.
   *
   * @return Collection of invite steps.
   */
  public InviteStepCollection getInviteSteps() {
    return this.inviteSteps;
  }

  /**
   * Getter for email attachment flag.
   *
   * @return Flag to include email attachments.
   */
  public int getIncludeEmailAttachments() {
    return this.includeEmailAttachments;
  }

  /**
   * Converts the RoutingDetail object to a Map.
   *
   * @return Map representation of the RoutingDetail object.
   */
  @NotNull
  @Override
  public Map<String, Object> toMap() {
    Map<String, Object> map = new LinkedHashMap<>();
    map.put("invite_steps", this.getInviteSteps());
    map.put("include_email_attachments", this.getIncludeEmailAttachments());
    return map;
  }

  /**
   * Creates a RoutingDetail object from a Map.
   *
   * @param data Map containing the data to create a RoutingDetail object.
   * @return New RoutingDetail object.
   */
  @NotNull
  @Contract("_ -> new")
  public static RoutingDetail fromMap(@NotNull Map<String, Object> data) {
    return new RoutingDetail(
        (InviteStepCollection) data.get("invite_steps"),
        (int) data.get("include_email_attachments"));
  }
}
