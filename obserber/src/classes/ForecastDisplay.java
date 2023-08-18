package classes;

import interfaces.DisplayElement;
import interfaces.Observer;

public class ForecastDisplay implements Observer, DisplayElement {
    private float currentPres = 30.00f;
    private float previousPres;
    private WeatherData weatherData;

    public ForecastDisplay(WeatherData weatherData){
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update() {
        previousPres = currentPres;
        currentPres = weatherData.getPres();
        display();
    }

    @Override
    public void display() {
        System.out.println("[기상 예측]=======================");
        if (currentPres > previousPres) {
            System.out.println("날씨가 좋아질 예정");
        } else if (currentPres == previousPres) {
            System.out.println("날씨 변화 없음");
        } else if (currentPres < previousPres) {
            System.out.println("날씨 안 좋아질 예정");
        }
        System.out.println("================================");
    }
}
