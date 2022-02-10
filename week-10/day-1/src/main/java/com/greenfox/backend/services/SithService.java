package com.greenfox.backend.services;

import org.json.simple.JSONObject;
import org.springframework.stereotype.Service;

@Service
public interface SithService {
    JSONObject getSithText(String text);
    String getRandomThings();
}
