package Lesson7;

public class Main{
    public static void main(String[] args){
        //ホットドリンク工場を使う
        DrinkFactory hotFactory = new HotDrinkFactory();
        Coffee hotCoffee = hotFactory.createCoffee();
        Tea hotTea = hotFactory.createTea();

        hotCoffee.prepare(); //ホットコーヒーを準備中...
        hotTea.prepare();    //ホットティーを準備中...

        // コールドドリンク工場を使う
        DrinkFactory coldFactory = new ColdDrinkFactory();
        Coffee icedCoffee = coldFactory.createCoffee();
        Tea icedTea = coldFactory.createTea();

        icedCoffee.prepare(); //アイスコーヒーを準備中...
        icedTea.prepare();    //アイスティーを準備中...
    }
}
