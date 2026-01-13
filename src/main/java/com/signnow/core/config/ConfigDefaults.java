/*
 * This file is a part of signNow SDK API client.
 *
 * (с) Copyright © 2011-present airSlate Inc. (https://www.signnow.com)
 *
 * For more details on copyright, see LICENSE.md file
 * that was distributed with this source code.
 */

package com.signnow.core.config;

import java.util.HashMap;
import java.util.Map;

/** This class provides default values for signNow SDK configuration file. */
public class ConfigDefaults {
  /** Default values for configuration */
  private static final String SIGNNOW_API_HOST = "https://api.signnow.com";

  private static final String BASIC_TOKEN = "";
  private static final String USERNAME = "";
  private static final String PASSWORD = "";
  public static final String DOWNLOADS_DIR = "./src/main/resources/downloads";

  /** Environment variables to keep API secrets */
  public static final String ENV_VAR_HOST = "SIGNNOW_API_HOST";

  public static final String ENV_VAR_BASIC_TOKEN = "SIGNNOW_API_BASIC_TOKEN";
  public static final String ENV_VAR_USERNAME = "SIGNNOW_API_USERNAME";
  public static final String ENV_VAR_PASSWORD = "SIGNNOW_API_PASSWORD";
  public static final String ENV_DOWNLOADS_DIR = "SIGNNOW_DOWNLOADS_DIR";

  /**
   * Returns defaults values for SDK configuration.
   *
   * @return A map containing the key-value pairs for case when configuration file not found
   */
  public Map<String, String> getDefaults() {
    Map<String, String> config = new HashMap<>();
    config.put(ENV_VAR_HOST, SIGNNOW_API_HOST);
    config.put(ENV_VAR_BASIC_TOKEN, BASIC_TOKEN);
    config.put(ENV_VAR_USERNAME, USERNAME);
    config.put(ENV_VAR_PASSWORD, PASSWORD);
    config.put(ENV_DOWNLOADS_DIR, DOWNLOADS_DIR);
    return config;
  }

  /**
   * Returns list of environment variables that keep API secrets.
   *
   * @return A list of environment variable names
   */
  public static String[] getEnvironmentVariableNames() {
    return new String[] {
      ENV_VAR_HOST, ENV_VAR_BASIC_TOKEN, ENV_VAR_USERNAME, ENV_VAR_PASSWORD, ENV_DOWNLOADS_DIR
    };
  }
}
