import twitter4j.Status;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;

import java.util.List;

public class Twitterapp4 {
    static void getOneUserTimeline(String userId)  {
        Twitter twitter= TwitterFactory.getSingleton();
        try {
            List<Status> statuses = twitter.getUserTimeline(userId);
            for (Status st : statuses) {
                System.out.println(st.getUser().getName() + "------" + st.getText() + "\n");
            }
        }
        catch(TwitterException e)
        {
            e.printStackTrace();
        }
    }
}
