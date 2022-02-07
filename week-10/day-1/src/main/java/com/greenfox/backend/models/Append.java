package com.greenfox.backend.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Append {
    private String appended;

    public Append(String appended) {
        this.appended = appended;
    }
}
