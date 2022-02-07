package com.greenfox.backend.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Doubling {

    private int received;
    private int result;
    private String error;

    public Doubling(int received) {
        this.received = received;
        this.result = received * 2;
    }
}
