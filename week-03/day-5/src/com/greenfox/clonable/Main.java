package com.greenfox.clonable;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Person> people = new ArrayList<>();

        Student john = new Student("John Doe", 20, "male", "BME");
        Student johnTheClone = (Student) john.clone();
        people.add(johnTheClone);
        people.add(john);
    }
}
