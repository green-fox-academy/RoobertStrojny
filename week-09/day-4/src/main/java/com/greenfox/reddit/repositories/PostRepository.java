package com.greenfox.reddit.repositories;

import com.greenfox.reddit.models.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Integer> {
}
