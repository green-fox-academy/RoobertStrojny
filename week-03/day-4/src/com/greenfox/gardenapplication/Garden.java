package com.greenfox.gardenapplication;

import java.util.ArrayList;
import java.util.List;

public class Garden {
    private List<Plants> plantsList = new ArrayList<>();

    public Garden() {
    }

    public void add() {
        plantsList.add(new Flower("yellow"));
        plantsList.add(new Flower("blue"));
        plantsList.add(new Tree("purple"));
        plantsList.add(new Tree("orange"));
    }

    public void info() {
        for (Plants plants : plantsList) {
            System.out.println("The " + plants.getColor() + " " + plants.getClass().getSimpleName() + " " + plants.writeNeed() +
                    ".");
        }
    }

    public void water(int amount) {
        int count = 0;

        for (Plants plants : plantsList) {
            if (plants.plantNeedWater()) {
                count++;
            }
        }

        for (Plants plants : plantsList) {
            if (plants.plantNeedWater()) {
                plants.setWaterAmount(plants.getWaterAmount() + (plants.getAbsorb() * (amount / count)));
                plants.plantNeedWater();
            }
        }

        info();
    }

    public void waterLevels() {
        for (Plants plants : plantsList) {
            System.out.println("Water level of " + plants.getColor() + " " + plants.getClass().getSimpleName() +
                    " is " + plants.getWaterAmount());
        }
    }
}
