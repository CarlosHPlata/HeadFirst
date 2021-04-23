package com.headFirst.welcome.duckApp;

public class MallardDuck extends Duck {

    public MallardDuck() {
        super();
        super.setFlyBehavior( new FlyWithWings() );
        super.setQuackBehavior( new Quack() );
    }

    @Override
    public void display() {
        System.out.println("I'm a Mallar Duck, bitch");
    }
}
