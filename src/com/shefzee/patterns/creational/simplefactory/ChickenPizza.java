package com.shefzee.patterns.creational.simplefactory;

public class ChickenPizza implements Pizza {


    @Override
    public Pizza createPizza() {
        System.out.println("Making Chicken Pizza");
        return new ChickenPizza();
    }
}
