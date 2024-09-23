/*
 * This file is a part of signNow SDK API client.
 *
 * (с) Copyright © 2011-present airSlate Inc. (https://www.signnow.com)
 *
 * For more details on copyright, see LICENSE.md file
 * that was distributed with this source code.
 */

package com.signnow.core.request;

/**
 * This class retrieves required annotation for specified request, and instantiates the annotation
 * as a standalone data object.
 */
public class ApiEndpointResolver {

  /** Construct ApiEndpoint data object from annotated request object. */
  public ApiEndpoint resolve(RequestInterface<?> request) {
    Class<? extends RequestInterface> reflection = request.getClass();
    if (!reflection.isAnnotationPresent(ApiEndpoint.class)) {
      throw new IllegalArgumentException(
          String.format(
              "Request class %s is not annotated with ApiEndpoint.", request.getClass().getName()));
    }
    return reflection.getAnnotation(ApiEndpoint.class);
  }
}
