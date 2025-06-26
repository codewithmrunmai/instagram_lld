package org.example;

import org.example.models.Post;
import org.example.models.User;
import org.example.services.FeedService;
import org.example.services.PostService;
import org.example.services.UserService;

//User & Feed microservice of Instagram
//This code represents the User & Feed microservice of Instagram — managing users, posts, and the feed distribution mechanism. It interacts with media storage, auth, notification, and other microservices (not covered here) to build the full Instagram backend ecosystem.

public class Main {
    public static void main(String[] args) {
        UserService userService = UserService.getInstance();
        PostService postService = new PostService();
        FeedService feedService = new FeedService();

        User mrunmai = userService.createUser("mrunmai");
        User sharvayu = userService.createUser("sharvayu");

        sharvayu.addFollower(mrunmai);  // mrunmai follows sharvayu

        Post post = postService.uploadPost(sharvayu, new byte[]{1, 2, 3}, "Sunset Vibes 🌅");
        feedService.distribute(post);

        System.out.println("📰 mrunmai's Feed: " + feedService.getFeed(mrunmai.getId(), 10));
    }
}

