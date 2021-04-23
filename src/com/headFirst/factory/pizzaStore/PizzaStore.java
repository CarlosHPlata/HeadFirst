package com.headFirst.factory.pizzaStore;

import com.headFirst.factory.pizzaStore.factory.Pizza;
import com.headFirst.factory.pizzaStore.factory.SimplePizzaFactory;

public class PizzaStore {

    private SimplePizzaFactory factory;

    public PizzaStore(SimplePizzaFactory factory) {
        this.factory = factory;
    }

    public Pizza orderPizza(String type) {
        System.out.println("You are ordering a " + type + " pizza");
        Pizza pizza;

        pizza = factory.createPizza(type);
        pizza.prepare();

        return pizza;
    }

}
