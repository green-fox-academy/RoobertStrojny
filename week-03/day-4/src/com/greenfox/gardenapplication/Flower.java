package com.greenfox.gardenapplication;

import java.util.Random;

public class Flower extends Plants {

    public Flower(String color) {
        super(color);
        this.setNeedsWater(plantNeedWater());
        this.setAbsorb(0.75);
    }

    @Override
    public boolean plantNeedWater() {
        this.setNeedsWater(this.getWaterAmount() < flowerMin);
        return this.getWaterAmount() < flowerMin;
    }



}


