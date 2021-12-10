package com.greenfox.charsequence;

public class ReversedString extends Gnirts{

    public ReversedString(String string) {
        super(string);
    }

    public String reverse(String string){
        String reversedString = null;
        for (int i = string.length(); i > 0; i--) {
            reversedString.concat(String.valueOf(string.charAt(i)));
        }
        return reversedString;
    }
}
