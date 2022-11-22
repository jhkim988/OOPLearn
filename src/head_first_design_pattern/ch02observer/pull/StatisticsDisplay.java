package head_first_design_pattern.ch02observer.pull;

import java.util.*;

public class StatisticsDisplay implements Observer, DisplayElement {
    private List<Float> temperature = new ArrayList<>();
    private WeatherData weatherData;

    public StatisticsDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        double avg = temperature.stream().mapToDouble(x -> Double.valueOf(x)).average().orElse(0.0);
        double min = temperature.stream().mapToDouble(x -> Double.valueOf(x)).min().orElse(0.0);
        double max = temperature.stream().mapToDouble(x -> Double.valueOf(x)).max().orElse(0.0);
        System.out.println("평균/최고/최저 온도" + avg + "/" + max + "/" + min);
    }

    @Override
    public void update() {
        this.temperature.add(weatherData.getTemperature());
        display();
    }
    
}
