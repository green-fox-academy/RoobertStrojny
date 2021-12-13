package com.greenfoxacademy.flyable;

import com.greenfoxacademy.animals.Bird;

public class Parrot extends Bird implements Flyable {


    public Parrot(String name) {
        super(name);
    }

    @Override
    public void land() {
        System.out.println(getName() + " can land.");
    }

    @Override
    public void fly() {
        System.out.println(getName() + " can fly.");
    }

    @Override
    public void takeOff() {
        System.out.println(getName() + " can take off.");
    }
}
