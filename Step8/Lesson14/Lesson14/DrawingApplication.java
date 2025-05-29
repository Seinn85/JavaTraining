//フライウェイトパターン(Flyweight Pattern)を使った「図形(ずけい)スタンプ」システム
package Lesson14;

public class DrawingApplication {
    public static void main(String[] args) {
        // 赤い円（○）を取得して配置
        Shape redCircle1 = ShapeFactory.getShape("Circle", "Red");
        redCircle1.draw(10, 20);

        // 青い三角（△）を取得して配置
        Shape blueTriangle = ShapeFactory.getShape("Triangle", "Blue");
        blueTriangle.draw(30, 40);

        // 同じ赤い円（○）を取得して配置
        Shape redCircle2 = ShapeFactory.getShape("Circle", "Red");
        redCircle2.draw(50, 60);

        // 同じインスタンスが再利用されていることを確認
        System.out.println("Same instance used for Red Circle: " + (redCircle1 == redCircle2));
    }
}