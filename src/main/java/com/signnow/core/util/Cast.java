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

public class Cast {

  @SuppressWarnings("unchecked")
  public static <T extends ApiData> T safe(Object obj, Class<T> clazz) {
    if (clazz.isInstance(obj)) {
      return (T) obj;
    }
    throw new IllegalArgumentException(
        "Cannot cast " + obj.getClass().getSimpleName() + " to " + clazz.getName());
  }

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
