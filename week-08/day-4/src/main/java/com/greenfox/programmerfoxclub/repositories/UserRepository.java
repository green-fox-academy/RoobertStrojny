package com.greenfox.programmerfoxclub.repositories;

import com.greenfox.programmerfoxclub.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
}
