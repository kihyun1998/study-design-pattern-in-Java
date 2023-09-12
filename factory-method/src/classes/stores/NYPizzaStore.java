package classes.stores;

import classes.pizzas.*;
import classes.pizzas.NewYork.NYStyleCheesePizza;
import classes.pizzas.NewYork.NYStyleClamPizza;
import classes.pizzas.NewYork.NYStylePepperoniPizza;
import classes.pizzas.NewYork.NYStyleVeggiePizza;


public class NYPizzaStore extends PizzaStore{
    // createPizza는 팩토리 메소드
    Pizza createPizza(String type) {
        if (type.equals("cheese")) {
            return new NYStyleCheesePizza();
        } else if (type.equals("pepperoni")) {
            return new NYStylePepperoniPizza();
        } else if (type.equals("clam")) {
            return new NYStyleClamPizza();
        } else if (type.equals("veggie")) {
            return new NYStyleVeggiePizza();
        } else return null;
    }
}
