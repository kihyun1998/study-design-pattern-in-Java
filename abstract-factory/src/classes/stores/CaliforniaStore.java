package classes.stores;

import classes.pizzas.California.CaliforniaStyleCheesePizza;
import classes.pizzas.California.CaliforniaStyleClamPizza;
import classes.pizzas.California.CaliforniaStylePepperoniPizza;
import classes.pizzas.California.CaliforniaStyleVeggiePizza;
import classes.pizzas.Pizza;

public class CaliforniaStore extends PizzaStore{
    // createPizza는 팩토리 메소드
    Pizza createPizza(String type) {
        if (type.equals("cheese")) {
            return new CaliforniaStyleCheesePizza();
        } else if (type.equals("pepperoni")) {
            return new CaliforniaStylePepperoniPizza();
        } else if (type.equals("clam")) {
            return new CaliforniaStyleClamPizza();
        } else if (type.equals("veggie")) {
            return new CaliforniaStyleVeggiePizza();
        } else return null;
    }
}
