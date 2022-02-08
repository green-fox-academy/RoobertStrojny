package com.greenfox.backend.services;

import com.greenfox.backend.models.arrayhandler.ArrayResult;
import com.greenfox.backend.models.arrayhandler.NumberResult;

public interface ArrayService {
    NumberResult sumNumbers(int[] numbers);
    NumberResult multiplyNumbers(int[] numbers);
    ArrayResult doubleNumbers(int[] numbers);
}
