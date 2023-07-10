package com.redditClone.reddit.repository;


import com.redditClone.reddit.model.Post;
import com.redditClone.reddit.model.Subreddit;
import com.redditClone.reddit.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PostRepository extends JpaRepository<Post, Long> {
    List<Post> findAllBySubreddit(Subreddit subreddit);

    List<Post> findByUser(User user);
}
