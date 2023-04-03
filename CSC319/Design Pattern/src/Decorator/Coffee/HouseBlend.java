package Decorator.Coffee;

import Decorator.Beverage.Beverage;

public class HouseBlend extends Beverage {

    public HouseBlend() {
        description = "House blend";
    }
    public double cost() {
        return 1.99;
    }
}