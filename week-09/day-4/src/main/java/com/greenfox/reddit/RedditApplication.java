package com.greenfox.reddit;

import com.greenfox.reddit.models.User;
import com.greenfox.reddit.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RedditApplication implements CommandLineRunner {

    UserService userService;

    @Autowired
    public RedditApplication(UserService userService) {
        this.userService = userService;
    }

    public static void main(String[] args) {
        SpringApplication.run(RedditApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        userService.saveUser(new User("anonymous", "anon123"));
    }
}
