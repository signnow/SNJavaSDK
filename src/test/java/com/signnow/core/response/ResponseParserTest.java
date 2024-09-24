/*
 * This file is a part of signNow SDK API client.
 *
 * (с) Copyright © 2011-present airSlate Inc. (https://www.signnow.com)
 *
 * For more details on copyright, see LICENSE.md file
 * that was distributed with this source code.
 */

package com.signnow.core.response;

import com.signnow.api.auth.request.TokenPostRequest;
import com.signnow.api.auth.response.TokenPostResponse;
import com.signnow.api.webhookv2.request.EventSubscriptionDeleteRequest;
import com.signnow.api.webhookv2.response.EventSubscriptionDeleteResponse;
import com.signnow.core.request.ApiEndpoint;
import com.signnow.core.request.ApiEndpointResolver;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ResponseParserTest {

  @Test
  public void testJsonResponseMappedSuccessfully() {
    ApiEndpointResolver apiEndpointResolver = new ApiEndpointResolver();
    TokenPostRequest request =
        new TokenPostRequest(
            "test_user", "test#paZZw0rd", "*", "password", "some code");

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
          Reply<TokenPostResponse> reply = ResponseParser.parseResponse(200, json, endpoint);
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
          String body = "";
          ApiEndpoint endpoint = apiEndpointResolver.resolve(request);
          Reply<EventSubscriptionDeleteResponse> reply = ResponseParser.parseResponse(204, body, endpoint);

          assertEquals(204, reply.getStatusCode());
          assertTrue(reply.isOk());
          assertTrue(reply.isEmpty());
          assertEquals("{}", reply.toJson());
        }
    );
  }

  @Test
  public void testMapEmptyJsonResponse() {
    ApiEndpointResolver apiEndpointResolver = new ApiEndpointResolver();
    EventSubscriptionDeleteRequest request = new EventSubscriptionDeleteRequest();
    request.withEventSubscriptionId("123");

    assertDoesNotThrow(
        () -> {
          String body = "{}";
          ApiEndpoint endpoint = apiEndpointResolver.resolve(request);
          Reply<EventSubscriptionDeleteResponse> reply = ResponseParser.parseResponse(204, body, endpoint);

          assertEquals(204, reply.getStatusCode());
          assertTrue(reply.isOk());
          assertTrue(reply.isEmpty());
          assertEquals("{}", reply.toJson());
        }
    );
  }
}
