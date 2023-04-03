package Decorator.Coffee;

import Decorator.Beverage.Beverage;

public class DarkRoast extends Beverage {

    public DarkRoast() {
       description = "Dark Roast";
    }
    public double cost() {
        return 1.99;
    }
}
