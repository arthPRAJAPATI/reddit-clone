package com.redditClone.reddit.repository;

import com.redditClone.reddit.model.Subreddit;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface SubredditRepository extends JpaRepository<Subreddit, Long> {
    Optional<Subreddit> findByName(String subredditName);
}