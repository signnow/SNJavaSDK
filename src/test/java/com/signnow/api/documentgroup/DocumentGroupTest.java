/*
 * This file is a part of signNow SDK API client.
 *
 * (с) Copyright © 2011-present airSlate Inc. (https://www.signnow.com)
 *
 * For more details on copyright, see LICENSE.md file
 * that was distributed with this source code.
 */

package com.signnow.api.documentgroup;

import static org.junit.jupiter.api.Assertions.*;

import com.signnow.BaseTest;
import com.signnow.api.documentgroup.request.DocumentGroupDeleteRequest;
import com.signnow.api.documentgroup.request.DocumentGroupGetRequest;
import com.signnow.api.documentgroup.request.DocumentGroupPostRequest;
import com.signnow.api.documentgroup.response.DocumentGroupDeleteResponse;
import com.signnow.api.documentgroup.response.DocumentGroupGetResponse;
import com.signnow.api.documentgroup.response.DocumentGroupPostResponse;
import com.signnow.core.ApiClient;
import com.signnow.core.exception.SignNowApiException;
import com.signnow.mock.expectation.Expectation;
import com.signnow.mock.faker.SignNowFaker;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DocumentGroupTest extends BaseTest {

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
  public void testPostDocumentGroup() {
    expectation = this.expectation("create_document_group", "post");

    DocumentGroupPostRequest request =
        new DocumentGroupPostRequest(faker.documentGroupDocumentIds(), faker.groupName());

    assertDoesNotThrow(
        () -> {
          DocumentGroupPostResponse response = (DocumentGroupPostResponse) apiClient.send(request).getResponse();

          assertNotNull(response, "DocumentGroupPostResponse should not be null.");

          this.assertSame(expectation.get("id"), response.getId());
        },
        "Sending DocumentGroupPostRequest should not throw any exception.");
  }

  @Test
  public void testGetDocumentGroup() {
    expectation = this.expectation("get_document_group", "get");

    DocumentGroupGetRequest request = new DocumentGroupGetRequest();
    request.withDocumentGroupId(faker.documentGroupId());

    assertDoesNotThrow(
        () -> {
          DocumentGroupGetResponse response = (DocumentGroupGetResponse) apiClient.send(request).getResponse();

          assertNotNull(response, "DocumentGroupGetResponse should not be null.");

          this.assertSame(expectation.get("id"), response.getId());
          this.assertSame(expectation.get("group_name"), response.getGroupName());
          this.assertSame(expectation.get("invite_id"), response.getInviteId());
          this.assertSame(expectation.get("documents"), response.getDocuments());
          this.assertSame(
              expectation.get("originator_organization_settings"),
              response.getOriginatorOrganizationSettings());
        },
        "Sending DocumentGroupGetRequest should not throw any exception.");
  }

  @Test
  public void testDeleteDocumentGroup() {
    expectation = this.expectation("delete_document_group", "delete");

    DocumentGroupDeleteRequest request = new DocumentGroupDeleteRequest();
    request.withDocumentGroupId(faker.documentGroupId());

    assertDoesNotThrow(
        () -> {
          DocumentGroupDeleteResponse response =
              (DocumentGroupDeleteResponse) apiClient.send(request).getResponse();

          assertNotNull(response, "DocumentGroupDeleteResponse should not be null.");

          this.assertSame(expectation.get("status"), response.getStatus());
        },
        "Sending DocumentGroupDeleteRequest should not throw any exception.");
  }
}
