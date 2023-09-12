package classes.factory;

import classes.ingredient.cheese_package.Cheese;
import classes.ingredient.clams_package.Clams;
import classes.ingredient.dough_package.Dough;
import classes.ingredient.pepperoni_package.Pepperoni;
import classes.ingredient.sauce_package.Sauce;
import classes.ingredient.veggies_package.Veggies;

public interface PizzaIngredientFactory {
    public Dough createDough();
    public Sauce createSauce();
    public Cheese createCheese();
    public Veggies[] createVeggies();
    public Pepperoni createPepperoni();
    public Clams createClam();
}
