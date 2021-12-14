package com.greenfox.sharpie;

public class Sharpie {
    String color;
    int width;
    int inkAmount = 100;

    public Sharpie(String color, int width) {
        this.color = color;
        this.width = width;
    }

    public int use() {
        if (inkAmount < 10) {
            return 0;
        }
       return inkAmount -= 10;
    }

    @Override
    public String toString() {
        return "Sharpie{" +
                "color='" + color + '\'' +
                '}';
    }
}

