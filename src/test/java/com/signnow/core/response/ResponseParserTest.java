/*
 * This file is a part of signNow SDK API client.
 *
 * (с) Copyright © 2011-present airSlate Inc. (https://www.signnow.com)
 *
 * For more details on copyright, see LICENSE.md file
 * that was distributed with this source code.
 */

package com.signnow.core.response;

import static org.junit.jupiter.api.Assertions.*;

import com.signnow.api.auth.request.TokenPostRequest;
import com.signnow.api.auth.response.TokenPostResponse;
import com.signnow.api.webhookv2.request.EventSubscriptionDeleteRequest;
import com.signnow.api.webhookv2.response.EventSubscriptionDeleteResponse;
import com.signnow.core.data.ResponseData;
import com.signnow.core.request.ApiEndpoint;
import com.signnow.core.request.ApiEndpointResolver;
import java.nio.charset.StandardCharsets;
import org.junit.jupiter.api.Test;

public class ResponseParserTest {

  @Test
  public void testJsonResponseMappedSuccessfully() {
    ApiEndpointResolver apiEndpointResolver = new ApiEndpointResolver();
    TokenPostRequest request =
        new TokenPostRequest("test_user", "test#paZZw0rd", "*", "password", "some code");

    assertDoesNotThrow(
        () -> {
          String json =
              "{"
                  + "\"expires_in\": 1754143108, "
                  + "\"token_type\":\"bearer\", "
                  + "\"access_token\":\"f9b20\","
                  + "\"refresh_token\":\"2c9737\","
                  + "\"scope\":\"*\","
                  + "\"last_login\":590918188"
                  + "}";
          ApiEndpoint endpoint = apiEndpointResolver.resolve(request);
          ResponseData responseData =
              new ResponseData(200, "application/json", null, "", json.getBytes());
          Reply<TokenPostResponse> reply = ResponseParser.parse(responseData, endpoint);
          TokenPostResponse response = reply.getResponse();

          assertEquals(200, reply.getStatusCode());
          assertTrue(reply.isOk());
          assertFalse(reply.isEmpty());
          assertEquals(json, reply.toJson());
          assertEquals(1754143108, response.getExpiresIn());
          assertEquals("bearer", response.getTokenType());
          assertEquals("f9b20", response.getAccessToken());
          assertEquals("2c9737", response.getRefreshToken());
          assertEquals("*", response.getScope());
          assertEquals(590918188, response.getLastLogin());
        },
        "ResponseParser.parseResponse() should not throw any exception.");
  }

  @Test
  public void testMapEmptyResponse() {
    ApiEndpointResolver apiEndpointResolver = new ApiEndpointResolver();
    EventSubscriptionDeleteRequest request = new EventSubscriptionDeleteRequest();
    request.withEventSubscriptionId("123");

    assertDoesNotThrow(
        () -> {
          ApiEndpoint endpoint = apiEndpointResolver.resolve(request);
          byte[] emptyBytes = new byte[0];
          ResponseData responseData = new ResponseData(204, "application/json", "", "", emptyBytes);
          Reply<EventSubscriptionDeleteResponse> reply =
              ResponseParser.parse(responseData, endpoint);

          assertEquals(204, reply.getStatusCode());
          assertTrue(reply.isOk());
          assertTrue(reply.isEmpty());
          assertEquals("{}", reply.toJson());
        });
  }

  @Test
  public void testMapEmptyJsonResponse() {
    ApiEndpointResolver apiEndpointResolver = new ApiEndpointResolver();
    EventSubscriptionDeleteRequest request = new EventSubscriptionDeleteRequest();
    request.withEventSubscriptionId("123");

    assertDoesNotThrow(
        () -> {
          ApiEndpoint endpoint = apiEndpointResolver.resolve(request);
          byte[] bytes = "{}".getBytes(StandardCharsets.UTF_8);
          ResponseData responseData = new ResponseData(204, "application/json", "", "{}", bytes);
          Reply<EventSubscriptionDeleteResponse> reply =
              ResponseParser.parse(responseData, endpoint);

          assertEquals(204, reply.getStatusCode());
          assertTrue(reply.isOk());
          assertTrue(reply.isEmpty());
          assertEquals("{}", reply.toJson());
        });
  }
}
