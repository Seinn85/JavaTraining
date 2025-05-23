import java.util.Scanner;

public class MultiCatchExample{
    public static void main(String[] args){
        //配列を定義
        int[] numbers = {10, 20, 30};

        //配列の内容を表示する
        System.out.print("配列の内容: [");
        for (int i = 0; i < numbers.length; i++){
            System.out.print(numbers[i]);
            if (i < numbers.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");

        Scanner scanner = new Scanner(System.in);

        try{
            //ユーザーに配列のインデックスを入力させる
            System.out.print("配列のインデックスを入力してください: ");
            int index = scanner.nextInt();

            //配列から値を取得
            int value = numbers[index];

            //割り算の分母を入力させる
            System.out.print("割り算の分母を入力してください: ");
            int denominator = scanner.nextInt();

            //割り算を実行
            int result = value / denominator;

            //計算結果を表示する
            System.out.println("計算結果: " + result);

        }catch (ArithmeticException | ArrayIndexOutOfBoundsException e){
            //マルチキャッチ構文で例外を処理
            if (e instanceof ArithmeticException){
                System.out.println("エラー: 0で割ることはできません。");
            }else if (e instanceof ArrayIndexOutOfBoundsException){
                System.out.println("エラー: 配列のインデックスが範囲外です。");
            }
        }finally{
            System.out.println("プログラム終了");
            scanner.close();
        }
    }
}