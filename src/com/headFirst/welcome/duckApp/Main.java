package com.headFirst.welcome.duckApp;

public class Main {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();

        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehavior( new RocketPowered() );
        model.performFly();
    }
}
