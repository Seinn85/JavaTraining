import java.util.Scanner;

public class Lesson6{
   public static void main(String[] args){
      //変数を3つ作って、初期の値を入れる
      int num1 = 45;
      int num2 = 67;
      int num3 = 32;

      //最も大きい数の変数を作る
      int largestNum;

      //3つの数の中で最も大きい値をif文で調べる
      if(num1 >= num2 && num1 >= num3){
         largestNum = num1;
      }else if(num2 >= num1 && num2 >= num3){
         largestNum = num2;
      }else{
         largestNum = num3;
      }
      System.out.println("最も大きい値は: " + largestNum);

      //ユーザーから3つの整数を入力させる
      Scanner scanner = new Scanner(System.in);
      System.out.println("1つ目の数値を入力してください");
      int userInput1 = scanner.nextInt();

      System.out.println("2つ目の数値を入力してください");
      int userInput2 = scanner.nextInt();

      System.out.println("3つ目の数値を入力してください");
      int userInput3 = scanner.nextInt();

      //ユーザーの最も大きい数の変数を作る
      int userLargestNum;

      //3つの数の中で最も大きい値をif文で調べる
      if(userInput1 >= userInput2 && userInput1 >= userInput3){
         userLargestNum = userInput1;
      }else if(userInput2 >= userInput1 && userInput2 >= userInput3){
         userLargestNum = userInput2;
      }else{
         userLargestNum = userInput3;
      }
      System.out.println("最も大きい値は: " + userLargestNum);
      scanner.close();
   }
}