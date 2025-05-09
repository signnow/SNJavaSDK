import java.io.File;

import com.signnow.api.document.request.DocumentPostRequest;
import com.signnow.api.document.response.DocumentPostResponse;
import com.signnow.api.documentgroup.request.DocumentGroupPostRequest;
import com.signnow.api.documentgroup.request.data.DocumentIdCollection;
import com.signnow.api.documentgroup.response.DocumentGroupPostResponse;
import com.signnow.api.embeddedsending.request.DocumentGroupEmbeddedSendingLinkPostRequest;
import com.signnow.api.embeddedsending.response.DocumentGroupEmbeddedSendingLinkPostResponse;
import com.signnow.core.ApiClient;
import com.signnow.core.exception.SignNowApiException;
import com.signnow.core.factory.SdkFactory;

public class EmbeddedSendingDocumentGroupExample {
  public static void main(String[] args) {

    /**
     * Important:
     * - The following variables are dummy, for example purposes only. Please provide actual data.
     * - If you do not specify a Bearer token, it will be generated automatically.
     */
    String bearerToken = "";
    String groupName = "Test Document Group";
    String pathToDocument = "/your/path/to/file.pdf";

    try {
      ApiClient client = SdkFactory.createApiClientWithBearerToken(bearerToken);

      /** Upload documents to create a document group, specify the paths to the files. */
      DocumentPostRequest request = new DocumentPostRequest(new File(pathToDocument));
      DocumentPostResponse response = (DocumentPostResponse) client.send(request).getResponse();
      String documentId1 = response.getId();

      DocumentPostRequest request2 = new DocumentPostRequest(new File(pathToDocument));
      DocumentPostResponse response2 = (DocumentPostResponse) client.send(request2).getResponse();
      String documentId2 = response2.getId();

      /**
       * Create a document group by specifying its name
       * and the IDs of the documents it will consist of.
       */
      DocumentIdCollection documentIds = new DocumentIdCollection();
      documentIds.add(documentId1);
      documentIds.add(documentId2);
      DocumentGroupPostRequest groupRequest = new DocumentGroupPostRequest(documentIds, groupName);
      DocumentGroupPostResponse groupResponse =
          (DocumentGroupPostResponse) client.send(groupRequest).getResponse();
      String groupId = groupResponse.getId();

      /** Create an embedded sending link for the created document group. */
      DocumentGroupEmbeddedSendingLinkPostRequest embeddedSendingRequest =
          new DocumentGroupEmbeddedSendingLinkPostRequest("https://example.com", 15, "blank");
      embeddedSendingRequest.withDocumentGroupId(groupId);
      DocumentGroupEmbeddedSendingLinkPostResponse embeddedSendingResponse =
          (DocumentGroupEmbeddedSendingLinkPostResponse)
              client.send(embeddedSendingRequest).getResponse();

      System.out.println(
          "Link for embedded sending: " + embeddedSendingResponse.getData().getUrl());
    } catch (SignNowApiException e) {
      System.out.println("ERROR: " + e.getMessage());
    }
  }
}
