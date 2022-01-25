package com.greenfox.di.colors;

import org.springframework.stereotype.Service;

@Service
public class WhiteColor implements MyColor{
    @Override
    public String printColor() {
        return "This is WHITE color";
    }
}
