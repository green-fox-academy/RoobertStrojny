package com.greenfox.minecraft;

import java.util.List;

public class Mud extends Block {

    public Mud() {
        super("mud", "dark gray", 0, false, List.of(new String[]{"brick", "air",
                "lava", "door", "window", "gold"}));
    }

    @Override
    public void getStatus() {
        super.getStatus();
    }
}
