/*
 * This file is a part of signNow SDK API client.
 *
 * (с) Copyright © 2011-present airSlate Inc. (https://www.signnow.com)
 *
 * For more details on copyright, see LICENSE.md file
 * that was distributed with this source code.
 */

package com.signnow.api.documentgroup.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.signnow.api.documentgroup.response.data.OriginatorOrganizationSettingsCollection;
import com.signnow.api.documentgroup.response.data.document.DocumentItemCollection;

@JsonIgnoreProperties(ignoreUnknown = true)
public class DocumentGroupGetResponse {

  @JsonProperty("id")
  private final String id;

  @JsonProperty("group_name")
  private final String groupName;

  @JsonProperty("documents")
  private final DocumentItemCollection documents;

  @JsonProperty("originator_organization_settings")
  private final OriginatorOrganizationSettingsCollection originatorOrganizationSettings;

  @JsonProperty("invite_id")
  private final String inviteId;

  public DocumentGroupGetResponse(
      @JsonProperty("id") String id,
      @JsonProperty("group_name") String groupName,
      @JsonProperty("documents") DocumentItemCollection documents,
      @JsonProperty("originator_organization_settings")
          OriginatorOrganizationSettingsCollection originatorOrganizationSettings,
      @JsonProperty("invite_id") String inviteId) {
    this.id = id;
    this.groupName = groupName;
    this.documents = documents;
    this.originatorOrganizationSettings = originatorOrganizationSettings;
    this.inviteId = inviteId;
  }

  public String getId() {
    return this.id;
  }

  public String getGroupName() {
    return this.groupName;
  }

  public DocumentItemCollection getDocuments() {
    return this.documents;
  }

  public OriginatorOrganizationSettingsCollection getOriginatorOrganizationSettings() {
    return this.originatorOrganizationSettings;
  }

  public String getInviteId() {
    return this.inviteId;
  }
}
