package Decorator.Condiment;

import Decorator.Beverage.Beverage;
import Decorator.CondementDecorator.CondimentDecorator;

public class Mocha extends CondimentDecorator {
    Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }
    public double cost() {
        return .20 + beverage.cost();
    }

    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }
}
