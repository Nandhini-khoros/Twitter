import twitter4j.*;

import java.util.List;
import java.util.Scanner;

public class Twitterapp1 {
    public static void postTweet(String postMessage){

        Twitter twitter= TwitterFactory.getSingleton();
        try {
            Status status = twitter.updateStatus(postMessage);
            System.out.println("POst tweeted");
        }
        catch (TwitterException e)
        {
            e.printStackTrace();
        }
    }


    public static void main(String[] args) throws TwitterException {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the message to be posted");
        String postMessage = sc.nextLine();
        System.out.println("Enter the  message to be sent directly to the user and userId");
        String  userMessage= sc.nextLine();
        String userId = sc.nextLine();
        System.out.println("Enter the user Id");
        String userId1 = sc.nextLine();
        Twitterapp1 td = new Twitterapp1();
        td.postTweet(postMessage);
        Twitterapp2.getTimeline();
        Twitterapp3.sendDirectMessage(userMessage,userId);
        Twitterapp4.getOneUserTimeline(userId1);
    }
}