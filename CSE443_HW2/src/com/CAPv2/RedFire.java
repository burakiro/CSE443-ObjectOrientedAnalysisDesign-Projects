package com.CAPv2;

/**
 * RedFire class
 */
public class RedFire implements type{
    int strength = 0;
    int agility = 0;
    int health = 0;

    /**
     * RedFire class Constructor
     */
    public RedFire() {
        this.setAgility();
        this.setHealth();
        this.setHealth();
    }

    /**
     * Strength setter
     */
    @Override
    public void setStrength() {
        this.strength = 100;
    }
    /**
     * Agility setter
     */
    @Override
    public void setAgility() {
        this.agility = 125;
    }

    /**
     * Health setter
     */
    @Override
    public void setHealth() {
        this.health = 75;
    }
}
