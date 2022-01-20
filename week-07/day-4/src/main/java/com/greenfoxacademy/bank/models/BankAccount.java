package com.greenfoxacademy.bank.models;

import java.util.Comparator;
import java.util.List;

public class BankAccount {
    private final String name;
    private double balance;
    private final String animalType;
    private boolean isKing;

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

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public boolean isKing() {
        return isKing;
    }

    public void setKing(boolean king) {
        isKing = king;
    }
}
