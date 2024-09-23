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
          this.assertSame(expectation.get("name"), response.getName());
          this.assertSame(expectation.get("filename"), response.getFilename());
          this.assertSame(expectation.get("page_count"), response.getPageCount());
          this.assertSame(expectation.get("created"), response.getCreated());
          this.assertSame(expectation.get("updated"), response.getUpdated());
          this.assertSame(expectation.get("editor_link"), response.getEditorLink());
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
