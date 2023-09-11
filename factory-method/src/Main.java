import classes.factory.ChicagoPizzaFactory;
import classes.factory.NYPizzaFactory;
import classes.stores.PizzaStore;

public class Main {
    public static void main(String[] args) {
        NYPizzaFactory nyFactory = new NYPizzaFactory();
        PizzaStore nyStore = new PizzaStore(nyFactory);
        nyStore.orederPizza("Veggi");

        ChicagoPizzaFactory chicagoPizzaFactory = new ChicagoPizzaFactory();
        PizzaStore chicagoStore = new PizzaStore(chicagoPizzaFactory);
        chicagoStore.orederPizza("Veggi");
    }
}