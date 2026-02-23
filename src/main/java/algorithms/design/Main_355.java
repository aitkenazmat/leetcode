package algorithms.design;

import java.util.List;

public class Main_355 {

  public static void main(String[] args) {
    Twitter twitter = new Twitter();

    twitter.postTweet(1, 5);
    twitter.postTweet(2, 6);
    twitter.postTweet(3, 7);


    twitter.follow(2, 1);
    twitter.follow(2, 3);


    List<Integer> newsFeed = twitter.getNewsFeed(1);
    System.out.println("");


  }
}
