import classes.pizzas.Pizza;
import classes.stores.NYPizzaStore;
import classes.stores.PizzaStore;

public class Main {
    public static void main(String[] args) {

        PizzaStore nyPizzaStore = new NYPizzaStore();

        nyPizzaStore.orderPizza("cheese");
    }
}