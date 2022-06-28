package com.CAPv2;
/**
 * BlueIce Class
 */
public class BlueIce implements type{

    int strength=0;
    int agility=0;
    int health=0;

    /**
     * Class constructor
     */
    public BlueIce() {
        this.setAgility();
        this.setHealth();
        this.setHealth();
    }

    /**
     * Strength setter
     */
    @Override
    public void setStrength() {
        this.strength = 125;
    }

    /**
     * Agility setter
     */
    @Override
    public void setAgility() {
    this.agility = 75;
    }

    /**
     * Health setter
     */
    @Override
    public void setHealth() {
    this.health = 100;
    }
}
