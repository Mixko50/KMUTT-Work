package Template.Beverage;

import Template.CaffeineBeverage.CaffeineBeverage;

public class Tea extends CaffeineBeverage {

    @Override
    public void brew() {
        System.out.println("Stepping the tea");
    }

    @Override
    public void addCondiment() {
        System.out.println("Adding lemon");
    }

}
