package com.greenfox.testing.models;

public class Translator {
    private String received;
    private String translated;

    public Translator(String received) {
        this.received = received;
        this.translated = "I am Groot!";
    }

    public Translator() {
    }

    public String getReceived() {
        return received;
    }

    public String getTranslated() {
        return translated;
    }
}
