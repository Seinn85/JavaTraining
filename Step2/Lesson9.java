import java.util.Scanner;

public class Lesson9{
   public static void main(String[] args){
      int i = 1;
      
      //while文を使って、iが5以下の間を繰り返する
      while(i <= 5){
         System.out.println(i);
         i++;
      }

      //改行
      System.out.println();

      //while文を使って、iが6から10までの数を順に表示する
      i = 6;
      while(i <= 10){
         System.out.println(i);
         i++;
      }

      //ユーザーから任意の数値を入力させ、その数までカウントアップする
      Scanner scanner = new Scanner(System.in);
      System.out.print("Enter a number to count up to: ");
      int max = scanner.nextInt();

      i = 1;
      while (i <= max) {
         System.out.println(i);
         i++;
      }
      scanner.close();
    }
}