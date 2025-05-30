//オブザーバーパターンを使った「温度監視システム」
package Lesson18;

public class Main {
    public static void main(String[] args) {
        TemperatureSensor sensor = new TemperatureSensor();

        // ディスプレイを作成
        TemperatureObserver tv = new TVDisplay();
        TemperatureObserver smartphone = new SmartphoneDisplay();

        // ディスプレイを登録
        sensor.addObserver(tv);
        sensor.addObserver(smartphone);

        // 温度を更新（すべてのディスプレイが通知を受ける）
        sensor.setTemperature(25);
        sensor.setTemperature(30);
    }
}