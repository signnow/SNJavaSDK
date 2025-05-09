/*
 * This file is a part of signNow SDK API client.
 *
 * (с) Copyright © 2011-present airSlate Inc. (https://www.signnow.com)
 *
 * For more details on copyright, see LICENSE.md file
 * that was distributed with this source code.
 */

package com.signnow.core.data;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class ResponseDataTest {

  @Test
  public void testResponseContainingPdfFileWithName() {
    byte[] content = "text".getBytes();
    ResponseData data =
        new ResponseData(
            200, "application/pdf", "attachment; filename=\"demo_document.pdf\"", "/tmp", content);

    assertEquals(200, data.getCode());
    assertEquals("/tmp", data.getDownloadDirectory());
    assertEquals("text", data.getContentAsString());
    assertEquals(content, data.getContent());
    assertEquals("demo_document.pdf", data.getFileName());
    assertTrue(data.hasFile());
  }

  @Test
  public void testResponseContainingZipFileWithoutName() {
    byte[] bytes = new byte[] {0x41, 0x42, 0x43};
    ResponseData data =
        new ResponseData(201, "application/zip", "attachment;", "/downloads", bytes);

    assertEquals(201, data.getCode());
    assertEquals("/downloads", data.getDownloadDirectory());
    assertEquals("ABC", data.getContentAsString());
    assertEquals(bytes, data.getContent());
    assertTrue(data.hasFile());
    assertTrue(this.isValidUuidZipFilename(data.getFileName()));
  }

  @Test
  public void testResponseNotContainingFile() {
    byte[] emptyArray = new byte[0];
    ResponseData data = new ResponseData(204, "text/plain", "", "/downloads", emptyArray);

    assertEquals(204, data.getCode());
    assertFalse(data.hasFile());
  }

  private boolean isValidUuidZipFilename(String filename) {
    String uuidZipPattern =
        "^[0-9a-fA-F]{8}-[0-9a-fA-F]{4}-"
            + "[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-"
            + "[0-9a-fA-F]{12}\\.zip$";
    return filename != null && filename.matches(uuidZipPattern);
  }
}
