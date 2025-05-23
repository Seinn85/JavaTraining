import java.util.Scanner;

public class Validate{
    //入力値をチェックし、条件に合わない場合に例外をスローする
    public static void validateInput(int value) {
        if (value <= 0) {
            //入力値が0以下の場合に例外をスローする
            throw new IllegalArgumentException("入力値は1以上である必要があります。");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //ユーザーから数値を入力させる
        System.out.print("数値を入力してください: ");
        int input = scanner.nextInt();

        try{
            //入力値をチェックする
            validateInput(input);
            //条件を満たしていれば正常なメッセージを表示
            System.out.println("入力値は有効です: " + input);
        }catch (IllegalArgumentException e){
            //例外が発生した場合はエラーメッセージを表示
            System.out.println("エラー: " + e.getMessage());
        }

        System.out.println("プログラム終了");
    }
}