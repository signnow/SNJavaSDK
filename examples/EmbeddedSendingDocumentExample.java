import java.io.File;

import com.signnow.api.document.request.DocumentPostRequest;
import com.signnow.api.document.response.DocumentPostResponse;
import com.signnow.api.embeddedsending.request.DocumentEmbeddedSendingLinkPostRequest;
import com.signnow.api.embeddedsending.response.DocumentEmbeddedSendingLinkPostResponse;
import com.signnow.core.ApiClient;
import com.signnow.core.exception.SignNowApiException;
import com.signnow.core.factory.SdkFactory;

public class EmbeddedSendingDocumentExample {
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

      /** Create an embedded sending link for the uploaded document. */
      DocumentEmbeddedSendingLinkPostRequest embeddedSendingRequest =
          new DocumentEmbeddedSendingLinkPostRequest(
              "document", "https://example.com", 15, "blank");
      embeddedSendingRequest.withDocumentId(response.getId());

      DocumentEmbeddedSendingLinkPostResponse embeddedSendingResponse =
          (DocumentEmbeddedSendingLinkPostResponse)
              client.send(embeddedSendingRequest).getResponse();

      System.out.println(
          "Link for embedded sending: " + embeddedSendingResponse.getData().getUrl());
    } catch (SignNowApiException e) {
      System.out.println("ERROR: " + e.getMessage());
    }
  }
}
