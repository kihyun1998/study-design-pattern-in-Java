package ducks;

import interfaces.FlyBehavor;
import interfaces.QuackBehavior;

public abstract class Duck {
    FlyBehavor flyBehavor;
    QuackBehavior quackBehavior;

    public Duck(){ }
    public abstract void display();
    public void performFly(){
        flyBehavor.fly();
    }

    public void performQuack(){
        quackBehavior.quack();
    }

    public void swim(){
        System.out.println("Everyone can swim!");
    }

    public void setFlyBehavor(FlyBehavor flyBehavor) {
        this.flyBehavor = flyBehavor;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }
}
