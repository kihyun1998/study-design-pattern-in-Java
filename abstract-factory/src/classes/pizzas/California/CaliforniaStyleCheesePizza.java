package classes.pizzas.California;

import classes.pizzas.Pizza;

public class CaliforniaStyleCheesePizza extends Pizza {
    public CaliforniaStyleCheesePizza(){
        name = "California Style's Cheese Pizza";
        dough = "Thin Crust";
        sauce = "Marinara Pizza Sauce";

        toppings.add("Feta Cheese");
        toppings.add("Ham");
    }
}
