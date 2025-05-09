/*
 * This file is a part of signNow SDK API client.
 *
 * (с) Copyright © 2011-present airSlate Inc. (https://www.signnow.com)
 *
 * For more details on copyright, see LICENSE.md file
 * that was distributed with this source code.
 */

package com.signnow.api.document;

import static org.junit.jupiter.api.Assertions.*;

import com.signnow.BaseTest;
import com.signnow.api.document.request.DocumentDeleteRequest;
import com.signnow.api.document.request.DocumentGetRequest;
import com.signnow.api.document.request.DocumentPostRequest;
import com.signnow.api.document.request.DocumentPutRequest;
import com.signnow.api.document.response.DocumentDeleteResponse;
import com.signnow.api.document.response.DocumentGetResponse;
import com.signnow.api.document.response.DocumentPostResponse;
import com.signnow.api.document.response.DocumentPutResponse;
import com.signnow.core.ApiClient;
import com.signnow.core.exception.SignNowApiException;
import com.signnow.core.response.Reply;
import com.signnow.mock.expectation.Expectation;
import com.signnow.mock.faker.SignNowFaker;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DocumentTest extends BaseTest {

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
  public void testPostDocument() {
    expectation = this.expectation("upload_document", "post");

    DocumentPostRequest request =
        new DocumentPostRequest(
            faker.file(),
            faker.name(),
            faker.booleanValue(),
            faker.saveFields(),
            faker.makeTemplate(),
            faker.password(),
            faker.folderId(),
            faker.originTemplateId(),
            faker.clientTimestamp());

    assertDoesNotThrow(
        () -> {
          DocumentPostResponse response = (DocumentPostResponse) apiClient.send(request).getResponse();

          assertNotNull(response, "DocumentPostResponse should not be null.");

          this.assertSame(expectation.get("id"), response.getId());
        },
        "Sending DocumentPostRequest should not throw any exception.");
  }

  @Test
  public void testGetDocument() {
    expectation = this.expectation("get_document", "get");

    DocumentGetRequest request = new DocumentGetRequest();
    request.withDocumentId(faker.documentId());

    assertDoesNotThrow(
        () -> {
          DocumentGetResponse response = (DocumentGetResponse) apiClient.send(request).getResponse();

          assertNotNull(response, "DocumentGetResponse should not be null.");

          this.assertSame(expectation.get("id"), response.getId());
          this.assertSame(expectation.get("user_id"), response.getUserId());
          this.assertSame(expectation.get("document_name"), response.getDocumentName());
          this.assertSame(expectation.get("page_count"), response.getPageCount());
          this.assertSame(expectation.get("created"), response.getCreated());
          this.assertSame(expectation.get("updated"), response.getUpdated());
          this.assertSame(expectation.get("original_filename"), response.getOriginalFilename());
          this.assertSame(expectation.get("origin_user_id"), response.getOriginUserId());
          this.assertSame(expectation.get("origin_document_id"), response.getOriginDocumentId());
          this.assertSame(expectation.get("owner"), response.getOwner());
          this.assertSame(expectation.get("owner_name"), response.getOwnerName());
          this.assertSame(expectation.get("is_template"), response.isTemplate());
          this.assertSame(expectation.get("parent_id"), response.getParentId());
          this.assertSame(expectation.get("recently_used"), response.getRecentlyUsed());
          this.assertSame(expectation.get("originator_logo"), response.getOriginatorLogo());
          this.assertSame(expectation.get("pages"), response.getPages());
          this.assertSame(expectation.get("default_folder"), response.getDefaultFolder());
          this.assertSame(expectation.get("entity_labels"), response.getEntityLabels());
          this.assertSame(expectation.get("version_time"), response.getVersionTime());
          this.assertSame(expectation.get("routing_details"), response.getRoutingDetails());
          this.assertSame(expectation.get("thumbnail"), response.getThumbnail());
          this.assertSame(expectation.get("signatures"), response.getSignatures());
          this.assertSame(expectation.get("tags"), response.getTags());
          this.assertSame(expectation.get("fields"), response.getFields());
          this.assertSame(expectation.get("roles"), response.getRoles());
          this.assertSame(expectation.get("viewer_roles"), response.getViewerRoles());
          this.assertSame(expectation.get("field_invites"), response.getFieldInvites());
          this.assertSame(
              expectation.get("viewer_field_invites"), response.getViewerFieldInvites());
          this.assertSame(
              expectation.get("signing_session_settings"), response.getSigningSessionSettings());
          this.assertSame(expectation.get("enumeration_options"), response.getEnumerationOptions());
          this.assertSame(expectation.get("payments"), response.getPayments());
          this.assertSame(expectation.get("integrations"), response.getIntegrations());
          this.assertSame(expectation.get("integration_objects"), response.getIntegrationObjects());
          this.assertSame(expectation.get("exported_to"), response.getExportedTo());
          this.assertSame(expectation.get("radiobuttons"), response.getRadiobuttons());
          this.assertSame(expectation.get("seals"), response.getSeals());
          this.assertSame(expectation.get("checks"), response.getChecks());
          this.assertSame(expectation.get("texts"), response.getTexts());
          this.assertSame(expectation.get("lines"), response.getLines());
          this.assertSame(expectation.get("attachments"), response.getAttachments());
          this.assertSame(expectation.get("hyperlinks"), response.getHyperlinks());
          this.assertSame(expectation.get("requests"), response.getRequests());
          this.assertSame(expectation.get("inserts"), response.getInserts());
          this.assertSame(expectation.get("fields_data"), response.getFieldsData());
          this.assertSame(expectation.get("field_validators"), response.getFieldValidators());
          this.assertSame(
              expectation.get("originator_organization_settings"),
              response.getOriginatorOrganizationSettings());
          this.assertSame(expectation.get("document_group_info"), response.getDocumentGroupInfo());
          this.assertSame(
              expectation.get("document_group_template_info"),
              response.getDocumentGroupTemplateInfo());
          this.assertSame(expectation.get("settings"), response.getSettings());
          this.assertSame(expectation.get("share_info"), response.getShareInfo());
        },
        "Sending DocumentGetRequest should not throw any exception.");
  }

  @Test
  public void testPutDocument() {
    expectation = this.expectation("update_document", "put");

    DocumentPutRequest request =
        new DocumentPutRequest(
            faker.documentFields(),
            faker.documentLines(),
            faker.documentChecks(),
            faker.documentRadiobuttons(),
            faker.documentSignatures(),
            faker.documentTexts(),
            faker.documentAttachments(),
            faker.documentHyperlinks(),
            faker.documentIntegrationObjects(),
            faker.documentDeactivateElements(),
            faker.documentName(),
            faker.clientTimestampString());
    request.withDocumentId(faker.documentId());

    assertDoesNotThrow(
        () -> {
          DocumentPutResponse response = (DocumentPutResponse) apiClient.send(request).getResponse();

          assertNotNull(response, "DocumentPutResponse should not be null.");

          this.assertSame(expectation.get("id"), response.getId());
        },
        "Sending DocumentPutRequest should not throw any exception.");
  }

  @Test
  public void testDeleteDocument() {
    expectation = this.expectation("delete_document", "delete");

    DocumentDeleteRequest request = new DocumentDeleteRequest();
    request.withDocumentId(faker.documentId());

    assertDoesNotThrow(
        () -> {
          DocumentDeleteResponse response = (DocumentDeleteResponse) apiClient.send(request).getResponse();

          assertNotNull(response, "DocumentDeleteResponse should not be null.");

          this.assertSame(expectation.get("status"), response.getStatus());
        },
        "Sending DocumentDeleteRequest should not throw any exception.");
  }
}
