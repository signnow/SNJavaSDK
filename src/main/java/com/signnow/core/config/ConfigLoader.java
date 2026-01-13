/*
 * This file is a part of signNow SDK API client.
 *
 * (с) Copyright © 2011-present airSlate Inc. (https://www.signnow.com)
 *
 * For more details on copyright, see LICENSE.md file
 * that was distributed with this source code.
 */

package com.signnow.core.config;

import com.signnow.core.exception.SignNowApiException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/** This class reads and parses signNow SDK configuration file. */
public class ConfigLoader {

  /**
   * This method loads the configuration file from the provided file path and parses it into a map.
   * Each line in the file should represent a key-value pair, separated by an equals sign. Lines
   * starting with a hash sign are considered comments and are ignored. Empty lines are also
   * ignored.
   *
   * @param filePath The path to the configuration file.
   * @return A map containing the key-value pairs from the configuration file.
   * @throws SignNowApiException If an error occurs while reading the file.
   */
  public Map<String, String> load(String filePath) throws SignNowApiException {
    Map<String, String> configMap = new HashMap<>();
    try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
      String line;
      while ((line = reader.readLine()) != null) {
        if (line.startsWith("#") || line.trim().isEmpty()) {
          continue;
        }
        String[] keyValue = line.split("=", 2);
        if (keyValue.length == 2) {
          String key = keyValue[0].trim();
          String value = keyValue[1].trim();
          configMap.put(key, value);
        }
      }
    } catch (IOException e) {
      throw new SignNowApiException(
          String.format(
              "An error occurred while reading the signNow SDK configuration file: %s. "
                  + "Please ensure the file exists, is accessible, and is correctly formatted.",
              filePath),
          e);
    }
    return configMap;
  }

  /**
   * Load API credentials from environment variables if they exist.
   *
   * @return A map of SDK configuration parsed from environment variables
   */
  public Map<String, String> loadConfigFromEnvironmentVariables() {
    String[] envVars = ConfigDefaults.getEnvironmentVariableNames();

    Map<String, String> config = new HashMap<>();
    Map<String, String> env = System.getenv();

    for (String envVar : envVars) {
      String value = env.get(envVar);
      if (value != null) {
        config.put(envVar, value);
      }
    }
    return config;
  }
}
