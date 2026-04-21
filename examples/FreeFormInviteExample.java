import com.signnow.api.documentinvite.request.FreeFormInvitePostRequest;
import com.signnow.api.documentinvite.response.FreeFormInvitePostResponse;
import com.signnow.core.ApiClient;
import com.signnow.core.exception.SignNowApiException;
import com.signnow.core.factory.SdkFactory;

public class FreeFormInviteExample {
  public static void main(String[] args) {
    // Fill in your actual data in examples/signnow-example.properties before running
    //----------------------------------------------------
    SignNowExampleData data = new SignNowExampleData();
    String bearerToken = data.getBearerToken();
    String senderEmail = data.getSenderEmail();
    String signerEmail = data.getFreeFormInviteSignerEmail();
    String documentId = data.getFreeFormInviteDocumentId();

    try {
      ApiClient client = SdkFactory.createApiClientWithBearerToken(bearerToken);

      FreeFormInvitePostRequest request = new FreeFormInvitePostRequest(signerEmail, senderEmail);
      request.withDocumentId(documentId);
      FreeFormInvitePostResponse response = (FreeFormInvitePostResponse) client.send(request).getResponse();

      System.out.println("Invite Request ID: " + response.getId());
    } catch (SignNowApiException e) {
      System.out.println("ERROR: " + e.getMessage());
    }
  }
}
