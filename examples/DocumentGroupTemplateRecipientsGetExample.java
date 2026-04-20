import com.signnow.api.documentgrouptemplate.request.DocumentGroupTemplateRecipientsGetRequest;
import com.signnow.api.documentgrouptemplate.response.DocumentGroupTemplateRecipientsGetResponse;
import com.signnow.core.ApiClient;
import com.signnow.core.exception.SignNowApiException;
import com.signnow.core.factory.SdkFactory;

public class DocumentGroupTemplateRecipientsGetExample {
  public static void main(String[] args) {
    // Fill in your actual data in examples/signnow-example.properties before running
    SignNowExampleData data = new SignNowExampleData();
    String bearerToken = data.getBearerToken();
    String templateId = data.getDocumentGroupTemplateRecipientsTemplateId();

    try {
      ApiClient client = SdkFactory.createApiClientWithBearerToken(bearerToken);
      DocumentGroupTemplateRecipientsGetRequest request =
          new DocumentGroupTemplateRecipientsGetRequest().withTemplateId(templateId);
      DocumentGroupTemplateRecipientsGetResponse response =
          (DocumentGroupTemplateRecipientsGetResponse) client.send(request).getResponse();

      System.out.println("Template Recipients:");
      response.getData().getRecipients().forEach(recipient -> {
        System.out.println("  Name: " + recipient.getName() + ", Email: " + recipient.getEmail());
      });

      if (response.getData().getGeneralExpirationDays() != null) {
        System.out.println("General Expiration Days: " + response.getData().getGeneralExpirationDays());
      }
      if (response.getData().getGeneralReminder() != null) {
        System.out.println("General Reminder - After: " + response.getData().getGeneralReminder().getRemindAfter()
            + ", Before: " + response.getData().getGeneralReminder().getRemindBefore()
            + ", Repeat: " + response.getData().getGeneralReminder().getRemindRepeat());
      }
      if (response.getData().getOrderType() != null) {
        System.out.println("Order Type: " + response.getData().getOrderType());
      }
    } catch (SignNowApiException e) {
      System.out.println("ERROR: " + e.getMessage());
    }
  }
}
