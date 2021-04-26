package com.headFirst.factory.methodFactory.chicagoPizza;

import com.headFirst.factory.methodFactory.Pizza;

public class ChicagoStyleCheesePizza extends Pizza {

    public ChicagoStyleCheesePizza() {
        name = "Chicago Style cheese pizza";
        sauce = "Extra thick crust dough";
        toppings.add("Shredded mozzarella cheese");
    }
}
