package Factory.SimplePizza;

import Factory.Pizza.Pizza;

public class PepperoniPizza extends Pizza {
    public PepperoniPizza() {
        name = "Pepperoni pizza";
        dough = "Thiqq Crust Dough";
        sauce = "Tomato Sauce";
        toppings.add("Pepperoni");
    }
}
