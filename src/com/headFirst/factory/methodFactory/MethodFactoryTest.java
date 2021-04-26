package com.headFirst.factory.methodFactory;

import com.headFirst.factory.methodFactory.chicagoPizza.ChicagoPizzaStore;
import com.headFirst.factory.methodFactory.nyPizza.NYPizzaStore;

public class MethodFactoryTest {

    public static void main(String[] args) {
        PizzaStore store = new NYPizzaStore();
        PizzaStore store2 = new ChicagoPizzaStore();

        Pizza pizza = store.orderPizza(Pizza.Type.CHEESE);
        Pizza pizza2 = store2.orderPizza(Pizza.Type.PEPPERONI);
    }
}
