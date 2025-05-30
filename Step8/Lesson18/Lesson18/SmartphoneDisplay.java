package Lesson18;

public class SmartphoneDisplay implements TemperatureObserver {
    @Override
    public void update(float temperature) {
        System.out.println("Smartphone Display: Temperature=" + temperature + "°C");
    }
}