/*
 * This file is a part of signNow SDK API client.
 *
 * (с) Copyright © 2011-present airSlate Inc. (https://www.signnow.com)
 *
 * For more details on copyright, see LICENSE.md file
 * that was distributed with this source code.
 */

package com.signnow.core.response;

import com.signnow.core.data.ResponseData;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Utility class for downloading files from HTTP responses. This class handles saving response body
 * content to files in a specified directory. It can extract filenames from Content-Disposition
 * headers or generate random filenames with appropriate extensions based on Content-Type.
 */
public final class FileDownloader {

  /**
   * Saves the binary content from an HTTP response to a file.
   *
   * @param downloadData The data object containing sensitive response data
   * @return The File object representing the saved file
   * @throws IOException If there's an error writing the file
   */
  public static File saveFile(ResponseData downloadData) throws IOException {
    String fileName = downloadData.getFileName();
    String downloadDirectory = downloadData.getDownloadDirectory();
    String filePath =
        downloadDirectory.endsWith("/")
            ? downloadDirectory + fileName
            : downloadDirectory + "/" + fileName;

    File directory = new File(downloadDirectory);
    if (!directory.exists()) {
      if (!directory.mkdirs()) {
        throw new IOException("Failed to create directory: " + downloadDirectory);
      }
    }

    try (FileOutputStream fos = new FileOutputStream(filePath)) {
      byte[] fileContent = downloadData.getContent();
      fos.write(fileContent);
      fos.flush();
    }

    return new File(filePath);
  }
}
