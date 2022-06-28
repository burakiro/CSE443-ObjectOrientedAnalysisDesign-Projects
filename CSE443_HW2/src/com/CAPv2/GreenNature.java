package com.CAPv2;
/**
 * GreenNature class
 */
public class GreenNature implements type{
    int strength = 0;
    int agility = 0;
    int health = 0;

    /**
     * Class constructor
     */
    public GreenNature() {
        this.setAgility();
        this.setHealth();
        this.setHealth();
    }
    /**
     * Strength setter
     */
    @Override
    public void setStrength() {
        this.strength = 75;
    }

    /**
     * Agility setter
     */
    @Override
    public void setAgility() {
        this.agility = 100;
    }

    /**
     * Health setter
     */
    @Override
    public void setHealth() {
        this.health = 125;
    }
}
