package classes;

import interfaces.FlyBehavor;

public class FlyWithWings implements FlyBehavor {
    @Override
    public void fly() {
        System.out.println("I can fly!!");
    }
}
