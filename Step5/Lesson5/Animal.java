package Lesson5;

public class Animal {
    //名前を入れる変数
    String name;

    //名前をセット コンストラクタ
    public Animal(String name) {
        this.name = name;
    }

    //声を出すメソッド
    public void makeSound() {
        System.out.println("動物の鳴き声");
    }
}