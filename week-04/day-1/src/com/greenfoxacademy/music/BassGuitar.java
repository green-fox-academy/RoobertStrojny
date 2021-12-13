package com.greenfoxacademy.music;

public class BassGuitar extends StringedInstrument{

    public BassGuitar() {
        super("Bass Guitar", 4);
    }

    public BassGuitar(int numberOfStrings) {
        super("Bass guitar", numberOfStrings);
    }


    @Override
    public void play() {
        System.out.println(sound() + "Duum-duum-duum");
    }
}
