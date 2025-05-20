public class Lesson3{
   public static void main(String[] args){
      //Declare 2 variables and assign initial float and double values
      float floatValue = 3.14f;
      double doubleValue = 123.456789;

      //Display initial values
      System.out.println("Initial float value: " + floatValue);
      System.out.println("Initial double value: " + doubleValue);

      //Assign new values
      floatValue = 10.5f;
      doubleValue = 0.00123;

      //Multiply and store result in double
      double result = floatValue * doubleValue;

      //Display the multiplication result
      System.out.println("Multiplication result: " + result);

      //Explanation of precision difference
        /*
         * float has 7 digits precision, while double has 15 digits.
         * That's why double is more accurate for calculations involving decimals.
         * In this program, we can observe that double values keep more digits after the decimal point.
         */
   }
}

