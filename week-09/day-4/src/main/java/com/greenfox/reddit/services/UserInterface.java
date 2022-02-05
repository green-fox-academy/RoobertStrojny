package com.greenfox.reddit.services;

import com.greenfox.reddit.models.Post;
import com.greenfox.reddit.models.User;
import org.springframework.stereotype.Service;

public interface UserInterface {
    void saveUser(User user);
    boolean validateUser(String username, String password);
    User getUserByUsername(String username);
    User getUserById(Integer id);
    boolean userAlreadyVotedForPost(User user, Post post);
}
