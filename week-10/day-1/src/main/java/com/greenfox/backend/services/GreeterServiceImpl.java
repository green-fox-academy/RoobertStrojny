package com.greenfox.backend.services;

import com.greenfox.backend.models.Greet;
import org.springframework.stereotype.Service;

@Service
public class GreeterServiceImpl implements GreeterService{

    @Override
    public Greet greet(String name, String title) {
        return new Greet("Oh, hi there " + name + ", my dear " + title + "!");
    }
}
