import com.signnow.api.webhook.request.SubscriptionDeleteRequest;
import com.signnow.api.webhook.request.SubscriptionGetRequest;
import com.signnow.api.webhook.request.SubscriptionPostRequest;
import com.signnow.api.webhook.request.data.Attribute;
import com.signnow.api.webhook.response.SubscriptionGetResponse;
import com.signnow.api.webhook.response.data.data.DataSubscription;
import com.signnow.api.webhook.response.data.data.DataSubscriptionCollection;
import com.signnow.core.ApiClient;
import com.signnow.core.exception.SignNowApiException;
import com.signnow.core.factory.SdkFactory;
import com.signnow.core.response.Reply;
import java.util.Optional;

public class WebhookExample {
  public static void main(String[] args) {
    // Fill in your actual data in examples/signnow-example.properties before running
    //----------------------------------------------------
    SignNowExampleData data = new SignNowExampleData();
    String bearerToken = data.getBearerToken();
    String userId = data.getUserId();
    String callbackUrl = data.getWebhookCallbackUrl();

    try {
      ApiClient client = SdkFactory.createApiClientWithBearerToken(bearerToken);

      // 1. Subscribe to the event, and then you can retrieve payloads
      // at your endpoint (i.e. callback URL)
      SubscriptionPostRequest subscriptionRequest =
          new SubscriptionPostRequest(
              "user.document.open", // event name; the event triggers when a user opens a document
              userId, // user ID that triggers their events
              "callback", // we will send callbacks
              new Attribute(callbackUrl), // to the specified URL
              null);
      Reply<?> postReply = client.send(subscriptionRequest);
      String subscriptionId = postReply.getHeader("id");
      System.out.println("Subscription is created, ID: " + subscriptionId);
      System.out.println(new String(new char[10]).replace("\0", "-"));

      // 2. Get all subscriptions
      SubscriptionGetRequest subscriptionsRequest = new SubscriptionGetRequest();
      SubscriptionGetResponse subscriptionsResponse =
          (SubscriptionGetResponse) client.send(subscriptionsRequest).getResponse();

      DataSubscriptionCollection subscriptions = subscriptionsResponse.getData();
      for (DataSubscription subscription : subscriptions) {
        System.out.println("ID: " + subscription.getId());
        System.out.println("Event: " + subscription.getEvent());
        System.out.println("Entity ID: " + subscription.getEntityId());
        System.out.println("Action: " + subscription.getAction());
      }

      // 3. Delete the subscription
      if (subscriptionId != null) {
        SubscriptionDeleteRequest deleteRequest = new SubscriptionDeleteRequest();
        deleteRequest.withEventSubscriptionId(subscriptionId);
        client.send(deleteRequest);
        System.out.println("Subscription is deleted, ID: " + subscriptionId);
      }
    } catch (SignNowApiException e) {
      System.out.println("ERROR: " + e.getMessage());
    }
  }
}
