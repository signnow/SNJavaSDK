/*
 * This file is a part of signNow SDK API client.
 *
 * (с) Copyright © 2011-present airSlate Inc. (https://www.signnow.com)
 *
 * For more details on copyright, see LICENSE.md file
 * that was distributed with this source code.
 */

package com.signnow.api.documentgroup.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.io.File;

/**
 * This class represents the response received after a request to download a document group. It is
 * annotated to ignore unknown properties when parsing JSON.
 */
public class DownloadDocumentGroupPostResponse {

  /**
   * The file downloaded as part of the response. This file is created from the response content and
   * stored locally.
   */
  private final File file;

  /**
   * Creates a new DownloadDocumentGroupPostResponse with the specified file.
   *
   * @param file The downloaded file
   */
  public DownloadDocumentGroupPostResponse(File file) {
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
