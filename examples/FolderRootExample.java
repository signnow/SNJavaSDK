import com.signnow.api.folder.request.FolderGetRequest;
import com.signnow.api.folder.response.FolderGetResponse;
import com.signnow.core.ApiClient;
import com.signnow.core.exception.SignNowApiException;
import com.signnow.core.factory.SdkFactory;

public class FolderRootExample {
  public static void main(String[] args) {

    // Set your actual input data here
    // Note: following values are dummy, just for example
    //----------------------------------------------------
    // if it is not specified here, a new Bearer token will be created automatically
    String bearerToken = "";

    try {
      ApiClient client = SdkFactory.createApiClientWithBearerToken(bearerToken);

      FolderGetRequest request = new FolderGetRequest();

      FolderGetResponse response = (FolderGetResponse) client.send(request).getResponse();

      System.out.println("Root Folder ID: " + response.getId());
      System.out.println("Root Folder Name: " + response.getName());
    } catch (SignNowApiException e) {
      System.out.println("ERROR: " + e.getMessage());
    }
  }
}
