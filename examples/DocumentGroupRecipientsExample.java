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
import com.signnow.api.documentgroup.request.DocumentGroupRecipientsGetRequest;
import com.signnow.api.documentgroup.request.DocumentGroupRecipientsPutRequest;
import com.signnow.api.documentgroup.request.data.CcCollection;
import com.signnow.api.documentgroup.request.data.GeneralReminder;
import com.signnow.api.documentgroup.request.data.recipient.Attribute;
import com.signnow.api.documentgroup.request.data.recipient.Document;
import com.signnow.api.documentgroup.request.data.recipient.DocumentCollection;
import com.signnow.api.documentgroup.request.data.recipient.Recipient;
import com.signnow.api.documentgroup.request.data.recipient.RecipientCollection;
import com.signnow.api.documentgroup.response.DocumentGroupRecipientsGetResponse;
import com.signnow.api.documentgroup.response.DocumentGroupRecipientsPutResponse;
import com.signnow.core.ApiClient;
import com.signnow.core.exception.SignNowApiException;
import com.signnow.core.factory.SdkFactory;
import java.io.File;

public class DocumentGroupRecipientsExample {
  public static void main(String[] args) {
    // Fill in your actual data in examples/signnow-example.properties before running
    SignNowExampleData data = new SignNowExampleData();
    String bearerToken = data.getBearerToken();
    String pathToDocument = data.getPathToDocument();
    String firstRecipientRole = data.getFirstRecipientRole();
    String secondRecipientRole = data.getSecondRecipientRole();
    String signAction = data.getSignAction();
    String viewAction = data.getViewAction();
    // Set your actual input data here, or use these as examples
    String groupName = "Test Document Group Recipients Example";
    String recipientOrder = "recipient_order"; // at_the_same_time, recipient_order, advanced_order
    int expirationDays = 31;

    try {
      ApiClient client = SdkFactory.createApiClientWithBearerToken(bearerToken);

      // Precondition:
      // the document group contains 2 documents both with a field assigned a signer role
      //----------------------------------------------------
      // Step 1: Upload two documents to become a document group
      DocumentPostRequest request = new DocumentPostRequest(new File(pathToDocument));
      DocumentPostResponse response = (DocumentPostResponse) client.send(request).getResponse();
      String documentId1 = response.getId();
      // Step 2: Add fields with roles to the 1st document
      FieldCollection fields = new FieldCollection();
      fields.add(
              new Field(205, 18, 122, 12, "text", 0, true, firstRecipientRole, "text_field1", "Reason to sign"));
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
              new Field(220, 24, 142, 14, "text", 0, true, secondRecipientRole, "text_field2", "My reason"));
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

      // PUT /v2/document-groups/{document_group_id}/recipients
      DocumentCollection docs1 = new DocumentCollection();
      // Signer recipient: should review and sign the document
      docs1.add(new Document(documentId1, firstRecipientRole, signAction));
      Attribute signerAttribute = Attribute.signer(false, true, false, "Please sign", "Signing request", null, null, null);
      Recipient recipient1 = new Recipient("John Doe", "john.doe@example.com", 1, docs1, null, signerAttribute);

      DocumentCollection docs2 = new DocumentCollection();
      // Viewer recipient: no signature, only view the document
      docs2.add(new Document(documentId2, secondRecipientRole, viewAction));
      Attribute viewerAttribute = Attribute.viewer("Please review", "Document review", false, null, null, null, null);
      Recipient recipient2 = new Recipient("Jane Smith", "jane.smith@example.com", 2, docs2, null, viewerAttribute);

      RecipientCollection recipients = new RecipientCollection();
      recipients.add(recipient1);
      recipients.add(recipient2);

      GeneralReminder generalReminder = new GeneralReminder(1, 5, 3);

      DocumentGroupRecipientsPutRequest putRequest = new DocumentGroupRecipientsPutRequest(
          recipients,
          new CcCollection(),
          expirationDays,
          generalReminder,
          recipientOrder
      ).withDocumentGroupId(documentGroupId);

      DocumentGroupRecipientsPutResponse putResponse = (DocumentGroupRecipientsPutResponse) client.send(putRequest)
          .getResponse();
      System.out.println("==== PUT ====");
      System.out.println("Updated recipients:");
      putResponse.getData().getRecipients().forEach(r -> {
        System.out.println("  Name: " + r.getName() + ", Email: " + r.getEmail());
      });
      if (putResponse.getData().getGeneralExpirationDays() != null) {
        System.out.println("General Expiration Days: " + putResponse.getData().getGeneralExpirationDays());
      }
      if (putResponse.getData().getGeneralReminder() != null) {
        com.signnow.api.documentgroup.response.data.data.GeneralReminder responseReminder = putResponse.getData().getGeneralReminder();
        System.out.println("General Reminder - After: " + responseReminder.getRemindAfter()
            + ", Before: " + responseReminder.getRemindBefore()
            + ", Repeat: " + responseReminder.getRemindRepeat());
      }
      if (putResponse.getData().getOrderType() != null) {
        System.out.println("Order Type: " + putResponse.getData().getOrderType());
      }

      // GET /v2/document-groups/{document_group_id}/recipients
      System.out.println("==== GET ====");
      DocumentGroupRecipientsGetRequest getRequest = new DocumentGroupRecipientsGetRequest()
          .withDocumentGroupId(documentGroupId);
      DocumentGroupRecipientsGetResponse getResponse = (DocumentGroupRecipientsGetResponse) client.send(getRequest)
          .getResponse();
      System.out.println("Recipients:");
      getResponse.getData().getRecipients().forEach(r -> {
        System.out.println("  Name: " + r.getName() + ", Email: " + r.getEmail());
      });
      if (getResponse.getData().getGeneralExpirationDays() != null) {
        System.out.println("General Expiration Days: " + getResponse.getData().getGeneralExpirationDays());
      }
      if (getResponse.getData().getGeneralReminder() != null) {
        com.signnow.api.documentgroup.response.data.data.GeneralReminder responseReminder = getResponse.getData().getGeneralReminder();
        System.out.println("General Reminder - After: " + responseReminder.getRemindAfter()
            + ", Before: " + responseReminder.getRemindBefore()
            + ", Repeat: " + responseReminder.getRemindRepeat());
      }
      if (getResponse.getData().getOrderType() != null) {
        System.out.println("Order Type: " + getResponse.getData().getOrderType());
      }
    } catch (SignNowApiException e) {
      System.out.println("ERROR: " + e.getMessage());
    }
  }
}
