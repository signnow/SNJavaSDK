/*
 * This file is a part of signNow SDK API client.
 *
 * (с) Copyright © 2011-present airSlate Inc. (https://www.signnow.com)
 *
 * For more details on copyright, see LICENSE.md file
 * that was distributed with this source code.
 */

package com.signnow.core.request;

import java.lang.annotation.*;

/**
 * Annotation to define API endpoint details at runtime.
 * This annotation can be used at the type level.
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface ApiEndpoint {

  /**
   * Defines the name of the API endpoint.
   *
   * @return the name of the API endpoint.
   */
  String name();

  /**
   * Defines the URL of the API endpoint.
   *
   * @return the URL of the API endpoint.
   */
  String url();

  /**
   * Defines the HTTP method to be used for the API endpoint.
   *
   * @return the HTTP method of the API endpoint.
   */
  String method();

  /**
   * Defines the authentication method to be used for the API endpoint.
   * Default is "bearer".
   *
   * @return the authentication method of the API endpoint.
   */
  String auth() default "bearer";

  /**
   * Defines the namespace of the API endpoint.
   *
   * @return the namespace of the API endpoint.
   */
  String namespace();

  /**
   * Defines the entity of the API endpoint.
   *
   * @return the entity of the API endpoint.
   */
  String entity();

  /**
   * Defines the type of the API endpoint.
   *
   * @return the type of the API endpoint.
   */
  String type();
}