//
package Lesson21;

public class YellowLightState implements TrafficLightState {
    @Override
    public void handle(TrafficLight trafficLight) {
        trafficLight.setState(new RedLightState());
    }

    @Override
    public void display() {
        System.out.println("Current state: Yellow Light - Caution");
    }
}