package com.greenfox.backend.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Greeter {
    private String welcome_message;
    private String name;
    private String title;
    private String error;

    public Greeter(String name, String title) {
        this.welcome_message = "Oh, hi there " + name + ", my dear " + title + "!";
        this.name = name;
        this.title = title;
    }

    public void setErrorBasedOnInputs() {
        if (name == null && title == null) {
            error = "Please provide a name and a title!";
        } else if (name == null) {
            error = "Please provide a name!";
        } else {
            error = "Please provide a title!";
        }
    }
}
