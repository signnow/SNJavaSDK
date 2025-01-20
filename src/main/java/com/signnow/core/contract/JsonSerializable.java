/*
 * This file is a part of signNow SDK API client.
 *
 * (с) Copyright © 2011-present airSlate Inc. (https://www.signnow.com)
 *
 * For more details on copyright, see LICENSE.md file
 * that was distributed with this source code.
 */

package com.signnow.core.contract;

/**
 * This interface represents a contract for classes that can be serialized to JSON.
 * Any class implementing this interface should provide its own implementation of the toJson method.
 */
public interface JsonSerializable {

  /**
   * Converts the implementing class to a JSON string representation.
   *
   * @return A string representation of the implementing class in JSON format.
   */
  String toJson();
}