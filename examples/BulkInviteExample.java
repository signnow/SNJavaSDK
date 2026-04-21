import com.signnow.api.template.request.BulkInvitePostRequest;
import com.signnow.api.template.response.BulkInvitePostResponse;
import com.signnow.core.ApiClient;
import com.signnow.core.exception.SignNowApiException;
import com.signnow.core.factory.SdkFactory;
import java.io.File;

public class BulkInviteExample {
  public static void main(String[] args) {
    // Fill in your actual data in examples/signnow-example.properties before running

    // Details: https://docs.signnow.com/docs/signnow/template/operations/create-a-template-bulkinvite
    //----------------------------------------------------
    SignNowExampleData data = new SignNowExampleData();
    String bearerToken = data.getBearerToken();
    // CSV file containing information for each invite in the bulk
    // Example: Signer 1|user@signnow.com,Contract_0_Jack
    // "Signer 1" - signing role, must present in the template
    // "user@signnow.com" - signer email related for the signing role
    // "Contract_0_Jack" - contains 3 parts: "Contract" - document name, 0 - line/invite number,
    // "Jack" - signer name
    String csvFilePath = data.getBulkInviteCsvFilePath();
    // The template from which a new document will be cloned for each invite in the bulk.
    // The template must have at least one field assigned the same signing role that exists in your csv file
    // (i.e. "Signer 1")
    // Look at TemplateExample.java to find out how to create a template.
    // Look at FieldInviteExample.java to find out how to add a field to document or template.
    String templateId = data.getBulkInviteTemplateId();
    // The folder to store documents cloned from the template.
    String folderId = data.getBulkInviteFolderId();
    String documentNameClonedFromTemplate = "test_bulk_invite";
    // Set your actual input data here, or use these as examples
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
