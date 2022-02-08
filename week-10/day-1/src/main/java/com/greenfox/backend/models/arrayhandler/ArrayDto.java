package com.greenfox.backend.models.arrayhandler;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Arrays;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ArrayDto {
    private String what;
    private int[] numbers;

    @Override
    public String toString() {
        return "what='" + what + '\'' +
                ", numbers=" + Arrays.toString(numbers) +
                '}';
    }
}
