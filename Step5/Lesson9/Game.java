package Lesson9;

//GameクラスはPlayableを実装する
public class Game implements Playable {
    //play()メソッドの具体的な実装
    @Override
    public void play() {
        System.out.println("ゲームをプレイしています");
    }
}