import java.io.File;

import com.signnow.api.document.request.DocumentPostRequest;
import com.signnow.api.document.response.DocumentPostResponse;
import com.signnow.api.documentgroup.request.DocumentGroupPostRequest;
import com.signnow.api.documentgroup.request.data.DocumentIdCollection;
import com.signnow.api.documentgroup.response.DocumentGroupPostResponse;
import com.signnow.api.embeddededitor.request.DocumentGroupEmbeddedEditorLinkPostRequest;
import com.signnow.api.embeddededitor.response.DocumentGroupEmbeddedEditorLinkPostResponse;
import com.signnow.core.ApiClient;
import com.signnow.core.exception.SignNowApiException;
import com.signnow.core.factory.SdkFactory;

public class EmbeddedEditorDocumentGroupExample {
  public static void main(String[] args) {

    // Set your actual input data here
    // Note: following values are dummy, just for example
    // ----------------------------------------------------
    // if it is not specified here, a new Bearer token will be created automatically
    String bearerToken = "";
    String groupName = "Test Document Group";
    String pathToDocument = "/your/path/to/file.pdf";

    try {
      ApiClient client = SdkFactory.createApiClientWithBearerToken(bearerToken);

      // Create first document
      DocumentPostRequest request = new DocumentPostRequest(new File(pathToDocument));
      DocumentPostResponse response = (DocumentPostResponse) client.send(request).getResponse();
      String documentId1 = response.getId();

      // Create second document
      DocumentPostRequest request2 = new DocumentPostRequest(new File(pathToDocument));
      DocumentPostResponse response2 = (DocumentPostResponse) client.send(request2).getResponse();
      String documentId2 = response2.getId();

      // Create document group from both documents
      DocumentIdCollection documentIds = new DocumentIdCollection();
      documentIds.add(documentId1);
      documentIds.add(documentId2);
      DocumentGroupPostRequest groupRequest = new DocumentGroupPostRequest(documentIds, groupName);
      DocumentGroupPostResponse groupResponse =
          (DocumentGroupPostResponse) client.send(groupRequest).getResponse();
      String groupId = groupResponse.getId();

      // Create a link to the document editor
      DocumentGroupEmbeddedEditorLinkPostRequest editorRequest =
          new DocumentGroupEmbeddedEditorLinkPostRequest("https://example.com", "blank", 15);
      editorRequest.withDocumentGroupId(groupId);
      DocumentGroupEmbeddedEditorLinkPostResponse editorResponse =
          (DocumentGroupEmbeddedEditorLinkPostResponse) client.send(editorRequest).getResponse();

      System.out.println("Link to embedded editor: " + editorResponse.getData().getUrl());
    } catch (SignNowApiException e) {
      System.out.println("ERROR: " + e.getMessage());
    }
  }
}
