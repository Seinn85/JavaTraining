package Lesson2;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        //add(int, int) を呼び出す
        int sumTwoInts = calculator.add(10, 20);
        System.out.println("2つの整数の合計: " + sumTwoInts);

        //add(int, int, int) を呼び出す
        int sumThreeInts = calculator.add(5, 15, 25);
        System.out.println("3つの整数の合計s: " + sumThreeInts);

        //add(double, double) を呼び出す
        double sumTwoDoubles = calculator.add(4.5, 3.2);
        System.out.println("2つの倍精度浮動小数点数の合計: " + sumTwoDoubles);
    }
}