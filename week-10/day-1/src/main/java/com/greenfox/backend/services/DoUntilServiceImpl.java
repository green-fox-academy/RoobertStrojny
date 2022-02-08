package com.greenfox.backend.services;

import com.greenfox.backend.models.dountil.DoUntil;
import org.springframework.stereotype.Service;

@Service
public class DoUntilServiceImpl implements DoUntilService{
    @Override
    public DoUntil sum(int until) {
        int result = 0;
        for (int i = 0; i <= until; i++) {
            result += i;
        }
        return new DoUntil(result);
    }

    @Override
    public DoUntil factorial(int until) {
        int result = 1;
        for (int i = 1; i <= until; i++) {
            result *= i;
        }
        return new DoUntil(result);
    }
}
