package Lesson1;

public class Main {
    public static void main(String[] args) {
        //多態性: Animalは Dog と Cat オブジェクトを保持します
        Animal[] animals = new Animal[2];
        animals[0] = new Dog();
        animals[1] = new Cat();

        //Animalをループしてeat()を呼び出す
        for (Animal animal : animals) {
            animal.eat(); //実際のオブジェクトタイプに基づいてオーバーライドされた eat()
        }

        //サブクラス固有のメソッドを呼び出す
        Dog dog = (Dog) animals[0];
        dog.bark();

        Cat cat = (Cat) animals[1];
        cat.meow();
    }
}