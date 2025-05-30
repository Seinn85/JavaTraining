//
package Lesson21;

public class RedLightState implements TrafficLightState {
    @Override
    public void handle(TrafficLight trafficLight) {
        trafficLight.setState(new GreenLightState());
    }

    @Override
    public void display() {
        System.out.println("Current state: Red Light - Stop");
    }
}