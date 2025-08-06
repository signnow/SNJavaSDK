import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.signnow.api.documentgroup.request.DocumentGroupRecipientsGetRequest;
import com.signnow.api.documentgroup.request.DocumentGroupRecipientsPutRequest;
import com.signnow.api.documentgroup.request.data.CcCollection;
import com.signnow.api.documentgroup.request.data.recipient.Recipient;
import com.signnow.api.documentgroup.request.data.recipient.RecipientCollection;
import com.signnow.api.documentgroup.response.DocumentGroupRecipientsGetResponse;
import com.signnow.api.documentgroup.response.DocumentGroupRecipientsPutResponse;
import com.signnow.core.ApiClient;
import com.signnow.core.exception.SignNowApiException;
import com.signnow.core.factory.SdkFactory;

public class DocumentGroupRecipientsExample {
  public static void main(String[] args) {
    // Set your actual input data here
    // Note: following values are dummy, just for example
    // ----------------------------------------------------
    // if it is not specified here, a new Bearer token will be created automatically
    String bearerToken = "";
    String documentGroupId = "5d66ca4accdd4ab28f8b2c71001093b5cb3bcb8a";

    try {
      ApiClient client = SdkFactory.createApiClientWithBearerToken(bearerToken);

      // Get recipient
      DocumentGroupRecipientsGetRequest request = new DocumentGroupRecipientsGetRequest()
          .withDocumentGroupId(documentGroupId);
      DocumentGroupRecipientsGetResponse response = (DocumentGroupRecipientsGetResponse) client.send(request)
          .getResponse();

      // Convert to request model and replace email
      RecipientCollection recipientCollection = new RecipientCollection();
      for (com.signnow.api.documentgroup.response.data.data.Recipient responseRecipient : response.getData()
          .getRecipients()) {
        Recipient reqRecipient = convertRecipient(responseRecipient);
        if (reqRecipient == null) continue;
        
        System.out.println("Original name: " + responseRecipient.getName());
        System.out.println("Original email: " + responseRecipient.getEmail());

        if (reqRecipient.getName().equals("Recipient 1")) {
          // Replace email
          Recipient updated = new Recipient(
              reqRecipient.getName(),
              "new.email@example.com",
              reqRecipient.getOrder(),
              reqRecipient.getDocuments(),
              reqRecipient.getEmailGroup(),
              reqRecipient.getAttributes());
          recipientCollection.add(updated);
        } else {
          recipientCollection.add(reqRecipient);
        }
      }

      // Send PUT request
      DocumentGroupRecipientsPutRequest putRequest = new DocumentGroupRecipientsPutRequest(
          recipientCollection,
          new CcCollection()).withDocumentGroupId(documentGroupId);

      DocumentGroupRecipientsPutResponse putResponse = (DocumentGroupRecipientsPutResponse) client.send(putRequest)
          .getResponse();
      System.out.println("Updated email: " + putResponse.getData().getRecipients().get(0).getEmail());

    } catch (SignNowApiException e) {
      System.out.println("ERROR: " + e.getMessage());
    }
  }

  private static Recipient convertRecipient(
      com.signnow.api.documentgroup.response.data.data.Recipient responseRecipient) {
    ObjectMapper mapper = new ObjectMapper();
    try {
      String json = mapper.writeValueAsString(responseRecipient);
      Recipient recipient = mapper.readValue(json, Recipient.class);

      return new Recipient(
          recipient.getName(),
          recipient.getEmail(),
          recipient.getOrder(),
          recipient.getDocuments(),
          recipient.getEmailGroup(),
          recipient.getAttributes());

    } catch (JsonProcessingException e) {
      e.printStackTrace();
      return null;
    }
  }
}
