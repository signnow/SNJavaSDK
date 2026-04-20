/*
 * This file is a part of signNow SDK API client.
 *
 * (с) Copyright © 2011-present airSlate Inc. (https://www.signnow.com)
 *
 * For more details on copyright, see LICENSE.md file
 * that was distributed with this source code.
 */

package com.signnow.api.documentgrouptemplate.request;

import com.signnow.core.request.ApiEndpoint;
import com.signnow.core.request.RequestInterface;
import com.signnow.api.documentgroup.request.data.CcCollection;
import com.signnow.api.documentgroup.request.data.GeneralReminder;
import com.signnow.api.documentgroup.request.data.recipient.RecipientCollection;

import java.util.HashMap;
import java.util.Map;

/**
 * This class represents a request to update document group template recipients.
 * It implements the RequestInterface with Object type.
 */
@ApiEndpoint(
    name = "updateDocumentGroupTemplateRecipients",
    url = "/v2/document-group-templates/{template_id}/recipients",
    method = "put",
    auth = "bearer",
    namespace = "documentGroupTemplate",
    entity = "documentGroupTemplateRecipients",
    type = "application/json")
public final class DocumentGroupTemplateRecipientsPutRequest implements RequestInterface<Object> {

  private final RecipientCollection recipients;

  private final CcCollection cc;

  private final Integer generalExpirationDays;

  private final GeneralReminder generalReminder;

  private final String orderType;

  private final HashMap<String, String> uriParams = new HashMap<>();

  /**
   * Constructs a new DocumentGroupTemplateRecipientsPutRequest with the specified recipients and cc.
   *
   * @param recipients the collection of recipients
   * @param cc the collection of cc
   */
  public DocumentGroupTemplateRecipientsPutRequest(RecipientCollection recipients, CcCollection cc) {
    this(recipients, cc, null, null, null);
  }

  /**
   * Constructs a new DocumentGroupTemplateRecipientsPutRequest with all fields.
   *
   * @param recipients the collection of recipients
   * @param cc the collection of cc
   * @param generalExpirationDays the number of general expiration days
   * @param generalReminder the general reminder
   * @param orderType the order type (at_the_same_time, recipient_order, advanced_order)
   */
  public DocumentGroupTemplateRecipientsPutRequest(
      RecipientCollection recipients,
      CcCollection cc,
      Integer generalExpirationDays,
      GeneralReminder generalReminder,
      String orderType) {
    this.recipients = recipients != null ? recipients : new RecipientCollection();
    this.cc = cc != null ? cc : new CcCollection();
    this.generalExpirationDays = generalExpirationDays;
    this.generalReminder = generalReminder;
    this.orderType = orderType;
  }

  /**
   * Returns the collection of recipients.
   *
   * @return the collection of recipients
   */
  public RecipientCollection getRecipients() {
    return this.recipients;
  }

  /**
   * Returns the collection of cc.
   *
   * @return the collection of cc
   */
  public CcCollection getCc() {
    return this.cc;
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
   * Returns the general reminder.
   *
   * @return the general reminder, or null if not set
   */
  public GeneralReminder getGeneralReminder() {
    return this.generalReminder;
  }

  /**
   * Returns the order type.
   *
   * @return the order type, or null if not set
   */
  public String getOrderType() {
    return this.orderType;
  }

  /**
   * Sets the document group template ID in the URI parameters.
   *
   * @param templateId the document group template ID
   * @return the current instance of DocumentGroupTemplateRecipientsPutRequest
   */
  public DocumentGroupTemplateRecipientsPutRequest withTemplateId(String templateId) {
    if (templateId != null) {
      this.uriParams.put("template_id", templateId);
    }
    return this;
  }

  /**
   * Returns a HashMap containing the URI parameters as key-value pairs.
   *
   * @return a HashMap containing the URI parameters
   */
  @Override
  public HashMap<String, String> uriParams() {
    return this.uriParams;
  }

  /**
   * Returns a Map with the payload of the request.
   *
   * @return a Map with the payload of the request
   */
  @Override
  public Map<String, Object> payload() {
    Map<String, Object> map = new HashMap<>();
    map.put("recipients", this.recipients != null ? this.recipients.toArray() : new Object[0]);
    map.put("cc", this.cc != null ? this.cc.toArray() : new Object[0]);
    if (this.generalExpirationDays != null) {
      map.put("general_expiration_days", this.generalExpirationDays);
    }
    if (this.generalReminder != null) {
      map.put("general_reminder", this.generalReminder.toMap());
    }
    if (this.orderType != null) {
      map.put("order_type", this.orderType);
    }
    return map;
  }
}
