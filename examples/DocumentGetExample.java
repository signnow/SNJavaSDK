import com.signnow.api.document.request.DocumentGetRequest;
import com.signnow.api.document.response.DocumentGetResponse;
import com.signnow.core.ApiClient;
import com.signnow.core.exception.SignNowApiException;
import com.signnow.core.factory.SdkFactory;

public class DocumentGetExample {
  public static void main(String[] args) {

    // Set your actual input data here
    // Note: following values are dummy, just for example
    //----------------------------------------------------
    // if it is not specified here, a new Bearer token will be created automatically
    String bearerToken = "";
    String documentId = "05fbed799231d85cf3471121ecd6a4221f9c5610";

    try {
      ApiClient client = SdkFactory.createApiClientWithBearerToken(bearerToken);
      DocumentGetRequest request = new DocumentGetRequest();
      request.withDocumentId(documentId);
      DocumentGetResponse response = (DocumentGetResponse) client.send(request).getResponse();
      System.out.println("Document ID: " + response.getId());
      System.out.println("Document Name: " + response.getDocumentName());
      System.out.println("Document Owner: " + response.getUserId());
    } catch (SignNowApiException e) {
      System.out.println("ERROR: " + e.getMessage());
    }
  }
}
