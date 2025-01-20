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
 * This class represents an invite step in the signNow API.
 */
public final class InviteStep extends ApiData {

  /**
   * The order of the invite step.
   */
  @JsonProperty("order")
  private final int order;

  /**
   * The actions associated with the invite step.
   */
  @JsonProperty("invite_actions")
  private final InviteActionCollection inviteActions;

  /**
   * The emails associated with the invite step.
   */
  @JsonProperty("invite_emails")
  private final InviteEmailCollection inviteEmails;

  /**
   * Constructor for InviteStep.
   *
   * @param order The order of the invite step.
   * @param inviteActions The actions associated with the invite step.
   * @param inviteEmails The emails associated with the invite step.
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
   * Constructor for InviteStep.
   *
   * @param order The order of the invite step.
   * @param inviteActions The actions associated with the invite step.
   */
  public InviteStep(
      @JsonProperty("order") int order,
      @JsonProperty("invite_actions") InviteActionCollection inviteActions) {
    this.order = order;
    this.inviteActions = inviteActions;
    this.inviteEmails = new InviteEmailCollection();
  }

  /**
   * Returns the order of the invite step.
   *
   * @return The order of the invite step.
   */
  public int getOrder() {
    return this.order;
  }

  /**
   * Returns the emails associated with the invite step.
   *
   * @return The emails associated with the invite step.
   */
  public InviteEmailCollection getInviteEmails() {
    return this.inviteEmails;
  }

  /**
   * Returns the actions associated with the invite step.
   *
   * @return The actions associated with the invite step.
   */
  public InviteActionCollection getInviteActions() {
    return this.inviteActions;
  }

  /**
   * Converts the InviteStep to a Map.
   *
   * @return A Map representation of the InviteStep.
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
   * Creates an InviteStep from a Map.
   *
   * @param data The Map to convert to an InviteStep.
   * @return The created InviteStep.
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
