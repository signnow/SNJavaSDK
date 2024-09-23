/*
 * This file is a part of signNow SDK API client.
 *
 * (с) Copyright © 2011-present airSlate Inc. (https://www.signnow.com)
 *
 * For more details on copyright, see LICENSE.md file
 * that was distributed with this source code.
 */

package com.signnow.core.config;

import com.signnow.core.token.BasicToken;
import java.util.Map;

/** All the signNow SDK API configuration file entries as a repository. */
public class ConfigRepository {

  private static final int READ_TIMEOUT = 15;
  private static final String CLIENT_NAME = "SignNow Java API Client/v3.0.0";

  private final Map<String, String> configMap;

  public ConfigRepository(Map<String, String> configMap) {
    this.configMap = configMap;
  }

  public String host() {
    return this.configMap.get("API_HOST");
  }

  public BasicToken basicToken() {
    return new BasicToken(this.configMap.get("API_BASIC_TOKEN"));
  }

  public String user() {
    return this.configMap.get("API_USERNAME");
  }

  public String password() {
    return this.configMap.get("API_PASSWORD");
  }

  public String clientName() {
    return CLIENT_NAME;
  }

  public int readTimeout() {
    return READ_TIMEOUT;
  }
}
