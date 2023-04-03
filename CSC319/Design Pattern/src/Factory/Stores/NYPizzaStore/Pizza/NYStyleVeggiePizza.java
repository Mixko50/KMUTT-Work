package Factory.Stores.NYPizzaStore.Pizza;

import Factory.Pizza.Pizza;

public class NYStyleVeggiePizza extends Pizza {
    public NYStyleVeggiePizza() {
        name = "Veggie pizza";
        dough = "Something Dough";
        sauce = "Chilli Sauce";
        toppings.add("Vegetable");
    }
    @Override
    public void cut() {
        System.out.println("Cutting the pizza into square slices for VeggiePizza");
    }
}
