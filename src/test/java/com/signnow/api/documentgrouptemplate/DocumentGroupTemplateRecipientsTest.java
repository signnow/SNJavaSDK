/*
 * This file is a part of signNow SDK API client.
 *
 * (с) Copyright © 2011-present airSlate Inc. (https://www.signnow.com)
 *
 * For more details on copyright, see LICENSE.md file
 * that was distributed with this source code.
 */

package com.signnow.api.documentgrouptemplate;

import static org.junit.jupiter.api.Assertions.*;

import com.signnow.BaseTest;
import com.signnow.api.documentgrouptemplate.request.DocumentGroupTemplateRecipientsGetRequest;
import com.signnow.api.documentgrouptemplate.request.DocumentGroupTemplateRecipientsPutRequest;
import com.signnow.api.documentgrouptemplate.response.DocumentGroupTemplateRecipientsGetResponse;
import com.signnow.api.documentgrouptemplate.response.DocumentGroupTemplateRecipientsPutResponse;
import com.signnow.core.ApiClient;
import com.signnow.core.exception.SignNowApiException;
import com.signnow.mock.expectation.Expectation;
import com.signnow.mock.faker.SignNowFaker;
import com.signnow.api.documentgroup.request.data.CcCollection;
import com.signnow.api.documentgroup.request.data.GeneralReminder;
import com.signnow.api.documentgroup.request.data.recipient.RecipientCollection;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DocumentGroupTemplateRecipientsTest extends BaseTest {

  private ApiClient apiClient;

  private SignNowFaker faker;

  private Expectation expectation;

  @BeforeEach
  public void setUp() {
    try {
      apiClient = this.client();
    } catch (SignNowApiException e) {
      fail(e.getMessage());
    }
    faker = this.faker();
  }

  @Test
  public void testGetDocumentGroupTemplateRecipients() {
    expectation = this.expectation("get_document_group_template_recipients", "get");

    DocumentGroupTemplateRecipientsGetRequest request = new DocumentGroupTemplateRecipientsGetRequest();
    request.withTemplateId(faker.templateId());

    assertDoesNotThrow(
        () -> {
          DocumentGroupTemplateRecipientsGetResponse response = (DocumentGroupTemplateRecipientsGetResponse) apiClient.send(request).getResponse();

          assertNotNull(response, "DocumentGroupTemplateRecipientsGetResponse should not be null.");
          assertNotNull(response.getData(), "Data should not be null.");
          assertNotNull(response.getData().getGeneralExpirationDays(), "General expiration days should not be null.");
          assertNotNull(response.getData().getGeneralReminder(), "General reminder should not be null.");
          assertNotNull(response.getData().getOrderType(), "Order type should not be null.");
          this.assertSame(expectation.get("data"), response.getData());
        },
        "Sending DocumentGroupTemplateRecipientsGetRequest should not throw any exception.");
  }

  @Test
  public void testPutDocumentGroupTemplateRecipients() {
    expectation = this.expectation("update_document_group_template_recipients", "put");

    RecipientCollection recipients = new RecipientCollection();
    CcCollection cc = new CcCollection();
    GeneralReminder generalReminder = new GeneralReminder(1, 5, 3);

    DocumentGroupTemplateRecipientsPutRequest request = new DocumentGroupTemplateRecipientsPutRequest(
        recipients, cc, 30, generalReminder, "recipient_order");
    request.withTemplateId(faker.templateId());

    assertDoesNotThrow(
        () -> {
          DocumentGroupTemplateRecipientsPutResponse response = (DocumentGroupTemplateRecipientsPutResponse) apiClient.send(request).getResponse();

          assertNotNull(response, "DocumentGroupTemplateRecipientsPutResponse should not be null.");
          assertNotNull(response.getData(), "Data should not be null.");
          assertNotNull(response.getData().getGeneralExpirationDays(), "General expiration days should not be null.");
          assertNotNull(response.getData().getGeneralReminder(), "General reminder should not be null.");
          assertNotNull(response.getData().getOrderType(), "Order type should not be null.");
          this.assertSame(expectation.get("data"), response.getData());
        },
        "Sending DocumentGroupTemplateRecipientsPutRequest should not throw any exception.");
  }
}
