package com.greenfox.todomysql;

import com.greenfox.todomysql.models.Todo;
import com.greenfox.todomysql.repositories.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TodomysqlApplication implements CommandLineRunner {
    TodoRepository todoRepository;

    @Autowired
    public TodomysqlApplication(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    public static void main(String[] args) {
        SpringApplication.run(TodomysqlApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        todoRepository.save(new Todo("Learn SQL"));
        todoRepository.save(new Todo("Make exam"));
        todoRepository.save(new Todo("Make project"));
        todoRepository.save(new Todo("Get a job"));
        todoRepository.save(new Todo("Do all exercises"));
        todoRepository.save(new Todo("Broom"));
        todoRepository.save(new Todo("Make the beds"));
        todoRepository.save(new Todo("Remove the grease"));
        todoRepository.save(new Todo("Wash the floors"));
    }
}
