package com.headFirst.factory.abstractFactory.ingredients;

public class NewYorkIngredientsFactory implements  PizzaIngredientFactory {
    @Override
    public Dough createDough() {
        return new ThinCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new MarinaraSauce();
    }

    @Override
    public Cheese createCheese() {
        return new ReggianoCheese();
    }

    @Override
    public Clam createClam() {
        return new FreshClam();
    }
}

class ReggianoCheese implements Cheese {
    @Override
    public String getName() {
        return "Reggiano Cheese";
    }
}

class ThinCrustDough implements Dough {
    @Override
    public String getName() {
        return "Thin crust Dough";
    }
}

class FreshClam implements Clam {

    @Override
    public String getName() {
        return "Fresh clam";
    }
}

class MarinaraSauce implements Sauce {

    @Override
    public String getName() {
        return "Marinara sauce";
    }
}