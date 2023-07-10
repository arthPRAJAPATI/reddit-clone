package com.redditClone.reddit.repository;

import com.redditClone.reddit.model.Comment;
import com.redditClone.reddit.model.Post;
import com.redditClone.reddit.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CommentRepository extends JpaRepository<Comment, Long> {
    List<Comment> findByPost(Post post);

    List<Comment> findAllByUser(User user);
}
