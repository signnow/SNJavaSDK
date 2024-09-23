/*
 * This file is a part of signNow SDK API client.
 *
 * (с) Copyright © 2011-present airSlate Inc. (https://www.signnow.com)
 *
 * For more details on copyright, see LICENSE.md file
 * that was distributed with this source code.
 */

package com.signnow.core.response;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.signnow.core.exception.SignNowApiException;
import com.signnow.core.request.ApiEndpoint;
import java.util.Locale;

/** This class parses signNow API response JSON and deserializes it into a data object. */
public class ResponseParser {
  private static final ObjectMapper objectMapper = new ObjectMapper();

  public static  <R> Reply<R> parseResponse(int codeResponse, String jsonResponse, ApiEndpoint apiEndpoint)
      throws SignNowApiException {
    String entity = capitalizeFirstLetter(apiEndpoint.entity());
    String method = capitalizeFirstLetter(apiEndpoint.method().toLowerCase());
    String namespace = apiEndpoint.namespace().toLowerCase();

    String className =
        String.format("com.signnow.api.%s.response.%s%sResponse", namespace, entity, method);

    try {
      Class<?> mapClass = Class.forName(className);
      try {
        objectMapper
            .setVisibility(PropertyAccessor.GETTER, JsonAutoDetect.Visibility.NONE)
            .setVisibility(PropertyAccessor.IS_GETTER, JsonAutoDetect.Visibility.NONE);
        TypeFactory typeFactory = objectMapper.getTypeFactory();
        JavaType responseType = typeFactory.constructType(mapClass);
        if (jsonResponse == null || jsonResponse.trim().isEmpty()) {
          jsonResponse = "{}";
        }
        R data = objectMapper.readValue(jsonResponse, responseType);
        return new Reply<>(codeResponse, jsonResponse, data);
      } catch (JsonProcessingException e) {
        throw new SignNowApiException(
            String.format(
                "Failed to deserialize the response JSON to class %s instance.", className),
            apiEndpoint.method().toUpperCase(Locale.ROOT) + " " + apiEndpoint.url(),
            null,
            jsonResponse,
            null,
            e);
      }
    } catch (ClassNotFoundException e) {
      throw new SignNowApiException(
          String.format("Response class %s not found for mapping.", className),
          apiEndpoint.method().toUpperCase(Locale.ROOT) + " " + apiEndpoint.url(),
          null,
          jsonResponse,
          null,
          e);
    }
  }

  private static String capitalizeFirstLetter(String input) {
    return input.substring(0, 1).toUpperCase() + input.substring(1);
  }
}
