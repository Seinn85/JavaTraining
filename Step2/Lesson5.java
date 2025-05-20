public class Lesson5{
   public static void main(String[] args){
      //Declare 2 variables and assign initial values
      int firstVar = 10;
      int secondVar = 20;

      //Display values before swapping
      System.out.println("Before swapping: variable1 = " + firstVar + ", variable2 = " + secondVar);
      
      //Swap value using temporary variable
      int temp = firstVar;
      firstVar = secondVar;
      secondVar = temp;

      //Display values after swapping
      System.out.println("After swapping: variable1 = " + firstVar + ", variable2 = " + secondVar);   
   }
}

