/*
 * This file is a part of signNow SDK API client.
 *
 * (с) Copyright © 2011-present airSlate Inc. (https://www.signnow.com)
 *
 * For more details on copyright, see LICENSE.md file
 * that was distributed with this source code.
 */

package com.signnow.api.template.response.data.routingdetail;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.signnow.core.data.ApiData;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

/** Represents an invitation step in the routing detail. */
public final class InviteStep extends ApiData {

  /**
   * The order or sequence number of the invitation step.
   */
  @JsonProperty("order")
  private final int order;

  /**
   * Collection of actions assigned to the invitees.
   */
  @JsonProperty("invite_actions")
  private final InviteActionCollection inviteActions;

  /**
   * Collection of emails to be invited.
   */
  @JsonProperty("invite_emails")
  private final InviteEmailCollection inviteEmails;

  /**
   * Constructs an InviteStep with the specified order, invite actions, and invite emails.
   *
   * @param order the order of the invite step
   * @param inviteActions the collection of invite actions
   * @param inviteEmails the collection of invite emails
   */
  @JsonCreator
  public InviteStep(
      @JsonProperty("order") int order,
      @JsonProperty("invite_actions") InviteActionCollection inviteActions,
      @JsonProperty("invite_emails") InviteEmailCollection inviteEmails) {
    this.order = order;
    this.inviteActions = inviteActions;
    this.inviteEmails = inviteEmails;
  }

  /**
   * Returns the order of the invite step.
   *
   * @return the order
   */
  public int getOrder() {
    return order;
  }

  /**
   * Returns the collection of invite emails.
   *
   * @return the invite emails
   */
  public InviteEmailCollection getInviteEmails() {
    return inviteEmails;
  }

  /**
   * Returns the collection of invite actions.
   *
   * @return the invite actions
   */
  public InviteActionCollection getInviteActions() {
    return inviteActions;
  }

  /**
   * Converts the invite step to a map representation.
   *
   * @return a map containing the invite step data
   */
  @NotNull
  public Map<String, Object> toMap() {
    Map<String, Object> map = new LinkedHashMap<>();
    map.put("order", this.getOrder());
    map.put("invite_emails", this.getInviteEmails());
    map.put("invite_actions", this.getInviteActions());
    return map;
  }

  /**
   * Creates an InviteStep from a map representation.
   *
   * @param data the map containing the invite step data
   * @return a new InviteStep instance
   */
  @NotNull
  @Contract("_ -> new")
  public static InviteStep fromMap(@NotNull Map<String, Object> data) {
    return new InviteStep(
        (int) data.get("order"),
        (InviteActionCollection) data.get("invite_actions"),
        (InviteEmailCollection) data.get("invite_emails"));
  }
}
