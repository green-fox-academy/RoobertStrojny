package com.greenfox.anagram;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnagramTest {

    @Test
    void test_two_strings_are_anagrams() {
        Anagram anagram = new Anagram("listen", "silent");

        assertTrue(anagram.isAnagram());
    }

}