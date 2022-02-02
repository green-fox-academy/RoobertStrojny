package com.greenfox.todomysql.models;

import lombok.Getter;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity(name = "todos")
@Getter
@Setter
public class Todo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String description;
    private boolean urgent = false;
    private boolean done = false;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date date = new Date();
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date dueDate;

    @ManyToOne
    private Assignee assignee;

    public Todo(String title) {
        this.title = title;
    }

    public Todo() {
    }

    public long getAssigneeId() {
        return assignee.getId();
    }

}
