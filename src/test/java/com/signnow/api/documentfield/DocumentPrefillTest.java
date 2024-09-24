/*
 * This file is a part of signNow SDK API client.
 *
 * (с) Copyright © 2011-present airSlate Inc. (https://www.signnow.com)
 *
 * For more details on copyright, see LICENSE.md file
 * that was distributed with this source code.
 */

package com.signnow.api.documentfield;

import static org.junit.jupiter.api.Assertions.*;

import com.signnow.BaseTest;
import com.signnow.api.documentfield.request.DocumentPrefillPutRequest;
import com.signnow.api.documentfield.response.DocumentPrefillPutResponse;
import com.signnow.core.ApiClient;
import com.signnow.core.exception.SignNowApiException;
import com.signnow.mock.faker.SignNowFaker;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DocumentPrefillTest extends BaseTest {

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

  @Test
  public void testPutDocumentPrefill() throws SignNowApiException {
    DocumentPrefillPutRequest request =
        new DocumentPrefillPutRequest(faker.documentFieldDocumentPrefillFields());
    request.withDocumentId(faker.documentId());
    DocumentPrefillPutResponse response = (DocumentPrefillPutResponse) apiClient.send(request).getResponse();

    assertNotNull(response, "Response should not be null.");
  }
}
