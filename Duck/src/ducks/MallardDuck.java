package ducks;

import classes.FlyWithWings;
import classes.Quack;

public class MallardDuck extends Duck{
    public MallardDuck(){
        quackBehavior = new Quack();
        flyBehavor = new FlyWithWings();
    }

    public void display(){
        System.out.println("Im a MallardDuck!!");
    }
}
