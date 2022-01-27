package com.greenfox.programmerfoxclub.models;

import java.util.List;

public class FoxList {
    private List<Fox> foxes;

    public FoxList(List<Fox> foxes) {
        this.foxes = foxes;
    }

    public void addFox(Fox fox) {
        foxes.add(fox);
    }

    public List<Fox> getFoxes() {
        return foxes;
    }
}
