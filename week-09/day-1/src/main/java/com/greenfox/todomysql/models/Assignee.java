package com.greenfox.todomysql.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity(name = "assignees")
@Getter
@Setter
public class Assignee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;

    @OneToOne(mappedBy = "assignee")
    private Todo todo;

    public Assignee() {
    }

    public Assignee(String name, String email) {
        this.name = name;
        this.email = email;
    }
}
