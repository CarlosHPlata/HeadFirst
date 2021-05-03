package com.headFirst.adapter.ducks.turkeys;

public class WildTurkey implements Turkey {

    @Override
    public void gobble() {
        System.out.println("Gobble! Gobble!!!!!!");
    }

    @Override
    public void fly() {
        System.out.println("I think i can fly but its more like jump with wings");
    }
}
