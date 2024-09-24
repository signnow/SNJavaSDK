/*
 * This file is a part of signNow SDK API client.
 *
 * (с) Copyright © 2011-present airSlate Inc. (https://www.signnow.com)
 *
 * For more details on copyright, see LICENSE.md file
 * that was distributed with this source code.
 */

package com.signnow.core.provider;

import java.util.HashMap;
import java.util.Map;

public class ServiceRepository {

  private static final String SERVICE_NAME_ERROR = "Service name cannot be null or empty.";
  private static final String SERVICE_INSTANCE_ERROR = "Service instance cannot be null.";

  /**
   * Map to store services, with a String as the key (e.g., service name) and Object as the value
   * (the service instance).
   */
  private final Map<String, Object> services = new HashMap<>();

  public void set(String serviceName, Object serviceInstance) {
    if (serviceName == null || serviceName.isEmpty()) {
      throw new IllegalArgumentException(SERVICE_NAME_ERROR);
    }
    if (serviceInstance == null) {
      throw new IllegalArgumentException(SERVICE_INSTANCE_ERROR);
    }
    this.services.put(serviceName, serviceInstance);
  }

  public Object get(String serviceName) {
    if (serviceName == null || serviceName.isEmpty()) {
      throw new IllegalArgumentException(SERVICE_NAME_ERROR);
    }
    return services.get(serviceName);
  }

  public boolean has(String serviceName) {
    if (serviceName == null || serviceName.isEmpty()) {
      throw new IllegalArgumentException(SERVICE_NAME_ERROR);
    }
    return services.containsKey(serviceName);
  }

  public boolean isEmpty() {
    return services.isEmpty();
  }
}
