package Strategy.FlyBehavior;

import Strategy.Interface.FlyBehavior;

public class FlyNoWay implements FlyBehavior {
    public void fly() {
        System.out.println("Cannot fly");
    }
}
