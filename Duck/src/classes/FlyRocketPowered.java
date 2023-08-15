package classes;

import interfaces.FlyBehavor;

public class FlyRocketPowered implements FlyBehavor {
    @Override
    public void fly() {
        System.out.println("ROCKET FLY!!");
    }
}
