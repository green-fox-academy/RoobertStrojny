package com.greenfox.reddit.models;

import lombok.Getter;
import lombok.Setter;

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

    @OneToMany(fetch = FetchType.EAGER)
    private List<Post> posts;

    public User() {
    }

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public void addPost(Post post) {
        posts.add(post);
    }

    public boolean containsPost(Post post) {
        return posts.contains(post);
    }

    @Override
    public String toString() {
        return username;
    }
}
