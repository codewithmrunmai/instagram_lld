package org.example.models;



import java.util.Date;
import java.util.UUID;

public class Post {
    private final String id;
    private final String userId;
    private final String mediaUrl;
    private final String caption;
    private final Date createdAt;

    public Post(String userId, String mediaUrl, String caption) {
        this.id = UUID.randomUUID().toString();
        this.userId = userId;
        this.mediaUrl = mediaUrl;
        this.caption = caption;
        this.createdAt = new Date();
    }

    public String getId() {
        return id;
    }

    public String getUserId() {
        return userId;
    }

    public Date getCreatedAt() {
        return createdAt;
    }
}
