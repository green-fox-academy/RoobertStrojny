package com.greenfox.gardenapplication;

public class Tree extends Plants {

    public Tree(String color) {
        super(color);
        this.setNeedsWater(plantNeedWater());
        this.setAbsorb(0.4);
    }

    @Override
    public boolean plantNeedWater() {
        this.setNeedsWater(this.getWaterAmount() < treeMin);
        return this.getWaterAmount() < treeMin;
    }
}
