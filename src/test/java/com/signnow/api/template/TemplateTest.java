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
import com.signnow.api.template.request.TemplatePostRequest;
import com.signnow.api.template.response.TemplatePostResponse;
import com.signnow.core.ApiClient;
import com.signnow.core.exception.SignNowApiException;
import com.signnow.mock.expectation.Expectation;
import com.signnow.mock.faker.SignNowFaker;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TemplateTest extends BaseTest {

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
  public void testPostTemplate() {
    expectation = this.expectation("create_template", "post");

    TemplatePostRequest request = new TemplatePostRequest(faker.documentId(), faker.documentName());

    assertDoesNotThrow(
        () -> {
          TemplatePostResponse response = (TemplatePostResponse) apiClient.send(request).getResponse();

          assertNotNull(response, "TemplatePostResponse should not be null.");

          this.assertSame(expectation.get("id"), response.getId());
        },
        "Sending TemplatePostRequest should not throw any exception.");
  }
}
