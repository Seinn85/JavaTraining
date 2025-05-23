import java.util.Scanner;

//Exceptionを継承したカスタム例外クラス
class InvalidValueException extends Exception{
    //コンストラクタでエラーメッセージを受け取る
    public InvalidValueException(String message){
        //親クラスExceptionのコンストラクタに渡す
        super(message);
    }
}

public class CustomException {
    //入力値が10未満なら例外を投げる
    public static void checkValue(int value) throws InvalidValueException {
        if(value < 10){
            //入力された値が10未満の場合にInvalidValueExceptionをスローする
            throw new InvalidValueException("入力された数値が小さすぎます。10以上の値を入力してください。");
        }
    }

    //例外を処理するメインメソッド
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("数値を入力してください: ");

        int input = scanner.nextInt();

        try{
            //入力値をチェックする
            checkValue(input);
            //問題なければ値を表示する
            System.out.println("入力された数値は: " + input);
        }catch (InvalidValueException e) {
            //例外発生時はエラーメッセージを表示する
            System.out.println("エラー: " + e.getMessage());
        }

        System.out.println("プログラム終了");
        scanner.close();
    }
}