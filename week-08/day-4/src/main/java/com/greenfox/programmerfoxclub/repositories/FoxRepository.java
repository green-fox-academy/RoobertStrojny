package com.greenfox.programmerfoxclub.repositories;

import com.greenfox.programmerfoxclub.models.Fox;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FoxRepository extends JpaRepository<Fox, Integer> {
}
