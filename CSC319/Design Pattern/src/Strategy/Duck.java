package Strategy;

import Strategy.Interface.FlyBehavior;
import Strategy.Interface.QuackBehavior;

public abstract class Duck {
    protected FlyBehavior flyBehavior;
    protected QuackBehavior quackBehavior;

   public abstract void display();

    public void swim() {
        System.out.println("Swim ......");
    }

    public void performQuack() {
        quackBehavior.quack();
    }

    public void performFly() {
        flyBehavior.fly();
    }
}
