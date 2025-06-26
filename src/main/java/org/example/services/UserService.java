package org.example.services;



import org.example.models.User;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class UserService {
    private final Map<String, User> users = new HashMap<>();
    private static UserService instance = null;

    private UserService() {}

    public static UserService getInstance() {
        if (instance == null) {
            instance = new UserService();
        }
        return instance;
    }

    public User createUser(String username) {
        String id = UUID.randomUUID().toString();
        User user = new User(id, username);
        users.put(id, user);
        return user;
    }

    public User getUser(String id) {
        return users.get(id);
    }
}
