package com.headFirst.factory.methodFactory.nyPizza;

import com.headFirst.factory.methodFactory.Pizza;
import com.headFirst.factory.methodFactory.PizzaStore;

public class NYPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(Pizza.Type type) {
        if (type == Pizza.Type.PEPPERONI) {
            return new NYStylePepperoniPizza();
        }

        else return new NYStyleCheesePizza();
    }
}
