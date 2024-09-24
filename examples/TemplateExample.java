import com.signnow.api.document.request.DocumentPostRequest;
import com.signnow.api.document.response.DocumentPostResponse;
import com.signnow.api.template.request.CloneTemplatePostRequest;
import com.signnow.api.template.request.TemplatePostRequest;
import com.signnow.api.template.response.CloneTemplatePostResponse;
import com.signnow.api.template.response.TemplatePostResponse;
import com.signnow.core.ApiClient;
import com.signnow.core.exception.SignNowApiException;
import com.signnow.core.factory.SdkFactory;
import java.io.File;

public class TemplateExample {
  public static void main(String[] args) {

    // Set your actual input data here
    // Note: following values are dummy, just for example
    //----------------------------------------------------
    // if it is not specified here, a new Bearer token will be created automatically
    String bearerToken = "";
    String pathToDocument = "/your/path/to/file.pdf";

    try {
      ApiClient client = SdkFactory.createApiClientWithBearerToken(bearerToken);

      // 1. Upload a regular document
      DocumentPostRequest request = new DocumentPostRequest(new File(pathToDocument));
      DocumentPostResponse response = (DocumentPostResponse) client.send(request).getResponse();
      String documentId = response.getId();

      // 2. Make template from the uploaded document
      TemplatePostRequest templateRequest =
          new TemplatePostRequest(documentId, "test_sdk_template");
      TemplatePostResponse templateResponse = (TemplatePostResponse) client.send(templateRequest).getResponse();
      String templateId = templateResponse.getId();

      // 3. Clone the template as a document
      CloneTemplatePostRequest cloneRequest = new CloneTemplatePostRequest();
      cloneRequest.withTemplateId(templateId);
      CloneTemplatePostResponse cloneResponse =
          (CloneTemplatePostResponse) client.send(cloneRequest).getResponse();
      String clonedTemplateId = cloneResponse.getId();

      System.out.println("New document ID: " + documentId);
      System.out.println("Template ID: " + templateId);
      System.out.println("Cloned from template document ID: " + clonedTemplateId);
    } catch (SignNowApiException e) {
      System.out.println("ERROR: " + e.getMessage());
    }
  }
}
