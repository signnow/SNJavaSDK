/*
 * This file is a part of signNow SDK API client.
 *
 * (с) Copyright © 2011-present airSlate Inc. (https://www.signnow.com)
 *
 * For more details on copyright, see LICENSE.md file
 * that was distributed with this source code.
 */

package com.signnow.api.user.request;

import com.signnow.core.request.ApiEndpoint;
import com.signnow.core.request.RequestInterface;
import java.util.HashMap;
import java.util.Map;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

/**
 * This class represents a request to update user initials.
 * It implements the RequestInterface with a String type parameter.
 */
@ApiEndpoint(
    name = "updateUserInitials",
    url = "/user/initial",
    method = "put",
    auth = "bearer",
    namespace = "User",
    entity = "initial",
    type = "application/json")
public final class InitialPutRequest implements RequestInterface<String> {

  /**
   * The data to be updated.
   */
  private final String data;

  /**
   * Constructs a new InitialPutRequest with the specified data.
   *
   * @param data the data to be updated
   */
  public InitialPutRequest(String data) {
    this.data = data;
  }

  /**
   * Returns the data to be updated.
   *
   * @return the data to be updated
   */
  public String getData() {
    return this.data;
  }

  /**
   * Returns an empty HashMap.
   * This method is required by the RequestInterface but not used in this class.
   *
   * @return an empty HashMap
   */
  @NotNull
  @Contract(value = " -> new", pure = true)
  @Override
  public HashMap<String, String> uriParams() {
    return new HashMap<>();
  }

  /**
   * Returns a Map with a single entry where the key is "data" and the value is the data to be updated.
   *
   * @return a Map with a single entry
   */
  @NotNull
  public Map<String, String> payload() {
    Map<String, String> map = new HashMap<>();
    map.put("data", this.getData());
    return map;
  }
}