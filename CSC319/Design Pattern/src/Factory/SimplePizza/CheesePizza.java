package Factory.SimplePizza;

import Factory.Pizza.Pizza;

public class CheesePizza extends Pizza {
    public CheesePizza() {
        name = "Cheese pizza";
        dough = "Thin Crust Dough";
        sauce = "Marinara Sauce";
        toppings.add("Grated Reggiano Cheese");
    }
}
