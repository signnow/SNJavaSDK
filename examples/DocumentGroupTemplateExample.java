import com.signnow.api.documentgrouptemplate.request.DocumentGroupTemplatePostRequest;
import com.signnow.api.documentgrouptemplate.response.DocumentGroupTemplatePostResponse;
import com.signnow.core.ApiClient;
import com.signnow.core.exception.SignNowApiException;
import com.signnow.core.factory.SdkFactory;

public class DocumentGroupTemplateExample {
  public static void main(String[] args) {

    // Set your actual input data here
    // Note: following values are dummy, just for example
    //----------------------------------------------------
    // if it is not specified here, a new Bearer token will be created automatically
    String bearerToken = "";
    String templateGroupId = "5d66ca4accdd4ab28f8b2c71001093b5cb3bcb8a";
    String groupName = "My Document Group";
    String clientTimestamp = "2024-01-15T10:30:00Z";
    String folderId = "5d66ca4accdd4ab28f8b2c71001093b5cb3bcb8b";

    try {
      ApiClient client = SdkFactory.createApiClientWithBearerToken(bearerToken);

      // Create document group from template
      DocumentGroupTemplatePostRequest request = new DocumentGroupTemplatePostRequest(
          groupName,
          clientTimestamp,
          folderId
      ).withTemplateGroupId(templateGroupId);

      DocumentGroupTemplatePostResponse response = (DocumentGroupTemplatePostResponse) client.send(request).getResponse();

      System.out.println("Document Group created successfully!");
      System.out.println("Document Group ID: " + response.getData().getUniqueId());
      System.out.println("Document Group Name: " + response.getData().getName());
      System.out.println("Document Group State: " + response.getData().getState());
      System.out.println("Owner Email: " + response.getData().getOwnerEmail());
      System.out.println("Created: " + response.getData().getCreated());

    } catch (SignNowApiException e) {
      System.out.println("ERROR: " + e.getMessage());
    }
  }
}
