package com.greenfox.minecraft;

import java.util.List;

public class Glass extends Block{

    public Glass(String color, int lightTransmission) {
        super("glass", color, lightTransmission, false, List.of("mud", "brick", "ice", "air", "glowstone", "door"));
    }

    public Glass(String color) {
        super("glass", color, 99, false, List.of("mud", "brick", "ice", "air", "glowstone", "door"));
    }

    public Glass(int lightTransmission) {
        super("glass", "transparent", lightTransmission, false, List.of("mud", "brick", "ice", "air", "glowstone", "door"));
    }

    public Glass() {
        super("glass", "transparent", 99, false, List.of("mud", "brick", "ice", "air", "glowstone", "door"));
    }

    @Override
    protected void getStatus() {
        super.getStatus();
    }
}
