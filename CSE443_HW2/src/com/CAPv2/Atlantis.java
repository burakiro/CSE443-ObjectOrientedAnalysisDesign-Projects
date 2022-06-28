package com.CAPv2;
/**
 * Atlantis Class
 */
public class Atlantis implements style {
    double strength = 0;
    double agility = 0;
    double health = 0;

    /**
     * Atlantis Class Constructor
     */
    public Atlantis(double typeStrength,double typeAgility,double typeHealth) {
        this.multiplyStrength(typeStrength);
        this.multiplyAgility(typeAgility);
        this.multiplyHealth(typeHealth);
    }

    /**
     * Strength multiplyer
     */
    @Override
    public void multiplyStrength(double typeStrength) {
        this.strength = typeStrength * 0.8;
    }

    /**
     * Agility multiplyer
     */
    @Override
    public void multiplyAgility(double typeAgility) {
        this.agility = typeAgility * 1.2;
    }

    /**
     * Health multiplyer
     */
    @Override
    public void multiplyHealth(double typeHealth) {
        this.health = typeHealth * 1.2;
    }}

