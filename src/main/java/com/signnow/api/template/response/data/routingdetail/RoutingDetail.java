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

/** Represents the routing detail for a template. */
public final class RoutingDetail extends ApiData {

  @JsonProperty("sign_as_merged")
  private final boolean signAsMerged;

  @JsonProperty("invite_steps")
  private final InviteStepCollection inviteSteps;

  @JsonProperty("include_email_attachments")
  private final String includeEmailAttachments;

  /**
   * Constructs a new RoutingDetail instance.
   *
   * @param signAsMerged Indicates if the sign is merged.
   * @param inviteSteps The collection of invite steps.
   * @param includeEmailAttachments Optional email attachments to include.
   */
  @JsonCreator
  public RoutingDetail(
      @JsonProperty("sign_as_merged") boolean signAsMerged,
      @JsonProperty("invite_steps") InviteStepCollection inviteSteps,
      @JsonProperty("include_email_attachments") String includeEmailAttachments) {
    this.signAsMerged = signAsMerged;
    this.inviteSteps = inviteSteps;
    this.includeEmailAttachments = includeEmailAttachments;
  }

  /**
   * Checks if the sign is merged.
   *
   * @return true if the sign is merged, false otherwise.
   */
  public boolean isSignAsMerged() {
    return this.signAsMerged;
  }

  /**
   * Gets the email attachments to include.
   *
   * @return The email attachments, or null if not set.
   */
  public String getIncludeEmailAttachments() {
    return this.includeEmailAttachments;
  }

  /**
   * Gets the collection of invite steps.
   *
   * @return The invite steps collection.
   */
  public InviteStepCollection getInviteSteps() {
    return this.inviteSteps;
  }

  /**
   * Converts the routing detail to a map representation.
   *
   * @return A map containing the routing detail data.
   */
  @NotNull
  public Map<String, Object> toMap() {
    Map<String, Object> map = new LinkedHashMap<>();
    map.put("sign_as_merged", this.isSignAsMerged());
    map.put("include_email_attachments", this.getIncludeEmailAttachments());
    map.put("invite_steps", this.getInviteSteps().toMap());
    return map;
  }

  /**
   * Creates a RoutingDetail instance from a map.
   *
   * @param data The map containing routing detail data.
   * @return A new RoutingDetail instance.
   */
  @NotNull
  @Contract("_ -> new")
  public static RoutingDetail fromMap(@NotNull Map<String, Object> data) {
    return new RoutingDetail(
        (Boolean) data.get("sign_as_merged"),
        (InviteStepCollection) data.get("invite_steps"),
        (String) data.get("include_email_attachments"));
  }
}
