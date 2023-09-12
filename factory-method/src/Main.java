import classes.pizzas.Pizza;
import classes.stores.ChicagoPizzaStore;
import classes.stores.NYPizzaStore;
import classes.stores.PizzaStore;

public class Main {
    public static void main(String[] args) {
        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();

        Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println("Eden's order is " +pizza.getName() + "\n");

        pizza = chicagoStore.orderPizza("cheese");
        System.out.println("Joel's order is "+pizza.getName()+"\n");
    }
}