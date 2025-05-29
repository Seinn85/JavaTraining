//デコレーターパターン（Decorator pattern）をしようして、コーヒーちゅうもんシステム
package Lesson13;

public class Main {
    public static void main(String[] args) {
        // 基本のコーヒー
        Coffee coffee = new BasicCoffee();
        System.out.println(coffee.getDescription() + " ($" + coffee.getCost() + ")");

        // ミルクを追加
        coffee = new MilkDecorator(coffee);
        System.out.println(coffee.getDescription() + " ($" + coffee.getCost() + ")");

        // 砂糖を追加
        coffee = new SugarDecorator(coffee);
        System.out.println(coffee.getDescription() + " ($" + coffee.getCost() + ")");

        // ホイップクリームを追加
        coffee = new WhippedCreamDecorator(coffee);
        System.out.println(coffee.getDescription() + " ($" + coffee.getCost() + ")");
    }
}