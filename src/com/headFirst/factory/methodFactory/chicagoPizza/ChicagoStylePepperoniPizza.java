package com.headFirst.factory.methodFactory.chicagoPizza;

import com.headFirst.factory.methodFactory.Pizza;

public class ChicagoStylePepperoniPizza extends Pizza {

    public ChicagoStylePepperoniPizza() {
        name = "Chicago Style Pepperoni pizza";
        sauce = "Extra thick crust dough";
        toppings.add("Shredded mozzarella cheese");
        toppings.add("Pepperoni");
    }
}
