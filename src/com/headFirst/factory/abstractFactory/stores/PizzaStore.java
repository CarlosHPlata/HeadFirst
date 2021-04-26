package com.headFirst.factory.abstractFactory.stores;


import com.headFirst.factory.abstractFactory.pizzas.Pizza;

public abstract class PizzaStore {

    public Pizza orderPizza(Pizza.Type type) {
        Pizza pizza;

        pizza = createPizza(type);

        pizza.prepare();
        return pizza;
    }

    protected abstract Pizza createPizza(Pizza.Type type);
}
