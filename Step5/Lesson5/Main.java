package Lesson5;

public class Main {
    public static void main(String[] args) {
        //犬を作って鳴かせる
        Animal dog = new Dog("ポチ");
        dog.makeSound(); // ワンワン と表示

        //猫を作って鳴かせる
        Animal cat = new Cat("ミケ");
        cat.makeSound(); // ニャーニャー と表示
    }
}