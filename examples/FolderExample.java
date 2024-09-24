import com.signnow.api.folder.request.FolderDocumentsGetRequest;
import com.signnow.api.folder.response.FolderDocumentsGetResponse;
import com.signnow.core.ApiClient;
import com.signnow.core.exception.SignNowApiException;
import com.signnow.core.factory.SdkFactory;

public class FolderExample {
  public static void main(String[] args) {

    // Set your actual input data here
    // Note: following values are dummy, just for example
    //----------------------------------------------------
    // if it is not specified here, a new Bearer token will be created automatically
    String bearerToken = "";
    String folderId = "14f2b0157ce3cb455a2d8031ccc1fc08bd32f8b5";

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
