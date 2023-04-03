package Decorator.Condiment;

import Decorator.Beverage.Beverage;
import Decorator.CondementDecorator.CondimentDecorator;

public class Crumble extends CondimentDecorator {
    Beverage beverage;

    public Crumble(Beverage beverage) {
        this.beverage = beverage;
    }
    public double cost() {
        return .3 + beverage.cost();
    }

    public String getDescription() {
        return beverage.getDescription() + ", Crumble";
    }
}
