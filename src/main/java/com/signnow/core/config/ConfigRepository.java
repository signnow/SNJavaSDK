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

/** This class represents all the signNow SDK API configuration file entries as a repository. */
public class ConfigRepository {

  private static final int READ_TIMEOUT = 15;
  private static final String CLIENT_NAME = "SignNowApiClient/v3.2.1 (Java)";
  private static final String DEFAULT_DOWNLOADS_DIR = "./src/main/resources/downloads";

  private final Map<String, String> configMap;

  /**
   * Constructor for ConfigRepository.
   *
   * @param configMap a map of configuration entries
   */
  public ConfigRepository(Map<String, String> configMap) {
    this.configMap = configMap;
  }

  /**
   * Returns the host from the configuration map.
   *
   * @return the host as a string
   */
  public String host() {
    return this.configMap.get("SIGNNOW_API_HOST");
  }

  /**
   * Returns the basic token from the configuration map.
   *
   * @return the basic token as a BasicToken object
   */
  public BasicToken basicToken() {
    return new BasicToken(this.configMap.get("SIGNNOW_API_BASIC_TOKEN"));
  }

  /**
   * Returns the user from the configuration map.
   *
   * @return the user as a string
   */
  public String user() {
    return this.configMap.get("SIGNNOW_API_USERNAME");
  }

  /**
   * Returns the password from the configuration map.
   *
   * @return the password as a string
   */
  public String password() {
    return this.configMap.get("SIGNNOW_API_PASSWORD");
  }

  public String projectDirectory() {
    return System.getProperty("user.dir");
  }

  /**
   * Returns the path to save downloaded files from the configuration map.
   *
   * @return the password as a string
   */
  public String downloadsDirectory() {
    String downloadsDir =
        this.configMap.getOrDefault("SIGNNOW_DOWNLOADS_DIR", DEFAULT_DOWNLOADS_DIR);

    if (downloadsDir.startsWith(".")) {
      downloadsDir = downloadsDir.replaceFirst("^\\.", projectDirectory());
    }

    return downloadsDir;
  }

  /**
   * Returns the client name.
   *
   * @return the client name as a string
   */
  public String clientName() {
    return CLIENT_NAME;
  }

  /**
   * Returns the read timeout.
   *
   * @return the read timeout as an integer
   */
  public int readTimeout() {
    return READ_TIMEOUT;
  }
}
