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

public final class InviteStep extends ApiData {

  @JsonProperty("order")
  private final int order;

  @JsonProperty("invite_actions")
  private final InviteActionCollection inviteActions;

  @JsonProperty("invite_emails")
  private final InviteEmailCollection inviteEmails;

  @JsonCreator
  public InviteStep(
      @JsonProperty("order") int order,
      @JsonProperty("invite_actions") InviteActionCollection inviteActions,
      @JsonProperty("invite_emails") InviteEmailCollection inviteEmails) {
    this.order = order;
    this.inviteActions = inviteActions;
    this.inviteEmails = inviteEmails;
  }

  public InviteStep(
      @JsonProperty("order") int order,
      @JsonProperty("invite_actions") InviteActionCollection inviteActions) {
    this.order = order;
    this.inviteActions = inviteActions;
    this.inviteEmails = new InviteEmailCollection();
  }

  public int getOrder() {
    return this.order;
  }

  public InviteEmailCollection getInviteEmails() {
    return this.inviteEmails;
  }

  public InviteActionCollection getInviteActions() {
    return this.inviteActions;
  }

  @NotNull
  @Override
  public Map<String, Object> toMap() {
    Map<String, Object> map = new LinkedHashMap<>();
    map.put("order", this.getOrder());
    map.put("invite_emails", this.getInviteEmails());
    map.put("invite_actions", this.getInviteActions());
    return map;
  }

  @NotNull
  @Contract("_ -> new")
  public static InviteStep fromMap(@NotNull Map<String, Object> data) {
    return new InviteStep(
        (int) data.get("order"),
        (InviteActionCollection) data.get("invite_actions"),
        (InviteEmailCollection) data.get("invite_emails"));
  }
}
