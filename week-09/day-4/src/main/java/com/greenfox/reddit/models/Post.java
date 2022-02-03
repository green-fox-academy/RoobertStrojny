package com.greenfox.reddit.models;

import lombok.Getter;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;

@Entity
@Getter
@Setter
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String title;
    private Integer likes = 0;
    private String url;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date creationDate = new Date();

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    public Post() {
    }

    public Post(String title, String url) {
        this.title = title;
        this.url = url;
    }

    public void increment() {
        likes++;
    }

    public void decrement() {
        likes--;
    }
}
