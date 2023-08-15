import classes.FlyRocketPowered;
import ducks.Duck;
import ducks.MallardDuck;
import ducks.ModelDuck;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        System.out.println("=====MallardDuck area=======");
        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();
        System.out.println("============================");

        System.out.println("=====Model area=======");
        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehavor(new FlyRocketPowered());
        model.performFly();
        System.out.println("======================");
    }
}