package com.greenfox.minecraft;

import java.util.List;

public class Window extends Block{
    public Window(String type, String color, int lightTransmission, boolean canCross, List<String> adjacent) {
        super(type, color, lightTransmission, canCross, adjacent);
    }
}
