package com.headFirst.welcome.duckApp;

public class MuteQuack implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println(":x");
    }
}
