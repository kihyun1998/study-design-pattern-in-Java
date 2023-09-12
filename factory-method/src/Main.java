import classes.pizzas.Pizza;
import classes.stores.CaliforniaStore;
import classes.stores.ChicagoPizzaStore;
import classes.stores.NYPizzaStore;
import classes.stores.PizzaStore;

public class Main {
    public static void main(String[] args) {
        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();
        PizzaStore californiaStore = new CaliforniaStore();

        Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println("Eden's order is " +pizza.getName() + "\n");

        pizza = chicagoStore.orderPizza("cheese");
        System.out.println("Joel's order is "+pizza.getName()+"\n");

        pizza = californiaStore.orderPizza("cheese");
        System.out.println("Park;s oreder is "+pizza.getName()+"\n");
    }
}