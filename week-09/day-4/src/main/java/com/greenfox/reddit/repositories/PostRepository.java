package com.greenfox.reddit.repositories;

import com.greenfox.reddit.models.Post;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PostRepository extends JpaRepository<Post, Integer> {
}
