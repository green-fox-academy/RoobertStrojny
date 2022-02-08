package com.greenfox.backend.models.dountil;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class DoUntilDto {
    private int until;

    public DoUntilDto(Integer until) {
        this.until = until;
    }

    @Override
    public String toString() {
        return "until=" + until +
                '}';
    }
}
