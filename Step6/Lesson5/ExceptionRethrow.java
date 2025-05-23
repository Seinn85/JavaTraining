import java.util.Scanner;

public class ExceptionRethrow{

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        try{
            //数値をユーザーから入力してもらう
            System.out.print("数値を入力してください: ");
            int num = scanner.nextInt();

            try{
                //10以下の場合は例外をスローする
                if (num <= 10){
                    throw new IllegalArgumentException("入力値が10以下です。");
                }
                //10より大きければ正常処理
                System.out.println("入力された数値は: " + num);
            }catch (IllegalArgumentException e){
                //最初の例外をキャッチ
                System.out.println("スローされた例外をキャッチしました: " + e.getMessage());

                //5以下なら再スロー
                if (num <= 5){
                    throw e;
                }
                //5より大きければ再スローしない
            }

        }catch (IllegalArgumentException e){
            //再スローされた例外をキャッチ
            System.out.println("再スローされた例外を処理します: 入力値が5以下です。");
        }

        //プログラム終了メッセージ
        System.out.println("プログラム終了");

        scanner.close();
    }
}