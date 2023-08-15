package ducks;

import classes.FlyNoWay;
import classes.FlyWithWings;
import classes.Quack;

public class ModelDuck extends Duck{
    public ModelDuck(){
        flyBehavor = new FlyNoWay();
        quackBehavior = new Quack();
    }

    public void display(){
        System.out.println("Im model duck haha !");
    }
}
