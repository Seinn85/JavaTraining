package Lesson9;

//MusicクラスはPlayableを実装する
public class Music implements Playable {
    //play()メソッドの具体的な実装
    @Override
    public void play() {
        System.out.println("音楽を再生しています");
    }
}