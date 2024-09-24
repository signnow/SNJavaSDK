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

public final class RoutingDetail extends ApiData {

  @JsonProperty("invite_steps")
  private final InviteStepCollection inviteSteps;

  @JsonProperty("include_email_attachments")
  private final int includeEmailAttachments;

  @JsonCreator
  public RoutingDetail(
      @JsonProperty("invite_steps") InviteStepCollection inviteSteps,
      @JsonProperty("include_email_attachments") int includeEmailAttachments) {
    this.inviteSteps = inviteSteps;
    this.includeEmailAttachments = includeEmailAttachments;
  }

  public RoutingDetail(@JsonProperty("invite_steps") InviteStepCollection inviteSteps) {
    this.inviteSteps = inviteSteps;
    this.includeEmailAttachments = 0;
  }

  public InviteStepCollection getInviteSteps() {
    return this.inviteSteps;
  }

  public int getIncludeEmailAttachments() {
    return this.includeEmailAttachments;
  }

  @NotNull
  @Override
  public Map<String, Object> toMap() {
    Map<String, Object> map = new LinkedHashMap<>();
    map.put("invite_steps", this.getInviteSteps());
    map.put("include_email_attachments", this.getIncludeEmailAttachments());
    return map;
  }

  @NotNull
  @Contract("_ -> new")
  public static RoutingDetail fromMap(@NotNull Map<String, Object> data) {
    return new RoutingDetail(
        (InviteStepCollection) data.get("invite_steps"),
        (int) data.get("include_email_attachments"));
  }
}
