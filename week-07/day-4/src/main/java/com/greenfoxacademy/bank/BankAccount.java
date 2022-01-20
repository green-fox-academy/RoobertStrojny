package com.greenfoxacademy.bank;

public class BankAccount {
    private String name;
    private double balance;
    private String animalType;

    public BankAccount(String name, double balance, String animalType) {
        this.name = name;
        this.balance = balance;
        this.animalType = animalType;
    }

    public String getTwoDecimalBalance() {
        return String.format("%.2f", balance);
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }

    public String getAnimalType() {
        return animalType;
    }
}
