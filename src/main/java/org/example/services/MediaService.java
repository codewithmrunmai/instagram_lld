package org.example.services;




import java.util.UUID;

public class MediaService {
    public String uploadMedia(byte[] mediaBytes) {
        // Simulate media upload by generating a URL based on content hash
        return "https://cdn.s3/" + UUID.nameUUIDFromBytes(mediaBytes);
    }
}
