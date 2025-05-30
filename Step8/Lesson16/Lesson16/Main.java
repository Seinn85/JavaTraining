//コマンドパターンを使った「スマートリモコン」システム
package Lesson16;

public class Main {
    public static void main(String[] args) {
        RemoteControl remote = new RemoteControl();

        // 家電を作成
        Light light = new Light();
        AirConditioner airConditioner = new AirConditioner();

        // コマンドを作成
        Command lightOn = new LightOnCommand(light);
        Command lightOff = new LightOffCommand(light);
        Command acOn = new AirConditionerOnCommand(airConditioner);
        Command acOff = new AirConditionerOffCommand(airConditioner);

        // リモコンのボタンにコマンドを割り当てる
        remote.setCommand(lightOn);
        remote.pressButton(); // ライトをONにする

        remote.setCommand(lightOff);
        remote.pressButton(); // ライトをOFFにする

        remote.setCommand(acOn);
        remote.pressButton(); // エアコンをONにする

        remote.setCommand(acOff);
        remote.pressButton(); // エアコンをOFFにする
    }
}