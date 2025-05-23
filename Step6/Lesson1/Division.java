import java.util.Scanner;

public class Division{
    public static void main(String[] args){
        //ユーザー入力のためのScanner
        Scanner scanner = new Scanner(System.in);  

        //ユーザーに分子の入力を求める
        System.out.print("分子を入力してください: ");
        int numerator = scanner.nextInt();

        //ユーザーに分母の入力を求める
        System.out.print("分母を入力してください: ");
        int denominator = scanner.nextInt();

        //try-catchを使用した例外処理
        try{
            //割り算を行いを実行する
            //分母が0の場合はArithmeticExceptionをスローします
            int result = numerator / denominator;
            System.out.println("結果: " + result);
        }catch (ArithmeticException e){
            //割る数（分母）が0の場合にエラー表示
            System.out.println("エラー: 0で割ることはできません。");
        }
        System.out.println("プログラム終了");
    }
}