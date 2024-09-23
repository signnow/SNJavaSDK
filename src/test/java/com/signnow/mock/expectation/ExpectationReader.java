/*
 * This file is a part of signNow SDK API client.
 *
 * (с) Copyright © 2011-present airSlate Inc. (https://www.signnow.com)
 *
 * For more details on copyright, see LICENSE.md file
 * that was distributed with this source code.
 */

package com.signnow.mock.expectation;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * This class reads WireMock mappings JSON file and constructs the data as a Data Transfer Object,
 * referred to as an Expectation.
 */
public class ExpectationReader {

  private static final String EXPECTATION_SUB_DIR = "wiremock/mappings";
  private static final String JSON_EXTENSION = ".json";

  public Expectation read(String actionName, String methodName) throws RuntimeException {
    String fileName = buildExpectationFileName(actionName, methodName);
    URL resourceUrl = ExpectationReader.class.getClassLoader().getResource(fileName);

    if (resourceUrl == null) {
      throw new RuntimeException(String.format("Not found expectation file %s.", fileName));
    }

    try {
      String content = new String(Files.readAllBytes(Paths.get(resourceUrl.getPath())));
      ObjectMapper objectMapper = new ObjectMapper();
      Map<String, Map<String, Object>> data =
          objectMapper.readValue(content, new TypeReference<Map<String, Map<String, Object>>>() {});
      Map<String, Object> response = data.get("response");
      String bodyJson = response.get("body").toString();
      LinkedHashMap<String, Object> body =
          objectMapper.readValue(bodyJson, new TypeReference<LinkedHashMap<String, Object>>() {});
      return new Expectation(fileName, body);
    } catch (IOException e) {
      throw new RuntimeException(String.format("Failed to load Expectation file %s.", fileName), e);
    }
  }

  private String buildExpectationFileName(String actionName, String methodName) {
    return EXPECTATION_SUB_DIR + "/" + actionName + "_" + methodName.toLowerCase() + JSON_EXTENSION;
  }
}
