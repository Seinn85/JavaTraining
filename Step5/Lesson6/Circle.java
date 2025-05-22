package Lesson6;

//子クラス
class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double getArea() {
        return radius * radius * 3.14;
    }
}