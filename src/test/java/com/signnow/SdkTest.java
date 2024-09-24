/*
 * This file is a part of signNow SDK API client.
 *
 * (с) Copyright © 2011-present airSlate Inc. (https://www.signnow.com)
 *
 * For more details on copyright, see LICENSE.md file
 * that was distributed with this source code.
 */

package com.signnow;

import static org.junit.jupiter.api.Assertions.*;

import com.signnow.core.ApiClient;
import com.signnow.core.exception.SignNowApiException;
import com.signnow.core.token.BearerToken;
import java.net.URL;
import org.junit.jupiter.api.Test;

public class SdkTest extends BaseTest {

  @Test
  public void testSdkGetStarted() {
    URL testsConfig = testConfigFileUrl();
    try {
      Sdk signNowSdk = new Sdk(testsConfig.getPath());
      ApiClient signNowApiClient = signNowSdk.build().authenticate().getApiClient();

      assertNotNull(signNowApiClient);
      assertNotNull(signNowApiClient.getBearerToken());
    } catch (SignNowApiException e) {
      fail("SDK get started error: " + e.getMessage());
    }
  }

  @Test
  public void testModifyBearerToken() {
    URL testsConfig = testConfigFileUrl();
    try {
      Sdk signNowSdk = new Sdk(testsConfig.getPath());
      ApiClient signNowApiClient = signNowSdk.build().authenticate().getApiClient();

      assertNotNull(signNowApiClient);

      BearerToken currentToken = signNowSdk.getActualBearerToken();
      BearerToken newToken = this.testBearerToken();

      assertNotNull(currentToken);

      signNowSdk.withBearerToken(newToken);

      assertEquals(newToken, signNowSdk.getActualBearerToken());
      assertNotEquals(currentToken, signNowSdk.getActualBearerToken());
    } catch (SignNowApiException e) {
      fail("token modification failed: " + e.getMessage());
    }
  }

  @Test
  public void testSdkReturnsApiVersion() {
    URL testsConfig = testConfigFileUrl();
    Sdk signNowSdk = new Sdk(testsConfig.getPath());
    String apiVersion = signNowSdk.version();

    assertNotNull(apiVersion);
    assertFalse(apiVersion.isEmpty());
  }
}
