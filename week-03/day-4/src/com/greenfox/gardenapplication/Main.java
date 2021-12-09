package com.greenfox.gardenapplication;

public class Main {
    public static void main(String[] args) {
        Garden garden = new Garden();
        garden.add();
        garden.info();
        System.out.println();
        garden.water(40);
        System.out.println();
        garden.water(70);
        System.out.println();
        garden.waterLevels();
    }
}
