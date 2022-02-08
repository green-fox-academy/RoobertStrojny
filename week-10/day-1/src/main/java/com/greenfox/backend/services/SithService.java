package com.greenfox.backend.services;

import org.json.simple.JSONObject;

public interface SithService {
    JSONObject getSithText(String text);
    String getRandomThings();
}
