package classes.stores;

import classes.factory.ChicagoPizzaIngredientFactory;
import classes.factory.PizzaIngredientFactory;
import classes.pizzas.CheesePizza;
import classes.pizzas.Pizza;
import classes.pizzas.VeggiePizza;

public class ChicagoPizzaStore extends PizzaStore{
    protected Pizza createPizza(String item){
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new ChicagoPizzaIngredientFactory();
        String local = "Cicago";
        if (item.equals("cheese")){
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName(local,"Cheese");
        }else if (item.equals("veggie")){
            pizza = new VeggiePizza(ingredientFactory);
            pizza.setName(local,"Veggie");
        }else if (item.equals("clam")){
            pizza = new VeggiePizza(ingredientFactory);
            pizza.setName(local,"Clam");
        }else if (item.equals("pepperoni")){
            pizza = new VeggiePizza(ingredientFactory);
            pizza.setName(local,"Pepperoni");
        }
        return pizza;
    }
}
