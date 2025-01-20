/*
 * This file is a part of signNow SDK API client.
 *
 * (с) Copyright © 2011-present airSlate Inc. (https://www.signnow.com)
 *
 * For more details on copyright, see LICENSE.md file
 * that was distributed with this source code.
 */

package com.signnow.core.util;

import com.signnow.core.data.ApiData;
import java.util.Iterator;
import java.util.Map;

/**
 * Utility class for casting objects.
 */
public class Cast {

  /**
   * Safely casts an object to a specified class.
   *
   * @param obj The object to be cast.
   * @param clazz The class to cast the object to.
   * @param <T> The type of the class.
   * @return The cast object.
   * @throws IllegalArgumentException If the object cannot be cast to the specified class.
   */
  @SuppressWarnings("unchecked")
  public static <T extends ApiData> T safe(Object obj, Class<T> clazz) {
    if (clazz.isInstance(obj)) {
      return (T) obj;
    }
    throw new IllegalArgumentException(
        "Cannot cast " + obj.getClass().getSimpleName() + " to " + clazz.getName());
  }

  /**
   * Safely casts an object to a Map with specified key and value classes.
   *
   * @param obj The object to be cast.
   * @param keyClass The class of the key in the map.
   * @param valueClass The class of the value in the map.
   * @param <K> The type of the key class.
   * @param <V> The type of the value class.
   * @return The cast object as a Map.
   * @throws IllegalArgumentException If the object cannot be cast to a Map with the specified key and value classes.
   */
  @SuppressWarnings("unchecked")
  public static <K, V> Map<K, V> safeToMap(Object obj, Class<K> keyClass, Class<V> valueClass) {
    if (obj instanceof Map) {
      return (Map<K, V>) obj;
    }
    throw new IllegalArgumentException(
        String.format(
            "Object %s cannot be cast to Map<%s, %s>",
            obj.getClass().getSimpleName(), keyClass.getName(), valueClass.getName()));
  }

  /**
   * Removes all null or empty values from a Map.
   *
   * @param map The map to clear of null or empty values.
   * @param <K> The type of the key class.
   * @param <V> The type of the value class.
   */
  public static <K, V> void clearEmpties(Map<K, V> map) {
    Iterator<Map.Entry<K, V>> iterator = map.entrySet().iterator();

    while (iterator.hasNext()) {
      Map.Entry<K, V> entry = iterator.next();
      V value = entry.getValue();

      if (value == null || (value instanceof String && ((String) value).isEmpty())) {
        iterator.remove();
      }
      if (value instanceof Map) {
        clearEmpties((Map<?, ?>) value);
      }
    }
  }
}