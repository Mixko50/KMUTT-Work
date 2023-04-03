import Command.Command.Command;
import Command.Light.Light;
import Command.Light.LightOnCommand;
import Command.SimpleRemoteControl.SimpleRemoteControl;
import Decorator.Beverage.Beverage;
import Decorator.Coffee.DarkRoast;
import Decorator.Condiment.Hazelnut;
import Decorator.Condiment.Mocha;
import Decorator.Condiment.Whip;
import Factory.Pizza.Pizza;
import Factory.PizzaStore.PizzaStore;
import Factory.SimpleExample.SimplePizzaFactory;
import Factory.SimpleExample.SimplePizzaStore;
import Factory.Stores.NYPizzaStore.NYPizzaStore;
import Observer.Subscriber.CurrentConditionsDisplay;
import Observer.WeatherStation.WeatherData;
import Strategy.Duck;
import Strategy.Ducks.MallardDuck;
import Strategy.Ducks.RubberDuck;
import Template.Beverage.Tea;
public class Main {
    public static void main(String[] args) {
        // Strategy
        System.out.println("-------------------------Strategy-----------------------------");
        Duck mallardDuck = new MallardDuck();
        mallardDuck.performFly();
        mallardDuck.performQuack();

        Duck rubberDuck = new RubberDuck();
        rubberDuck.performFly();
        rubberDuck.performQuack();

        // Observer
        System.out.println("-------------------------Observer-----------------------------");
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay subscriber = new CurrentConditionsDisplay(weatherData);

        subscriber.display();

        weatherData.setMeasurements(35.2f, 60.6f, 10);
        weatherData.setMeasurements(38.2f, 70.6f, 9);
        weatherData.setMeasurements(32.2f, 44.3f, 2);

        // Decorator
        System.out.println("-----------------------Decorator-L------------------------------");
        Beverage beverage = new DarkRoast();
        System.out.println(beverage.cost());
        beverage = new Whip(beverage);
        System.out.println(beverage.cost());
        beverage = new Mocha(beverage);
        System.out.println(beverage.cost());
        beverage = new Hazelnut(beverage);
        System.out.println(beverage.cost());
        System.out.println(beverage.getDescription() + " $"+ beverage.cost());

        // Factory
        System.out.println("-----------------------Factory-------------------------------");
        PizzaStore nyStore = new NYPizzaStore();

        Pizza pizza = nyStore.orderPizza("veggie");
        System.out.println("Mixko ordered a "+pizza.getName() + "\n");

        SimplePizzaFactory simplePizzaFactory = new SimplePizzaFactory();
        SimplePizzaStore simple = new SimplePizzaStore(simplePizzaFactory);
        Pizza pizza1 = simple.orderPizza("cheese");

        // Command
        System.out.println("-----------------------Command-------------------------------");
        SimpleRemoteControl simpleRemote = new SimpleRemoteControl();
        Light light = new Light();
        LightOnCommand lightOn = new LightOnCommand(light);

        simpleRemote.setCommand(lightOn);
        simpleRemote.buttonWasPressed();

        // Template
        System.out.println("-----------------------Template-------------------------------");
        Tea tea = new Tea();
        tea.prepareRecipe();
    }
}