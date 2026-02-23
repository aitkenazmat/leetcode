package algorithms.design;

import java.util.*;
import java.util.stream.Collectors;

public class Twitter {
  List<User> users;
  int order = 0;

  public Twitter() {
    users = new ArrayList<>();
  }

  public void postTweet(int userId, int tweetId) {
    User user = getUser(userId);
    if ( user != null ) {
      List<Post> currentPosts = user.posts;
      if (currentPosts != null) {
        currentPosts.add(createPost(tweetId));
      }

    } else {
      List<Post> newPosts = new ArrayList<>();
      newPosts.add(createPost(tweetId));
      users.add(createUser(userId, newPosts));
    }
  }



  public List<Integer> getNewsFeed(int userId) {

    List<Post> posts = new ArrayList<>();
    User user = getUser(userId);

    for (User u :  users) {
      List<User> subscribers = u.subscribers;
      if (subscribers!=null) {
        if (subscribers.contains(user)) {
          List<Post> posts1 = u.posts;
          if (posts1!=null)
            posts.addAll(posts1);
        }
      }
    }
    posts.addAll(user.posts);
    Collections.sort(posts);
    return posts.stream().map(post -> post.postId).limit(10).collect(Collectors.toList());
  }

  public void follow(int followerId, int followeeId) {

    User publisher = getUser(followeeId);
    User subsriber = getUser(followerId);
    if (publisher ==null) {
      publisher = createUser(followeeId, null);
      users.add(publisher);
    }

    if (subsriber == null) {
      subsriber = createUser(followerId, null);
      users.add(subsriber);
    }

    List<User> subscribers = publisher.subscribers;
    subscribers.add(subsriber);
  }

  public void unfollow(int followerId, int followeeId) {

    User publisher = getUser(followeeId);
    User unsubsriber = getUser(followerId);
    if (publisher ==null) {
      publisher = createUser(followeeId, null);
    }

    if (unsubsriber == null) {
      unsubsriber = createUser(followerId, null);
    }

    List<User> subscribers = publisher.subscribers;
    int i = subscribers.indexOf(unsubsriber);
    if ( i != -1) {
      subscribers.remove(i);
    }
  }

  private User getUser(int userId) {
    for (User user : users) {
      if (user.userId == userId) {
        return  user;
      }
    }
    return null;
  }

  private Post createPost(int postId) {
    Post post = new Post();
    post.postId = postId;
    post.order = order;

    order++;

    return post;
  }

  private User createUser(int userId, List<Post> newPosts) {
    User newUser = new User();
    newUser.userId = userId;
    newUser.posts = newPosts;
    return newUser;
  }


  static class User {
    int userId;
    List<Post> posts = new ArrayList<>();
    List<User> subscribers = new ArrayList<>();
  }

  static class Post implements Comparable<Post> {
    int postId;
    int order;

    @Override
    public int compareTo(Post o) {
      return Integer.compare(o.order,this.order);
    }
  }
}

