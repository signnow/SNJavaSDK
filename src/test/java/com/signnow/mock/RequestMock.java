/*
 * This file is a part of signNow SDK API client.
 *
 * (с) Copyright © 2011-present airSlate Inc. (https://www.signnow.com)
 *
 * For more details on copyright, see LICENSE.md file
 * that was distributed with this source code.
 */

package com.signnow.mock;

import com.signnow.core.request.ApiEndpoint;
import com.signnow.core.request.RequestInterface;
import java.util.HashMap;
import java.util.Map;

@ApiEndpoint(
    name = "test",
    url = "/mock/test",
    method = "post",
    auth = "bearer",
    namespace = "coverage",
    entity = "request",
    type = "application/x-www-form-urlencoded")
public class RequestMock implements RequestInterface<String> {
  private final String first;
  private final String second;

  public RequestMock(String first, String second) {
    this.first = first;
    this.second = second;
  }

  public String getFirst() {
    return first;
  }

  public String getSecond() {
    return second;
  }

  @Override
  public HashMap<String, String> uriParams() {
    return new HashMap<>();
  }

  @Override
  public Map<String, String> payload() {
    return Map.of();
  }
}
