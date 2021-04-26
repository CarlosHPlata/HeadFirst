package com.headFirst.factory.simpleFacotry;

import com.headFirst.factory.simpleFacotry.factory.SimplePizzaFactory;

public class OrderPizzas {

    public static void main(String[] args) {
        PizzaStore store = new PizzaStore(new SimplePizzaFactory());

        store.orderPizza("cheese");
        store.orderPizza("peperoni");
        store.orderPizza("veggie");
    }
}
