//
package Lesson21;

public class TrafficLight {
    private TrafficLightState state;

    public TrafficLight() {
        // 初期状態は赤信号
        this.state = new RedLightState();
    }

    public void setState(TrafficLightState state) {
        this.state = state;
    }

    public void changeState() {
        state.handle(this);
    }

    public void showState() {
        state.display();
    }
}