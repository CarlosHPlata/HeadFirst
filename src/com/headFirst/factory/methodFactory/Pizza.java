package com.headFirst.factory.methodFactory;

import java.util.ArrayList;

public abstract class Pizza {
    public static enum Type { CHEESE, PEPPERONI };

    protected String name;
    protected String sauce;
    protected ArrayList<String> toppings = new ArrayList<String>();

    public void prepare() {
        String text = String.format(
                "Preparing %s with %s Sauce and the next toppings:\n%s",
                name,
                sauce,
                toppings.stream().reduce("\t", (partialString, element) -> partialString+element+"\n\t")
        );
        System.out.println(text);
    }
}
