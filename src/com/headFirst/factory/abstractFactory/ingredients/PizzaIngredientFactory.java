package com.headFirst.factory.abstractFactory.ingredients;

public interface PizzaIngredientFactory {

    public Dough createDough();
    public Sauce createSauce();
    public Cheese createCheese();
    public Clam createClam();

}
