package com.greenfox.gardenapplication;

import java.util.Random;

public class Plants {
    private String color;
    private double waterAmount;
    private boolean needsWater;
    private double absorb;

    protected final int flowerMin = 5;
    protected final int treeMin = 10;

    public Plants(String color) {
        this.color = color;
        Random random = new Random();
        this.setWaterAmount(random.nextInt(0, 4));
    }

    public String writeNeed(){
        if (this.needsWater){
            return "needs water";
        } else {
            return "doesn't need water";
        }
    }

    protected void absorb(){

    }

    public boolean plantNeedWater(){
        return this.needsWater;
    }



    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getWaterAmount() {
        return waterAmount;
    }

    public void setWaterAmount(double waterAmount) {
        this.waterAmount = waterAmount;
    }

    public boolean isNeedsWater() {
        return needsWater;
    }

    public void setNeedsWater(boolean needsWater) {
        this.needsWater = needsWater;
    }

    public double getAbsorb() {
        return absorb;
    }

    public void setAbsorb(double absorb) {
        this.absorb = absorb;
    }
}
