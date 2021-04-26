package com.headFirst.factory.methodFactory.nyPizza;

import com.headFirst.factory.methodFactory.Pizza;

public class NYStylePepperoniPizza extends Pizza {

    public NYStylePepperoniPizza() {
        name = "NY Style pepperoni pizza";
        sauce = "Marinara Sauce";
        toppings.add("Grated Reggiano Cheese");
        toppings.add("Pepperoni");
    }
}
