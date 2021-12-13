package com.greenfoxacademy.music;

abstract class Instrument {
    protected String name;

    protected Instrument(String name) {
        this.name = name;
    }

    protected abstract void play();
}
