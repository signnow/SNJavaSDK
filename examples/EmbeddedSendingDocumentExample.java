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

    /**
     * Important:
     * - The following variables are dummy, for example purposes only. Please provide actual data.
     * - If you do not specify a Bearer token, it will be generated automatically.
     */
    String bearerToken = "";
    String pathToDocument = "/your/path/to/document.pdf";

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
