import com.signnow.api.document.request.DocumentGetRequest;
import com.signnow.api.document.response.DocumentGetResponse;
import com.signnow.core.ApiClient;
import com.signnow.core.exception.SignNowApiException;
import com.signnow.core.factory.SdkFactory;

public class DocumentGetExample {
  public static void main(String[] args) {
    // Fill in your actual data in examples/signnow-example.properties before running
    //----------------------------------------------------
    SignNowExampleData data = new SignNowExampleData();
    String bearerToken = data.getBearerToken();
    String documentId = data.getDocumentId();

    try {
      ApiClient client = SdkFactory.createApiClientWithBearerToken(bearerToken);
      DocumentGetRequest request = new DocumentGetRequest();
      request.withDocumentId(documentId);
      DocumentGetResponse response = (DocumentGetResponse) client.send(request).getResponse();
      System.out.println("Document ID: " + response.getId());
      System.out.println("Document Name: " + response.getDocumentName());
      System.out.println("Document Owner: " + response.getUserId());

      // These fields are available when using ?include=field_invites query parameter
      if (response.getGeneralExpirationDays() != null) {
        System.out.println("General Expiration Days: " + response.getGeneralExpirationDays());
      }
      if (response.getGeneralReminder() != null) {
        System.out.println("General Reminder - After: " + response.getGeneralReminder().getRemindAfter()
            + ", Before: " + response.getGeneralReminder().getRemindBefore()
            + ", Repeat: " + response.getGeneralReminder().getRemindRepeat());
      }
      if (response.getOrderType() != null) {
        System.out.println("Order Type: " + response.getOrderType());
      }
    } catch (SignNowApiException e) {
      System.out.println("ERROR: " + e.getMessage());
    }
  }
}
