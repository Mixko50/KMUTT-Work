package Observer.Subscriber;

import Observer.Observer.DisplayElements;
import Observer.Observer.Observer;
import Observer.Observer.Subject;

public class CurrentConditionsDisplay implements Observer, DisplayElements {
    private float temperature, humidity;
    private Subject weatherData;

    public CurrentConditionsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    public void display() {
        System.out.println("Current conditions: " + temperature+"F degrees and " + humidity + "% humidity");
    }

    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }
}
