import com.signnow.api.document.request.DocumentPostRequest;
import com.signnow.api.document.request.DocumentPutRequest;
import com.signnow.api.document.request.data.Field;
import com.signnow.api.document.request.data.FieldCollection;
import com.signnow.api.document.response.DocumentPostResponse;
import com.signnow.api.documentgroup.request.DocumentGroupPostRequest;
import com.signnow.api.documentgroup.request.data.DocumentIdCollection;
import com.signnow.api.documentgroup.response.DocumentGroupPostResponse;
import com.signnow.api.embeddedgroupinvite.request.GroupInviteLinkPostRequest;
import com.signnow.api.embeddedgroupinvite.request.GroupInvitePostRequest;
import com.signnow.api.embeddedgroupinvite.request.data.invite.*;
import com.signnow.api.embeddedgroupinvite.response.GroupInviteLinkPostResponse;
import com.signnow.api.embeddedgroupinvite.response.GroupInvitePostResponse;
import com.signnow.core.ApiClient;
import com.signnow.core.exception.SignNowApiException;
import com.signnow.core.factory.SdkFactory;
import java.io.File;

public class EmbeddedGroupInviteExample {
  public static void main(String[] args) {

    // Set your actual input data here
    // Note: following values are dummy, just for example
    //----------------------------------------------------
    // if it is not specified here, a new Bearer token will be created automatically
    String bearerToken = "";
    String groupName = "Test Document Group for Embedded Invite";
    String signer1Role = "Signer 1";
    String signer2Role = "Signer 2";
    String signer1Email = "first@signnow.com";
    String signer2Email = "second@signnow.com";
    String pathToDocument = "/your/path/to/document.pdf";

    try {
      ApiClient client = SdkFactory.createApiClientWithBearerToken(bearerToken);

      // Step 1: Upload 1st document
      DocumentPostRequest request = new DocumentPostRequest(new File(pathToDocument));
      DocumentPostResponse response = (DocumentPostResponse) client.send(request).getResponse();
      String documentId1 = response.getId();

      // Step 2: Add fields and roles to the 1st document
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
              signer1Role,
              "text1_field",
              "First signer reason"));
      fields.add(
          new Field(
              205,
              38,
              122,
              12,
              "signature",
              0,
              true,
              signer1Role,
              "signature1_field",
              "First signer signature"));
      DocumentPutRequest putRequest1 = new DocumentPutRequest(fields);
      putRequest1.withDocumentId(documentId1);
      client.send(putRequest1);

      // Step 3: Upload 2nd document
      DocumentPostRequest request2 = new DocumentPostRequest(new File(pathToDocument));
      DocumentPostResponse response2 = (DocumentPostResponse) client.send(request2).getResponse();
      String documentId2 = response2.getId();

      // Step 4: Add fields and roles to the 2nd document
      FieldCollection fields2 = new FieldCollection();
      fields2.add(
          new Field(
              220,
              24,
              142,
              14,
              "text",
              0,
              true,
              signer2Role,
              "text2_field",
              "Second signer reason"));
      fields2.add(
          new Field(
              205,
              38,
              122,
              12,
              "signature",
              0,
              true,
              signer2Role,
              "signature2_field",
              "Second signer signature"));
      DocumentPutRequest putRequest2 = new DocumentPutRequest(fields2);
      putRequest2.withDocumentId(documentId2);
      client.send(putRequest2);

      // Step 5: Create document group
      DocumentIdCollection documentIds = new DocumentIdCollection();
      documentIds.add(documentId1);
      documentIds.add(documentId2);
      DocumentGroupPostRequest groupRequest = new DocumentGroupPostRequest(documentIds, groupName);
      DocumentGroupPostResponse groupResponse =
          (DocumentGroupPostResponse) client.send(groupRequest).getResponse();
      String documentGroupId = groupResponse.getId();

      // Step 6: Create an embedded invite for document group
      DocumentCollection documents1 = new DocumentCollection();
      documents1.add(new Document(documentId1, "sign", signer1Role));
      Signer signer1 = new Signer(signer1Email, "none", documents1, "Thomas", "Rockstar");
      SignerCollection firstInviteSigners = new SignerCollection();
      firstInviteSigners.add(signer1);

      DocumentCollection documents2 = new DocumentCollection();
      documents2.add(new Document(documentId2, "sign", signer2Role));
      Signer signer2 = new Signer(signer2Email, "none", documents2, "Thomas", "Popstar");
      SignerCollection secondInviteSigners = new SignerCollection();
      secondInviteSigners.add(signer2);

      InviteCollection invites = new InviteCollection();
      invites.add(new Invite(1, firstInviteSigners));
      invites.add(new Invite(2, secondInviteSigners));

      GroupInvitePostRequest inviteRequest = new GroupInvitePostRequest(invites, true);
      inviteRequest.withDocumentGroupId(documentGroupId);
      GroupInvitePostResponse inviteResponse = (GroupInvitePostResponse) client.send(inviteRequest).getResponse();
      String groupInviteId = inviteResponse.getData().getId();

      // Create an embedded invite link for the embedded group invite
      GroupInviteLinkPostRequest linkRequest =
          new GroupInviteLinkPostRequest(signer1Email, "none", 15)
              .withDocumentGroupId(documentGroupId)
              .withEmbeddedInviteId(groupInviteId);

      GroupInviteLinkPostResponse linkResponse =
          (GroupInviteLinkPostResponse) client.send(linkRequest).getResponse();

      System.out.println("DG: " + documentGroupId);
      System.out.println("DG embedded invite: " + groupInviteId);
      System.out.println("DG embedded link: " + linkResponse.getData().getLink());
    } catch (SignNowApiException e) {
      System.out.println("ERROR: " + e.getMessage());
    }
  }
}
