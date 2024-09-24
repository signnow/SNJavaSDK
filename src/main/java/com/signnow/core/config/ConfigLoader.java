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

  /** Return the map containing config file entries as a repository. */
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
}
