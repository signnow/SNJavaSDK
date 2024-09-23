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

public interface RequestInterface<T> {

  /**
   * Describes the URI parameters present in the Request, if any.
   *
   * <p>Example: URL: /document/{document_id}/invite uriParams(): "document_id" =>
   * "e896ec9311a74a8a8ee9faff7049446fe452e461"
   */
  public HashMap<String, String> uriParams();

  /** Contains actual Request's body (POST, PUT). */
  public Map<String, T> payload();
}
