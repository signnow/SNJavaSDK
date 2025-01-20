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

/**
 * This class is a repository for services. It stores service instances and provides methods to 
 * manipulate and retrieve these instances.
 */
public class ServiceRepository {

  private static final String SERVICE_NAME_ERROR = "Service name cannot be null or empty.";
  private static final String SERVICE_INSTANCE_ERROR = "Service instance cannot be null.";

  /**
   * Map to store services, with a String as the key (e.g., service name) and Object as the value
   * (the service instance).
   */
  private final Map<String, Object> services = new HashMap<>();

  /**
   * This method sets a service instance in the repository.
   *
   * @param serviceName the name of the service. It cannot be null or empty.
   * @param serviceInstance the instance of the service. It cannot be null.
   * @throws IllegalArgumentException if the serviceName is null or empty, or if the serviceInstance is null.
   */
  public void set(String serviceName, Object serviceInstance) {
    if (serviceName == null || serviceName.isEmpty()) {
      throw new IllegalArgumentException(SERVICE_NAME_ERROR);
    }
    if (serviceInstance == null) {
      throw new IllegalArgumentException(SERVICE_INSTANCE_ERROR);
    }
    this.services.put(serviceName, serviceInstance);
  }

  /**
   * This method retrieves a service instance from the repository.
   *
   * @param serviceName the name of the service. It cannot be null or empty.
   * @return the instance of the service.
   * @throws IllegalArgumentException if the serviceName is null or empty.
   */
  public Object get(String serviceName) {
    if (serviceName == null || serviceName.isEmpty()) {
      throw new IllegalArgumentException(SERVICE_NAME_ERROR);
    }
    return services.get(serviceName);
  }

  /**
   * This method checks if a service instance exists in the repository.
   *
   * @param serviceName the name of the service. It cannot be null or empty.
   * @return true if the service exists, false otherwise.
   * @throws IllegalArgumentException if the serviceName is null or empty.
   */
  public boolean has(String serviceName) {
    if (serviceName == null || serviceName.isEmpty()) {
      throw new IllegalArgumentException(SERVICE_NAME_ERROR);
    }
    return services.containsKey(serviceName);
  }

  /**
   * This method checks if the repository is empty.
   *
   * @return true if the repository is empty, false otherwise.
   */
  public boolean isEmpty() {
    return services.isEmpty();
  }
}