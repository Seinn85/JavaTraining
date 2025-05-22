package Lesson11;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle();

        //半径を設定
        circle.setRadius(5);

        //半径を取得して表示
        System.out.println("半径: " + circle.getRadius());

        //面積を計算して表示
        System.out.println("面積: " + circle.calculateArea());
    }
}