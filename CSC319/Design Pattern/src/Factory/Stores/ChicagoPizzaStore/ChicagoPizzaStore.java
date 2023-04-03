package Factory.Stores.ChicagoPizzaStore;

import Factory.Pizza.Pizza;
import Factory.PizzaStore.PizzaStore;
import Factory.SimplePizza.CheesePizza;
import Factory.SimplePizza.PepperoniPizza;
import Factory.SimplePizza.VeggiePizza;
import Factory.Stores.ChicagoPizzaStore.Pizza.ChicagoStyleCheesePizza;
import Factory.Stores.ChicagoPizzaStore.Pizza.ChicagoStylePepperoniPizza;
import Factory.Stores.ChicagoPizzaStore.Pizza.ChicagoStyleVeggiePizza;

public class ChicagoPizzaStore extends PizzaStore {

    @Override
    public Pizza createPizza(String item) {
        if (item.equals("cheese")) {
           return new ChicagoStyleCheesePizza();
        } else if (item.equals("pepperoni")) {
            return new ChicagoStylePepperoniPizza();
        } else if (item.equals("veggie")) {
            return new ChicagoStyleVeggiePizza();
        } else {
            return null;
        }
    }
}
