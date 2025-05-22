package Lesson6;

public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle(5);
        System.out.println("円の面積: " + circle.getArea());

        Shape square = new Square(4);
        System.out.println("正方形の面積: " + square.getArea());
    }
}
