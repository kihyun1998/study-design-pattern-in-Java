package classes;

import interfaces.DisplayElement;
import interfaces.Observer;

public class StatisticDisplay implements Observer, DisplayElement {

    private float tempSum = 0.0f;
    private float maxTemp = 0.0f;
    private float minTemp = 99999.0f;
    private int cnt;
    private WeatherData weatherData;

    public StatisticDisplay(WeatherData weatherData){
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        tempSum += temp;
        cnt++;
        if(maxTemp<temp){
            maxTemp = temp;
        }

        if(minTemp>temp){
            minTemp = temp;
        }
        display();
    }

    public void display(){
        System.out.println("[날씨 정보]=======================");
        System.out.println(String.format("평균 : %.3f, 최고 : %.3f, 최저 : %.3f",tempSum/cnt, maxTemp, minTemp));
        System.out.println("================================");
    }
}
