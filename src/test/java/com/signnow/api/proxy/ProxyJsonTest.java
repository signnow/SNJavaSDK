/*
 * This file is a part of signNow SDK API client.
 *
 * (с) Copyright © 2011-present airSlate Inc. (https://www.signnow.com)
 *
 * For more details on copyright, see LICENSE.md file
 * that was distributed with this source code.
 */

package com.signnow.api.proxy;

import static org.junit.jupiter.api.Assertions.*;

import com.signnow.BaseTest;
import com.signnow.api.proxy.response.ProxyJsonResponse;
import com.signnow.core.ApiClient;
import com.signnow.core.exception.SignNowApiException;
import com.signnow.core.request.ApiEndpoint;
import com.signnow.core.request.RequestInterface;
import com.signnow.mock.expectation.Expectation;
import com.signnow.mock.faker.SignNowFaker;
import java.util.HashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ProxyJsonTest extends BaseTest {
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

  @ApiEndpoint(
      name = "proxy",
      url = "/document/{document_id}",
      method = "get",
      auth = "bearer",
      namespace = "proxy",
      entity = "proxy",
      type = "application/json")
  public final class CustomProxyRequest implements RequestInterface<String> {

    private final Map<String, String> uriParams = new HashMap<>();

    public CustomProxyRequest withDocumentId(String documentId) {
      this.uriParams.put("document_id", documentId);
      return this;
    }

    @NotNull
    @Override
    public HashMap<String, String> uriParams() {
      return new HashMap<>(this.uriParams);
    }

    @NotNull
    @Override
    public Map<String, String> payload() {
      return new HashMap<>();
    }
  }

  @Test
  public void testCustomProxyRequest() {
    expectation = this.expectation("get_document", "get");

    CustomProxyRequest request = new CustomProxyRequest();
    request.withDocumentId(faker.documentId());

    assertDoesNotThrow(
        () -> {
          ProxyJsonResponse response = (ProxyJsonResponse) apiClient.send(request).getResponse();
          assertNotNull(response, "ProxyJsonResponse should not be null.");

          this.assertSame(expectation.get("id"), response.getRawJson().get("id").asText());
          this.assertSame(
              expectation.get("user_id"), response.getRawJson().get("user_id").asText());
          this.assertSame(
              expectation.get("document_name"),
              response.getRawJson().get("document_name").asText());
          this.assertSame(
              expectation.get("page_count"), response.getRawJson().get("page_count").asText());
          this.assertSame(expectation.get("created"), response.getRawJson().get("created").asInt());
          this.assertSame(expectation.get("updated"), response.getRawJson().get("updated").asInt());
          this.assertSame(
              expectation.get("original_filename"),
              response.getRawJson().get("original_filename").asText());
          this.assertSame(
              expectation.get("origin_user_id"), response.getRawJson().get("origin_user_id").asText());
          this.assertSame(
              expectation.get("origin_document_id"),
              response.getRawJson().get("origin_document_id").asText());
          this.assertSame(expectation.get("owner"), response.getRawJson().get("owner").asText());
          this.assertSame(
              expectation.get("owner_name"), response.getRawJson().get("owner_name").asText());
          this.assertSame(
              expectation.get("is_template"), response.getRawJson().get("is_template").asBoolean());
          this.assertSame(
              expectation.get("parent_id"), response.getRawJson().get("parent_id").asText());
          this.assertSame(
              expectation.get("recently_used"), response.getRawJson().get("recently_used"));
          this.assertSame(
              expectation.get("originator_logo"),
              response.getRawJson().get("originator_logo").asText());
          this.assertSame(expectation.get("pages"), response.getRawJson().get("pages"));
          this.assertSame(
              expectation.get("default_folder"), response.getRawJson().get("default_folder"));
          this.assertSame(
              expectation.get("entity_labels"), response.getRawJson().get("entity_labels"));
          this.assertSame(
              expectation.get("version_time"), response.getRawJson().get("version_time").asInt());
          this.assertSame(
              expectation.get("routing_details"), response.getRawJson().get("routing_details"));
          this.assertSame(expectation.get("thumbnail"), response.getRawJson().get("thumbnail"));
          this.assertSame(expectation.get("signatures"), response.getRawJson().get("signatures"));
          this.assertSame(expectation.get("tags"), response.getRawJson().get("tags"));
          this.assertSame(expectation.get("fields"), response.getRawJson().get("fields"));
          this.assertSame(expectation.get("roles"), response.getRawJson().get("roles"));
          this.assertSame(
              expectation.get("viewer_roles"), response.getRawJson().get("viewer_roles"));
          this.assertSame(
              expectation.get("field_invites"), response.getRawJson().get("field_invites"));
          this.assertSame(
              expectation.get("viewer_field_invites"),
              response.getRawJson().get("viewer_field_invites"));
          this.assertSame(
              expectation.get("signing_session_settings"),
              response.getRawJson().get("signing_session_settings"));
          this.assertSame(
              expectation.get("enumeration_options"),
              response.getRawJson().get("enumeration_options"));
          this.assertSame(expectation.get("payments"), response.getRawJson().get("payments"));
          this.assertSame(
              expectation.get("integrations"), response.getRawJson().get("integrations"));
          this.assertSame(
              expectation.get("integration_objects"),
              response.getRawJson().get("integration_objects"));
          this.assertSame(expectation.get("exported_to"), response.getRawJson().get("exported_to"));
          this.assertSame(
              expectation.get("radiobuttons"), response.getRawJson().get("radiobuttons"));
          this.assertSame(expectation.get("seals"), response.getRawJson().get("seals"));
          this.assertSame(expectation.get("checks"), response.getRawJson().get("checks"));
          this.assertSame(expectation.get("texts"), response.getRawJson().get("texts"));
          this.assertSame(expectation.get("lines"), response.getRawJson().get("lines"));
          this.assertSame(expectation.get("attachments"), response.getRawJson().get("attachments"));
          this.assertSame(expectation.get("hyperlinks"), response.getRawJson().get("hyperlinks"));
          this.assertSame(expectation.get("requests"), response.getRawJson().get("requests"));
          this.assertSame(expectation.get("inserts"), response.getRawJson().get("inserts"));
          this.assertSame(expectation.get("fields_data"), response.getRawJson().get("fields_data"));
          this.assertSame(
              expectation.get("field_validators"), response.getRawJson().get("field_validators"));
          this.assertSame(
              expectation.get("originator_organization_settings"),
              response.getRawJson().get("originator_organization_settings"));
          this.assertSame(
              expectation.get("document_group_info"),
              response.getRawJson().get("document_group_info"));
          this.assertSame(
              expectation.get("document_group_template_info"),
              response.getRawJson().get("document_group_template_info"));
          this.assertSame(expectation.get("settings"), response.getRawJson().get("settings"));
          this.assertSame(expectation.get("share_info"), response.getRawJson().get("share_info"));
        },
        "Sending CustomProxyRequest should not throw any exception.");
  }
}
