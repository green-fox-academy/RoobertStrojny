package com.greenfox.anagram;

import java.util.Arrays;

public class Anagram {
    private final String string1;
    private final String string2;

    public Anagram(String string1, String string2) {
        this.string1 = string1;
        this.string2 = string2;
    }

    public boolean isAnagram() {
        char[] firstCharArray = string1.toCharArray();
        char[] secondCharArray = string2.toCharArray();

        if (firstCharArray.length == secondCharArray.length) {
            Arrays.sort(firstCharArray);
            Arrays.sort(secondCharArray);
            if (Arrays.equals(firstCharArray, secondCharArray)){
                return true;
            }
        }

        return false;
    }
}
