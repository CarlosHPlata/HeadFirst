package com.headFirst.decorator.starBuzz.decorators;

import com.headFirst.decorator.starBuzz.Beverage;

public class Soy extends CondimentDecorator {

    public Soy(Beverage beverage) {
        super(beverage);
    }

    @Override
    public double cost() {
        double originalCost = beverage.cost();

        if (getSize() == Size.TALL){
            return originalCost + .10;
        } else if (getSize() == Size.GRANDE) {
            return originalCost + .15;
        }

        return beverage.cost() + .20;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", soy";
    }
}
