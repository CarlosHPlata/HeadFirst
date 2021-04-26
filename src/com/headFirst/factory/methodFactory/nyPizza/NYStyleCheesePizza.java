package com.headFirst.factory.methodFactory.nyPizza;

import com.headFirst.factory.methodFactory.Pizza;

public class NYStyleCheesePizza extends Pizza {

    public NYStyleCheesePizza() {
        name = "NY Style cheese pizza";
        sauce = "Marinara Sauce";
        toppings.add("Grated Reggiano Cheese");
    }

}
