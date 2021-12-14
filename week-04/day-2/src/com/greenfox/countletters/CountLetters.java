package com.greenfox.countletters;

import java.util.HashMap;
import java.util.Map;

public class CountLetters {
    private final Map<String, Integer> map = new HashMap<>();

    public CountLetters() {
    }

    public Map<String, Integer> getMap() {
        return map;
    }

    public Map<String, Integer> countLetters(String string) {
        Map<String, Integer> map = new HashMap<>();
        char[] stringToArray = string.toCharArray();

        for (char c : stringToArray) {
            if (map.containsKey(String.valueOf(c))) {
                map.put(String.valueOf(c), map.get(String.valueOf(c)) + 1);
            } else {
                map.put(String.valueOf(c), 1);
            }
        }

        return map;
    }

}
