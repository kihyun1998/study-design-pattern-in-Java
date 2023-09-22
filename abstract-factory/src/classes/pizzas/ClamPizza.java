package classes.pizzas;

import classes.factory.PizzaIngredientFactory;

public class ClamPizza extends Pizza{
    PizzaIngredientFactory ingredientFactory;

    public ClamPizza(PizzaIngredientFactory pizzaIngredientFactory){
        this.ingredientFactory = pizzaIngredientFactory;
    }

    @Override
    public void prepare() {
        System.out.println("Prepare ... "+name);
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        cheese = ingredientFactory.createCheese();
        clams = ingredientFactory.createClam();
    }
}
