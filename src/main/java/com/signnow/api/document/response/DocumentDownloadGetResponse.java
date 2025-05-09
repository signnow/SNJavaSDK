/*
 * This file is a part of signNow SDK API client.
 *
 * (с) Copyright © 2011-present airSlate Inc. (https://www.signnow.com)
 *
 * For more details on copyright, see LICENSE.md file
 * that was distributed with this source code.
 */

package com.signnow.api.document.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.io.File;

/**
 * This class represents the response received after a document download request.
 */
public class DocumentDownloadGetResponse {

  /**
   * The file downloaded as part of the response. This file is created from the response content and
   * stored locally.
   */
  private final File file;

  /**
   * Creates a new DocumentDownloadGetResponse with the specified file.
   *
   * @param file The downloaded file
   */
  public DocumentDownloadGetResponse(File file) {
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
