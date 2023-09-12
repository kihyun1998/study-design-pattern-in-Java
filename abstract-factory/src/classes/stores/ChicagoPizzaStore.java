package classes.stores;

import classes.pizzas.Chicago.ChicagoStyleCheesePizza;
import classes.pizzas.Chicago.ChicagoStyleClamPizza;
import classes.pizzas.Chicago.ChicagoStylePepperoniPizza;
import classes.pizzas.Chicago.ChicagoStyleVeggiePizza;
import classes.pizzas.Pizza;

public class ChicagoPizzaStore extends PizzaStore{
    // createPizza는 팩토리 메소드
    Pizza createPizza(String type) {
        if (type.equals("cheese")) {
            return new ChicagoStyleCheesePizza();
        } else if (type.equals("pepperoni")) {
            return new ChicagoStylePepperoniPizza();
        } else if (type.equals("clam")) {
            return new ChicagoStyleClamPizza();
        } else if (type.equals("veggie")) {
            return new ChicagoStyleVeggiePizza();
        } else return null;
    }
}
