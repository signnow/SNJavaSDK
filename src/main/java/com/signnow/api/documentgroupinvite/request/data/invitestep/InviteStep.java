/*
 * This file is a part of signNow SDK API client.
 *
 * (с) Copyright © 2011-present airSlate Inc. (https://www.signnow.com)
 *
 * For more details on copyright, see LICENSE.md file
 * that was distributed with this source code.
 */

package com.signnow.api.documentgroupinvite.request.data.invitestep;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.signnow.core.data.ApiData;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

/**
 * This class represents an invite step in the signNow API.
 */
public final class InviteStep extends ApiData {

  /**
   * The order of the invite step.
   */
  @JsonProperty("order")
  private final int order;

  /**
   * The collection of invite actions associated with the invite step.
   */
  @JsonProperty("invite_actions")
  private final InviteActionCollection inviteActions;

  /**
   * The collection of invite emails associated with the invite step.
   */
  @JsonProperty("invite_emails")
  private final InviteEmailCollection inviteEmails;

  /**
   * Constructs an InviteStep object with the specified order, invite actions, and invite emails.
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
   * @return the order of the invite step
   */
  public int getOrder() {
    return this.order;
  }

  /**
   * Returns the collection of invite emails.
   *
   * @return the collection of invite emails
   */
  public InviteEmailCollection getInviteEmails() {
    return this.inviteEmails;
  }

  /**
   * Returns the collection of invite actions.
   *
   * @return the collection of invite actions
   */
  public InviteActionCollection getInviteActions() {
    return this.inviteActions;
  }

  /**
   * Converts this InviteStep object to a Map.
   *
   * @return a Map representing this InviteStep object
   */
  @NotNull
  @Override
  public Map<String, Object> toMap() {
    Map<String, Object> map = new LinkedHashMap<>();
    map.put("order", this.getOrder());
    map.put("invite_emails", this.getInviteEmails());
    map.put("invite_actions", this.getInviteActions());
    return map;
  }

  /**
   * Creates an InviteStep object from the specified Map.
   *
   * @param data a Map containing the data to create an InviteStep object
   * @return a new InviteStep object created from the specified Map
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
