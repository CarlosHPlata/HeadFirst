package com.headFirst.factory.abstractFactory.pizzas;
import com.headFirst.factory.abstractFactory.ingredients.PizzaIngredientFactory;

public class ClamPizza extends Pizza{
    PizzaIngredientFactory ingredientFactory;

    public ClamPizza (PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    @Override
    public void prepare() {
        System.out.println("Preparing " + getName());
        dough = ingredientFactory.createDough();
        cheese = ingredientFactory.createCheese();
        sauce = ingredientFactory.createSauce();
        clam = ingredientFactory.createClam();
    }
}
