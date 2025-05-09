/*
 * This file is a part of signNow SDK API client.
 *
 * (с) Copyright © 2011-present airSlate Inc. (https://www.signnow.com)
 *
 * For more details on copyright, see LICENSE.md file
 * that was distributed with this source code.
 */

package com.signnow.api.template.response;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.signnow.api.template.response.data.ShareInfo;
import com.signnow.api.template.response.data.routingdetail.RoutingDetail;
import com.signnow.api.template.response.data.template.TemplateCollection;

/**
 * Represents a group template with various details.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public final class GroupTemplateGetResponse {

  /**
   * The unique ID of the group template.
   */
  @JsonProperty("id")
  private final String id;

  /**
   * Identifier of the user who owns the document group.
   */
  @JsonProperty("user_id")
  private final String userId;

  /**
   * Name of the group.
   */
  @JsonProperty("group_name")
  private final String groupName;

  /**
   * Identifier of the folder containing this document group.
   */
  @JsonProperty("folder_id")
  private final String folderId;

  /**
   * Routing details related to this document group.
   */
  @JsonProperty("routing_details")
  private final RoutingDetail routingDetails;

  /**
   * Templates associated with the document group.
   */
  @JsonProperty("templates")
  private final TemplateCollection templates;

  /**
   * Indicates whether the document group is shared (1) or not (0).
   */
  @JsonProperty("shared")
  private final int shared;

  /**
   * Email of the owner who created the document group template.
   */
  @JsonProperty("document_group_template_owner_email")
  private final String documentGroupTemplateOwnerEmail;

  /**
   * Identifier of the team with which the document group is shared.
   */
  @JsonProperty("shared_team_id")
  private final String sharedTeamId;

  /**
   * Indicates if the document group should be owned as merged.
   */
  @JsonProperty("own_as_merged")
  private final boolean ownAsMerged;

  /**
   * Action to be taken via email after the completion of a workflow.
   */
  @JsonProperty("email_action_on_complete")
  private final String emailActionOnComplete;

  /**
   * Timestamp when the document group was created (Unix epoch).
   */
  @JsonProperty("created")
  private final int created;

  /**
   * Timestamp when the document group was last updated (Unix epoch).
   */
  @JsonProperty("updated")
  private final int updated;

  /**
   * Indicates if the document group was recently used (1 = yes, 0 = no).
   */
  @JsonProperty("recently_used")
  private final int recentlyUsed;

  /**
   * Indicates if the document group is pinned for easy access.
   */
  @JsonProperty("pinned")
  private final boolean pinned;

  /**
   * Information about sharing settings and permissions.
   */
  @JsonProperty("share_info")
  private final ShareInfo shareInfo;

  /**
   * Constructs a new GroupTemplateGet instance.
   *
   * @param id The ID of the group template.
   * @param userId The user ID associated with the group template.
   * @param groupName The name of the group.
   * @param folderId The folder ID where the template is stored.
   * @param routingDetails The routing details of the template.
   * @param templates The collection of templates.
   * @param shared The shared status of the template.
   * @param documentGroupTemplateOwnerEmail The email of the document group template owner.
   * @param sharedTeamId The ID of the shared team.
   * @param ownAsMerged Whether the template is owned as merged.
   * @param emailActionOnComplete The email action on completion.
   * @param created The creation timestamp.
   * @param updated The update timestamp.
   * @param recentlyUsed The recently used status.
   * @param pinned Whether the template is pinned.
   * @param shareInfo The share information.
   */
  @JsonCreator
  public GroupTemplateGetResponse(
      @JsonProperty("id") String id,
      @JsonProperty("userId") String userId,
      @JsonProperty("groupName") String groupName,
      @JsonProperty("folderId") String folderId,
      @JsonProperty("routingDetails") RoutingDetail routingDetails,
      @JsonProperty("templates") TemplateCollection templates,
      @JsonProperty("shared") int shared,
      @JsonProperty("documentGroupTemplateOwnerEmail") String documentGroupTemplateOwnerEmail,
      @JsonProperty("sharedTeamId") String sharedTeamId,
      @JsonProperty("ownAsMerged") boolean ownAsMerged,
      @JsonProperty("emailActionOnComplete") String emailActionOnComplete,
      @JsonProperty("created") int created,
      @JsonProperty("updated") int updated,
      @JsonProperty("recentlyUsed") int recentlyUsed,
      @JsonProperty("pinned") boolean pinned,
      @JsonProperty("shareInfo") ShareInfo shareInfo) {
    this.id = id;
    this.userId = userId;
    this.groupName = groupName;
    this.folderId = folderId;
    this.routingDetails = routingDetails;
    this.templates = templates;
    this.shared = shared;
    this.documentGroupTemplateOwnerEmail = documentGroupTemplateOwnerEmail;
    this.sharedTeamId = sharedTeamId;
    this.ownAsMerged = ownAsMerged;
    this.emailActionOnComplete = emailActionOnComplete;
    this.created = created;
    this.updated = updated;
    this.recentlyUsed = recentlyUsed;
    this.pinned = pinned;
    this.shareInfo = shareInfo;
  }

  /**
   * Gets the ID of the group template.
   *
   * @return The ID of the group template.
   */
  public String getId() {
    return this.id;
  }

  /**
   * Gets the user ID associated with the group template.
   *
   * @return The user ID.
   */
  public String getUserId() {
    return this.userId;
  }

  /**
   * Gets the name of the group.
   *
   * @return The group name.
   */
  public String getGroupName() {
    return this.groupName;
  }

  /**
   * Gets the folder ID where the template is stored.
   *
   * @return The folder ID.
   */
  public String getFolderId() {
    return this.folderId;
  }

  /**
   * Gets the routing details of the template.
   *
   * @return The routing details.
   */
  public RoutingDetail getRoutingDetails() {
    return this.routingDetails;
  }

  /**
   * Gets the collection of templates.
   *
   * @return The template collection.
   */
  public TemplateCollection getTemplates() {
    return this.templates;
  }

  /**
   * Gets the shared status of the template.
   *
   * @return The shared status.
   */
  public int getShared() {
    return this.shared;
  }

  /**
   * Gets the email of the document group template owner.
   *
   * @return The owner's email.
   */
  public String getDocumentGroupTemplateOwnerEmail() {
    return this.documentGroupTemplateOwnerEmail;
  }

  /**
   * Gets the ID of the shared team.
   *
   * @return The shared team ID.
   */
  public String getSharedTeamId() {
    return this.sharedTeamId;
  }

  /**
   * Gets the share information.
   *
   * @return The share information.
   */
  public ShareInfo getShareInfo() {
    return this.shareInfo;
  }

  /**
   * Checks if the template is owned as merged.
   *
   * @return True if owned as merged, otherwise false.
   */
  public boolean isOwnAsMerged() {
    return this.ownAsMerged;
  }

  /**
   * Gets the email action on completion.
   *
   * @return The email action on completion.
   */
  public String getEmailActionOnComplete() {
    return this.emailActionOnComplete;
  }

  /**
   * Gets the creation timestamp.
   *
   * @return The creation timestamp.
   */
  public int getCreated() {
    return this.created;
  }

  /**
   * Gets the update timestamp.
   *
   * @return The update timestamp.
   */
  public int getUpdated() {
    return this.updated;
  }

  /**
   * Gets the recently used status.
   *
   * @return The recently used status.
   */
  public int getRecentlyUsed() {
    return this.recentlyUsed;
  }

  /**
   * Checks if the template is pinned.
   *
   * @return True if pinned, otherwise false.
   */
  public boolean isPinned() {
    return this.pinned;
  }
}
