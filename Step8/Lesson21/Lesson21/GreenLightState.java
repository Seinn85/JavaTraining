package Lesson21;

public class GreenLightState implements TrafficLightState {
    @Override
    public void handle(TrafficLight trafficLight) {
        trafficLight.setState(new YellowLightState());
    }

    @Override
    public void display() {
        System.out.println("Current state: Green Light - Go");
    }
}