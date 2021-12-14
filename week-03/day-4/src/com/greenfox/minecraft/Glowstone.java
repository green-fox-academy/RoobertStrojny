package com.greenfox.minecraft;

import java.util.List;

public class Glowstone extends Block{
    protected boolean madeTransform = false;

    public Glowstone() {
        super("glowstone", "white", 300, false, List.of(new String[] {"glass", "ice",
        "air", "lava"}));
    }

    @Override
    public void getStatus() {
        super.getStatus();
        if (madeTransform){
            System.out.println("Has transformed a block of type glass to gold");
        } else {
            System.out.println("Made no transformation");
        }

    }

    @Override
    protected void transform(Block toTransform) {
        if (toTransform.getType().equals("glass")){

        }
    }
}
