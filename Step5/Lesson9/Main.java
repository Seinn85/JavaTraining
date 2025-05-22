package Lesson9;

//Mainクラスで動作確認
public class Main {
    public static void main(String[] args) {
        //Playable型の変数でGameクラスを操作
        Playable game = new Game();
        game.play(); //ゲームをプレイしています

        //Playable型の変数でMusicクラスを操作
        Playable music = new Music();
        music.play(); //音楽を再生しています
    }
}