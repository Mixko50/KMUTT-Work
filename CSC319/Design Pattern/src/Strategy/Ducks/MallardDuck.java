package Strategy.Ducks;

import Strategy.Duck;
import Strategy.FlyBehavior.FlyWithWings;
import Strategy.QuackBehavior.Quack;

public class MallardDuck extends Duck {

    public MallardDuck() {
        this.flyBehavior = new FlyWithWings();
        this.quackBehavior = new Quack();
    }
    public void display() {
        System.out.println("I'm a Mallard duck");
    }
}
