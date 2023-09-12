package classes.pizzas;

import java.util.ArrayList;
import java.util.List;

public abstract class Pizza {
    public String name;
    public String dough;
    public String sauce;
    public List<String> toppings = new ArrayList<String>();

    public String getName() {
        return name;
    }

    public void prepare() {
        System.out.println("=====Preparing " + name+"=====");
        System.out.println("Making dough ...");
        System.out.println("Put the sauce ...");
        System.out.println("Put the toppings");
        System.out.println("*********************");
        for (String topping : toppings){
            System.out.println(topping+" ");
        }
        System.out.println("*********************");
    }

    public void bake() {
        System.out.println("Baking " + name);
    }

    public void cut() {
        System.out.println("Cutting " + name);
    }

    public void box() {
        System.out.println("Boxing " + name);
    }
}
