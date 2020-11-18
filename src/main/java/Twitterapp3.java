import twitter4j.DirectMessage;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;

public class Twitterapp3 {
    static void sendDirectMessage(String userMessage, String userId)  {
        Twitter twitter= TwitterFactory.getSingleton();
        try {
            DirectMessage message = twitter.sendDirectMessage(userMessage, userId);
            System.out.println("Sent: " + message.getText() + " to @" + message.getRecipientId());
        }
        catch (TwitterException e)
        {
            e.printStackTrace();
        }
    }
}
