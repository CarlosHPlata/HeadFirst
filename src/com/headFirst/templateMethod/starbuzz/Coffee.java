package com.headFirst.templateMethod.starbuzz;

public class Coffee extends CaffeineBeverage {

    @Override
    void brew() {
        System.out.println("brew coffee and milk");
    }

    @Override
    void addCondiments() {
        System.out.println("Adding sugar and milk");
    }

}
