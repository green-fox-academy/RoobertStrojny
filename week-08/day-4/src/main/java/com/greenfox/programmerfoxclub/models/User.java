package com.greenfox.programmerfoxclub.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;
    private String password;
    @OneToOne
    private Fox fox;

    public User(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public User() {
    }

}
