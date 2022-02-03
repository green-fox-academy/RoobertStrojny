package com.greenfox.reddit.services;

import com.greenfox.reddit.models.Post;

import java.util.List;

public interface PostInterface {
    List<Post> getAllPosts();
    void savePost(Post post);
    void incrementPost(Post post);
}
