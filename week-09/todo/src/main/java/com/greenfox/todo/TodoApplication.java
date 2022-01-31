package com.greenfox.todo;

import com.greenfox.todo.models.Todo;
import com.greenfox.todo.repositories.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TodoApplication implements CommandLineRunner {

    TodoRepository todoRepository;

    @Autowired
    public TodoApplication(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    public static void main(String[] args) {
        SpringApplication.run(TodoApplication.class, args);
    }


    @Override
    public void run(String... args) throws Exception {
        todoRepository.save(new Todo("Learn SQL"));
        todoRepository.save(new Todo("Make exam"));
        todoRepository.save(new Todo("Make project"));
        todoRepository.save(new Todo("Get a job"));

    }
}
