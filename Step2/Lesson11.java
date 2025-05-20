import java.util.Scanner;

public class Lesson11 {

   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      int userNum;

      //入力された数字が素数かどうかを確認する
      while (true) {
         System.out.print("整数値を入力してください: ");
         userNum = scanner.nextInt();

         if (userNum >= 2) {
               break;
         } else {
               System.out.println("2以上の整数を入力してください");
         }
      }

      //数が素数かどうか確認する
      boolean isPrime = true;

      for (int i = 2; i <= Math.sqrt(userNum); i++) {
         if (userNum % i == 0) {
               isPrime = false;
               break;
         }
      }

      if (isPrime) {
         System.out.println("入力された数値 " + userNum + " は素数です");
      } else {
         System.out.println("入力された数値 " + userNum + " は素数ではありません");
      }
      scanner.close();
   }
}