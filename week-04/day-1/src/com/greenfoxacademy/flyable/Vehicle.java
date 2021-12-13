package com.greenfoxacademy.flyable;

abstract class Vehicle {
    private String name;
    private int maxSpeed;
    private int highestAltitude;

    protected Vehicle(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
