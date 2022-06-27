package com.shefzee.patterns.structural.decorator;

public class Main {

    public static void main(String[] args) {
        Pizza newPizza = new TomatoSauce(new Mozerella(new PlainPizza()));

        System.out.println("Ingredients = " + newPizza.getDescription());
        System.out.println("Cost = " + newPizza.getCost());

        Pizza newPizza2 = new Mozerella(new TomatoSauce(new PlainPizza()));

        System.out.println("Ingredients = " + newPizza2.getDescription());
        System.out.println("Cost = " + newPizza2.getCost());
    }
}
