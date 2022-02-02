package com.greenfox.todomysql.repositories;

import com.greenfox.todomysql.models.Assignee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AssigneeRepository extends JpaRepository<Assignee, Long> {
    List<Assignee> getAssigneeByTodoContains(String name);
}
