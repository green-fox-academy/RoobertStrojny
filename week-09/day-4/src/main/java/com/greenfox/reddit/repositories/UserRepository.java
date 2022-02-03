package com.greenfox.reddit.repositories;

import com.greenfox.reddit.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
