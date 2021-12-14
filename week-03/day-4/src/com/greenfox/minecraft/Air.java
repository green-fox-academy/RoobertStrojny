package com.greenfox.minecraft;

import java.util.List;

public class Air extends Block{
    public Air() {
        super("air", "transparent", 100, true, List.of("mud", "brick", "glass", "door", "window", "gold"));
    }

    @Override
    protected void getStatus() {
        super.getStatus();
    }
}
