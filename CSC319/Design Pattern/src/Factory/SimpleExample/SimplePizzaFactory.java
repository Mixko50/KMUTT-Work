package Factory.SimpleExample;

import Factory.Pizza.Pizza;
import Factory.SimplePizza.CheesePizza;
import Factory.SimplePizza.PepperoniPizza;
import Factory.SimplePizza.VeggiePizza;

public class SimplePizzaFactory {
    public Pizza createPizza(String type) {
        if (type.equals("cheese")) {
            return new CheesePizza();
        } else if (type.equals("pepperoni")) {
            return new PepperoniPizza();
        } else if (type.equals("veggie")) {
            return new VeggiePizza();
        } else {
            return null;
        }
    }
}
