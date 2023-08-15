package classes;

import interfaces.QuackBehavior;

public class Squack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("bbick");
    }
}
