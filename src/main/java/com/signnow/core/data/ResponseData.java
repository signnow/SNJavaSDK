/*
 * This file is a part of signNow SDK API client.
 *
 * (с) Copyright © 2011-present airSlate Inc. (https://www.signnow.com)
 *
 * For more details on copyright, see LICENSE.md file
 * that was distributed with this source code.
 */

package com.signnow.core.data;

import java.nio.charset.StandardCharsets;
import java.util.UUID;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Represents the response data of an HTTP request, including the status code, content type,
 * response body, and an optional download directory.
 */
public class ResponseData {

  /** The HTTP status code associated with the response. */
  private final int code;

  /** The MIME type of the content, e.g., "application/pdf" or "application/zip". */
  private final String contentType;

  /**
   * The content disposition of the response to specify how content should be displayed (e.g.,
   * "attachment; filename=\"document.pdf\"").
   */
  private final String contentDisposition;

  /** The directory path where the content should be downloaded or saved. */
  private final String downloadDirectory;

  /** The raw content of the response as a byte array. */
  private final byte[] content;

  /**
   * Constructs a new {@code ResponseData} instance.
   *
   * @param code the HTTP status code
   * @param contentType the content type of the response
   * @param contentDisposition the content disposition parsed from the response
   * @param downloadDirectory the directory where the response content should be downloaded, if
   *     applicable
   * @param content the raw body content of the response
   */
  public ResponseData(
      int code,
      String contentType,
      String contentDisposition,
      String downloadDirectory,
      byte[] content) {
    this.code = code;
    this.contentType = contentType;
    this.contentDisposition = contentDisposition;
    this.downloadDirectory = downloadDirectory;
    this.content = content;
  }

  /**
   * Returns the HTTP status code
   *
   * @return the response status code
   */
  public int getCode() {
    return this.code;
  }

  /**
   * Returns the raw bytes content of the response.
   *
   * @return the response raw body content
   */
  public byte[] getContent() {
    return this.content;
  }

  /**
   * Returns the string content of the response.
   *
   * @return the response body content as a string
   */
  public String getContentAsString() {
    return new String(this.getContent(), StandardCharsets.UTF_8);
  }

  /**
   * Returns the directory where the response content should be downloaded, if applicable.
   *
   * @return the download directory, or {@code null} if not applicable
   */
  public String getDownloadDirectory() {
    return this.downloadDirectory;
  }

  /**
   * Attempts to extract a filename from the Content-Disposition header, or generates a random
   * filename if extraction fails.
   *
   * @return A filename string
   */
  public String getFileName() {
    if (this.contentDisposition == null) {
      return this.generateFileName();
    }

    Pattern pattern = Pattern.compile("filename\\s*=\\s*\"?([^\";]*)\"?");
    Matcher matcher = pattern.matcher(this.contentDisposition);
    if (matcher.find()) {
      return matcher.group(1);
    }

    return this.generateFileName();
  }

  /**
   * Returns true if content type means file type
   *
   * @return true when response's content type points to file type
   */
  public boolean hasFile() {
    Set<String> contentTypes = Set.of("application/pdf", "application/zip");
    return contentTypes.contains(this.contentType);
  }

  /**
   * Generates a random filename with an appropriate extension based on Content-Type.
   *
   * @return A randomly generated filename with extension
   */
  private String generateFileName() {
    String randomName = UUID.randomUUID().toString();
    String extension = this.getExtensionFromContentType();
    return randomName + "." + extension;
  }

  /**
   * Determines an appropriate file extension based on the Content-Type header.
   *
   * @return The file extension string (without leading dot)
   */
  private String getExtensionFromContentType() {
    Map<String, String> contentTypeMap =
        Map.of(
            "application/pdf", "pdf",
            "application/zip", "zip");

    String baseType = this.contentType.split(";")[0];

    return contentTypeMap.getOrDefault(baseType, "bin");
  }
}
