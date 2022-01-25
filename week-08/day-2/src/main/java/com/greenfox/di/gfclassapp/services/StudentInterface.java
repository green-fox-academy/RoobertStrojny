package com.greenfox.di.gfclassapp.services;

import java.util.List;

public interface StudentInterface {
    public boolean check(String name);

    public String count();

    public List<String> findAll();

    public void save(String student);
}
