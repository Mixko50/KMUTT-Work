package Template.Beverage;

import Template.CaffeineBeverage.CaffeineBeverage;

public class Coffee extends CaffeineBeverage {
    @Override
    protected void brew() {
        System.out.println("Dripping coffee through filter");
    }

    @Override
    protected void addCondiment() {
        System.out.println("Adding sugar and Milk");
    }
}
