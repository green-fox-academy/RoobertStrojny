package com.greenfoxacademy;

import com.greenfoxacademy.flyable.*;

public class FlyingThings {

    public static void main(String[] args) {
        Helicopter helicopter = new Helicopter("Helicopter");
        Parrot parrot = new Parrot("Parrot");

        helicopter.takeOff();
        helicopter.fly();
        helicopter.land();

        parrot.fly();
        parrot.takeOff();
        parrot.land();


    }

}
