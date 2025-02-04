/*
 * This file is a part of signNow SDK API client.
 *
 * (с) Copyright © 2011-present airSlate Inc. (https://www.signnow.com)
 *
 * For more details on copyright, see LICENSE.md file
 */

package com.signnow.api.embeddededitor;

import static org.junit.jupiter.api.Assertions.*;

import com.signnow.BaseTest;
import com.signnow.api.embeddededitor.request.DocumentEmbeddedEditorLinkPostRequest;
import com.signnow.api.embeddededitor.response.DocumentEmbeddedEditorLinkPostResponse;
import com.signnow.core.ApiClient;
import com.signnow.core.exception.SignNowApiException;
import com.signnow.mock.expectation.Expectation;
import com.signnow.mock.faker.SignNowFaker;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DocumentEmbeddedEditorLinkTest extends BaseTest {

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
  public void testPostDocumentEmbeddedEditorLink() {
    expectation = this.expectation("create_document_embedded_editor_link", "post");

    DocumentEmbeddedEditorLinkPostRequest request =
        new DocumentEmbeddedEditorLinkPostRequest(
            faker.redirectUri(), faker.redirectTarget(), faker.linkExpiration());

    request.withDocumentId(faker.documentId());

    assertDoesNotThrow(
        () -> {
          DocumentEmbeddedEditorLinkPostResponse response =
              (DocumentEmbeddedEditorLinkPostResponse) apiClient.send(request).getResponse();

          assertNotNull(response, "DocumentEmbeddedEditorLinkPostResponse should not be null.");

          this.assertSame(expectation.get("data"), response.getData());
        },
        "Sending DocumentEmbeddedEditorLinkPostResponse should not throw any exception.");
  }
}
