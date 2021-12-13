package com.greenfoxacademy.printable;

public class Domino implements Printable{

    private int aSide;
    private int bSide;

    public Domino(int aSide, int bSide) {
        this.aSide = aSide;
        this.bSide = bSide;
    }

    @Override
    public void printAllFields() {
        System.out.println("Domino A side : " + getaSide() + ", B side: " + getbSide());
    }

    private int getbSide() {
        return bSide;
    }

    private int getaSide() {
        return aSide;
    }
}
