package com.greenfox.reddit.repositories;

import com.greenfox.reddit.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Integer> {
    User getUserByUsernameAndPassword(String username, String password);
    User getUserByUsername(String username);
}
