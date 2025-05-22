package Lesson5;

//Animalクラスを継承（extends）している
public class Dog extends Animal {

    //コンストラクタ
    public Dog(String name) {
        super(name); // 親クラスのコンストラクタを呼び出す
    }

    //声をオーバーライド
    @Override
    public void makeSound() {
        System.out.println("ワンワン");
    }
}