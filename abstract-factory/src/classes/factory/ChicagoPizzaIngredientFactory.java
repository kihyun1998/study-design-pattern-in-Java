package classes.factory;

import classes.ingredient.cheese_package.Cheese;
import classes.ingredient.cheese_package.MozzarellaCheese;
import classes.ingredient.clams_package.Clams;
import classes.ingredient.clams_package.FrozenClams;
import classes.ingredient.dough_package.Dough;
import classes.ingredient.dough_package.ThickCrustDough;
import classes.ingredient.pepperoni_package.Pepperoni;
import classes.ingredient.pepperoni_package.SlicedPepperoni;
import classes.ingredient.sauce_package.PlumTomatoSauce;
import classes.ingredient.sauce_package.Sauce;
import classes.ingredient.veggies_package.BlackOlives;
import classes.ingredient.veggies_package.Eggplant;
import classes.ingredient.veggies_package.Spinach;
import classes.ingredient.veggies_package.Veggies;
import sun.security.provider.ConfigFile;

public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory{

    @Override
    public Dough createDough(){
        return new ThickCrustDough();
    }

    @Override
    public Sauce createSauce(){
        return new PlumTomatoSauce();
    }

    @Override
    public Cheese createCheese(){
        return new MozzarellaCheese();
    }

    @Override
    public Veggies[] createVeggies(){
        Veggies veggies[] = {new BlackOlives(), new Eggplant(), new Spinach()};
        return veggies;
    }

    @Override
    public Pepperoni createPepperoni() { return new SlicedPepperoni(); }

    @Override
    public Clams createClam() { return new FrozenClams(); }
}
