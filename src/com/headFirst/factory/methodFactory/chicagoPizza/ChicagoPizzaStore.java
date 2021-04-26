package com.headFirst.factory.methodFactory.chicagoPizza;

import com.headFirst.factory.methodFactory.Pizza;
import com.headFirst.factory.methodFactory.PizzaStore;

public class ChicagoPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(Pizza.Type type) {
        if (type == Pizza.Type.CHEESE) {
            return new ChicagoStyleCheesePizza();
        }

        return new ChicagoStylePepperoniPizza();
    }
}
