package com.greenfox.backend.models;

import lombok.Getter;

@Getter
public class ErrorMessage {
    private String error;

    public ErrorMessage(String error) {
        this.error = error;
    }
}
