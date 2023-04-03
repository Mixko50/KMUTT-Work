package Factory.Stores.ChicagoPizzaStore.Pizza;

import Factory.Pizza.Pizza;

public class ChicagoStylePepperoniPizza extends Pizza {
    public ChicagoStylePepperoniPizza() {
        name = "Pepperoni pizza";
        dough = "Thiqq Crust Dough";
        sauce = "Tomato Sauce";
        toppings.add("Pepperoni");
    }
}
