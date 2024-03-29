package com.greenfox.charsequence;

public class Gnirts implements CharSequence {
    private final String string;

    public Gnirts(String string) {
        this.string = string;
    }

    public static void main(String[] args) {
        Gnirts gnirts = new Gnirts("example");
        System.out.println(gnirts.charAt(1));
    }

    public String reverseString(String string) {
        StringBuilder sb = new StringBuilder();
        sb.append(string);
        StringBuilder reverse = sb.reverse();
        return reverse.toString();
    }

    @Override
    public int length() {
        return 0;
    }

    @Override
    public char charAt(int index) {
        return reverseString(this.string).charAt(index);
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        return null;
    }
}
