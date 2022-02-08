package com.greenfox.backend.models.sith;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class SithDto {
    private String text;

    public SithDto(String text) {
        this.text = text;
    }
}
