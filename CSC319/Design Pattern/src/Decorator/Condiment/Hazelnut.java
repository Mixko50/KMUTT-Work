package Decorator.Condiment;

import Decorator.Beverage.Beverage;
import Decorator.CondementDecorator.CondimentDecorator;

public class Hazelnut extends CondimentDecorator {
    Beverage beverage;

    public Hazelnut(Beverage beverage) {
        this.beverage = beverage;
    }

    public double cost() {
        return .5 + beverage.cost();
    }

    public String getDescription() {
        return beverage.getDescription() + ", Hazelnut";
    }
}
