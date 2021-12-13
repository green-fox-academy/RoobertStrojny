package com.greenfoxacademy.music;

public class Violin extends StringedInstrument{

    public Violin() {
        super("Violin", 4);
    }

    public Violin(int numberOfStrings) {
        super("Violin", numberOfStrings);
    }


    @Override
    public void play() {
        System.out.println(sound() + "Screech");
    }
}
