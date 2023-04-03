package Factory.Stores.NYPizzaStore;

import Factory.Pizza.Pizza;
import Factory.PizzaStore.PizzaStore;
import Factory.SimplePizza.CheesePizza;
import Factory.SimplePizza.PepperoniPizza;
import Factory.SimplePizza.VeggiePizza;
import Factory.Stores.NYPizzaStore.Pizza.NYStyleCheesePizza;
import Factory.Stores.NYPizzaStore.Pizza.NYStylePepperoniPizza;
import Factory.Stores.NYPizzaStore.Pizza.NYStyleVeggiePizza;

public class NYPizzaStore extends PizzaStore {
    public Pizza createPizza(String item) {
        if (item.equals("cheese")) {
           return new NYStyleCheesePizza();
        } else if (item.equals("pepperoni")) {
            return new NYStylePepperoniPizza();
        } else if (item.equals("veggie")) {
            return new NYStyleVeggiePizza();
        } else {
            return null;
        }
    }
}
