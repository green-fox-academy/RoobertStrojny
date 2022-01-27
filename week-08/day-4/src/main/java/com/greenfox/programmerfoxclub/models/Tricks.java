package com.greenfox.programmerfoxclub.models;

import java.util.ArrayList;
import java.util.List;


public class Tricks {
    private List<String> tricks;

    public Tricks() {
        tricks = new ArrayList<>();
        tricks.add("Write HTML");
        tricks.add("Do maths");
        tricks.add("Workout");
        tricks.add("Sleep");
    }

    public List<String> getTricks() {
        return tricks;
    }
}
