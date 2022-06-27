package com.shefzee.patterns.structural.decorator;

public class Mozerella extends ToppingDecorator {

    public Mozerella(Pizza newPizza){
        super(newPizza);
        System.out.println("Adding Mozerella");
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " ,Mozerella";
    }

    @Override
    public double getCost() {
        return super.getCost() + 0.5;
    }
}
