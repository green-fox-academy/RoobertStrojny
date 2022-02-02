package com.greenfox.todomysql.repositories;

import com.greenfox.todomysql.models.Todo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TodoRepository extends JpaRepository<Todo, Long> {
    List<Todo> findAllByDoneFalse();
    List<Todo> findAllByTitleLike(String title);
    List<Todo> findAllByDescriptionLike(String description);
    List<Todo> findAllByAssigneeName(String name);
}
