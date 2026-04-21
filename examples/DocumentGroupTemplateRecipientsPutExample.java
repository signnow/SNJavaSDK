import com.signnow.api.documentgroup.request.data.CcCollection;
import com.signnow.api.documentgroup.request.data.GeneralReminder;
import com.signnow.api.documentgroup.request.data.recipient.Attribute;
import com.signnow.api.documentgroup.request.data.recipient.Document;
import com.signnow.api.documentgroup.request.data.recipient.DocumentCollection;
import com.signnow.api.documentgroup.request.data.recipient.Recipient;
import com.signnow.api.documentgroup.request.data.recipient.RecipientCollection;
import com.signnow.api.documentgrouptemplate.request.DocumentGroupTemplateRecipientsGetRequest;
import com.signnow.api.documentgrouptemplate.request.DocumentGroupTemplateRecipientsPutRequest;
import com.signnow.api.documentgrouptemplate.response.DocumentGroupTemplateRecipientsGetResponse;
import com.signnow.api.documentgrouptemplate.response.DocumentGroupTemplateRecipientsPutResponse;
import com.signnow.core.ApiClient;
import com.signnow.core.exception.SignNowApiException;
import com.signnow.core.factory.SdkFactory;

public class DocumentGroupTemplateRecipientsPutExample {
  public static void main(String[] args) {
    // Fill in your actual data in examples/signnow-example.properties before running
    // ----------------------------------------------------
    SignNowExampleData data = new SignNowExampleData();
    String bearerToken = data.getBearerToken();
    String templateId = data.getDocumentGroupTemplateRecipientsTemplateId();
    String documentId1 = data.getDocumentGroupTemplateRecipientsDocumentId1();
    // Set your actual input data here, or use these as examples
    String orderType = "recipient_order"; // at_the_same_time, recipient_order, advanced_order
    int expirationDays = 30;

    try {
      ApiClient client = SdkFactory.createApiClientWithBearerToken(bearerToken);

      // Recipient 1
      DocumentCollection docs1 = new DocumentCollection();
      docs1.add(new Document(documentId1, "Recipient 1", "sign"));
      Attribute attr1 = Attribute.signer(false, true, false, "Please sign", "Signing request", null, null, null);
      Recipient recipient1 = new Recipient("John Doe", "abuba@yopmail.com", 1, docs1, null, attr1);

      // Update template recipients with general settings
      RecipientCollection recipients = new RecipientCollection();
      recipients.add(recipient1);
      CcCollection cc = new CcCollection();

      GeneralReminder generalReminder = new GeneralReminder(1, 5, 3);

      DocumentGroupTemplateRecipientsPutRequest putRequest =
              new DocumentGroupTemplateRecipientsPutRequest(
                      recipients,
                      cc,
                      expirationDays,
                      generalReminder,
                      orderType
              ).withTemplateId(templateId);

      DocumentGroupTemplateRecipientsPutResponse putResponse =
              (DocumentGroupTemplateRecipientsPutResponse) client.send(putRequest).getResponse();

      System.out.println("Template recipients updated successfully.");
      if (putResponse.getData().getGeneralExpirationDays() != null) {
        System.out.println("General expiration: " + putResponse.getData().getGeneralExpirationDays());
      }
      if (putResponse.getData().getGeneralReminder() != null) {
        System.out.println("General reminder: " + putResponse.getData().getGeneralReminder());
      }
      if (putResponse.getData().getOrderType() != null) {
        System.out.println("Updated Order Type: " + putResponse.getData().getOrderType());
      }
    } catch (SignNowApiException e) {
      System.out.println("ERROR: " + e.getMessage());
    }
  }
}
