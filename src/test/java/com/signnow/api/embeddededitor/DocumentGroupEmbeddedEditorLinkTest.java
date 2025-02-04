/*
 * This file is a part of signNow SDK API client.
 *
 * (с) Copyright © 2011-present airSlate Inc. (https://www.signnow.com)
 *
 * For more details on copyright, see LICENSE.md file
 * that was distributed with this source code.
 */

package com.signnow.api.embeddededitor;

import static org.junit.jupiter.api.Assertions.*;

import com.signnow.BaseTest;
import com.signnow.api.embeddededitor.request.DocumentGroupEmbeddedEditorLinkPostRequest;
import com.signnow.api.embeddededitor.response.DocumentGroupEmbeddedEditorLinkPostResponse;
import com.signnow.core.ApiClient;
import com.signnow.core.exception.SignNowApiException;
import com.signnow.mock.expectation.Expectation;
import com.signnow.mock.faker.SignNowFaker;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DocumentGroupEmbeddedEditorLinkTest extends BaseTest {

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
  public void testPostDocumentGroupEmbedEditorLink() {
    expectation = this.expectation("create_document_group_embedded_editor_link", "post");

    DocumentGroupEmbeddedEditorLinkPostRequest request =
        new DocumentGroupEmbeddedEditorLinkPostRequest(
            faker.redirectUri(), faker.redirectTarget(), faker.linkExpiration());

    request.withDocumentGroupId(faker.documentGroupId());

    assertDoesNotThrow(
        () -> {
          DocumentGroupEmbeddedEditorLinkPostResponse response =
              (DocumentGroupEmbeddedEditorLinkPostResponse) apiClient.send(request).getResponse();

          assertNotNull(
              response, "DocumentGroupEmbeddedEditorLinkPostResponse should not be null.");

          this.assertSame(expectation.get("data"), response.getData());
        },
        "Sending DocumentGroupEmbedEditorLinkPostRequest should not throw any exception.");
  }
}
