package com.headFirst.factory.abstractFactory.stores;

import com.headFirst.factory.abstractFactory.ingredients.NewYorkIngredientsFactory;
import com.headFirst.factory.abstractFactory.ingredients.PizzaIngredientFactory;
import com.headFirst.factory.abstractFactory.pizzas.CheesePizza;
import com.headFirst.factory.abstractFactory.pizzas.ClamPizza;
import com.headFirst.factory.abstractFactory.pizzas.Pizza;
import com.headFirst.factory.abstractFactory.pizzas.PepperoniPizza;

public class NYPizzaStore extends PizzaStore{
    @Override
    protected Pizza createPizza(Pizza.Type type) {
        PizzaIngredientFactory ingredientFactory = new NewYorkIngredientsFactory();

        switch (type) {
            case CHEESE:
                return new CheesePizza(ingredientFactory);
            case PEPPERONI:
                return new PepperoniPizza(ingredientFactory);
            case CLAM:
                return new ClamPizza(ingredientFactory);
            default:
                return null;
        }
    }
}
