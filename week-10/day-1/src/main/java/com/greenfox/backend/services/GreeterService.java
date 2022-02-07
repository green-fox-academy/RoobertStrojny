package com.greenfox.backend.services;

import com.greenfox.backend.models.Greet;

public interface GreeterService {
    Greet greet(String name, String title);
}
