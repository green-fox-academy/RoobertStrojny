package com.greenfox.todomysql.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity(name = "todos")
@Getter
@Setter
public class Todo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private boolean urgent = false;
    private boolean done = false;

    @OneToOne(cascade = CascadeType.ALL)
    private Assignee assignee;

    public Todo(String title) {
        this.title = title;
    }

    public Todo() {
    }

}
