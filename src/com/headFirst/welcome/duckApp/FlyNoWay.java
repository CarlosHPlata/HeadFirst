package com.headFirst.welcome.duckApp;

public class FlyNoWay implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("I can't fly :c");
    }
}
