package org.example.services;



import org.example.feeds.FanoutStrategy;
import org.example.feeds.PullFanoutStrategy;
import org.example.feeds.PushFanoutStrategy;
import org.example.models.Post;
import org.example.models.User;

import java.util.List;
import java.util.Set;

public class FeedService {
    private final RedisClient redis = RedisClient.getInstance();

    public void distribute(Post post) {
        User user = UserService.getInstance().getUser(post.getUserId());
        Set<String> followers = user.getFollowers();

        FanoutStrategy strategy = (followers.size() < 1000000)
                ? new PushFanoutStrategy()
                : new PullFanoutStrategy();

        strategy.fanout(post, followers);
    }

    public List<String> getFeed(String userId, int limit) {
        return redis.zrange("feed:" + userId, limit);
    }
}
