import java.util.Scanner;

public class Lesson12{
   public static void main(String[] args){
      Scanner scanner = new Scanner(System.in);
      String userInput;

      while(true){
         //ユーザーに入力を促すメッセージを表示する
         System.out.print("文字列を入力してください（終了するには 'quit' と入力）: ");
         //ユーザーの入力を取得し、前後の空白を削除
         userInput = scanner.nextLine().trim();

         //入力が "quit" の場合、ループを終了
         if (userInput.equals("quit")){
            System.out.println("プログラムを終了します");
            break;
         }else{
            //入力された文字列を表示する
            System.out.println("あなたが入力した文字列: " + userInput);
         }
      }
      scanner.close();
   }
}
