package com.headFirst.factory.abstractFactory.pizzas;

import com.headFirst.factory.abstractFactory.ingredients.Cheese;
import com.headFirst.factory.abstractFactory.ingredients.Clam;
import com.headFirst.factory.abstractFactory.ingredients.Dough;
import com.headFirst.factory.abstractFactory.ingredients.Sauce;

import java.util.ArrayList;

public abstract class Pizza {
    public static enum Type { CHEESE, PEPPERONI, CLAM };

    private String name;

    protected Dough dough;
    protected Cheese cheese;
    protected Clam clam;
    protected Sauce sauce;

    public abstract void prepare();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}