//テンプレートメソッドパターンを使った「飲み物の作成システム」
package Lesson20;

public class Main {
    public static void main(String[] args) {
        System.out.println("Making Tea...");
        Beverage tea = new Tea();
        tea.prepareRecipe();

        System.out.println("\nMaking Coffee...");
        Beverage coffee = new Coffee();
        coffee.prepareRecipe();
    }
}