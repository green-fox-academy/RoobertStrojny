package com.greenfox.countletters;

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

class CountLettersTest {

    @Test
    void map_contains_3_chars_l() {
        CountLetters map = new CountLetters();

        assertEquals(3, map.countLetters("hello world").get("l"));

    }

    @Test
    void map_contains_2_chars_o() {
        CountLetters map = new CountLetters();

        assertEquals(2, map.countLetters("hello world").get("o"));
    }

    @Test
    void map_contains_0_chars_i() {
        CountLetters map = new CountLetters();

        assertNull(map.countLetters("hello world").get("i"));
    }

}