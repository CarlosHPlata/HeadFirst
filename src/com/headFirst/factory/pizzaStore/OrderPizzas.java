package com.headFirst.factory.pizzaStore;

import com.headFirst.factory.pizzaStore.factory.SimplePizzaFactory;

public class OrderPizzas {

    public static void main(String[] args) {
        PizzaStore store = new PizzaStore(new SimplePizzaFactory());

        store.orderPizza("cheese");
        store.orderPizza("peperoni");
        store.orderPizza("veggie");
    }
}
