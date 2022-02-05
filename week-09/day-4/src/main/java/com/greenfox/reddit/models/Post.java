package com.greenfox.reddit.models;

import lombok.Getter;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;
import java.util.Date;
import java.util.List;
import java.util.Map;

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
    private LocalDateTime creationDate = LocalDateTime.now();

    @ManyToOne(cascade = CascadeType.ALL)
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

    public long timeDifferenceInMinutes() {
        LocalDateTime now = LocalDateTime.now();
        return ChronoUnit.MINUTES.between(now, creationDate) / -1;
    }

    public long timeDifferenceInHours() {
        LocalDateTime now = LocalDateTime.now();
        return ChronoUnit.HOURS.between(now, creationDate) / -1;
    }

    public long timeDifferenceInDays() {
        LocalDateTime now = LocalDateTime.now();
        return ChronoUnit.DAYS.between(now, creationDate) / -1;
    }

    public String getTimeDifference() {
        if (timeDifferenceInMinutes() < 2) {
            return "Posted now";
        }else if (timeDifferenceInMinutes() < 60) {
            return "Posted " + timeDifferenceInMinutes() + " minutes ago";
        }else if (timeDifferenceInHours() < 24) {
            return "Posted " + timeDifferenceInHours() + " hours ago";
        } else {
            return "Posted " + timeDifferenceInDays() + " days ago";
        }
    }
}
