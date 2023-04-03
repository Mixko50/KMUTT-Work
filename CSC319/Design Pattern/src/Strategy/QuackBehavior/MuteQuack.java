package Strategy.QuackBehavior;

import Strategy.Interface.QuackBehavior;

public class MuteQuack implements QuackBehavior {
    public void quack() {
        System.out.println("<< Silence >>");
    }
}
