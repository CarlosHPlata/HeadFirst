package com.headFirst.decorator.starBuzz.coffees;

import com.headFirst.decorator.starBuzz.Beverage;

public class Decaf extends Beverage {

    public Decaf() {
        description = "Decaf coffee";
    }

    @Override
    public double cost() {
        return 1.05;
    }
}
