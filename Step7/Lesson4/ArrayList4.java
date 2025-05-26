import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList4{
    public static void main(String[] args) {
        //ArrayList<Integer>を作成
        ArrayList<Integer> numbers = new ArrayList<>();

        //1から10までの整数を順番に追加
        for (int i = 1; i <= 10; i++) {
            numbers.add(i);
        }

        //スキャナーを使ってユーザーから整数を入力してもらう
        Scanner scanner = new Scanner(System.in);
        System.out.print("検索したい整数を入力してください：");
        int input = scanner.nextInt();

        //ArrayListに含まれているかどうかをcontainsメソッドで調べる
        if (numbers.contains(input)) {
            System.out.println(input + "は含まれています");
        } else {
            System.out.println(input + "は含まれていません");
        }

        //Scannerを閉じる（推奨）
        scanner.close();
    }
}