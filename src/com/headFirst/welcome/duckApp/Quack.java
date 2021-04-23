package com.headFirst.welcome.duckApp;

public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Quack! :v");
    }
}
