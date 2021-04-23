package com.headFirst.welcome.duckApp;

public class ModelDuck extends Duck{

    public ModelDuck() {
        super();
        super.setFlyBehavior( new FlyNoWay() );
        super.setQuackBehavior( new Quack() );
    }

    @Override
    public void display() {
        System.out.println("Im a model duck");
    }
}
