package com.headFirst.factory.methodFactory;

public abstract class PizzaStore {

    public Pizza orderPizza(Pizza.Type type) {
        Pizza pizza;

        pizza = createPizza(type);

        pizza.prepare();
        return pizza;
    }

    protected abstract Pizza createPizza(Pizza.Type type);
}
