package com.headFirst.templateMethod.starbuzz;

public class Tea extends CaffeineBeverage {

    @Override
    void brew() {
        System.out.println("Adding some lemon");
    }

    @Override
    void addCondiments() {
        System.out.println("Steep tea bag");
    }
}
