package com.greenfox.backend.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Greet {
    private String welcome_message;

    public Greet(String welcome_message) {
        this.welcome_message = welcome_message;
    }
}
