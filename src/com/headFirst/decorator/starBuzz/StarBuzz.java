package com.headFirst.decorator.starBuzz;

import com.headFirst.decorator.starBuzz.coffees.Espresso;
import com.headFirst.decorator.starBuzz.decorators.Mocha;
import com.headFirst.decorator.starBuzz.decorators.Whip;

public class StarBuzz {

    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        System.out.printf("Your coffee base is %s with a cost of %3.2f\n", beverage.getDescription(), beverage.cost());

        beverage = new Mocha(beverage);
        beverage = new Mocha(beverage);
        beverage = new Whip(beverage);

        System.out.printf("Your beverage is %s with a cost of %3.2f\n", beverage.getDescription(), beverage.cost());
    }
}
