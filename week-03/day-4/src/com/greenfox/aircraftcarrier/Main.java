package com.greenfox.aircraftcarrier;

public class Main {
    public static void main(String[] args) {
        Aircraft f35 = new F35();
        System.out.println(f35.getType());
        System.out.println(f35.getStatus());
        System.out.println(f35.refillAmmo(250));
        System.out.println(f35.getStatus());
        System.out.println(f35.fight());
        System.out.println(f35.getStatus());
    }
}
