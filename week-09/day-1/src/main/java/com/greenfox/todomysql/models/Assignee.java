package com.greenfox.todomysql.models;

import lombok.Getter;
import lombok.Setter;
import net.bytebuddy.utility.dispatcher.JavaDispatcher;

import javax.persistence.*;
import java.util.List;

@Entity(name = "assignees")
@Getter
@Setter
public class Assignee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;

    @OneToMany
    private List<Todo> todo;

    public Assignee() {
    }

    public Assignee(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public void addTodo(Todo todo) {
        this.todo.add(todo);
    }

    @Override
    public String toString() {
        return getName();
    }

}
