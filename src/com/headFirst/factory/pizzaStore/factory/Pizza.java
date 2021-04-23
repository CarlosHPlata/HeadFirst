package com.headFirst.factory.pizzaStore.factory;

public abstract class Pizza {

    protected String name;

    public Pizza(String name) {
        this.name = name;
    }

    public void prepare() {
        System.out.printf("Your %s is ready\n-------------------------------\n", name);
    }

}
