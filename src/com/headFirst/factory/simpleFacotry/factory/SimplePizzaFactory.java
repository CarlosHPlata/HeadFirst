package com.headFirst.factory.simpleFacotry.factory;

public class SimplePizzaFactory {

    public Pizza createPizza(String type) {
        if (type.equals("cheese")) {
            return new CheesePizza();
        }

        if (type.equals("peperoni")) {
            return new PeperoniPizza();
        }

        if (type.equals("clam")) {
            return new ClamPizza();
        }

        return new VeggiePizza();
    }
}
