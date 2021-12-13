package com.greenfoxacademy.music;

abstract class StringedInstrument extends Instrument {
    protected int numberOfStrings;

    protected StringedInstrument(String name, int numberOfStrings) {
        super(name);
        this.numberOfStrings = numberOfStrings;
    }

    protected String sound() {
        return this.name + ", a " + getNumberOfStrings() + "-stringed instrument that goes ";
    }

    private int getNumberOfStrings() {
        return numberOfStrings;
    }
}
