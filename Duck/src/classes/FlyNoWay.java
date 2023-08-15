package classes;

import interfaces.FlyBehavor;

public class FlyNoWay implements FlyBehavor {
    @Override
    public void fly() {
        System.out.println("I can't fly ! TT");
    }
}
