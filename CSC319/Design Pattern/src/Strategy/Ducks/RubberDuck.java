package Strategy.Ducks;

import Strategy.Duck;
import Strategy.FlyBehavior.FlyNoWay;
import Strategy.QuackBehavior.Squeak;

public class RubberDuck extends Duck {

    public RubberDuck() {
        this.flyBehavior = new FlyNoWay();
        this.quackBehavior = new Squeak();
    }
    public void display() {
        System.out.println("I'm a Rubber duck");
    }
}
