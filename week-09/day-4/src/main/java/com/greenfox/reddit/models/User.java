package com.greenfox.reddit.models;

import lombok.Getter;
import lombok.Setter;
import org.springframework.web.bind.annotation.ModelAttribute;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String username;
    private String password;

    @OneToMany
    private List<Post> posts;

    public User() {
    }

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }


    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                '}';
    }
}
