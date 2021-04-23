package com.headFirst.decorator.starBuzz.decorators;

import com.headFirst.decorator.starBuzz.Beverage;

public class Mocha extends CondimentDecorator{


    public Mocha(Beverage beverage) {
        super(beverage);
    }

    @Override
    public double cost() {
        return beverage.cost() + .20;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }
}
