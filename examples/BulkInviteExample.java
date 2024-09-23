import com.signnow.api.template.request.BulkInvitePostRequest;
import com.signnow.api.template.response.BulkInvitePostResponse;
import com.signnow.core.ApiClient;
import com.signnow.core.exception.SignNowApiException;
import com.signnow.core.factory.SdkFactory;
import java.io.File;

public class BulkInviteExample {
  public static void main(String[] args) {

    // Set your actual input data here
    // Note: following values are dummy, just for example
    // Details: https://docs.signnow.com/docs/signnow/template/operations/create-a-template-bulkinvite
    //----------------------------------------------------
    // if it is empty or null, a new Bearer token will be created automatically
    String bearerToken = "";
    // CSV file containing information for each invite in the bulk
    // Example: Signer 1|user@signnow.com,Contract_0_Jack
    // "Signer 1" - signing role, must present in the template
    // "user@signnow.com" - signer email related for the signing role
    // "Contract_0_Jack" - contains 3 parts: "Contract" - document name, 0 - line/invite number,
    // "Jack" - signer name
    String csvFilePath = "/your/path/to/data.csv";
    // The template from which a new document will be cloned for each invite in the bulk.
    // The template must have at least one field assigned the same signing role that exists in your csv file
    // (i.e. "Signer 1")
    // Look at TemplateExample.java to find out how to create a template.
    // Look at FieldInviteExample.java to find out how to add a field to document or template.
    String templateId = "e2e913db4ba9815a31c8a28a196b7df96fe1cc46";
    // The folder to store documents cloned from the template.
    String folderId = "3073f8da73b9a5328f95ccc55a912e3f46da2d94";
    String documentNameClonedFromTemplate = "test_bulk_invite";
    String bulkInviteSubject = "email subject for all signers from CSV";
    String bulkInviteMessage = "email message for all signers from CSV";

    try {
      ApiClient client = SdkFactory.createApiClientWithBearerToken(bearerToken);

      BulkInvitePostRequest request =
          new BulkInvitePostRequest(
              new File(csvFilePath),
              folderId,
              0,
              documentNameClonedFromTemplate,
              bulkInviteSubject,
              bulkInviteMessage);
      request.withDocumentId(templateId);
      BulkInvitePostResponse response = (BulkInvitePostResponse) client.send(request).getResponse();

      System.out.println("Status: " + response.getStatus());
    } catch (SignNowApiException e) {
      System.out.println("ERROR: " + e.getMessage());
    }
  }
}
