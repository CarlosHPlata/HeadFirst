package com.headFirst.adapter.ducks.ducks;

public class MallarDuck implements Duck {
    @Override
    public void quack() {
        System.out.println("Quakc :v");
    }

    @Override
    public void fly() {
        System.out.println("I'm flying");
    }
}
