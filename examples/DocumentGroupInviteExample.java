import com.signnow.api.document.request.DocumentPostRequest;
import com.signnow.api.document.request.DocumentPutRequest;
import com.signnow.api.document.request.data.Field;
import com.signnow.api.document.request.data.FieldCollection;
import com.signnow.api.document.response.DocumentPostResponse;
import com.signnow.api.documentgroup.request.DocumentGroupGetRequest;
import com.signnow.api.documentgroup.request.DocumentGroupPostRequest;
import com.signnow.api.documentgroup.request.data.DocumentIdCollection;
import com.signnow.api.documentgroup.response.DocumentGroupGetResponse;
import com.signnow.api.documentgroup.response.DocumentGroupPostResponse;
import com.signnow.api.documentgroupinvite.request.GroupInvitePostRequest;
import com.signnow.api.documentgroupinvite.request.data.CcCollection;
import com.signnow.api.documentgroupinvite.request.data.invitestep.*;
import com.signnow.api.documentgroupinvite.response.GroupInvitePostResponse;
import com.signnow.core.ApiClient;
import com.signnow.core.exception.SignNowApiException;
import com.signnow.core.factory.SdkFactory;
import java.io.File;

public class DocumentGroupInviteExample {
  public static void main(String[] args) {

    // Set your actual input data here
    // Note: following values are dummy, just for example
    //----------------------------------------------------
    // if it is not specified here, a new Bearer token will be created automatically
    String bearerToken = "";
    String groupName = "Test Document Group";
    String signerRole = "Signer";
    String signerEmail = "signer@signnow.com";
    String subject = "Please sign these documents";
    String message = "Hello, please sign these documents";
    String pathToDocument = "/your/path/to/document.pdf";

    try {
      ApiClient client = SdkFactory.createApiClientWithBearerToken(bearerToken);

      // Step 1: Upload 1st document
      DocumentPostRequest request = new DocumentPostRequest(new File(pathToDocument));
      DocumentPostResponse response = (DocumentPostResponse) client.send(request).getResponse();
      String documentId1 = response.getId();

      // Step 2: Add fields with roles to the 1st document
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
          new Field(220, 24, 142, 14, "text", 0, true, signerRole, "text_field", "My reason"));
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
      String groupId = groupResponse.getId();

      // Step 6: Get the newly created document group
      DocumentGroupGetRequest getGroupRequest = new DocumentGroupGetRequest();
      getGroupRequest.withDocumentGroupId(groupId);
      DocumentGroupGetResponse docGroupResponse =
          (DocumentGroupGetResponse) client.send(getGroupRequest).getResponse();

      // Step 7: Create group invite
      InviteStepCollection inviteSteps = new InviteStepCollection();
      InviteActionCollection actions = new InviteActionCollection();
      actions.add(new InviteAction(signerEmail, signerRole, "sign", documentId1));
      actions.add(new InviteAction(signerEmail, signerRole, "sign", documentId2));

      InviteEmailCollection emails = new InviteEmailCollection();
      emails.add(new InviteEmail(signerEmail, subject, message));

      inviteSteps.add(new InviteStep(1, actions, emails));
      CcCollection cc = new CcCollection(); // configure carbon copies if needed

      GroupInvitePostRequest inviteRequest = new GroupInvitePostRequest(inviteSteps, cc);
      inviteRequest.withDocumentGroupId(groupId);
      GroupInvitePostResponse inviteResponse = (GroupInvitePostResponse) client.send(inviteRequest).getResponse();

      System.out.println("Document Group: " + docGroupResponse.getId());
      System.out.println("Document Group invite: " + inviteResponse.getId());
    } catch (SignNowApiException e) {
      System.out.println("ERROR: " + e.getMessage());
    }
  }
}
