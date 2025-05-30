//
package Lesson20;

public abstract class Beverage {
    // テンプレートメソッド（飲み物を作る流れを統一する）
    public final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }

    // 共通の処理（すべての飲み物で共通）
    private void boilWater() {
        System.out.println("Boiling water...");
    }

    private void pourInCup() {
        System.out.println("Pouring into cup...");
    }

    // サブクラスごとに異なる処理（抽象メソッド）
    protected abstract void brew();
    protected abstract void addCondiments();
}