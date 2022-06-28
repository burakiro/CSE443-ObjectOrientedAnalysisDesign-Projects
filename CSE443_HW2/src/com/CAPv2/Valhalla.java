package com.CAPv2;

/**
 * Valhalla class
 */
public class Valhalla implements style {
    double strength = 0;
    double agility = 0;
    double health = 0;


    /**
     * Valhall class constructor.
     */
    public Valhalla(double typeStrength,double typeAgility,double typeHealth) {
        this.multiplyStrength(typeStrength);
        this.multiplyAgility(typeAgility);
        this.multiplyHealth(typeHealth);
    }

    /**
     * Strength multiplyer
     */
    @Override
    public void multiplyStrength(double typeStrength) {
        this.strength = typeStrength * 1.3;
    }

    /**
     * Agility multiplyer
     */
    @Override
    public void multiplyAgility(double typeAgility) {
        this.agility = typeAgility * 0.4;
    }

    /**
     * Health multiplyer
     */
    @Override
    public void multiplyHealth(double typeHealth) {
        this.health = typeHealth * 1.3;
    }}
