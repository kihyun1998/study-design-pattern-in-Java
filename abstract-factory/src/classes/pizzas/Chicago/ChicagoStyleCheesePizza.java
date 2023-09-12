package classes.pizzas.Chicago;

import classes.pizzas.Pizza;

public class ChicagoStyleCheesePizza extends Pizza {
    public ChicagoStyleCheesePizza(){
        name = "Chicago style's Cheese Pizza";
        dough = "Very Thick Crust";
        sauce = "Plum Tomato Pizza Sauce";
        toppings.add("Shredded Cheese");
    }

    @Override
    public void cut(){
        System.out.println("Cut into Square");
    }
}
