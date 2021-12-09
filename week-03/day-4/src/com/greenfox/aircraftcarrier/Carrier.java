package com.greenfox.aircraftcarrier;

import com.greenfox.gardenapplication.Plants;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Carrier {
    private List<Aircraft> listOfAircraft = new ArrayList<>();
    private int storageAmmo;
    private int healthPoints;
    private int totalDamage;

    public Carrier(int storageAmmo, int healthPoints) {
        this.storageAmmo = storageAmmo;
        this.healthPoints = healthPoints;
    }

    public void add() {
        Random random = new Random();
        int chance = random.nextInt(0,2);
        if (chance == 0){
            listOfAircraft.add(new F35());
        } else {
            listOfAircraft.add(new F16());
        }
    }

    public void fill() {
        if (getStorageAmmo() == 0) {
            throw new ArithmeticException("Storage ammo is 0!");
        } else {

            if (getStorageAmmo() < getAllAmmo()) {
                for (Aircraft aircraft : listOfAircraft) {
                    if (aircraft.isPriority()) {
                        if (storageAmmo <= aircraft.refillAmmo(storageAmmo)) {
                            System.out.println("We are out of ammo!");
                            break;
                        } else {
                            storageAmmo = aircraft.refillAmmo(storageAmmo);
                        }
                    }
                }
                for (Aircraft aircraft : listOfAircraft) {
                    if (!aircraft.isPriority()) {
                        if (storageAmmo <= aircraft.refillAmmo(storageAmmo)) {
                            System.out.println("We are out of ammo!");
                            break;
                        } else {
                            storageAmmo = aircraft.refillAmmo(storageAmmo);
                        }
                    }
                }

            } else {
                for (Aircraft aircraft : listOfAircraft) {
                    if (storageAmmo <= aircraft.refillAmmo(storageAmmo)) {
                        System.out.println("We are out of ammo!");
                        break;
                    } else {
                        storageAmmo = aircraft.refillAmmo(storageAmmo);
                    }
                }
            }

        }
    }


    public void fight(Carrier carrier) {
        for (Aircraft aircraft : listOfAircraft) {
            this.totalDamage += aircraft.fight();
        }
        if (carrier.getHealthPoints() > totalDamage) {
            carrier.setHealthPoints(carrier.getHealthPoints() - totalDamage);
        } else {
            carrier.setHealthPoints(0);
        }
    }

    public void getStatus() {
        if (getHealthPoints() != 0) {
            System.out.println("HP: " + getHealthPoints() + ", Aircraft count: " + listOfAircraft.size() + ", Ammo Storage : " +
                    getStorageAmmo() + ", Total Damage : " + getTotalDamage());
            System.out.println("Aircrafts: ");
            for (Aircraft aircraft : listOfAircraft) {
                System.out.println(aircraft.getStatus());
            }
        } else {
            System.out.println("It's dead Jim :(");
        }
    }

    public int getAllAmmo() {
        int allAmmo = 0;
        for (Aircraft aircraft : listOfAircraft) {
            allAmmo += aircraft.getAmmo();
        }
        return allAmmo;
    }

    public int getStorageAmmo() {
        return storageAmmo;
    }


    public int getHealthPoints() {
        return healthPoints;
    }

    public void setHealthPoints(int healthPoints) {
        this.healthPoints = healthPoints;
    }

    public int getTotalDamage() {
        return totalDamage;
    }
}
