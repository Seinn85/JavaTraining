package Lesson11;

public class Circle {
    private double radius;

    //半径（radius）値を受け入れるコンストラクタ
    public Circle(double radius) {
        setRadius(radius);  // Use setter to apply validation
    }

    //デフォルトの引数なしコンストラクタ（オプション）
    public Circle() {
        this.radius = 0;  // Initialize radius to 0 by default
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if (radius < 0) {
            System.out.println("半径は0以上の値を指定してください。");
        } else {
            this.radius = radius;
        }
    }

    public double calculateArea() {
        return radius * radius * 3.14;
    }
}