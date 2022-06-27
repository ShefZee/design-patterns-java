package com.shefzee.patterns.creational.simplefactory;

public class Main {

    public static void main(String[] args) {
        PizzaFactory pizzaFactory = new PizzaFactory();
        Pizza pizza = pizzaFactory.getPizza("Chicken");
        pizza.createPizza();
    }
}
