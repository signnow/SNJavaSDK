import com.signnow.api.folder.request.FolderDocumentsGetRequest;
import com.signnow.api.folder.response.FolderDocumentsGetResponse;
import com.signnow.core.ApiClient;
import com.signnow.core.exception.SignNowApiException;
import com.signnow.core.factory.SdkFactory;

public class FolderExample {
  public static void main(String[] args) {
    // Fill in your actual data in examples/signnow-example.properties before running
    //----------------------------------------------------
    SignNowExampleData data = new SignNowExampleData();
    String bearerToken = data.getBearerToken();
    String folderId = data.getFolderFolderId();

    try {
      ApiClient client = SdkFactory.createApiClientWithBearerToken(bearerToken);

      FolderDocumentsGetRequest request = new FolderDocumentsGetRequest();
      request.withFolderId(folderId);

      FolderDocumentsGetResponse response = (FolderDocumentsGetResponse) client.send(request).getResponse();

      System.out.println("Folder ID: " + response.getId());
      System.out.println("Folder Name: " + response.getName());
    } catch (SignNowApiException e) {
      System.out.println("ERROR: " + e.getMessage());
    }
  }
}
