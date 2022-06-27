package com.shefzee.patterns.creational.simplefactory;

public class PizzaFactory {

    public Pizza getPizza(String pizzaType){
        if("Chicken".equals(pizzaType)){
            return new ChickenPizza();
        }else if("Veg".equals(pizzaType)){
            return new VegPizza();
      }
        return null;
    }
}
