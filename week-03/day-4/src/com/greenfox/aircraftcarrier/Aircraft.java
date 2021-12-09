package com.greenfox.aircraftcarrier;

public class Aircraft {
    public int ammo = 0;
    private int baseDamage;
    private int maxAmmo;
    private int totalDamage;

    public Aircraft() {
    }

    public int getTotalDamage() {
        return totalDamage;
    }

    public void setTotalDamage(int totalDamage) {
        this.totalDamage = totalDamage;
    }

    public int fight() {
        int usedAmmo = this.ammo;
        this.ammo = 0;
        this.setTotalDamage(usedAmmo * baseDamage);
        return this.getTotalDamage();
    }

    public String getType() {
        return this.getClass().getSimpleName();
    }

    public int refillAmmo(int storageAmmo) {
        int ammoNeeded = this.getAmmo() - this.maxAmmo;
        this.setAmmo(this.maxAmmo);
        return storageAmmo + ammoNeeded;
    }

    public String getStatus() {
        return "Type " + this.getType() + ", Ammo: " + this.getAmmo() + ", Base Damage : " + this.getBaseDamage()
                + ", All Damage: " + this.getTotalDamage();
    }

    public boolean isPriority() {
        if (this.getType() == "F35") return true;
        else return false;
    }

    public int getAmmo() {
        return ammo;
    }

    public void setAmmo(int ammo) {
        this.ammo = ammo;
    }

    public int getBaseDamage() {
        return baseDamage;
    }

    public void setBaseDamage(int baseDamage) {
        this.baseDamage = baseDamage;
    }

    public int getMaxAmmo() {
        return maxAmmo;
    }

    public void setMaxAmmo(int maxAmmo) {
        this.maxAmmo = maxAmmo;
    }
}
