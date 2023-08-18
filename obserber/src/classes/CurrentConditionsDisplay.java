package classes;

import interfaces.DisplayElement;
import interfaces.Observer;

public class CurrentConditionsDisplay implements Observer, DisplayElement {
    private float temp;
    private float hum;
    private WeatherData weatherData;

    public CurrentConditionsDisplay(WeatherData weatherData){
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    public void update(){
        this.temp = weatherData.getTemp();
        this.hum = weatherData.getHum();
        display();
    }

    public void display(){
        System.out.println("[현재 날씨]=======================");
        System.out.println(String.format("현재온도 : %s F, 현재 습도 : %s %%",temp,hum));
        System.out.println("================================");
    }
}
