import com.signnow.api.document.request.DocumentGetRequest;
import com.signnow.api.document.request.DocumentPostRequest;
import com.signnow.api.document.request.DocumentPutRequest;
import com.signnow.api.document.request.data.Field;
import com.signnow.api.document.request.data.FieldCollection;
import com.signnow.api.document.response.DocumentGetResponse;
import com.signnow.api.document.response.DocumentPostResponse;
import com.signnow.api.document.response.data.Role;
import com.signnow.api.document.response.data.RoleCollection;
import com.signnow.api.embeddedinvite.request.DocumentInviteLinkPostRequest;
import com.signnow.api.embeddedinvite.request.DocumentInvitePostRequest;
import com.signnow.api.embeddedinvite.request.data.Invite;
import com.signnow.api.embeddedinvite.request.data.InviteCollection;
import com.signnow.api.embeddedinvite.response.DocumentInviteLinkPostResponse;
import com.signnow.api.embeddedinvite.response.DocumentInvitePostResponse;
import com.signnow.api.embeddedinvite.response.data.DataInvite;
import com.signnow.api.embeddedinvite.response.data.DataInviteCollection;
import com.signnow.core.ApiClient;
import com.signnow.core.exception.SignNowApiException;
import com.signnow.core.factory.SdkFactory;
import java.io.File;

public class EmbeddedInviteExample {
  public static void main(String[] args) {

    // Set your actual input data here
    // Note: following values are dummy, just for example
    //----------------------------------------------------
    // if it is not specified here, a new Bearer token will be created automatically
    String bearerToken = "";
    String signerRole = "Signer 1";
    String signerEmail = "first@signnow.com";
    String signerFirstName = "Alex";
    String signerLastName = "Tester";
    int embeddedInviteLinkExpirationTime = 45;
    String pathToDocument = "/your/path/to/document.pdf";

    try {
      ApiClient client = SdkFactory.createApiClientWithBearerToken(bearerToken);

      // Step 1: Upload 1st document
      DocumentPostRequest request = new DocumentPostRequest(new File(pathToDocument));
      DocumentPostResponse response = (DocumentPostResponse) client.send(request).getResponse();
      String documentId = response.getId();

      // Step 2: Add fields with roles to the document
      FieldCollection fields = new FieldCollection();
      fields.add(
          new Field(
              205, 18, 122, 12, "text", 0, true, signerRole, "text1_field", "Signing reason"));
      DocumentPutRequest putRequest = new DocumentPutRequest(fields);
      putRequest.withDocumentId(documentId);
      client.send(putRequest);

      // 3. Get the document by id to retrieve the role IDs
      DocumentGetRequest documentRequest = new DocumentGetRequest();
      documentRequest.withDocumentId(documentId);
      DocumentGetResponse documentResponse = (DocumentGetResponse) client.send(documentRequest).getResponse();

      // 4. find the roleID by role name
      RoleCollection roles = documentResponse.getRoles();
      String roleId = "";
      for (Role role : roles) {
        if (role.getName().equals(signerRole)) {
          roleId = role.getUniqueId();
          break;
        }
      }

      // 5. Send embedded invite
      InviteCollection invites = new InviteCollection();
      invites.add(new Invite(signerEmail, roleId, 1, signerFirstName, signerLastName));
      DocumentInvitePostRequest inviteRequest = new DocumentInvitePostRequest(invites, null);
      inviteRequest.withDocumentId(documentId);
      DocumentInvitePostResponse inviteResponse =
          (DocumentInvitePostResponse) client.send(inviteRequest).getResponse();
      DataInviteCollection embeddedInvites = inviteResponse.getData();

      // 6. Find invite ID
      String embeddedInviteId = "";
      for (DataInvite embeddedInvite : embeddedInvites) {
        if (embeddedInvite.getEmail().equals(signerEmail)) {
          embeddedInviteId = embeddedInvite.getId();
          break;
        }
      }

      // 7. Create an embedded invite link for the embedded invite
      DocumentInviteLinkPostRequest linkRequest =
          new DocumentInviteLinkPostRequest("none", embeddedInviteLinkExpirationTime)
              .withDocumentId(documentId)
              .withFieldInviteId(embeddedInviteId);
      DocumentInviteLinkPostResponse linkResponse =
          (DocumentInviteLinkPostResponse) client.send(linkRequest).getResponse();

      System.out.println("Document ID: " + documentId);
      System.out.println("Document embedded invite ID: " + embeddedInviteId);
      System.out.println("Document embedded invite link: " + linkResponse.getData().getLink());
    } catch (SignNowApiException e) {
      System.out.println("ERROR: " + e.getMessage());
    }
  }
}
