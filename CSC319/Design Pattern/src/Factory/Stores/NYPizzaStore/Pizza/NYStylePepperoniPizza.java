package Factory.Stores.NYPizzaStore.Pizza;

import Factory.Pizza.Pizza;

public class NYStylePepperoniPizza extends Pizza {
    public NYStylePepperoniPizza() {
        name = "Pepperoni pizza";
        dough = "Thiqq Crust Dough";
        sauce = "Tomato Sauce";
        toppings.add("Pepperoni");
    }
}
