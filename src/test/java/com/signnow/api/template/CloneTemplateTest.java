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
import com.signnow.api.template.request.CloneTemplatePostRequest;
import com.signnow.api.template.response.CloneTemplatePostResponse;
import com.signnow.core.ApiClient;
import com.signnow.core.exception.SignNowApiException;
import com.signnow.mock.expectation.Expectation;
import com.signnow.mock.faker.SignNowFaker;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CloneTemplateTest extends BaseTest {

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
  public void testPostCloneTemplate() {
    expectation = this.expectation("create_document_with_template", "post");

    CloneTemplatePostRequest request =
        new CloneTemplatePostRequest(
            faker.documentName(), faker.clientTimestampString(), faker.folderId());
    request.withTemplateId(faker.templateId());

    assertDoesNotThrow(
        () -> {
          CloneTemplatePostResponse response = (CloneTemplatePostResponse) apiClient.send(request).getResponse();

          assertNotNull(response, "CloneTemplatePostResponse should not be null.");

          this.assertSame(expectation.get("id"), response.getId());
          this.assertSame(expectation.get("name"), response.getName());
        },
        "Sending CloneTemplatePostRequest should not throw any exception.");
  }
}
