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

        Carrier carrier = new Carrier(50, 2000);
        Carrier carrier2 = new Carrier(100, 2500);
        for (int i = 0; i < 7; i++) {
            carrier.add();
        }
        for (int i = 0; i < 7; i++) {
            carrier2.add();
        }

        System.out.println();
        carrier.getStatus();
        System.out.println();
        carrier2.getStatus();

        carrier.fill();
        carrier2.fill();

        System.out.println();
        carrier.getStatus();
        System.out.println();
        carrier2.getStatus();

        carrier.fight(carrier2);

        carrier.getStatus();
        System.out.println();
        carrier2.getStatus();


    }
}
