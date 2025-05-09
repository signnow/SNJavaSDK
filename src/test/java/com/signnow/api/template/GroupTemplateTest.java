/*
 * This file is a part of signNow SDK API client.
 *
 * (с) Copyright © 2011-present airSlate Inc. (https://www.signnow.com)
 *
 * For more details on copyright, see LICENSE.md file
 * that was distributed with this source code.
 */

package com.signnow.api.template;

import static org.junit.jupiter.api.Assertions.*;

import com.signnow.BaseTest;
import com.signnow.api.template.request.GroupTemplateGetRequest;
import com.signnow.api.template.request.GroupTemplatePutRequest;
import com.signnow.api.template.response.GroupTemplateGetResponse;
import com.signnow.api.template.response.GroupTemplatePutResponse;
import com.signnow.core.ApiClient;
import com.signnow.core.exception.SignNowApiException;
import com.signnow.core.response.Reply;
import com.signnow.mock.expectation.Expectation;
import com.signnow.mock.faker.SignNowFaker;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class GroupTemplateTest extends BaseTest {

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
  public void testGetGroupTemplate() {
    expectation = this.expectation("get_document_group_template", "get");

    GroupTemplateGetRequest request = new GroupTemplateGetRequest();
    request.withTemplateId(faker.templateId());

    assertDoesNotThrow(
        () -> {
          GroupTemplateGetResponse response = (GroupTemplateGetResponse) apiClient.send(request).getResponse();

          assertNotNull(response, "GroupTemplateGetResponse should not be null.");

          this.assertSame(expectation.get("id"), response.getId());
          this.assertSame(expectation.get("user_id"), response.getUserId());
          this.assertSame(expectation.get("group_name"), response.getGroupName());
          this.assertSame(expectation.get("folder_id"), response.getFolderId());
          this.assertSame(expectation.get("routing_details"), response.getRoutingDetails());
          this.assertSame(expectation.get("templates"), response.getTemplates());
          this.assertSame(expectation.get("shared"), response.getShared());
          this.assertSame(expectation.get("document_group_template_owner_email"),
              response.getDocumentGroupTemplateOwnerEmail());
          this.assertSame(expectation.get("shared_team_id"), response.getSharedTeamId());
          this.assertSame(expectation.get("own_as_merged"), response.isOwnAsMerged());
          this.assertSame(expectation.get("email_action_on_complete"), response.getEmailActionOnComplete());
          this.assertSame(expectation.get("created"), response.getCreated());
          this.assertSame(expectation.get("updated"), response.getUpdated());
          this.assertSame(expectation.get("recently_used"), response.getRecentlyUsed());
          this.assertSame(expectation.get("pinned"), response.isPinned());
          this.assertSame(expectation.get("share_info"), response.getShareInfo());
        },
        "Sending GroupTemplateGetRequest should not throw any exception.");
  }

  @Test
  public void testPutGroupTemplate() {
    GroupTemplatePutRequest request =
        new GroupTemplatePutRequest(
            faker.templateGroupTemplateRoutingDetails(),
            faker.templateGroupName(),
            faker.templateGroupTemplateTemplateIdsToAdd(),
            faker.templateGroupTemplateTemplateIdsToRemove());
    request.withTemplateId(faker.templateId());

    assertDoesNotThrow(
        () -> {
          GroupTemplatePutResponse response = (GroupTemplatePutResponse) apiClient.send(request).getResponse();

          assertNotNull(response, "GroupTemplatePutResponse should not be null.");
        },
        "Sending GroupTemplatePutRequest should not throw any exception.");
  }
}
