/*
 * This file is a part of signNow SDK API client.
 *
 * (с) Copyright © 2011-present airSlate Inc. (https://www.signnow.com)
 *
 * For more details on copyright, see LICENSE.md file
 * that was distributed with this source code.
 */

package com.signnow.core.request;

import java.util.HashMap;
import java.util.Map;

/**
 * This interface defines the structure of a Request.
 *
 * @param <T> the type of the values in the payload map
 */
public interface RequestInterface<T> {

  /**
   * This method is used to get the URI parameters present in the Request.
   *
   * <p>Example: URL: /document/{document_id}/invite uriParams(): "document_id" =>
   * "e896ec9311a74a8a8ee9faff7049446fe452e461"
   *
   * @return HashMap containing the URI parameters as key-value pairs
   */
  public HashMap<String, String> uriParams();

  /**
   * This method is used to get the actual Request's body (POST, PUT).
   *
   * @return Map containing the payload of the request as key-value pairs
   */
  public Map<String, T> payload();
}