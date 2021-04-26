package com.headFirst.factory.abstractFactory.ingredients;

public class ChicagoIngedientsFactory implements PizzaIngredientFactory{
    @Override
    public Dough createDough() {
        return new ThickCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new PlumTomatoSauce();
    }

    @Override
    public Cheese createCheese() {
        return new MozzarellaCheese();
    }

    @Override
    public Clam createClam() {
        return new FrozenClam();
    }
}

class MozzarellaCheese implements Cheese {
    @Override
    public String getName() {
        return "Mozzarella Cheese";
    }
}

class ThickCrustDough implements Dough {
    @Override
    public String getName() {
        return "Thick crust Dough";
    }
}

class FrozenClam implements Clam {

    @Override
    public String getName() {
        return "Frozen clam";
    }
}

class PlumTomatoSauce implements Sauce {

    @Override
    public String getName() {
        return "Plum tomato sauce";
    }
}