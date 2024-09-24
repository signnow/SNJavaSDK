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
import java.util.Optional;

public class WebhookExample {
  public static void main(String[] args) {

    // Set your actual input data here
    // Note: following values are dummy, just for example
    //----------------------------------------------------
    // if it is not specified here, a new Bearer token will be created automatically
    String bearerToken = "";
    // Your user ID
    String userId = "f2e913db4ba9815a31f8a28a196b7df96fe1cc46";
    // Your URL to catch webhooks for subscribed events in SignNow
    String callbackUrl = "https://demo.requestcatcher.com/";

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
      client.send(subscriptionRequest);
      System.out.println("Subscription is created");

      // 2. Get all subscriptions
      SubscriptionGetRequest subscriptionsRequest = new SubscriptionGetRequest();
      SubscriptionGetResponse subscriptionsResponse =
          (SubscriptionGetResponse) client.send(subscriptionsRequest).getResponse();

      String subscriptionId = null;
      DataSubscriptionCollection subscriptions = subscriptionsResponse.getData();
      for (DataSubscription subscription : subscriptions) {
        System.out.println("ID: " + subscription.getId());
        System.out.println("Event: " + subscription.getEvent());
        System.out.println("Entity ID: " + subscription.getEntityId());
        System.out.println("Action: " + subscription.getAction());
        System.out.println(
            "Headers: "
                + Optional.ofNullable(subscription.getJsonAttributes().getHeaders())
                    .map(m -> m.toString())
                    .orElse("{}"));
        System.out.println(new String(new char[10]).replace("\0", "-"));

        if ("user.document.open".equals(subscription.getEvent())) {
          subscriptionId = subscription.getId();
        }
      }

      // 3. Delete the subscription
      if (subscriptionId != null) {
        SubscriptionDeleteRequest deleteRequest = new SubscriptionDeleteRequest();
        deleteRequest.withEventSubscriptionId(subscriptionId);
        client.send(deleteRequest);
        System.out.println("Subscription is deleted");
      }
    } catch (SignNowApiException e) {
      System.out.println("ERROR: " + e.getMessage());
    }
  }
}
