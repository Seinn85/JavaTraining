package Lesson14;

public class Main {
    public static void main(String[] args) {
        Game game = new Game(10);

        //初期スコアを表示
        System.out.println("初期スコア: " + game.getScore());

        //スコアを25に更新
        game.setScore(25);
        System.out.println("更新後スコア: " + game.getScore());

        //スコアを-5にしようとする
        game.setScore(-5);
        System.out.println("再度スコア: " + game.getScore());
    }
}