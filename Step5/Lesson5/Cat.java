package Lesson5;

//Animalクラスを継承（extends）している
public class Cat extends Animal {

    //コンストラクタ
    public Cat(String name) {
        super(name); // 親クラスのコンストラクタを呼び出す
    }

    //声をオーバーライド
    @Override
    public void makeSound() {
        System.out.println("ニャーニャー");
    }
}