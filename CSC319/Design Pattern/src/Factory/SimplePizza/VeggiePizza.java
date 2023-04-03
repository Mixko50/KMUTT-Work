package Factory.SimplePizza;

import Factory.Pizza.Pizza;

public class VeggiePizza extends Pizza {
    public VeggiePizza() {
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
