package classes.pizzas;

import classes.factory.PizzaIngredientFactory;

public class CheesePizza extends Pizza{
    PizzaIngredientFactory ingredientFactory;

    public CheesePizza(PizzaIngredientFactory ingredientFactory){
        this.ingredientFactory = ingredientFactory;
    }

    @Override
    public void prepare() {
        System.out.println("Preparing... "+name);
        dough = ingredientFactory.createDough();
        System.out.println("Dough ... ");
        System.out.println(dough);

        sauce = ingredientFactory.createSauce();
        System.out.println("Sauce ... ");
        System.out.println(sauce);

        cheese = ingredientFactory.createCheese();
        System.out.println("Cheese..");
        System.out.println(cheese);
    }
}
