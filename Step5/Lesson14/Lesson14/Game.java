package Lesson14;

public class Game {
    //private 修飾子で定義する
    private int score;

    //コンストラクタで初期スコアを設定
    public Game(int initialScore) {
        setScore(initialScore);
    }

    //スコアを取得するメソッド
    public int getScore() {
        return score;
    }

    //スコアを設定するメソッド
    public void setScore(int score) {
        if (score < 0) {
            System.out.println("エラー：スコアは0以上の値を設定してください。");
        } else {
            this.score = score;
        }
    }
}