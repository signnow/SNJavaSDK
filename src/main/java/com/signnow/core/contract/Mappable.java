/*
 * This file is a part of signNow SDK API client.
 *
 * (с) Copyright © 2011-present airSlate Inc. (https://www.signnow.com)
 *
 * For more details on copyright, see LICENSE.md file
 * that was distributed with this source code.
 */

package com.signnow.core.contract;

import java.util.Map;

/**
 * The Mappable interface provides a contract for classes that can be converted to a Map.
 */
public interface Mappable {

  /**
   * Converts the current object to a Map.
   *
   * @return a Map representation of the current object. The types of the keys and values are not specified.
   */
  public Map<?, ?> toMap();
}