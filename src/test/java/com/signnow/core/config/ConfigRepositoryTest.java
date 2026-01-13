/*
 * This file is a part of signNow SDK API client.
 *
 * (с) Copyright © 2011-present airSlate Inc. (https://www.signnow.com)
 *
 * For more details on copyright, see LICENSE.md file
 * that was distributed with this source code.
 */

package com.signnow.core.config;

import static org.junit.jupiter.api.Assertions.*;

import com.signnow.core.exception.SignNowApiException;
import com.signnow.core.token.BasicToken;
import com.signnow.mock.Constants;
import java.util.Map;
import java.util.Objects;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ConfigRepositoryTest {
  private ConfigRepository configRepository;

  @BeforeEach
  public void setUp() {
    String configPath =
        Objects.requireNonNull(getClass().getClassLoader().getResource(Constants.TEST_CONFIG_FILE))
            .getPath();
    try {
      Map<String, String> configMap = (new ConfigLoader()).load(configPath);
      configRepository = new ConfigRepository(configMap);
    } catch (SignNowApiException e) {
      fail(e.getMessage());
    }
  }

  @Test
  public void testConfigLoading() {
    assertNotNull(configRepository);
    assertEquals("https://api.test.not.exist.signnow.com", configRepository.host());
    assertEquals("user-test@signnow.com", configRepository.user());
    assertEquals("test!PAZZW", configRepository.password());
    assertInstanceOf(BasicToken.class, configRepository.basicToken());
    assertEquals("test_basic_token", configRepository.basicToken().token());
    assertEquals(System.getProperty("user.dir"), configRepository.projectDirectory());
    assertEquals(
        configRepository.projectDirectory() + "/src/main/resources/downloads",
        configRepository.downloadsDirectory());
  }
}
