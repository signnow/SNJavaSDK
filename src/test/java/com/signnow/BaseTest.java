/*
 * This file is a part of signNow SDK API client.
 *
 * (с) Copyright © 2011-present airSlate Inc. (https://www.signnow.com)
 *
 * For more details on copyright, see LICENSE.md file
 * that was distributed with this source code.
 */

package com.signnow;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.signnow.core.ApiClient;
import com.signnow.core.config.ConfigLoader;
import com.signnow.core.config.ConfigRepository;
import com.signnow.core.contract.JsonSerializable;
import com.signnow.core.exception.SignNowApiException;
import com.signnow.core.request.ApiEndpointResolver;
import com.signnow.core.token.BasicToken;
import com.signnow.core.token.BearerToken;
import com.signnow.mock.expectation.Expectation;
import com.signnow.mock.expectation.ExpectationReader;
import com.signnow.mock.faker.SignNowFaker;
import java.net.URL;
import net.datafaker.Faker;
import okhttp3.OkHttpClient;

public class BaseTest {

  private static final String TESTS_CONFIG = ".env.test";
  private static final String TESTS_BASIC_TOKEN = "test-basic";
  private static final String TESTS_BEARER_TOKEN = "test-bearer";
  private static final String TESTS_REFRESH_TOKEN = "test-refresh";
  private static final int TESTS_TOKEN_EXPIRATION_TIME = 25920;

  protected ApiClient client() throws SignNowApiException {
    URL testsConfig = testConfigFileUrl();
    return new ApiClient(
        new OkHttpClient(),
        new ApiEndpointResolver(),
        new ConfigRepository((new ConfigLoader()).load(testsConfig.getPath())),
        this.testBasicToken(),
        this.testBearerToken());
  }

  protected SignNowFaker faker() {
    return new SignNowFaker(new Faker());
  }

  protected Expectation expectation(String name, String method) {
    ExpectationReader reader = new ExpectationReader();
    return reader.read(name, method);
  }

  protected URL testConfigFileUrl() {
    return BaseTest.class.getClassLoader().getResource(TESTS_CONFIG);
  }

  protected BasicToken testBasicToken() {
    return new BasicToken(TESTS_BASIC_TOKEN);
  }

  protected BearerToken testBearerToken() {
    return new BearerToken(TESTS_BEARER_TOKEN, TESTS_REFRESH_TOKEN, TESTS_TOKEN_EXPIRATION_TIME);
  }

  protected void assertSame(Object expected, Object actual) {
    if (expected == null && actual == null) {
      return;
    }
    if (expected instanceof String && actual instanceof JsonSerializable) {
      assertTrue(this.compareJsonStrings((String) expected, ((JsonSerializable) actual).toJson()));
      return;
    }
    if (expected instanceof Number) {
      assertEquals(expected, actual);
      return;
    }
    if (expected instanceof Boolean) {
      assertEquals(expected, actual);
      return;
    }
    assertEquals(expected, actual instanceof String ? actual : String.valueOf(actual));
  }

  protected boolean compareJsonStrings(String json1, String json2) {
    try {
      ObjectMapper objectMapper = new ObjectMapper();

      Object object1 = objectMapper.readValue(json1, Object.class);
      Object object2 = objectMapper.readValue(json2, Object.class);

      return object1.equals(object2);
    } catch (Exception e) {
      return false;
    }
  }
}
