import java.util.Scanner;

public class Lesson4{
   public static void main(String[] args){
      //Declare 2 variables and assign initial values
      int num1 = 15;
      int num2 = 4;

      int quotient = num1 / num2;
      int remainder = num1 % num2;

      //Display quotient and remainder values
      System.out.println("Quotient: " + quotient + "," + "Remainder: " + remainder);

      //Accept user input
      Scanner scanner = new Scanner(System.in);

      //Run for 3 times
      for(int i = 1; i <= 3; i++){
         System.out.println("Test " + i + ": Enter first integer: ");
         int userInput1 = scanner.nextInt();
         System.out.println("Test " + i + ": Enter second integer: ");
         int userInput2 = scanner.nextInt();

         if(userInput2 == 0){
            System.out.println("Can't divide by zero");
         }
         else{
            int resultQuotient = userInput1 / userInput2;
            int resultRemainder = userInput1 % userInput2;
            System.out.println("Quotient: " + resultQuotient + "," + "Remainder: " + resultRemainder);
         }
      }
      scanner.close();
   }
}