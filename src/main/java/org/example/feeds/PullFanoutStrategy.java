package org.example.feeds;

import org.example.models.Post;

import java.util.Set;

public class PullFanoutStrategy implements FanoutStrategy {

    @Override
    public void fanout(Post post, Set<String> followers) {
        System.out.println("📥 Fanout SKIPPED (pull on read).");
        // No push for large follower counts, pull on feed read
    }
}
