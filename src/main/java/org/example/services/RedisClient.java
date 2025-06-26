package org.example.services;

import java.util.*;

//Simulates Redis Sorted Set commands (ZADD and ZRANGE)
public class RedisClient {
    private static RedisClient instance = null;
    private final Map<String, TreeMap<Long, String>> sortedSet = new HashMap<>();

    private RedisClient() {}

    public static RedisClient getInstance() {
        if (instance == null) {
            instance = new RedisClient();
        }
        return instance;
    }

    public void zadd(String key, long score, String value) {
        sortedSet.putIfAbsent(key, new TreeMap<>(Collections.reverseOrder()));
        sortedSet.get(key).put(score, value);
    }

    public List<String> zrange(String key, int limit) {
        if (!sortedSet.containsKey(key)) return Collections.emptyList();
        return sortedSet.get(key).values().stream().limit(limit).toList();
    }
}
