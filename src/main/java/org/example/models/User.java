package org.example.models;

import java.util.HashSet;
import java.util.Set;

public class User {
    private final String id;
    private final String username;
    private final Set<String> followers = new HashSet<>();

    public User(String id, String username) {
        this.id = id;
        this.username = username;
    }

    public String getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public Set<String> getFollowers() {
        return followers;
    }

    public void addFollower(User user) {
        followers.add(user.getId());
    }
}
