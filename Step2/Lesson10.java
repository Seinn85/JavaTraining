public class Lesson10{
   public static void main(String[] args){
      //1から100までの3の倍数のみを表示する
      System.out.println("Multiples of 3:");
      for(int i = 1; i <= 100; i++){
         if (i % 3 == 0){
            System.out.println(i);
         };
      }
      
      //改行
      System.out.println(); 
      //3 と 5 の倍数を表示する（重複なし）
      System.out.println("Multiples of 3 or 5:");
      for (int i = 1; i <= 100; i++) {
         if (i % 3 == 0 || i % 5 == 0) {
               System.out.println(i);
         }
      }

      //改行
      System.out.println();
      //「Fizz、Buzz」と表示する
      System.out.println("FizzBuzz:");
      for (int i = 1; i <= 100; i++) {
         if (i % 3 == 0 && i % 5 == 0) {
               System.out.println("FizzBuzz");
         } else if (i % 3 == 0) {
               System.out.println("Fizz");
         } else if (i % 5 == 0) {
               System.out.println("Buzz");
         } else {
               System.out.println(i);
         }
      }
   }
}