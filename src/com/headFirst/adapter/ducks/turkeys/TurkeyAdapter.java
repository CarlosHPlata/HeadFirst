package com.headFirst.adapter.ducks.turkeys;

import com.headFirst.adapter.ducks.ducks.Duck;

public class TurkeyAdapter implements Duck {
    private Turkey turk;

    public TurkeyAdapter(Turkey turk) {
        this.turk = turk;
    }

    @Override
    public void quack() {
        turk.gobble();
    }

    @Override
    public void fly() {
        for(int i=0; i<5; i++) {
            turk.fly();
        }
    }
}
