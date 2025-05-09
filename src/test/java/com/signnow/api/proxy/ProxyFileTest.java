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
import com.signnow.api.proxy.response.ProxyFileResponse;
import com.signnow.core.ApiClient;
import com.signnow.core.exception.SignNowApiException;
import com.signnow.core.request.ApiEndpoint;
import com.signnow.core.request.RequestInterface;
import com.signnow.mock.faker.SignNowFaker;
import java.util.HashMap;
import java.util.Map;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ProxyFileTest extends BaseTest {

  private ApiClient apiClient;

  private SignNowFaker faker;

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
      url = "/document/{document_id}/download",
      method = "get",
      auth = "bearer",
      namespace = "proxy",
      entity = "proxy",
      type = "application/pdf")
  public final class CustomProxyRequest implements RequestInterface<String> {
    private final HashMap<String, String> uriParams = new HashMap<>();

    private final HashMap<String, String> queryParams = new HashMap<>();

    public CustomProxyRequest withType(String type) {
      this.queryParams.put("type", type);
      return this;
    }

    public CustomProxyRequest withHistory(String withHistory) {
      this.queryParams.put("with_history", withHistory);
      return this;
    }

    public CustomProxyRequest withDocumentId(String documentId) {
      this.uriParams.put("document_id", documentId);
      return this;
    }

    @NotNull
    @Contract(value = " -> new", pure = true)
    @Override
    public HashMap<String, String> uriParams() {
      return new HashMap<>(this.uriParams);
    }

    @NotNull
    public Map<String, String> queryParams() {
      return new HashMap<>(this.queryParams);
    }

    @NotNull
    @Override
    public Map<String, String> payload() {
      return new HashMap<>();
    }
  }

  @Test
  public void testProxyFile() {

    CustomProxyRequest request = new CustomProxyRequest();
    request.withDocumentId(faker.documentId());

    assertDoesNotThrow(
        () -> {
          ProxyFileResponse response = (ProxyFileResponse) apiClient.send(request).getResponse();

          assertNotNull(response, "ProxyFileResponse should not be null.");
        },
        "Sending CustomProxyRequest should not throw any exception.");
  }
}
