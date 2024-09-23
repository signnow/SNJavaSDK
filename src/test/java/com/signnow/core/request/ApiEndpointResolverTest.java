/*
 * This file is a part of signNow SDK API client.
 *
 * (с) Copyright © 2011-present airSlate Inc. (https://www.signnow.com)
 *
 * For more details on copyright, see LICENSE.md file
 * that was distributed with this source code.
 */

package com.signnow.core.request;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;

import com.signnow.mock.RequestMock;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ApiEndpointResolverTest {

  private ApiEndpointResolver apiEndpointResolver;

  @BeforeEach
  public void setUp() {
    apiEndpointResolver = new ApiEndpointResolver();
  }

  @Test
  public void testEndpointAnnotationGivenFromRequestResolvedSuccessfully() {
    RequestMock request = new RequestMock("hello", "world");

    assertDoesNotThrow(
        () -> {
          ApiEndpoint endpoint = apiEndpointResolver.resolve(request);
          assertEquals("test", endpoint.name());
          assertEquals("/mock/test", endpoint.url());
          assertEquals("post", endpoint.method());
          assertEquals("bearer", endpoint.auth());
          assertEquals("coverage", endpoint.namespace());
          assertEquals("request", endpoint.entity());
          assertEquals("application/x-www-form-urlencoded", endpoint.type());

          assertEquals("hello", request.getFirst());
          assertEquals("world", request.getSecond());
        },
        "ApiEndpointResolver.resolve() should not throw any exception.");
  }
}
