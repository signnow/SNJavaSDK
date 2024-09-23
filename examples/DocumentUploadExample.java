import com.signnow.api.document.request.DocumentPostRequest;
import com.signnow.api.document.response.DocumentPostResponse;
import com.signnow.core.ApiClient;
import com.signnow.core.exception.SignNowApiException;
import com.signnow.core.factory.SdkFactory;
import java.io.File;

public class DocumentUploadExample {
  public static void main(String[] args) {

    // Set your actual input data here
    // Note: following values are dummy, just for example
    //----------------------------------------------------
    // if it is not specified here, a new Bearer token will be created automatically
    String bearerToken = "";
    String pathToDocument = "/your/path/to/file.pdf";

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
