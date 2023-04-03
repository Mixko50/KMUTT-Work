package Decorator.Condiment;

import Decorator.Beverage.Beverage;
import Decorator.CondementDecorator.CondimentDecorator;

public class Whip extends CondimentDecorator {
    Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }
    public double cost() {
        return .1 + beverage.cost();
    }

    public String getDescription() {
        return beverage.getDescription() + ", Whip";
    }
}
