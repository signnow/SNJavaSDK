/*
 * This file is a part of signNow SDK API client.
 *
 * (с) Copyright © 2011-present airSlate Inc. (https://www.signnow.com)
 *
 * For more details on copyright, see LICENSE.md file
 * that was distributed with this source code.
 */

package com.signnow.api.folder;

import static org.junit.jupiter.api.Assertions.*;

import com.signnow.BaseTest;
import com.signnow.api.folder.request.FolderGetRequest;
import com.signnow.api.folder.response.FolderGetResponse;
import com.signnow.core.ApiClient;
import com.signnow.core.exception.SignNowApiException;
import com.signnow.mock.expectation.Expectation;
import org.junit.jupiter.api.Test;

public class FolderTest extends BaseTest {

  private ApiClient apiClient;

  private Expectation expectation;

  @Test
  public void testGetFolder() {
    try {
      apiClient = this.client();
    } catch (SignNowApiException e) {
      fail(e.getMessage());
    }

    expectation = this.expectation("get_folder", "get");

    FolderGetRequest request = new FolderGetRequest();

    assertDoesNotThrow(
        () -> {
          FolderGetResponse response = (FolderGetResponse) apiClient.send(request).getResponse();

          assertNotNull(response, "FolderGetResponse should not be null.");

          assertNotNull(response.getId());
          this.assertSame(expectation.get("id"), response.getId());
          this.assertSame(expectation.get("created"), response.getCreated());
          this.assertSame(expectation.get("name"), response.getName());
          this.assertSame(expectation.get("user_id"), response.getUserId());
          this.assertSame(expectation.get("parent_id"), response.getParentId());
          this.assertSame(expectation.get("system_folder"), response.isSystemFolder());
          this.assertSame(expectation.get("shared"), response.isShared());
          this.assertSame(expectation.get("folders"), response.getFolders());
          this.assertSame(expectation.get("total_documents"), response.getTotalDocuments());
          this.assertSame(expectation.get("documents"), response.getDocuments());
          this.assertSame(expectation.get("team_name"), response.getTeamName());
          this.assertSame(expectation.get("team_id"), response.getTeamId());
          this.assertSame(expectation.get("team_type"), response.getTeamType());
        },
        "Sending FolderGetRequest should not throw any exception.");
  }
}
