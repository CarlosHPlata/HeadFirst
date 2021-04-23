package com.headFirst.decorator.starBuzz.coffees;

import com.headFirst.decorator.starBuzz.Beverage;

public class DarkRoast extends Beverage {

    public DarkRoast() {
        description = "Dark Roast Coffee";
    }

    @Override
    public double cost() {
        return .99;
    }
}
