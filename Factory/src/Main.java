import classes.Pizza;
import classes.PizzaStore;
import classes.SimplePizzaFactory;

public class Main {
    public static void main(String[] args) {
        SimplePizzaFactory factory = new SimplePizzaFactory();
        PizzaStore store = new PizzaStore(factory);

        Pizza pizza = store.orderPizza("cheese");
        System.out.println("\n\nWe ordered a " + pizza.getName() + "\n");
        System.out.println(pizza);

        pizza = store.orderPizza("veggie");
        System.out.println("\n\nWe ordered a " + pizza.getName() + "\n");
        System.out.println(pizza);
    }
}