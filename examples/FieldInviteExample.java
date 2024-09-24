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

public class FieldInviteExample {
  public static void main(String[] args) {

    // Set your actual input data here
    // Note: following values are dummy, just for example
    //----------------------------------------------------
    // if it is not specified here, a new Bearer token will be created automatically
    String bearerToken = "";
    String senderEmail = "sender@signnow.com";
    String signerEmail = "signer@signnow.com";
    String signerRole = "General Manager";
    String subject = "You have got an invitation to sign the contact";
    String message = "Hello, please read and sign the contract";
    String pathToDocument = "/your/path/to/file.pdf"; // Path to a document to be signed

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
