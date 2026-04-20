import com.signnow.api.document.request.DocumentPostRequest;
import com.signnow.api.document.response.DocumentPostResponse;
import com.signnow.api.document.request.DocumentGetRequest;
import com.signnow.api.document.request.DocumentPutRequest;
import com.signnow.api.document.request.data.Field;
import com.signnow.api.document.request.data.FieldCollection;
import com.signnow.api.document.response.DocumentGetResponse;
import com.signnow.api.document.response.data.Role;
import com.signnow.api.document.response.data.RoleCollection;
import com.signnow.api.documentinvite.request.SendInvitePostRequest;
import com.signnow.api.documentinvite.request.data.To;
import com.signnow.api.documentinvite.request.data.ToCollection;
import com.signnow.api.documentinvite.response.SendInvitePostResponse;
import com.signnow.core.ApiClient;
import com.signnow.core.exception.SignNowApiException;
import com.signnow.core.factory.SdkFactory;
import java.io.File;

public class FieldInviteExample {
  public static void main(String[] args) {
    // Fill in your actual data in examples/signnow-example.properties before running
    //----------------------------------------------------
    SignNowExampleData data = new SignNowExampleData();
    String bearerToken = data.getBearerToken();
    String senderEmail = data.getSenderEmail();
    String signerEmail = data.getFieldInviteSignerEmail();
    String signerRole = data.getFieldInviteSignerRole();
    String pathToDocument = data.getPathToDocument();
    // Set your actual input data here, or use these as examples
    String subject = "You have got an invitation to sign the contact";
    String message = "Hello, please read and sign the contract";

    try {
      ApiClient client = SdkFactory.createApiClientWithBearerToken(bearerToken);

      DocumentPostRequest request = new DocumentPostRequest(new File(pathToDocument));
      DocumentPostResponse response = (DocumentPostResponse) client.send(request).getResponse();
      String documentId = response.getId();

      // Add fields with roles to the document
      FieldCollection fields = new FieldCollection();
      fields.add(
          new Field(
              205,
              18,
              122,
              12,
              "text",
              0,
              true,
              signerRole,
              "signer_reason_text_field",
              "Reason to sign"));
      DocumentPutRequest putFieldsRequest = new DocumentPutRequest(fields);
      putFieldsRequest.withDocumentId(documentId);
      client.send(putFieldsRequest);

      // Get the document by id to retrieve the role IDs
      DocumentGetRequest documentRequest = new DocumentGetRequest();
      documentRequest.withDocumentId(documentId);
      DocumentGetResponse documentResponse = (DocumentGetResponse) client.send(documentRequest).getResponse();

      // Send an invitation to sign the document
      RoleCollection roles = documentResponse.getRoles();
      ToCollection to = new ToCollection();
      for (Role role : roles) {
        to.add(
            new To(
                signerEmail,
                role.getUniqueId(),
                role.getName(),
                Integer.parseInt(role.getSigningOrder()),
                subject,
                message));
      }
      SendInvitePostRequest inviteRequest =
          new SendInvitePostRequest(documentId, to, senderEmail, subject, message);
      inviteRequest.withDocumentId(documentId);
      SendInvitePostResponse inviteResponse = (SendInvitePostResponse) client.send(inviteRequest).getResponse();
      System.out.println("Status: " + inviteResponse.getStatus());
    } catch (SignNowApiException e) {
      System.out.println("ERROR: " + e.getMessage());
    }
  }
}
