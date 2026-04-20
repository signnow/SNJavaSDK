import com.signnow.api.document.request.DocumentPostRequest;
import com.signnow.api.document.response.DocumentPostResponse;
import com.signnow.core.ApiClient;
import com.signnow.core.exception.SignNowApiException;
import com.signnow.core.factory.SdkFactory;
import java.io.File;

public class DocumentUploadExample {
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

      System.out.println("New document ID: " + response.getId());
    } catch (SignNowApiException e) {
      System.out.println("ERROR: " + e.getMessage());
    }
  }
}
