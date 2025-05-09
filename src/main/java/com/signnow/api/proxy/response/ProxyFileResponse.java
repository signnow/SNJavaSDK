/*
 * This file is a part of signNow SDK API client.
 *
 * (с) Copyright © 2011-present airSlate Inc. (https://www.signnow.com)
 *
 * For more details on copyright, see LICENSE.md file
 * that was distributed with this source code.
 */

package com.signnow.api.proxy.response;

import java.io.File;

/**
 * This class represents the response received after a request to proxy any unimplemented endpoint
 * that returns a file.
 */
public class ProxyFileResponse {
  /**
   * The file downloaded as part of the response. This file is created from the response content and
   * stored locally.
   */
  private final File file;

  /**
   * Creates a new ProxyFileResponse with the specified file.
   *
   * @param file The downloaded file
   */
  public ProxyFileResponse(File file) {
    this.file = file;
  }

  /**
   * Gets the downloaded file.
   *
   * @return The File object representing the downloaded file
   */
  public File getFile() {
    return file;
  }
}
