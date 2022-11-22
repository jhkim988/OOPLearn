package head_first_design_pattern.ch02observer;

import java.util.*;

public class WeatherData implements Subject {
    private List<Observer> observers;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() {
        observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        observers.stream()
            .forEach(observer -> observer.update(temperature, humidity, pressure));    
    }
    
    public void measurementsChanged() {
        notifyObservers();
    }

    public void setMeasurements(float temperature, float huidity, float pressure) {
        this.temperature = temperature;
        this.humidity = huidity;
        this.pressure = pressure;
        measurementsChanged();
    }
}
