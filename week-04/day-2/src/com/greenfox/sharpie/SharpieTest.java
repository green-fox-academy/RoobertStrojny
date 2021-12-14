package com.greenfox.sharpie;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SharpieTest {
    Sharpie sharpie = new Sharpie("yellow", 2);

    @Test
    void sharpie_use_to_negative(){
        for (int i = 0; i < 11; i++) {
            sharpie.use();
        }

        assertEquals(0, sharpie.inkAmount);
    }

}