package com.greenfox.apples;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ApplesTest {

    @Test
    void testing_string_apple(){
        Apples apple = new Apples();

        assertEquals("apple", apple.getApple());
    }

}