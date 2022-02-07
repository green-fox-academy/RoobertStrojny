package com.greenfox.backend.services;

import com.greenfox.backend.models.ArrayResult;
import com.greenfox.backend.models.NumberResult;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class ArrayServiceImpl implements ArrayService {
    @Override
    public NumberResult sumNumbers(int[] numbers) {
        int result = Arrays.stream(numbers).sum();
        return new NumberResult(result);
    }

    @Override
    public NumberResult multiplyNumbers(int[] numbers) {
        int result = Arrays.stream(numbers).reduce(1, Math::multiplyExact);
        return new NumberResult(result);
    }

    @Override
    public ArrayResult doubleNumbers(int[] numbers) {
        int[] result = Arrays.stream(numbers).map(n -> n*2).toArray();
        return new ArrayResult(result);
    }
}
