package com.headFirst.decorator.starBuzz.coffees;

import com.headFirst.decorator.starBuzz.Beverage;

public class HouseBlend extends Beverage {

    HouseBlend() {
        description = "House Blend Coffee";
    }

    @Override
    public double cost() {
        return .89;
    }
}
