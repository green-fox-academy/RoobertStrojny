package com.greenfox.programmerfoxclub.models;

import java.util.List;

public class Fox {
    private final String name;
    private Tricks tricks;

    public Fox(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
