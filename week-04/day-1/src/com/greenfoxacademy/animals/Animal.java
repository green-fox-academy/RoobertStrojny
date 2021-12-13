package com.greenfoxacademy.animals;

abstract class Animal {
    protected String name;
    protected int age;
    protected String gender;
    protected int numberOfLegs;
    protected boolean isAlive;

    protected Animal(String name, int age) {
        this.name = name;
        this.age = age;
        this.isAlive = true;
    }

    protected Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    protected abstract String breed();
}
