package com.greenfox.charsequence;

public class ShiftedCharSequence implements CharSequence {
    private String string;
    private int charNumber;

    public ShiftedCharSequence(String string, int charNumber) {
        this.string = string;
        this.charNumber = charNumber;
    }

    public static void main(String[] args) {
        ShiftedCharSequence shifter = new ShiftedCharSequence("example", 2);
        System.out.println(shifter.charAt(0));
    }

    public String shifter(String string, int number) {
        StringBuilder sb = new StringBuilder();
        for (int i = number; i < string.length(); i++) {
            sb.append(string.charAt(i));
        }

        for (int i = number - 1; i >= 0; i--) {
            sb.append(string.charAt(i));
        }

        return sb.toString();
    }

    @Override
    public int length() {
        return 0;
    }

    @Override
    public char charAt(int index) {
        return shifter(this.string, this.charNumber).charAt(index);
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        return null;
    }
}
