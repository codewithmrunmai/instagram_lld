# 📸 Instagram LLD - User & Feed Microservice (Java)

Welcome to the Low-Level Design of a core **Instagram-like backend microservice**, built in Java.

This microservice handles:
- 👤 User creation and following
- 🖼️ Post uploads
- 📰 Feed fanout (push/pull logic)
- 🧠 Redis-simulated sorted sets for real-time feeds

---

## 🔧 Modules Implemented

| Module        | Description                                  |
|---------------|----------------------------------------------|
| **UserService**  | Manages users and follower relationships     |
| **PostService**  | Uploads media posts with metadata            |
| **FeedService**  | Pushes/pulls posts to follower feeds using strategy pattern |
| **RedisClient**  | In-memory simulation of Redis Sorted Set (`ZADD`, `ZRANGE`) |

---

## 🧠 Design Patterns Used

- **Singleton**: `UserService`, `RedisClient`  
- **Strategy**: `FanoutStrategy` → `Push` vs `Pull` logic  
- **Adapter**: `RedisClient` wraps Redis logic  
- **Immutable Models**: `User`, `Post` have final fields  

---

## 📁 Folder Structure

org.example/
├── models/ // Entities: User, Post
├── services/ // Core logic: Feed, User, Post
├── feed/ // Strategy pattern: PushFanout, PullFanout
└── Main.java // Entry point

yaml
Copy
Edit

---

## ▶️ How to Run

1. Clone this repo
2. Open in any Java IDE (IntelliJ / VSCode / Eclipse)
3. Run `Main.java`
4. You’ll see output like:
✅ Post Uploaded: <post-id>
📤 Fanout PUSH to 1 users.
📰 mrunmai's Feed: [<post-id>]

yaml
Copy
Edit

---

## 🛠️ Tech Stack

- Java 17
- No external dependencies (fully in-memory)
- Designed for education & YouTube LLD series

---

## 🎥 Part of YouTube Series

This repo powers the backend demo shown in my LLD video on:

**“How Instagram Uploads & Shows Feed in Milliseconds”**  
Watch the full breakdown on [YouTube Channel 🔗](https://www.youtube.com/@CodeWithMrunmai/videos)

---

## 💡 Future Scope

- Add Comments, Likes, and Notification modules  
- Integrate with real Redis and S3  
- Add REST APIs with Spring Boot (if scaling needed)

---

## 🤝 Connect with Me

Made with 💜 by **Mrunmai Dahare**  
📩 [business.mrunmai@gmail.com](mailto:business.mrunmai@gmail.com)  
🔗 [YouTube](https://www.youtube.com/@CodeWithMrunmai/videos) | [LinkedIn](https://www.linkedin.com/in/mrunmai-dahare/)

---

## 🪪 License

This project is open for learning, remixing, and contributions 🎓
