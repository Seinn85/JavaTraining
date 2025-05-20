import java.util.Scanner;
import java.util.Random;

public class Lesson13 {
    public static void main(String[] args) {
        // ランダムな整数を生成するためのRandomオブジェクト
        Random rand = new Random();

        // 0～100の範囲でランダムな整数を生成
        int targetNumber = rand.nextInt(101);

        // ユーザーからの入力を受け取るScannerオブジェクト
        Scanner scanner = new Scanner(System.in);

        // ユーザーの入力を保持する変数と、試行回数をカウントする変数
        int guess;
        int attempts = 0;

        // 正解するまで繰り返す
        while (true) {
            System.out.print("0～100の間の整数を入力してください: ");
            guess = scanner.nextInt();
            attempts++;

            if (guess < targetNumber) {
                // 入力が小さい場合
                System.out.println("大きい数を試してください。");
            } else if (guess > targetNumber) {
                // 入力が大きい場合
                System.out.println("小さい数を試してください。");
            } else {
                // 正解の場合
                System.out.println("正解です！あなたは" + attempts + "回で当てました。");
                break;
            }
        }
        scanner.close();
    }
}