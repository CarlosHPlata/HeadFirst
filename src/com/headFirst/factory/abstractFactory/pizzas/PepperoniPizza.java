package com.headFirst.factory.abstractFactory.pizzas;

import com.headFirst.factory.abstractFactory.ingredients.PizzaIngredientFactory;
import com.headFirst.factory.simpleFacotry.factory.PeperoniPizza;

public class PepperoniPizza extends Pizza{
    private PizzaIngredientFactory ingredientFactory;

    public PepperoniPizza (PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    @Override
    public void prepare() {
        System.out.println("Preparing " + getName() + " and adding Pepperoni");
        dough = ingredientFactory.createDough();
        cheese = ingredientFactory.createCheese();
        sauce = ingredientFactory.createSauce();
    }
}
