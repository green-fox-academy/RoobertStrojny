package com.greenfox.minecraft;

import java.util.List;

abstract class Block {
    private final String type;
    private final String color;
    private final int lightTransmission;
    private final boolean canCross;
    List<String> adjacent;

    public Block(String type, String color, int lightTransmission, boolean canCross, List<String> adjacent) {
        this.type = type;
        this.color = color;
        this.lightTransmission = lightTransmission;
        this.canCross = canCross;
        this.adjacent = adjacent;
    }

    protected boolean canBePlaced(Block block) {
        for (int i = 0; i < getAdjacent().size(); i++) {
            if (getAdjacent().get(i).equals(block.getType())) {
                return true;
            }
        }
        return false;
    }

    protected void getStatus() {
        System.out.println("Block of type: " + getType());
        System.out.println("Has light transmission: " + getLightTransmission());
        if (canCross) {
            System.out.println("Can be crossed");
        } else {
            System.out.println("Can not be crossed");
        }
    }

    protected void transform(Block toTransform) {
    }

    public String getType() {
        return type;
    }

    private List<String> getAdjacent() {
        return adjacent;
    }

    public int getLightTransmission() {
        return lightTransmission;
    }
}
