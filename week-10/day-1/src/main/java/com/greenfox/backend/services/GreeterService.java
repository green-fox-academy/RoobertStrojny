package com.greenfox.backend.services;

import com.greenfox.backend.models.Greet;
import org.springframework.stereotype.Service;

@Service
public interface GreeterService {
    Greet greet(String name, String title);
}
