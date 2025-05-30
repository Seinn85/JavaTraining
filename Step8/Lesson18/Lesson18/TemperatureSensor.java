package Lesson18;

import java.util.ArrayList;
import java.util.List;

public class TemperatureSensor {
    private List<TemperatureObserver> observers = new ArrayList<>();
    private float temperature;

    // オブザーバーを登録
    public void addObserver(TemperatureObserver observer) {
        observers.add(observer);
    }

    // オブザーバーを削除
    public void removeObserver(TemperatureObserver observer) {
        observers.remove(observer);
    }

    // 全オブザーバーに通知
    public void notifyObservers() {
        for (TemperatureObserver observer : observers) {
            observer.update(temperature);
        }
    }

    // 温度を更新
    public void setTemperature(float temperature) {
        this.temperature = temperature;
        System.out.println("\nTemperature updated: " + temperature + "°C");
        notifyObservers();
    }
}