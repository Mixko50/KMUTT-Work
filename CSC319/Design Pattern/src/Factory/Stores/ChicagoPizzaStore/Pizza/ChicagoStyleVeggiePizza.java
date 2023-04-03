package Factory.Stores.ChicagoPizzaStore.Pizza;

import Factory.Pizza.Pizza;

public class ChicagoStyleVeggiePizza extends Pizza {
    public ChicagoStyleVeggiePizza() {
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
