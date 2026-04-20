import java.io.File;

import com.signnow.api.document.request.DocumentPostRequest;
import com.signnow.api.document.response.DocumentPostResponse;
import com.signnow.api.embeddededitor.request.DocumentEmbeddedEditorLinkPostRequest;
import com.signnow.api.embeddededitor.response.DocumentEmbeddedEditorLinkPostResponse;
import com.signnow.core.ApiClient;
import com.signnow.core.exception.SignNowApiException;
import com.signnow.core.factory.SdkFactory;

public class EmbeddedEditorDocumentExample {
  public static void main(String[] args) {
    // Fill in your actual data in examples/signnow-example.properties before running
    //----------------------------------------------------
    SignNowExampleData data = new SignNowExampleData();
    String bearerToken = data.getBearerToken();
    String pathToDocument = data.getPathToDocument();

    try {
      ApiClient client = SdkFactory.createApiClientWithBearerToken(bearerToken);

      DocumentPostRequest request = new DocumentPostRequest(new File(pathToDocument));
      DocumentPostResponse response = (DocumentPostResponse) client.send(request).getResponse();

      // Create a link to the document editor
      DocumentEmbeddedEditorLinkPostRequest editorRequest =
          new DocumentEmbeddedEditorLinkPostRequest("https://example.com", "blank", 15);
      editorRequest.withDocumentId(response.getId());
      DocumentEmbeddedEditorLinkPostResponse editorResponse =
          (DocumentEmbeddedEditorLinkPostResponse) client.send(editorRequest).getResponse();

      System.out.println("Link to embedded editor: " + editorResponse.getData().getUrl());
    } catch (SignNowApiException e) {
      System.out.println("ERROR: " + e.getMessage());
    }
  }
}
