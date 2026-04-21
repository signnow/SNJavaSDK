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
import com.signnow.api.documentgroup.response.data.data.GeneralReminder;
import com.signnow.api.documentgroup.response.data.document.DocumentItemCollection;

/**
 * This class represents the response from the Document Group Get API.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class DocumentGroupGetResponse {

  /**
   * The unique identifier of the document group.
   */
  @JsonProperty("id")
  private final String id;

  /**
   * The name of the document group.
   */
  @JsonProperty("group_name")
  private final String groupName;

  /**
   * The collection of documents in the document group.
   */
  @JsonProperty("documents")
  private final DocumentItemCollection documents;

  /**
   * The settings of the organization that originated the document group.
   */
  @JsonProperty("originator_organization_settings")
  private final OriginatorOrganizationSettingsCollection originatorOrganizationSettings;

  /**
   * The unique identifier of the invite.
   */
  @JsonProperty("invite_id")
  private final String inviteId;

  /**
   * The number of general expiration days for the document group.
   */
  @JsonProperty("general_expiration_days")
  private final Integer generalExpirationDays;

  /**
   * General reminder for the document group.
   */
  @JsonProperty("general_reminder")
  private final GeneralReminder generalReminder;

  /**
   * The order type for the document group recipients.
   * Possible values: at_the_same_time, recipient_order, advanced_order.
   */
  @JsonProperty("order_type")
  private final String orderType;

  /**
   * Constructs a new DocumentGroupGetResponse with the specified parameters.
   *
   * @param id the unique identifier of the document group
   * @param groupName the name of the document group
   * @param documents the collection of documents in the document group
   * @param originatorOrganizationSettings the settings of the organization that originated the document group
   * @param inviteId the unique identifier of the invite
   * @param generalExpirationDays the number of general expiration days
   * @param generalReminder the general reminder
   * @param orderType the order type for the document group recipients
   */
  public DocumentGroupGetResponse(
      @JsonProperty("id") String id,
      @JsonProperty("group_name") String groupName,
      @JsonProperty("documents") DocumentItemCollection documents,
      @JsonProperty("originator_organization_settings")
          OriginatorOrganizationSettingsCollection originatorOrganizationSettings,
      @JsonProperty("invite_id") String inviteId,
      @JsonProperty("general_expiration_days") Integer generalExpirationDays,
      @JsonProperty("general_reminder") GeneralReminder generalReminder,
      @JsonProperty("order_type") String orderType) {
    this.id = id;
    this.groupName = groupName;
    this.documents = documents;
    this.originatorOrganizationSettings = originatorOrganizationSettings;
    this.inviteId = inviteId;
    this.generalExpirationDays = generalExpirationDays;
    this.generalReminder = generalReminder;
    this.orderType = orderType;
  }

  /**
   * Returns the unique identifier of the document group.
   *
   * @return the unique identifier of the document group
   */
  public String getId() {
    return this.id;
  }

  /**
   * Returns the name of the document group.
   *
   * @return the name of the document group
   */
  public String getGroupName() {
    return this.groupName;
  }

  /**
   * Returns the collection of documents in the document group.
   *
   * @return the collection of documents in the document group
   */
  public DocumentItemCollection getDocuments() {
    return this.documents;
  }

  /**
   * Returns the settings of the organization that originated the document group.
   *
   * @return the settings of the organization that originated the document group
   */
  public OriginatorOrganizationSettingsCollection getOriginatorOrganizationSettings() {
    return this.originatorOrganizationSettings;
  }

  /**
   * Returns the unique identifier of the invite.
   *
   * @return the unique identifier of the invite
   */
  public String getInviteId() {
    return this.inviteId;
  }

  /**
   * Returns the number of general expiration days.
   *
   * @return the number of general expiration days, or null if not set
   */
  public Integer getGeneralExpirationDays() {
    return this.generalExpirationDays;
  }

  /**
   * Returns the collection of general reminders.
   *
   * @return the general reminder, or null if not set
   */
  public GeneralReminder getGeneralReminder() {
    return this.generalReminder;
  }

  /**
   * Returns the order type for the document group recipients.
   *
   * @return the order type, or null if not set
   */
  public String getOrderType() {
    return this.orderType;
  }
}