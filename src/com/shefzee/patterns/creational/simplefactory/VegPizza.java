package com.shefzee.patterns.creational.simplefactory;

public class VegPizza implements Pizza {

    @Override
    public Pizza createPizza() {
        System.out.println("Making VegPizza");
        return new VegPizza();
    }
}
