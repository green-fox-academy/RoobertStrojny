package com.greenfox.di.gfclassapp.services;

import org.springframework.stereotype.Service;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

@Service
public class StudentFileService implements StudentInterface{
    private final List<String> names;

    public StudentFileService(List<String> names) {
        this.names = getNames();
    }

    private List<String> getNames() {
        try {
            return Files.readAllLines(getPath());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }


    @Override
    public boolean check(String name) {
        return names.stream().anyMatch(student -> student.equalsIgnoreCase(name));
    }

    @Override
    public String count() {
        return String.valueOf(names.size());    }

    @Override
    public List<String> findAll() {
        return names;
    }

    @Override
    public void save(String student) {
        names.add(student);
        try {
            Files.write(getPath(), names, Charset.defaultCharset());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private Path getPath() {
        return Paths.get("src/main/java/com/greenfox/di/gfclassapp/models/names.txt");
    }
}
