package org.example.services;


import org.example.models.Post;
import org.example.models.User;

public class PostService {
    private final MediaService mediaService = new MediaService();

    public Post uploadPost(User user, byte[] media, String caption) {
        String mediaUrl = mediaService.uploadMedia(media);
        Post post = new Post(user.getId(), mediaUrl, caption);
        System.out.println("✅ Post Uploaded: " + post.getId());
        return post;
    }
}
