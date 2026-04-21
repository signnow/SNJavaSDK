import com.signnow.api.documentgrouptemplate.request.DocumentGroupTemplatePostRequest;
import com.signnow.api.documentgrouptemplate.response.DocumentGroupTemplatePostResponse;
import com.signnow.core.ApiClient;
import com.signnow.core.exception.SignNowApiException;
import com.signnow.core.factory.SdkFactory;
import java.time.Instant;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;

public class DocumentGroupTemplateExample {
  public static void main(String[] args) {
    // Fill in your actual data in examples/signnow-example.properties before running
    //----------------------------------------------------
    SignNowExampleData data = new SignNowExampleData();
    String bearerToken = data.getBearerToken();
    String templateGroupId = data.getDocumentGroupTemplateTemplateGroupId();
    String clientTimestamp = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss'Z'")
        .withZone(ZoneOffset.UTC).format(Instant.now());
    String folderId = data.getDocumentGroupTemplateFolderId();
    // Set your actual input data here, or use these as examples
    String groupName = "My Document Group";

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
