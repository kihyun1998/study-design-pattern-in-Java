package classes.pizzas;

import classes.ingredient.cheese_package.Cheese;
import classes.ingredient.clams_package.Clams;
import classes.ingredient.dough_package.Dough;
import classes.ingredient.pepperoni_package.Pepperoni;
import classes.ingredient.sauce_package.Sauce;
import classes.ingredient.veggies_package.Veggies;

import java.util.ArrayList;
import java.util.List;

public abstract class Pizza {
    String name;
    Dough dough;
    Sauce sauce;
    Veggies veggies[];
    Cheese cheese;
    Pepperoni pepperoni;
    Clams clams;

    abstract void prepare();

    public void bake() {
        System.out.println("Baking " + name);
    }

    public void cut() {
        System.out.println("Cutting " + name);
    }

    public void box() {
        System.out.println("Boxing " + name);
    }
    void setName(String name){
        this.name = name;
    }

    String getName(){
        return name;
    }
    public String toString(){
        return name;
    }
}
