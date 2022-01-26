package com.greenfox.di.gfclassapp.services;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


public class StudentService implements StudentInterface {
    private final List<String> names;

    public StudentService() {
        names = new ArrayList<>();
        names.add("Sanyi");
        names.add("Lilla");
        names.add("John");
    }

    @Override
    public boolean check(String name) {
        return names.stream().anyMatch(student -> student.equalsIgnoreCase(name));
    }

    @Override
    public String count() {
        return String.valueOf(names.size());
    }

    @Override
    public List<String> findAll() {
        return names;
    }

    @Override
    public void save(String student) {
        names.add(student);
    }
}