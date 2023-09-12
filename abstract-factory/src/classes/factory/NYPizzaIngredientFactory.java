package classes.factory;

import classes.ingredient.cheese_package.Cheese;
import classes.ingredient.cheese_package.ReggianoCheese;
import classes.ingredient.clams_package.Clams;
import classes.ingredient.clams_package.FreshClams;
import classes.ingredient.dough_package.Dough;
import classes.ingredient.dough_package.ThinCrustDough;
import classes.ingredient.pepperoni_package.Pepperoni;
import classes.ingredient.pepperoni_package.SlicedPepperoni;
import classes.ingredient.sauce_package.MarinaraSauce;
import classes.ingredient.sauce_package.Sauce;
import classes.ingredient.veggies_package.*;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory{
    @Override
    public Dough createDough() {
        return new ThinCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new MarinaraSauce();
    }

    @Override
    public Cheese createCheese() {
        return new ReggianoCheese();
    }

    @Override
    public Veggies[] createVeggies() {
        Veggies veggies[] = {new Garlic(), new Onion(), new Mushroom(), new RedPepper()};
        return veggies;
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    @Override
    public Clams createClam() {
        return new FreshClams();
    }
}
